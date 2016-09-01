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

import com.bydan.erp.nomina.util.CargaFamiliar_NMConstantesFunciones;
import com.bydan.erp.nomina.util.CargaFamiliar_NMParameterReturnGeneral;
//import com.bydan.erp.nomina.util.CargaFamiliar_NMParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.CargaFamiliar_NMBean;
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
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CargaFamiliar_NMBeanSwingJInternalFrame extends CargaFamiliar_NMJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CargaFamiliar_NMBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CargaFamiliar_NM> cargafamiliar_nmValidator = new ClassValidator<CargaFamiliar_NM>(CargaFamiliar_NM.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CargaFamiliar_NM cargafamiliar_nm;	
	public CargaFamiliar_NM cargafamiliar_nmAux;
	public CargaFamiliar_NM cargafamiliar_nmAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CargaFamiliar_NM cargafamiliar_nmTotales;
	public Long idCargaFamiliar_NMActual;
	public Long iIdNuevoCargaFamiliar_NM=0L;
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

	public String sFinalQueryComboEmpleado="";

	public List<Empleado> empleadosForeignKey;

	public List<Empleado> getempleadosForeignKey() {
		return empleadosForeignKey;
	}

	public void setempleadosForeignKey(List<Empleado> empleadosForeignKey) {
		this.empleadosForeignKey = empleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadoForeignKey;

	public Empleado getempleadoForeignKey() {
		return empleadoForeignKey;
	}

	public void setempleadoForeignKey(Empleado empleadoForeignKey) {
		this.empleadoForeignKey = empleadoForeignKey;
	}

	public String sFinalQueryComboTipoCargaFami="";

	public List<TipoCargaFami> tipocargafamisForeignKey;

	public List<TipoCargaFami> gettipocargafamisForeignKey() {
		return tipocargafamisForeignKey;
	}

	public void settipocargafamisForeignKey(List<TipoCargaFami> tipocargafamisForeignKey) {
		this.tipocargafamisForeignKey = tipocargafamisForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoCargaFami tipocargafamiForeignKey;

	public TipoCargaFami gettipocargafamiForeignKey() {
		return tipocargafamiForeignKey;
	}

	public void settipocargafamiForeignKey(TipoCargaFami tipocargafamiForeignKey) {
		this.tipocargafamiForeignKey = tipocargafamiForeignKey;
	}

	public String sFinalQueryComboTipoGenero="";

	public List<TipoGenero> tipogenerosForeignKey;

	public List<TipoGenero> gettipogenerosForeignKey() {
		return tipogenerosForeignKey;
	}

	public void settipogenerosForeignKey(List<TipoGenero> tipogenerosForeignKey) {
		this.tipogenerosForeignKey = tipogenerosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoGenero tipogeneroForeignKey;

	public TipoGenero gettipogeneroForeignKey() {
		return tipogeneroForeignKey;
	}

	public void settipogeneroForeignKey(TipoGenero tipogeneroForeignKey) {
		this.tipogeneroForeignKey = tipogeneroForeignKey;
	}

	public String sFinalQueryComboEstadoCivil="";

	public List<EstadoCivil> estadocivilsForeignKey;

	public List<EstadoCivil> getestadocivilsForeignKey() {
		return estadocivilsForeignKey;
	}

	public void setestadocivilsForeignKey(List<EstadoCivil> estadocivilsForeignKey) {
		this.estadocivilsForeignKey = estadocivilsForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoCivil estadocivilForeignKey;

	public EstadoCivil getestadocivilForeignKey() {
		return estadocivilForeignKey;
	}

	public void setestadocivilForeignKey(EstadoCivil estadocivilForeignKey) {
		this.estadocivilForeignKey = estadocivilForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idEmpleadoActual=0L;

	public Long getidEmpleadoActual() {
		return idEmpleadoActual;
	}

	public void setidEmpleadoActual(Long idEmpleadoActual) {
		this.idEmpleadoActual= idEmpleadoActual;
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
	
	public Boolean isPermisoTodoCargaFamiliar_NM;
	public Boolean isPermisoNuevoCargaFamiliar_NM;
	public Boolean isPermisoActualizarCargaFamiliar_NM;
	public Boolean isPermisoActualizarOriginalCargaFamiliar_NM;
	public Boolean isPermisoEliminarCargaFamiliar_NM;
	public Boolean isPermisoGuardarCambiosCargaFamiliar_NM;
	public Boolean isPermisoConsultaCargaFamiliar_NM;
	public Boolean isPermisoBusquedaCargaFamiliar_NM;
	public Boolean isPermisoReporteCargaFamiliar_NM;
	public Boolean isPermisoPaginacionMedioCargaFamiliar_NM;
	public Boolean isPermisoPaginacionAltoCargaFamiliar_NM;
	public Boolean isPermisoPaginacionTodoCargaFamiliar_NM;
	public Boolean isPermisoCopiarCargaFamiliar_NM;
	public Boolean isPermisoVerFormCargaFamiliar_NM;
	public Boolean isPermisoDuplicarCargaFamiliar_NM;
	public Boolean isPermisoOrdenCargaFamiliar_NM;
	
	
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
	
	public CargaFamiliar_NMParameterReturnGeneral cargafamiliar_nmReturnGeneral;
	public CargaFamiliar_NMParameterReturnGeneral cargafamiliar_nmParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCargaFamiliar_NM=false;
	public Boolean esParaAccionDesdeFormularioCargaFamiliar_NM=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CargaFamiliar_NMSessionBeanAdditional cargafamiliar_nmSessionBeanAdditional=null;
	
	public CargaFamiliar_NMSessionBeanAdditional getCargaFamiliar_NMSessionBeanAdditional() {
		return this.cargafamiliar_nmSessionBeanAdditional;
	}
	
	public void setCargaFamiliar_NMSessionBeanAdditional(CargaFamiliar_NMSessionBeanAdditional cargafamiliar_nmSessionBeanAdditional) {
		try {
			this.cargafamiliar_nmSessionBeanAdditional=cargafamiliar_nmSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CargaFamiliar_NMBeanSwingJInternalFrameAdditional cargafamiliar_nmBeanSwingJInternalFrameAdditional=null;
	//public class CargaFamiliar_NMBeanSwingJInternalFrame
	
	public CargaFamiliar_NMBeanSwingJInternalFrameAdditional getCargaFamiliar_NMBeanSwingJInternalFrameAdditional() {
		return this.cargafamiliar_nmBeanSwingJInternalFrameAdditional;
	}
	
	public void setCargaFamiliar_NMBeanSwingJInternalFrameAdditional(CargaFamiliar_NMBeanSwingJInternalFrameAdditional cargafamiliar_nmBeanSwingJInternalFrameAdditional) {
		try {
			this.cargafamiliar_nmBeanSwingJInternalFrameAdditional=cargafamiliar_nmBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CargaFamiliar_NMLogic cargafamiliar_nmLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CargaFamiliar_NM cargafamiliar_nmBean;
	public CargaFamiliar_NMConstantesFunciones cargafamiliar_nmConstantesFunciones;
	//public CargaFamiliar_NMParameterReturnGeneral cargafamiliar_nmReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public TipoCargaFamiLogic tipocargafamiLogic;
	public TipoGeneroLogic tipogeneroLogic;
	public EstadoCivilLogic estadocivilLogic;
	
	//PARAMETROS
	
	
	//public List<CargaFamiliar_NM> cargafamiliar_nms;	
	//public List<CargaFamiliar_NM> cargafamiliar_nmsEliminados;
	//public List<CargaFamiliar_NM> cargafamiliar_nmsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCargaFamiliar_NM=false;
	public Boolean isVisibilidadCeldaDuplicarCargaFamiliar_NM=true;
	public Boolean isVisibilidadCeldaCopiarCargaFamiliar_NM=true;
	public Boolean isVisibilidadCeldaVerFormCargaFamiliar_NM=true;
	public Boolean isVisibilidadCeldaOrdenCargaFamiliar_NM=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM=false;
	public Boolean isVisibilidadCeldaModificarCargaFamiliar_NM=false;
	public Boolean isVisibilidadCeldaActualizarCargaFamiliar_NM=false;
	public Boolean isVisibilidadCeldaEliminarCargaFamiliar_NM=false;
	public Boolean isVisibilidadCeldaCancelarCargaFamiliar_NM=false;
	public Boolean isVisibilidadCeldaGuardarCargaFamiliar_NM=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoCivil=false;
	public Boolean isVisibilidadFK_IdTipoCargaFami=false;
	public Boolean isVisibilidadFK_IdTipoGenero=false;
	
	public Long getiIdNuevoCargaFamiliar_NM() {
		return this.iIdNuevoCargaFamiliar_NM;
	}

	public void setiIdNuevoCargaFamiliar_NM(Long iIdNuevoCargaFamiliar_NM) {
		this.iIdNuevoCargaFamiliar_NM = iIdNuevoCargaFamiliar_NM;
	}
	
	public Long getidCargaFamiliar_NMActual() {
		return this.idCargaFamiliar_NMActual;
	}

	public void setidCargaFamiliar_NMActual(Long idCargaFamiliar_NMActual) {
		this.idCargaFamiliar_NMActual = idCargaFamiliar_NMActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CargaFamiliar_NM getcargafamiliar_nm() {
		return this.cargafamiliar_nm;
	}

	public void setcargafamiliar_nm(CargaFamiliar_NM cargafamiliar_nm) {
		this.cargafamiliar_nm = cargafamiliar_nm;
	}
	
	public CargaFamiliar_NM getcargafamiliar_nmAux() {
		return this.cargafamiliar_nmAux;
	}

	public void setcargafamiliar_nmAux(CargaFamiliar_NM cargafamiliar_nmAux) {
		this.cargafamiliar_nmAux = cargafamiliar_nmAux;
	}				
	
	public CargaFamiliar_NM getcargafamiliar_nmAnterior() {
		return this.cargafamiliar_nmAnterior;
	}

	public void setcargafamiliar_nmAnterior(CargaFamiliar_NM cargafamiliar_nmAnterior) {
		this.cargafamiliar_nmAnterior = cargafamiliar_nmAnterior;
	}	
	
	public CargaFamiliar_NM getcargafamiliar_nmTotales() {
		return this.cargafamiliar_nmTotales;
	}

	public void setcargafamiliar_nmTotales(CargaFamiliar_NM cargafamiliar_nmTotales) {
		this.cargafamiliar_nmTotales = cargafamiliar_nmTotales;
	}	
	
	public CargaFamiliar_NM getcargafamiliar_nmBean() {
		return this.cargafamiliar_nmBean;
	}

	public void setcargafamiliar_nmBean(CargaFamiliar_NM cargafamiliar_nmBean) {
		this.cargafamiliar_nmBean = cargafamiliar_nmBean;
	}	
	
	public CargaFamiliar_NMParameterReturnGeneral getcargafamiliar_nmReturnGeneral() {
		return this.cargafamiliar_nmReturnGeneral;
	}

	public void setcargafamiliar_nmReturnGeneral(CargaFamiliar_NMParameterReturnGeneral cargafamiliar_nmReturnGeneral) {
		this.cargafamiliar_nmReturnGeneral = cargafamiliar_nmReturnGeneral;
	}	
	
	
	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estado_civilFK_IdEstadoCivil=-1L;

	public Long getid_estado_civilFK_IdEstadoCivil() {
		return this.id_estado_civilFK_IdEstadoCivil;
	}

	public void setid_estado_civilFK_IdEstadoCivil(Long id_estado_civilFK_IdEstadoCivil) {
		this.id_estado_civilFK_IdEstadoCivil = id_estado_civilFK_IdEstadoCivil;
	}

	public Long id_tipo_carga_famiFK_IdTipoCargaFami=-1L;

	public Long getid_tipo_carga_famiFK_IdTipoCargaFami() {
		return this.id_tipo_carga_famiFK_IdTipoCargaFami;
	}

	public void setid_tipo_carga_famiFK_IdTipoCargaFami(Long id_tipo_carga_famiFK_IdTipoCargaFami) {
		this.id_tipo_carga_famiFK_IdTipoCargaFami = id_tipo_carga_famiFK_IdTipoCargaFami;
	}

	public Long id_tipo_generoFK_IdTipoGenero=-1L;

	public Long getid_tipo_generoFK_IdTipoGenero() {
		return this.id_tipo_generoFK_IdTipoGenero;
	}

	public void setid_tipo_generoFK_IdTipoGenero(Long id_tipo_generoFK_IdTipoGenero) {
		this.id_tipo_generoFK_IdTipoGenero = id_tipo_generoFK_IdTipoGenero;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CargaFamiliar_NMLogic getCargaFamiliar_NMLogic()	{		
		return cargafamiliar_nmLogic;
	}

	public void setCargaFamiliar_NMLogic(CargaFamiliar_NMLogic cargafamiliar_nmLogic) {
		this.cargafamiliar_nmLogic = cargafamiliar_nmLogic;
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
	
	public Boolean getIsEsNuevoCargaFamiliar_NM() {
		return isEsNuevoCargaFamiliar_NM;
	}

	public void setIsEsNuevoCargaFamiliar_NM(Boolean isEsNuevoCargaFamiliar_NM) {
		this.isEsNuevoCargaFamiliar_NM = isEsNuevoCargaFamiliar_NM;
	}

	public Boolean getEsParaAccionDesdeFormularioCargaFamiliar_NM() {
		return esParaAccionDesdeFormularioCargaFamiliar_NM;
	}
	
	public void setEsParaAccionDesdeFormularioCargaFamiliar_NM(Boolean esParaAccionDesdeFormularioCargaFamiliar_NM) {
		this.esParaAccionDesdeFormularioCargaFamiliar_NM = esParaAccionDesdeFormularioCargaFamiliar_NM;
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

			if(this.cargafamiliar_nmSessionBean==null) {
				this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
			}

			if(!this.cargafamiliar_nmSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cargafamiliar_nmSessionBean.getlidEmpresaActual());
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

	public void cargarCombosEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadosForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.cargafamiliar_nmSessionBean==null) {
				this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
			}

			if(!this.cargafamiliar_nmSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadosForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(cargafamiliar_nmSessionBean.getlidEmpleadoActual());
					this.empleadosForeignKey.add(empleadoLogic.getEmpleado());
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

	public void cargarCombosTipoCargaFamisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipocargafamisForeignKey=new ArrayList<TipoCargaFami>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoCargaFamiLogic tipocargafamiLogic=new TipoCargaFamiLogic();

			//tipocargafamiLogic.getTipoCargaFamiDataAccess().setIsForForeingKeyData(true);

			if(this.cargafamiliar_nmSessionBean==null) {
				this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
			}

			if(!this.cargafamiliar_nmSessionBean.getisBusquedaDesdeForeignKeySesionTipoCargaFami()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipocargafamiLogic.getTipoCargaFamiDataAccess().setIsForForeingKeyData(true);

					tipocargafamiLogic.getTodosTipoCargaFamisWithConnection(sFinalQuery,new Pagination());

					this.tipocargafamisForeignKey=tipocargafamiLogic.getTipoCargaFamis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoCargaFami(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocargafamiLogic.getEntityWithConnection(cargafamiliar_nmSessionBean.getlidTipoCargaFamiActual());
					this.tipocargafamisForeignKey.add(tipocargafamiLogic.getTipoCargaFami());
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

	public void cargarCombosTipoGenerosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipogenerosForeignKey=new ArrayList<TipoGenero>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoGeneroLogic tipogeneroLogic=new TipoGeneroLogic();

			//tipogeneroLogic.getTipoGeneroDataAccess().setIsForForeingKeyData(true);

			if(this.cargafamiliar_nmSessionBean==null) {
				this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
			}

			if(!this.cargafamiliar_nmSessionBean.getisBusquedaDesdeForeignKeySesionTipoGenero()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipogeneroLogic.getTipoGeneroDataAccess().setIsForForeingKeyData(true);

					tipogeneroLogic.getTodosTipoGenerosWithConnection(sFinalQuery,new Pagination());

					this.tipogenerosForeignKey=tipogeneroLogic.getTipoGeneros();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoGenero(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogeneroLogic.getEntityWithConnection(cargafamiliar_nmSessionBean.getlidTipoGeneroActual());
					this.tipogenerosForeignKey.add(tipogeneroLogic.getTipoGenero());
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

	public void cargarCombosEstadoCivilsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadocivilsForeignKey=new ArrayList<EstadoCivil>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoCivilLogic estadocivilLogic=new EstadoCivilLogic();

			//estadocivilLogic.getEstadoCivilDataAccess().setIsForForeingKeyData(true);

			if(this.cargafamiliar_nmSessionBean==null) {
				this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
			}

			if(!this.cargafamiliar_nmSessionBean.getisBusquedaDesdeForeignKeySesionEstadoCivil()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadocivilLogic.getEstadoCivilDataAccess().setIsForForeingKeyData(true);

					estadocivilLogic.getTodosEstadoCivilsWithConnection(sFinalQuery,new Pagination());

					this.estadocivilsForeignKey=estadocivilLogic.getEstadoCivils();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoCivil(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadocivilLogic.getEntityWithConnection(cargafamiliar_nmSessionBean.getlidEstadoCivilActual());
					this.estadocivilsForeignKey.add(estadocivilLogic.getEstadoCivil());
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

					if(this.cargafamiliar_nm!=null) {
						this.cargafamiliar_nm.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
						this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empresaCargaFamiliar_NM.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCargaFamiliar_NM.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
						if(this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empresaCargaFamiliar_NM.getItemCount()>0) {
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empresaCargaFamiliar_NM.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCargaFamiliar_NMGenerico)throws Exception
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
				jComboBoxid_empresaCargaFamiliar_NMGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCargaFamiliar_NMGenerico!=null && jComboBoxid_empresaCargaFamiliar_NMGenerico.getItemCount()>0) {
					jComboBoxid_empresaCargaFamiliar_NMGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoForeignKey(Long idEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadoTemp!=null) {

					if(this.cargafamiliar_nm!=null) {
						this.cargafamiliar_nm.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
						this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empleadoCargaFamiliar_NM.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoCargaFamiliar_NM.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
						if(this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empleadoCargaFamiliar_NM.getItemCount()>0) {
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empleadoCargaFamiliar_NM.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoCargaFamiliar_NM!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoCargaFamiliar_NM.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoCargaFamiliar_NM!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoCargaFamiliar_NM.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoCargaFamiliar_NM.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoCargaFamiliar_NM.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpleadoForeignKeyDescripcion(Long idEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoCargaFamiliar_NMGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(empleadoTemp!=null) {
				jComboBoxid_empleadoCargaFamiliar_NMGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoCargaFamiliar_NMGenerico!=null && jComboBoxid_empleadoCargaFamiliar_NMGenerico.getItemCount()>0) {
					jComboBoxid_empleadoCargaFamiliar_NMGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoCargaFamiForeignKey(Long idTipoCargaFamiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoCargaFami  tipocargafamiTemp=null;

			for(TipoCargaFami tipocargafamiAux:tipocargafamisForeignKey) {
				if(tipocargafamiAux.getId()!=null && tipocargafamiAux.getId().equals(idTipoCargaFamiSeleccionado)) {
					tipocargafamiTemp=tipocargafamiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipocargafamiTemp!=null) {

					if(this.cargafamiliar_nm!=null) {
						this.cargafamiliar_nm.setTipoCargaFami(tipocargafamiTemp);
					}

					if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
						this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_carga_famiCargaFamiliar_NM.setSelectedItem(tipocargafamiTemp);
					}
				} else {
					//jComboBoxid_tipo_carga_famiCargaFamiliar_NM.setSelectedItem(tipocargafamiTemp);
					if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
						if(this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_carga_famiCargaFamiliar_NM.getItemCount()>0) {
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_carga_famiCargaFamiliar_NM.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoCargaFami") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocargafamiTemp!=null && jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM!=null) {
						jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM.setSelectedItem(tipocargafamiTemp);
					} else {
						if(jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM!=null) {
							//jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM.setSelectedItem(tipocargafamiTemp);
							if(jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM.getItemCount()>0) {
								jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTipoCargaFamiForeignKeyDescripcion(Long idTipoCargaFamiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoCargaFami  tipocargafamiTemp=null;

			for(TipoCargaFami tipocargafamiAux:tipocargafamisForeignKey) {
				if(tipocargafamiAux.getId()!=null && tipocargafamiAux.getId().equals(idTipoCargaFamiSeleccionado)) {
					tipocargafamiTemp=tipocargafamiAux;
					break;
				}
			}


			sDescripcion=TipoCargaFamiConstantesFunciones.getTipoCargaFamiDescripcion(tipocargafamiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoCargaFamiForeignKeyGenerico(Long idTipoCargaFamiSeleccionado,JComboBox jComboBoxid_tipo_carga_famiCargaFamiliar_NMGenerico)throws Exception
	{
		try
		{
			TipoCargaFami  tipocargafamiTemp=null;

			for(TipoCargaFami tipocargafamiAux:tipocargafamisForeignKey) {
				if(tipocargafamiAux.getId()!=null && tipocargafamiAux.getId().equals(idTipoCargaFamiSeleccionado)) {
					tipocargafamiTemp=tipocargafamiAux;
					break;
				}
			}

			if(tipocargafamiTemp!=null) {
				jComboBoxid_tipo_carga_famiCargaFamiliar_NMGenerico.setSelectedItem(tipocargafamiTemp);
			} else {
				if(jComboBoxid_tipo_carga_famiCargaFamiliar_NMGenerico!=null && jComboBoxid_tipo_carga_famiCargaFamiliar_NMGenerico.getItemCount()>0) {
					jComboBoxid_tipo_carga_famiCargaFamiliar_NMGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoGeneroForeignKey(Long idTipoGeneroSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoGenero  tipogeneroTemp=null;

			for(TipoGenero tipogeneroAux:tipogenerosForeignKey) {
				if(tipogeneroAux.getId()!=null && tipogeneroAux.getId().equals(idTipoGeneroSeleccionado)) {
					tipogeneroTemp=tipogeneroAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipogeneroTemp!=null) {

					if(this.cargafamiliar_nm!=null) {
						this.cargafamiliar_nm.setTipoGenero(tipogeneroTemp);
					}

					if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
						this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_generoCargaFamiliar_NM.setSelectedItem(tipogeneroTemp);
					}
				} else {
					//jComboBoxid_tipo_generoCargaFamiliar_NM.setSelectedItem(tipogeneroTemp);
					if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
						if(this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_generoCargaFamiliar_NM.getItemCount()>0) {
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_generoCargaFamiliar_NM.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoGenero") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipogeneroTemp!=null && jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM!=null) {
						jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM.setSelectedItem(tipogeneroTemp);
					} else {
						if(jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM!=null) {
							//jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM.setSelectedItem(tipogeneroTemp);
							if(jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM.getItemCount()>0) {
								jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTipoGeneroForeignKeyDescripcion(Long idTipoGeneroSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoGenero  tipogeneroTemp=null;

			for(TipoGenero tipogeneroAux:tipogenerosForeignKey) {
				if(tipogeneroAux.getId()!=null && tipogeneroAux.getId().equals(idTipoGeneroSeleccionado)) {
					tipogeneroTemp=tipogeneroAux;
					break;
				}
			}


			sDescripcion=TipoGeneroConstantesFunciones.getTipoGeneroDescripcion(tipogeneroTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoGeneroForeignKeyGenerico(Long idTipoGeneroSeleccionado,JComboBox jComboBoxid_tipo_generoCargaFamiliar_NMGenerico)throws Exception
	{
		try
		{
			TipoGenero  tipogeneroTemp=null;

			for(TipoGenero tipogeneroAux:tipogenerosForeignKey) {
				if(tipogeneroAux.getId()!=null && tipogeneroAux.getId().equals(idTipoGeneroSeleccionado)) {
					tipogeneroTemp=tipogeneroAux;
					break;
				}
			}

			if(tipogeneroTemp!=null) {
				jComboBoxid_tipo_generoCargaFamiliar_NMGenerico.setSelectedItem(tipogeneroTemp);
			} else {
				if(jComboBoxid_tipo_generoCargaFamiliar_NMGenerico!=null && jComboBoxid_tipo_generoCargaFamiliar_NMGenerico.getItemCount()>0) {
					jComboBoxid_tipo_generoCargaFamiliar_NMGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoCivilForeignKey(Long idEstadoCivilSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoCivil  estadocivilTemp=null;

			for(EstadoCivil estadocivilAux:estadocivilsForeignKey) {
				if(estadocivilAux.getId()!=null && estadocivilAux.getId().equals(idEstadoCivilSeleccionado)) {
					estadocivilTemp=estadocivilAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadocivilTemp!=null) {

					if(this.cargafamiliar_nm!=null) {
						this.cargafamiliar_nm.setEstadoCivil(estadocivilTemp);
					}

					if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
						this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_estado_civilCargaFamiliar_NM.setSelectedItem(estadocivilTemp);
					}
				} else {
					//jComboBoxid_estado_civilCargaFamiliar_NM.setSelectedItem(estadocivilTemp);
					if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
						if(this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_estado_civilCargaFamiliar_NM.getItemCount()>0) {
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_estado_civilCargaFamiliar_NM.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstadoCivil") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadocivilTemp!=null && jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM!=null) {
						jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM.setSelectedItem(estadocivilTemp);
					} else {
						if(jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM!=null) {
							//jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM.setSelectedItem(estadocivilTemp);
							if(jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM.getItemCount()>0) {
								jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEstadoCivilForeignKeyDescripcion(Long idEstadoCivilSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoCivil  estadocivilTemp=null;

			for(EstadoCivil estadocivilAux:estadocivilsForeignKey) {
				if(estadocivilAux.getId()!=null && estadocivilAux.getId().equals(idEstadoCivilSeleccionado)) {
					estadocivilTemp=estadocivilAux;
					break;
				}
			}


			sDescripcion=EstadoCivilConstantesFunciones.getEstadoCivilDescripcion(estadocivilTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoCivilForeignKeyGenerico(Long idEstadoCivilSeleccionado,JComboBox jComboBoxid_estado_civilCargaFamiliar_NMGenerico)throws Exception
	{
		try
		{
			EstadoCivil  estadocivilTemp=null;

			for(EstadoCivil estadocivilAux:estadocivilsForeignKey) {
				if(estadocivilAux.getId()!=null && estadocivilAux.getId().equals(idEstadoCivilSeleccionado)) {
					estadocivilTemp=estadocivilAux;
					break;
				}
			}

			if(estadocivilTemp!=null) {
				jComboBoxid_estado_civilCargaFamiliar_NMGenerico.setSelectedItem(estadocivilTemp);
			} else {
				if(jComboBoxid_estado_civilCargaFamiliar_NMGenerico!=null && jComboBoxid_estado_civilCargaFamiliar_NMGenerico.getItemCount()>0) {
					jComboBoxid_estado_civilCargaFamiliar_NMGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CargaFamiliar_NM cargafamiliar_nm,JComboBox jComboBoxid_empresaCargaFamiliar_NMGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCargaFamiliar_NMGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empresaCargaFamiliar_NM.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCargaFamiliar_NMGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cargafamiliar_nm.setid_empresa(empresaAux.getId());
				cargafamiliar_nm.setempresa_descripcion(CargaFamiliar_NMConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cargafamiliar_nm.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(CargaFamiliar_NM cargafamiliar_nm,JComboBox jComboBoxid_empleadoCargaFamiliar_NMGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoCargaFamiliar_NMGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empleadoCargaFamiliar_NM.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoCargaFamiliar_NMGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				cargafamiliar_nm.setid_empleado(empleadoAux.getId());
				cargafamiliar_nm.setempleado_descripcion(CargaFamiliar_NMConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				cargafamiliar_nm.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoCargaFamiForeignKey(CargaFamiliar_NM cargafamiliar_nm,JComboBox jComboBoxid_tipo_carga_famiCargaFamiliar_NMGenerico)throws Exception
	{
		try
		{
			TipoCargaFami  tipocargafamiAux=new TipoCargaFami();

			if(jComboBoxid_tipo_carga_famiCargaFamiliar_NMGenerico==null) {
				tipocargafamiAux=(TipoCargaFami)this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_carga_famiCargaFamiliar_NM.getSelectedItem();
			} else {
				tipocargafamiAux=(TipoCargaFami)jComboBoxid_tipo_carga_famiCargaFamiliar_NMGenerico.getSelectedItem();
			}

			if(tipocargafamiAux!=null && tipocargafamiAux.getId()!=null) {
				cargafamiliar_nm.setid_tipo_carga_fami(tipocargafamiAux.getId());
				cargafamiliar_nm.settipocargafami_descripcion(CargaFamiliar_NMConstantesFunciones.getTipoCargaFamiDescripcion(tipocargafamiAux));
				cargafamiliar_nm.setTipoCargaFami(tipocargafamiAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoGeneroForeignKey(CargaFamiliar_NM cargafamiliar_nm,JComboBox jComboBoxid_tipo_generoCargaFamiliar_NMGenerico)throws Exception
	{
		try
		{
			TipoGenero  tipogeneroAux=new TipoGenero();

			if(jComboBoxid_tipo_generoCargaFamiliar_NMGenerico==null) {
				tipogeneroAux=(TipoGenero)this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_generoCargaFamiliar_NM.getSelectedItem();
			} else {
				tipogeneroAux=(TipoGenero)jComboBoxid_tipo_generoCargaFamiliar_NMGenerico.getSelectedItem();
			}

			if(tipogeneroAux!=null && tipogeneroAux.getId()!=null) {
				cargafamiliar_nm.setid_tipo_genero(tipogeneroAux.getId());
				cargafamiliar_nm.settipogenero_descripcion(CargaFamiliar_NMConstantesFunciones.getTipoGeneroDescripcion(tipogeneroAux));
				cargafamiliar_nm.setTipoGenero(tipogeneroAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoCivilForeignKey(CargaFamiliar_NM cargafamiliar_nm,JComboBox jComboBoxid_estado_civilCargaFamiliar_NMGenerico)throws Exception
	{
		try
		{
			EstadoCivil  estadocivilAux=new EstadoCivil();

			if(jComboBoxid_estado_civilCargaFamiliar_NMGenerico==null) {
				estadocivilAux=(EstadoCivil)this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_estado_civilCargaFamiliar_NM.getSelectedItem();
			} else {
				estadocivilAux=(EstadoCivil)jComboBoxid_estado_civilCargaFamiliar_NMGenerico.getSelectedItem();
			}

			if(estadocivilAux!=null && estadocivilAux.getId()!=null) {
				cargafamiliar_nm.setid_estado_civil(estadocivilAux.getId());
				cargafamiliar_nm.setestadocivil_descripcion(CargaFamiliar_NMConstantesFunciones.getEstadoCivilDescripcion(estadocivilAux));
				cargafamiliar_nm.setEstadoCivil(estadocivilAux);			}
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

					if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { 
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empresaCargaFamiliar_NM.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empresaCargaFamiliar_NM.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { 
					}

					if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { 
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empleadoCargaFamiliar_NM.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empleadoCargaFamiliar_NM.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { 
					}

					if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoCargaFamiliar_NM.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoCargaFamiliar_NM.addItem(empleado);
							}
						}

						if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoCargaFamisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoCargaFami=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { 
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_carga_famiCargaFamiliar_NM.removeAllItems();

							for(TipoCargaFami tipocargafami:this.tipocargafamisForeignKey) {
								this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_carga_famiCargaFamiliar_NM.addItem(tipocargafami);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { 
					}

					if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoCargaFami") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM.removeAllItems();

							for(TipoCargaFami tipocargafami:this.tipocargafamisForeignKey) {
								this.jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM.addItem(tipocargafami);
							}
						}

						if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoGenerosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoGenero=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { 
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_generoCargaFamiliar_NM.removeAllItems();

							for(TipoGenero tipogenero:this.tipogenerosForeignKey) {
								this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_generoCargaFamiliar_NM.addItem(tipogenero);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { 
					}

					if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoGenero") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM.removeAllItems();

							for(TipoGenero tipogenero:this.tipogenerosForeignKey) {
								this.jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM.addItem(tipogenero);
							}
						}

						if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoCivilsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoCivil=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { 
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_estado_civilCargaFamiliar_NM.removeAllItems();

							for(EstadoCivil estadocivil:this.estadocivilsForeignKey) {
								this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_estado_civilCargaFamiliar_NM.addItem(estadocivil);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { 
					}

					if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstadoCivil") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM.removeAllItems();

							for(EstadoCivil estadocivil:this.estadocivilsForeignKey) {
								this.jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM.addItem(estadocivil);
							}
						}

						if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empresaCargaFamiliar_NM.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empresaCargaFamiliar_NM.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEmpleadoForeignKey(Empleado empleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empleadoCargaFamiliar_NM.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empleadoCargaFamiliar_NM.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoCargaFamiliar_NM.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoCargaFamiliar_NM.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoCargaFamiForeignKey(TipoCargaFami tipocargafami,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_carga_famiCargaFamiliar_NM.setSelectedItem(tipocargafami);
						}
					} else {
						if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_carga_famiCargaFamiliar_NM.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM.setSelectedItem(tipocargafami);
						} else {
							this.jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoGeneroForeignKey(TipoGenero tipogenero,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_generoCargaFamiliar_NM.setSelectedItem(tipogenero);
						}
					} else {
						if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_generoCargaFamiliar_NM.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM.setSelectedItem(tipogenero);
						} else {
							this.jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstadoCivilForeignKey(EstadoCivil estadocivil,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_estado_civilCargaFamiliar_NM.setSelectedItem(estadocivil);
						}
					} else {
						if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_estado_civilCargaFamiliar_NM.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM.setSelectedItem(estadocivil);
						} else {
							this.jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCargaFamiliar_NM() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CargaFamiliar_NMConstantesFunciones.refrescarForeignKeysDescripcionesCargaFamiliar_NM(this.cargafamiliar_nmLogic.getCargaFamiliar_NMs());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CargaFamiliar_NMConstantesFunciones.refrescarForeignKeysDescripcionesCargaFamiliar_NM(this.cargafamiliar_nms);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(TipoCargaFami.class));
		classes.add(new Classe(TipoGenero.class));
		classes.add(new Classe(EstadoCivil.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cargafamiliar_nmLogic.setCargaFamiliar_NMs(this.cargafamiliar_nms);
			cargafamiliar_nmLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CargaFamiliar_NMParameterReturnGeneral getCargaFamiliar_NMParameterGeneral() {
		return this.cargafamiliar_nmParameterGeneral;
	}
	
	public void setCargaFamiliar_NMParameterGeneral(CargaFamiliar_NMParameterReturnGeneral cargafamiliar_nmParameterGeneral) {
		this.cargafamiliar_nmParameterGeneral = cargafamiliar_nmParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCargaFamiliar_NM() {
		return isPermisoTodoCargaFamiliar_NM;
	}

	public void setIsPermisoTodoCargaFamiliar_NM(Boolean isPermisoTodoCargaFamiliar_NM) {
		this.isPermisoTodoCargaFamiliar_NM = isPermisoTodoCargaFamiliar_NM;
	}

	public Boolean getIsPermisoNuevoCargaFamiliar_NM() {
		return isPermisoNuevoCargaFamiliar_NM;
	}

	public void setIsPermisoNuevoCargaFamiliar_NM(Boolean isPermisoNuevoCargaFamiliar_NM) {
		this.isPermisoNuevoCargaFamiliar_NM = isPermisoNuevoCargaFamiliar_NM;
	}

	public Boolean getIsPermisoActualizarCargaFamiliar_NM() {
		return isPermisoActualizarCargaFamiliar_NM;
	}

	public void setIsPermisoActualizarCargaFamiliar_NM(Boolean isPermisoActualizarCargaFamiliar_NM) {
		this.isPermisoActualizarCargaFamiliar_NM = isPermisoActualizarCargaFamiliar_NM;
	}

	public Boolean getIsPermisoEliminarCargaFamiliar_NM() {
		return isPermisoEliminarCargaFamiliar_NM;
	}

	public void setIsPermisoEliminarCargaFamiliar_NM(Boolean isPermisoEliminarCargaFamiliar_NM) {
		this.isPermisoEliminarCargaFamiliar_NM = isPermisoEliminarCargaFamiliar_NM;
	}

	public Boolean getIsPermisoGuardarCambiosCargaFamiliar_NM() {
		return isPermisoGuardarCambiosCargaFamiliar_NM;
	}

	public void setIsPermisoGuardarCambiosCargaFamiliar_NM(Boolean isPermisoGuardarCambiosCargaFamiliar_NM) {
		this.isPermisoGuardarCambiosCargaFamiliar_NM = isPermisoGuardarCambiosCargaFamiliar_NM;
	}
	
	public Boolean getIsPermisoConsultaCargaFamiliar_NM() {
		return isPermisoConsultaCargaFamiliar_NM;
	}

	public void setIsPermisoConsultaCargaFamiliar_NM(Boolean isPermisoConsultaCargaFamiliar_NM) {
		this.isPermisoConsultaCargaFamiliar_NM = isPermisoConsultaCargaFamiliar_NM;
	}

	public Boolean getIsPermisoBusquedaCargaFamiliar_NM() {
		return isPermisoBusquedaCargaFamiliar_NM;
	}

	public void setIsPermisoBusquedaCargaFamiliar_NM(Boolean isPermisoBusquedaCargaFamiliar_NM) {
		this.isPermisoBusquedaCargaFamiliar_NM = isPermisoBusquedaCargaFamiliar_NM;
	}

	public Boolean getIsPermisoReporteCargaFamiliar_NM() {
		return isPermisoReporteCargaFamiliar_NM;
	}

	public void setIsPermisoReporteCargaFamiliar_NM(Boolean isPermisoReporteCargaFamiliar_NM) {
		this.isPermisoReporteCargaFamiliar_NM = isPermisoReporteCargaFamiliar_NM;
	}
	
	public Boolean getIsPermisoPaginacionMedioCargaFamiliar_NM() {
		return isPermisoPaginacionMedioCargaFamiliar_NM;
	}

	public void setIsPermisoPaginacionMedioCargaFamiliar_NM(Boolean isPermisoPaginacionMedioCargaFamiliar_NM) {
		this.isPermisoPaginacionMedioCargaFamiliar_NM = isPermisoPaginacionMedioCargaFamiliar_NM;
	}
	
	public Boolean getIsPermisoPaginacionTodoCargaFamiliar_NM() {
		return isPermisoPaginacionTodoCargaFamiliar_NM;
	}

	public void setIsPermisoPaginacionTodoCargaFamiliar_NM(Boolean isPermisoPaginacionTodoCargaFamiliar_NM) {
		this.isPermisoPaginacionTodoCargaFamiliar_NM = isPermisoPaginacionTodoCargaFamiliar_NM;
	}
	
	public Boolean getIsPermisoPaginacionAltoCargaFamiliar_NM() {
		return isPermisoPaginacionAltoCargaFamiliar_NM;
	}

	public void setIsPermisoPaginacionAltoCargaFamiliar_NM(Boolean isPermisoPaginacionAltoCargaFamiliar_NM) {
		this.isPermisoPaginacionAltoCargaFamiliar_NM = isPermisoPaginacionAltoCargaFamiliar_NM;
	}
	
	public Boolean getIsPermisoCopiarCargaFamiliar_NM() {
		return isPermisoCopiarCargaFamiliar_NM;
	}

	public void setIsPermisoCopiarCargaFamiliar_NM(Boolean isPermisoCopiarCargaFamiliar_NM) {
		this.isPermisoCopiarCargaFamiliar_NM = isPermisoCopiarCargaFamiliar_NM;
	}
	
	public Boolean getIsPermisoVerFormCargaFamiliar_NM() {
		return isPermisoVerFormCargaFamiliar_NM;
	}

	public void setIsPermisoVerFormCargaFamiliar_NM(Boolean isPermisoVerFormCargaFamiliar_NM) {
		this.isPermisoVerFormCargaFamiliar_NM = isPermisoVerFormCargaFamiliar_NM;
	}
	
	public Boolean getIsPermisoDuplicarCargaFamiliar_NM() {
		return isPermisoDuplicarCargaFamiliar_NM;
	}

	public void setIsPermisoDuplicarCargaFamiliar_NM(Boolean isPermisoDuplicarCargaFamiliar_NM) {
		this.isPermisoDuplicarCargaFamiliar_NM = isPermisoDuplicarCargaFamiliar_NM;
	}
	
	public Boolean getIsPermisoOrdenCargaFamiliar_NM() {
		return isPermisoOrdenCargaFamiliar_NM;
	}

	public void setIsPermisoOrdenCargaFamiliar_NM(Boolean isPermisoOrdenCargaFamiliar_NM) {
		this.isPermisoOrdenCargaFamiliar_NM = isPermisoOrdenCargaFamiliar_NM;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCargaFamiliar_NM() {
		return isVisibilidadCeldaNuevoCargaFamiliar_NM;
	}

	public void setIsVisibilidadCeldaNuevoCargaFamiliar_NM(Boolean isVisibilidadCeldaNuevoCargaFamiliar_NM) {
		this.isVisibilidadCeldaNuevoCargaFamiliar_NM = isVisibilidadCeldaNuevoCargaFamiliar_NM;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCargaFamiliar_NM() {
		return isVisibilidadCeldaDuplicarCargaFamiliar_NM;
	}

	public void setIsVisibilidadCeldaDuplicarCargaFamiliar_NM(Boolean isVisibilidadCeldaDuplicarCargaFamiliar_NM) {
		this.isVisibilidadCeldaDuplicarCargaFamiliar_NM = isVisibilidadCeldaDuplicarCargaFamiliar_NM;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCargaFamiliar_NM() {
		return isVisibilidadCeldaCopiarCargaFamiliar_NM;
	}

	public void setIsVisibilidadCeldaCopiarCargaFamiliar_NM(Boolean isVisibilidadCeldaCopiarCargaFamiliar_NM) {
		this.isVisibilidadCeldaCopiarCargaFamiliar_NM = isVisibilidadCeldaCopiarCargaFamiliar_NM;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCargaFamiliar_NM() {
		return isVisibilidadCeldaVerFormCargaFamiliar_NM;
	}

	public void setIsVisibilidadCeldaVerFormCargaFamiliar_NM(Boolean isVisibilidadCeldaVerFormCargaFamiliar_NM) {
		this.isVisibilidadCeldaVerFormCargaFamiliar_NM = isVisibilidadCeldaVerFormCargaFamiliar_NM;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCargaFamiliar_NM() {
		return isVisibilidadCeldaOrdenCargaFamiliar_NM;
	}

	public void setIsVisibilidadCeldaOrdenCargaFamiliar_NM(Boolean isVisibilidadCeldaOrdenCargaFamiliar_NM) {
		this.isVisibilidadCeldaOrdenCargaFamiliar_NM = isVisibilidadCeldaOrdenCargaFamiliar_NM;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM() {
		return isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM(Boolean isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM) {
		this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM = isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCargaFamiliar_NM() {
		return isVisibilidadCeldaModificarCargaFamiliar_NM;
	}

	public void setIsVisibilidadCeldaModificarCargaFamiliar_NM(Boolean isVisibilidadCeldaModificarCargaFamiliar_NM) {
		this.isVisibilidadCeldaModificarCargaFamiliar_NM = isVisibilidadCeldaModificarCargaFamiliar_NM;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCargaFamiliar_NM() {
		return isVisibilidadCeldaActualizarCargaFamiliar_NM;
	}

	public void setIsVisibilidadCeldaActualizarCargaFamiliar_NM(Boolean isVisibilidadCeldaActualizarCargaFamiliar_NM) {
		this.isVisibilidadCeldaActualizarCargaFamiliar_NM = isVisibilidadCeldaActualizarCargaFamiliar_NM;
	}

	public Boolean getIsVisibilidadCeldaEliminarCargaFamiliar_NM() {
		return isVisibilidadCeldaEliminarCargaFamiliar_NM;
	}

	public void setIsVisibilidadCeldaEliminarCargaFamiliar_NM(Boolean isVisibilidadCeldaEliminarCargaFamiliar_NM) {
		this.isVisibilidadCeldaEliminarCargaFamiliar_NM = isVisibilidadCeldaEliminarCargaFamiliar_NM;
	}

	public Boolean getIsVisibilidadCeldaCancelarCargaFamiliar_NM() {
		return isVisibilidadCeldaCancelarCargaFamiliar_NM;
	}

	public void setIsVisibilidadCeldaCancelarCargaFamiliar_NM(Boolean isVisibilidadCeldaCancelarCargaFamiliar_NM) {
		this.isVisibilidadCeldaCancelarCargaFamiliar_NM = isVisibilidadCeldaCancelarCargaFamiliar_NM;
	}

	public Boolean getIsVisibilidadCeldaGuardarCargaFamiliar_NM() {
		return isVisibilidadCeldaGuardarCargaFamiliar_NM;
	}

	public void setIsVisibilidadCeldaGuardarCargaFamiliar_NM(Boolean isVisibilidadCeldaGuardarCargaFamiliar_NM) {
		this.isVisibilidadCeldaGuardarCargaFamiliar_NM = isVisibilidadCeldaGuardarCargaFamiliar_NM;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCargaFamiliar_NM() {
		return isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCargaFamiliar_NM(Boolean isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM) {
		this.isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM = isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM;
	}
		
	public CargaFamiliar_NMSessionBean getcargafamiliar_nmSessionBean() {
		return this.cargafamiliar_nmSessionBean;
	}
	
	public void setcargafamiliar_nmSessionBean(CargaFamiliar_NMSessionBean cargafamiliar_nmSessionBean) {
		this.cargafamiliar_nmSessionBean=cargafamiliar_nmSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstadoCivil() {
		return this.isVisibilidadFK_IdEstadoCivil;
	}

	public void setisVisibilidadFK_IdEstadoCivil(Boolean isVisibilidadFK_IdEstadoCivil) {
		this.isVisibilidadFK_IdEstadoCivil=isVisibilidadFK_IdEstadoCivil;
	}

	public Boolean getisVisibilidadFK_IdTipoCargaFami() {
		return this.isVisibilidadFK_IdTipoCargaFami;
	}

	public void setisVisibilidadFK_IdTipoCargaFami(Boolean isVisibilidadFK_IdTipoCargaFami) {
		this.isVisibilidadFK_IdTipoCargaFami=isVisibilidadFK_IdTipoCargaFami;
	}

	public Boolean getisVisibilidadFK_IdTipoGenero() {
		return this.isVisibilidadFK_IdTipoGenero;
	}

	public void setisVisibilidadFK_IdTipoGenero(Boolean isVisibilidadFK_IdTipoGenero) {
		this.isVisibilidadFK_IdTipoGenero=isVisibilidadFK_IdTipoGenero;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(CargaFamiliar_NM cargafamiliar_nm)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cargafamiliar_nm,null);
				this.setActualParaGuardarEmpleadoForeignKey(cargafamiliar_nm,null);
				this.setActualParaGuardarTipoCargaFamiForeignKey(cargafamiliar_nm,null);
				this.setActualParaGuardarTipoGeneroForeignKey(cargafamiliar_nm,null);
				this.setActualParaGuardarEstadoCivilForeignKey(cargafamiliar_nm,null);
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
	
	public void bugActualizarReferenciaActual(CargaFamiliar_NM cargafamiliar_nm,CargaFamiliar_NM cargafamiliar_nmAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCargaFamiliar_NM(cargafamiliar_nm);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cargafamiliar_nmAux.setId(cargafamiliar_nm.getId());
		cargafamiliar_nmAux.setVersionRow(cargafamiliar_nm.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCargaFamiliar_NM();
		
			int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.cargafamiliar_nm,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cargafamiliar_nmValidator.getInvalidValues(this.cargafamiliar_nm);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cargafamiliar_nmLogic.setDatosCliente(datosCliente);
			cargafamiliar_nmLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cargafamiliar_nmAux=new  CargaFamiliar_NM();
				
				cargafamiliar_nmAux.setIsNew(true);
				cargafamiliar_nmAux.setIsChanged(true);
				
				cargafamiliar_nmAux.setCargaFamiliar_NMOriginal(this.cargafamiliar_nm);
				
				cargafamiliar_nmAux.setId(this.cargafamiliar_nm.getId());	
				cargafamiliar_nmAux.setVersionRow(this.cargafamiliar_nm.getVersionRow());	
				cargafamiliar_nmAux.setid_empresa(this.cargafamiliar_nm.getid_empresa());	
				cargafamiliar_nmAux.setid_empleado(this.cargafamiliar_nm.getid_empleado());	
				cargafamiliar_nmAux.setid_tipo_carga_fami(this.cargafamiliar_nm.getid_tipo_carga_fami());	
				cargafamiliar_nmAux.setid_tipo_genero(this.cargafamiliar_nm.getid_tipo_genero());	
				cargafamiliar_nmAux.setid_estado_civil(this.cargafamiliar_nm.getid_estado_civil());	
				cargafamiliar_nmAux.setcedula(this.cargafamiliar_nm.getcedula());	
				cargafamiliar_nmAux.setapellido(this.cargafamiliar_nm.getapellido());	
				cargafamiliar_nmAux.setnombre(this.cargafamiliar_nm.getnombre());	
				cargafamiliar_nmAux.setdireccion(this.cargafamiliar_nm.getdireccion());	
				cargafamiliar_nmAux.setfecha_nacimiento(this.cargafamiliar_nm.getfecha_nacimiento());	
				cargafamiliar_nmAux.setvalor_cupo(this.cargafamiliar_nm.getvalor_cupo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cargafamiliar_nmSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cargafamiliar_nmAux,cargafamiliar_nmLogic.getCargaFamiliar_NMs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cargafamiliar_nmAux,cargafamiliar_nms);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cargafamiliar_nmSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliar_nmLogic.saveCargaFamiliar_NMs();//WithConnection
						//cargafamiliar_nmLogic.getSetVersionRowCargaFamiliar_NMs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cargafamiliar_nm,cargafamiliar_nmAux);
					
					this.refrescarForeignKeysDescripcionesCargaFamiliar_NM();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cargafamiliar_nmSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cargafamiliar_nmLogic.saveCargaFamiliar_NMRelaciones(cargafamiliar_nmAux);//WithConnection
								//cargafamiliar_nmLogic.getSetVersionRowCargaFamiliar_NMs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cargafamiliar_nm,cargafamiliar_nmAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cargafamiliar_nmSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cargafamiliar_nmAux,cargafamiliar_nmLogic.getCargaFamiliar_NMs());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cargafamiliar_nmAux,cargafamiliar_nms);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cargafamiliar_nm,cargafamiliar_nmAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cargafamiliar_nmAux=new  CargaFamiliar_NM();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() 
					|| (this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() && this.cargafamiliar_nm.getId()>=0)) {
						
					cargafamiliar_nmAux.setIsNew(false);
				}
				
				cargafamiliar_nmAux.setIsDeleted(false);
			
				cargafamiliar_nmAux.setId(this.cargafamiliar_nm.getId());	
				cargafamiliar_nmAux.setVersionRow(this.cargafamiliar_nm.getVersionRow());	
				cargafamiliar_nmAux.setid_empresa(this.cargafamiliar_nm.getid_empresa());	
				cargafamiliar_nmAux.setid_empleado(this.cargafamiliar_nm.getid_empleado());	
				cargafamiliar_nmAux.setid_tipo_carga_fami(this.cargafamiliar_nm.getid_tipo_carga_fami());	
				cargafamiliar_nmAux.setid_tipo_genero(this.cargafamiliar_nm.getid_tipo_genero());	
				cargafamiliar_nmAux.setid_estado_civil(this.cargafamiliar_nm.getid_estado_civil());	
				cargafamiliar_nmAux.setcedula(this.cargafamiliar_nm.getcedula());	
				cargafamiliar_nmAux.setapellido(this.cargafamiliar_nm.getapellido());	
				cargafamiliar_nmAux.setnombre(this.cargafamiliar_nm.getnombre());	
				cargafamiliar_nmAux.setdireccion(this.cargafamiliar_nm.getdireccion());	
				cargafamiliar_nmAux.setfecha_nacimiento(this.cargafamiliar_nm.getfecha_nacimiento());	
				cargafamiliar_nmAux.setvalor_cupo(this.cargafamiliar_nm.getvalor_cupo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cargafamiliar_nmAux,cargafamiliar_nmLogic.getCargaFamiliar_NMs());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cargafamiliar_nmAux,cargafamiliar_nms);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cargafamiliar_nmSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliar_nmLogic.saveCargaFamiliar_NMs();//WithConnection
						//cargafamiliar_nmLogic.getSetVersionRowCargaFamiliar_NMs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cargafamiliar_nm,cargafamiliar_nmAux);
					
					this.refrescarForeignKeysDescripcionesCargaFamiliar_NM();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cargafamiliar_nmSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cargafamiliar_nmLogic.saveCargaFamiliar_NMRelaciones(cargafamiliar_nmAux);//WithConnection
								//cargafamiliar_nmLogic.getSetVersionRowCargaFamiliar_NMs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cargafamiliar_nm,cargafamiliar_nmAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cargafamiliar_nmSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cargafamiliar_nmAux,cargafamiliar_nmLogic.getCargaFamiliar_NMs());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cargafamiliar_nmAux,cargafamiliar_nms);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cargafamiliar_nm,cargafamiliar_nmAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cargafamiliar_nmAux=new  CargaFamiliar_NM();
				
				cargafamiliar_nmAux.setIsNew(false);
				cargafamiliar_nmAux.setIsChanged(false);
				
				cargafamiliar_nmAux.setIsDeleted(true);
				
				cargafamiliar_nmAux.setId(this.cargafamiliar_nm.getId());	
				cargafamiliar_nmAux.setVersionRow(this.cargafamiliar_nm.getVersionRow());	
				cargafamiliar_nmAux.setid_empresa(this.cargafamiliar_nm.getid_empresa());	
				cargafamiliar_nmAux.setid_empleado(this.cargafamiliar_nm.getid_empleado());	
				cargafamiliar_nmAux.setid_tipo_carga_fami(this.cargafamiliar_nm.getid_tipo_carga_fami());	
				cargafamiliar_nmAux.setid_tipo_genero(this.cargafamiliar_nm.getid_tipo_genero());	
				cargafamiliar_nmAux.setid_estado_civil(this.cargafamiliar_nm.getid_estado_civil());	
				cargafamiliar_nmAux.setcedula(this.cargafamiliar_nm.getcedula());	
				cargafamiliar_nmAux.setapellido(this.cargafamiliar_nm.getapellido());	
				cargafamiliar_nmAux.setnombre(this.cargafamiliar_nm.getnombre());	
				cargafamiliar_nmAux.setdireccion(this.cargafamiliar_nm.getdireccion());	
				cargafamiliar_nmAux.setfecha_nacimiento(this.cargafamiliar_nm.getfecha_nacimiento());	
				cargafamiliar_nmAux.setvalor_cupo(this.cargafamiliar_nm.getvalor_cupo());	
				
				if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cargafamiliar_nmAux.getId()>=0) {	
						this.cargafamiliar_nmsEliminados.add(cargafamiliar_nmAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cargafamiliar_nmAux,cargafamiliar_nmLogic.getCargaFamiliar_NMs());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cargafamiliar_nmAux,cargafamiliar_nms);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cargafamiliar_nmSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliar_nmLogic.saveCargaFamiliar_NMs();//WithConnection
						//cargafamiliar_nmLogic.getSetVersionRowCargaFamiliar_NMs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cargafamiliar_nmSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cargafamiliar_nmLogic.saveCargaFamiliar_NMRelaciones(cargafamiliar_nmAux);//WithConnection
								//cargafamiliar_nmLogic.getSetVersionRowCargaFamiliar_NMs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.cargafamiliar_nmSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cargafamiliar_nmAux,cargafamiliar_nmLogic.getCargaFamiliar_NMs());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cargafamiliar_nmAux,cargafamiliar_nms);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().addAll(this.cargafamiliar_nmsEliminados);
					
					cargafamiliar_nmLogic.saveCargaFamiliar_NMs();//WithConnection
					//cargafamiliar_nmLogic.getSetVersionRowCargaFamiliar_NMs();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCargaFamiliar_NM();
				
				this.cargafamiliar_nmsEliminados= new ArrayList<CargaFamiliar_NM>();		
			}
			
			if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Carga Familiar_ N M GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Carga Familiar_ N M",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cargafamiliar_nm=cargafamiliar_nmAux;
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
      		//this.finishProcessCargaFamiliar_NM();
      	}
		
	}	
	
	public void actualizarRelaciones(CargaFamiliar_NM cargafamiliar_nmLocal) throws Exception {
		
		if(this.cargafamiliar_nmSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CargaFamiliar_NM cargafamiliar_nmLocal) throws Exception {	
		if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cargafamiliar_nmLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				cargafamiliar_nmLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoCargaFamiDetalleFormJInternalFrame.class)) {
				TipoCargaFamiBeanSwingJInternalFrame tipocargafamiBeanSwingJInternalFrameLocal=(TipoCargaFamiBeanSwingJInternalFrame) ((TipoCargaFamiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocargafamiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoCargaFami(tipocargafamiBeanSwingJInternalFrameLocal.gettipocargafami(),true);
				tipocargafamiBeanSwingJInternalFrameLocal.actualizarLista(tipocargafamiBeanSwingJInternalFrameLocal.tipocargafami,this.tipocargafamisForeignKey);

				tipocargafamiBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocargafamiBeanSwingJInternalFrameLocal.tipocargafami);

				cargafamiliar_nmLocal.setTipoCargaFami(tipocargafamiBeanSwingJInternalFrameLocal.tipocargafami);

				this.addItemDefectoCombosForeignKeyTipoCargaFami();
				this.cargarCombosFrameTipoCargaFamisForeignKey("Formulario");
				this.setActualTipoCargaFamiForeignKey(tipocargafamiBeanSwingJInternalFrameLocal.tipocargafami.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoGeneroDetalleFormJInternalFrame.class)) {
				TipoGeneroBeanSwingJInternalFrame tipogeneroBeanSwingJInternalFrameLocal=(TipoGeneroBeanSwingJInternalFrame) ((TipoGeneroDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipogeneroBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoGenero(tipogeneroBeanSwingJInternalFrameLocal.gettipogenero(),true);
				tipogeneroBeanSwingJInternalFrameLocal.actualizarLista(tipogeneroBeanSwingJInternalFrameLocal.tipogenero,this.tipogenerosForeignKey);

				tipogeneroBeanSwingJInternalFrameLocal.actualizarRelaciones(tipogeneroBeanSwingJInternalFrameLocal.tipogenero);

				cargafamiliar_nmLocal.setTipoGenero(tipogeneroBeanSwingJInternalFrameLocal.tipogenero);

				this.addItemDefectoCombosForeignKeyTipoGenero();
				this.cargarCombosFrameTipoGenerosForeignKey("Formulario");
				this.setActualTipoGeneroForeignKey(tipogeneroBeanSwingJInternalFrameLocal.tipogenero.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoCivilDetalleFormJInternalFrame.class)) {
				EstadoCivilBeanSwingJInternalFrame estadocivilBeanSwingJInternalFrameLocal=(EstadoCivilBeanSwingJInternalFrame) ((EstadoCivilDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadocivilBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoCivil(estadocivilBeanSwingJInternalFrameLocal.getestadocivil(),true);
				estadocivilBeanSwingJInternalFrameLocal.actualizarLista(estadocivilBeanSwingJInternalFrameLocal.estadocivil,this.estadocivilsForeignKey);

				estadocivilBeanSwingJInternalFrameLocal.actualizarRelaciones(estadocivilBeanSwingJInternalFrameLocal.estadocivil);

				cargafamiliar_nmLocal.setEstadoCivil(estadocivilBeanSwingJInternalFrameLocal.estadocivil);

				this.addItemDefectoCombosForeignKeyEstadoCivil();
				this.cargarCombosFrameEstadoCivilsForeignKey("Formulario");
				this.setActualEstadoCivilForeignKey(estadocivilBeanSwingJInternalFrameLocal.estadocivil.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCargaFamiliar_NMActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cargafamiliar_nmValidator.getInvalidValues(this.cargafamiliar_nm);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CargaFamiliar_NM cargafamiliar_nm,List<CargaFamiliar_NM> cargafamiliar_nms) throws Exception {
		try	{		
			CargaFamiliar_NMConstantesFunciones.actualizarLista(cargafamiliar_nm,cargafamiliar_nms,this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CargaFamiliar_NM cargafamiliar_nm,List<CargaFamiliar_NM> cargafamiliar_nms) throws Exception {
		try	{			
			CargaFamiliar_NMConstantesFunciones.actualizarSelectedLista(cargafamiliar_nm,cargafamiliar_nms);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CargaFamiliar_NM> cargafamiliar_nmsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cargafamiliar_nmsLocal=this.cargafamiliar_nmLogic.getCargaFamiliar_NMs();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cargafamiliar_nmsLocal=this.cargafamiliar_nms;
			}
			//ARCHITECTURE
		
			for(CargaFamiliar_NM cargafamiliar_nmLocal:cargafamiliar_nmsLocal) {
				if(this.permiteMantenimiento(cargafamiliar_nmLocal) && cargafamiliar_nmLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CargaFamiliar_NMConstantesFunciones.getCargaFamiliar_NMLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CargaFamiliar_NMConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelid_empresaCargaFamiliar_NM,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargaFamiliar_NMConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelid_empleadoCargaFamiliar_NM,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargaFamiliar_NMConstantesFunciones.IDTIPOCARGAFAMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelid_tipo_carga_famiCargaFamiliar_NM,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargaFamiliar_NMConstantesFunciones.IDTIPOGENERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelid_tipo_generoCargaFamiliar_NM,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargaFamiliar_NMConstantesFunciones.IDESTADOCIVIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelid_estado_civilCargaFamiliar_NM,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargaFamiliar_NMConstantesFunciones.CEDULA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelcedulaCargaFamiliar_NM,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargaFamiliar_NMConstantesFunciones.APELLIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelapellidoCargaFamiliar_NM,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargaFamiliar_NMConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelnombreCargaFamiliar_NM,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargaFamiliar_NMConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabeldireccionCargaFamiliar_NM,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargaFamiliar_NMConstantesFunciones.FECHANACIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelfecha_nacimientoCargaFamiliar_NM,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargaFamiliar_NMConstantesFunciones.VALORCUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelvalor_cupoCargaFamiliar_NM,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelid_empresaCargaFamiliar_NM,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelid_empleadoCargaFamiliar_NM,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelid_tipo_carga_famiCargaFamiliar_NM,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelid_tipo_generoCargaFamiliar_NM,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelid_estado_civilCargaFamiliar_NM,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelcedulaCargaFamiliar_NM,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelapellidoCargaFamiliar_NM,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelnombreCargaFamiliar_NM,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabeldireccionCargaFamiliar_NM,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelfecha_nacimientoCargaFamiliar_NM,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelvalor_cupoCargaFamiliar_NM,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoCargaFamiliar_NM--;	
		
		
		this.cargafamiliar_nmAux=new CargaFamiliar_NM();
		
		this.cargafamiliar_nmAux.setId(this.iIdNuevoCargaFamiliar_NM);
		this.cargafamiliar_nmAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().add(this.cargafamiliar_nmAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cargafamiliar_nms.add(this.cargafamiliar_nmAux);
		}
		//ARCHITECTURE
		
		this.cargafamiliar_nm=this.cargafamiliar_nmAux;
		
		if(CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCargaFamiliar_NM(this.cargafamiliar_nm);
			this.setVariablesObjetoActualToFormularioForeignKeyCargaFamiliar_NM(this.cargafamiliar_nm);
		}
				
		//this.setDefaultControlesCargaFamiliar_NM();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCargaFamiliar_NM();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCargaFamiliar_NM();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCargaFamiliar_NM();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCargaFamiliar_NM(this.cargafamiliar_nmBean,this.cargafamiliar_nm,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cargafamiliar_nmSessionBean.getConGuardarRelaciones()) {
			classes=CargaFamiliar_NMConstantesFunciones.getClassesRelationshipsOfCargaFamiliar_NM(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cargafamiliar_nmReturnGeneral=cargafamiliar_nmLogic.procesarEventosCargaFamiliar_NMsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cargafamiliar_nmLogic.getCargaFamiliar_NMs(),this.cargafamiliar_nm,this.cargafamiliar_nmParameterGeneral,this.isEsNuevoCargaFamiliar_NM,classes);//this.cargafamiliar_nmLogic.getCargaFamiliar_NM()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCargaFamiliar_NM(this.cargafamiliar_nmReturnGeneral,this.cargafamiliar_nmBean,false);
		
		if(this.cargafamiliar_nmReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCargaFamiliar_NM(this.cargafamiliar_nmReturnGeneral.getCargaFamiliar_NM());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCargaFamiliar_NM(this.cargafamiliar_nmReturnGeneral.getCargaFamiliar_NM());
		}
		
		if(this.cargafamiliar_nmReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCargaFamiliar_NM(this.cargafamiliar_nmReturnGeneral.getCargaFamiliar_NM(),classes);//this.cargafamiliar_nmBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.cargafamiliar_nm,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCargaFamiliar_NM();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCargaFamiliar_NM();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.RecargarFormCargaFamiliar_NM(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCargaFamiliar_NM(false);
						
			if(cargafamiliar_nmSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCargaFamiliar_NM();
			}
			
			this.actualizarVisualTableDatosCargaFamiliar_NM();
			
			this.jTableDatosCargaFamiliar_NM.setRowSelectionInterval(this.getIndiceNuevoCargaFamiliar_NM(), this.getIndiceNuevoCargaFamiliar_NM());
			
			this.seleccionarFilaTablaCargaFamiliar_NMActual();
						
			this.actualizarEstadoCeldasBotonesCargaFamiliar_NM("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCargaFamiliar_NM(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextFieldcedulaCargaFamiliar_NM.setEnabled(isHabilitar && this.cargafamiliar_nmConstantesFunciones.activarcedulaCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreaapellidoCargaFamiliar_NM.setEnabled(isHabilitar && this.cargafamiliar_nmConstantesFunciones.activarapellidoCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreanombreCargaFamiliar_NM.setEnabled(isHabilitar && this.cargafamiliar_nmConstantesFunciones.activarnombreCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreadireccionCargaFamiliar_NM.setEnabled(isHabilitar && this.cargafamiliar_nmConstantesFunciones.activardireccionCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jDateChooserfecha_nacimientoCargaFamiliar_NM.setEnabled(isHabilitar && this.cargafamiliar_nmConstantesFunciones.activarfecha_nacimientoCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextFieldvalor_cupoCargaFamiliar_NM.setEnabled(isHabilitar && this.cargafamiliar_nmConstantesFunciones.activarvalor_cupoCargaFamiliar_NM);	
		//
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empresaCargaFamiliar_NM.setEnabled(isHabilitar && this.cargafamiliar_nmConstantesFunciones.activarid_empresaCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empleadoCargaFamiliar_NM.setEnabled(isHabilitar && this.cargafamiliar_nmConstantesFunciones.activarid_empleadoCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_carga_famiCargaFamiliar_NM.setEnabled(isHabilitar && this.cargafamiliar_nmConstantesFunciones.activarid_tipo_carga_famiCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_generoCargaFamiliar_NM.setEnabled(isHabilitar && this.cargafamiliar_nmConstantesFunciones.activarid_tipo_generoCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_estado_civilCargaFamiliar_NM.setEnabled(isHabilitar && this.cargafamiliar_nmConstantesFunciones.activarid_estado_civilCargaFamiliar_NM);
	};
	
	public void setDefaultControlesCargaFamiliar_NM() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCargaFamiliar_NM(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cargafamiliar_nmSessionBean.setConGuardarRelaciones(true);			
			this.cargafamiliar_nmSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jTabbedPaneRelacionesCargaFamiliar_NM.setVisible(true);
			
					
		} else {
			//this.cargafamiliar_nmSessionBean.setConGuardarRelaciones(false);			
			this.cargafamiliar_nmSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jTabbedPaneRelacionesCargaFamiliar_NM.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCargaFamiliar_NM() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CargaFamiliar_NM cargafamiliar_nmAux:this.cargafamiliar_nmLogic.getCargaFamiliar_NMs()) {
				if(cargafamiliar_nmAux.getId().equals(this.iIdNuevoCargaFamiliar_NM)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CargaFamiliar_NM cargafamiliar_nmAux:this.cargafamiliar_nms) {
				if(cargafamiliar_nmAux.getId().equals(this.iIdNuevoCargaFamiliar_NM)) {
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
	
	public int getIndiceActualCargaFamiliar_NM(CargaFamiliar_NM cargafamiliar_nm,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CargaFamiliar_NM cargafamiliar_nmAux:this.cargafamiliar_nmLogic.getCargaFamiliar_NMs()) {
				if(cargafamiliar_nmAux.getId().equals(cargafamiliar_nm.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CargaFamiliar_NM cargafamiliar_nmAux:this.cargafamiliar_nms) {
				if(cargafamiliar_nmAux.getId().equals(cargafamiliar_nm.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCargaFamiliar_NM(CargaFamiliar_NM cargafamiliar_nmOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CargaFamiliar_NM cargafamiliar_nmAux:this.cargafamiliar_nmLogic.getCargaFamiliar_NMs()) {
				if(cargafamiliar_nmAux.getCargaFamiliar_NMOriginal().getId().equals(cargafamiliar_nmOriginal.getId())) {
					existe=true;
					cargafamiliar_nmOriginal.setId(cargafamiliar_nmAux.getId());
					cargafamiliar_nmOriginal.setVersionRow(cargafamiliar_nmAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CargaFamiliar_NM cargafamiliar_nmAux:this.cargafamiliar_nms) {
				if(cargafamiliar_nmAux.getCargaFamiliar_NMOriginal().getId().equals(cargafamiliar_nmOriginal.getId())) {
					existe=true;
					cargafamiliar_nmOriginal.setId(cargafamiliar_nmAux.getId());
					cargafamiliar_nmOriginal.setVersionRow(cargafamiliar_nmAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCargaFamiliar_NM(Boolean esParaCancelar) throws Exception {
		cargafamiliar_nmsAux=new ArrayList<CargaFamiliar_NM>();
		cargafamiliar_nmAux=new CargaFamiliar_NM();
		
		if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CargaFamiliar_NM cargafamiliar_nmAux:this.cargafamiliar_nmLogic.getCargaFamiliar_NMs()) {
					if(cargafamiliar_nmAux.getId()<0) {
						cargafamiliar_nmsAux.add(cargafamiliar_nmAux);
					}		
				}
				this.iIdNuevoCargaFamiliar_NM=0L;
				this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().removeAll(cargafamiliar_nmsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CargaFamiliar_NM cargafamiliar_nmAux:this.cargafamiliar_nms) {
					if(cargafamiliar_nmAux.getId()<0) {
						cargafamiliar_nmsAux.add(cargafamiliar_nmAux);
					}		
				}
				this.iIdNuevoCargaFamiliar_NM=0L;
				this.cargafamiliar_nms.removeAll(cargafamiliar_nmsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCargaFamiliar_NM 
					&& this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().size()>0
					) {
					cargafamiliar_nmAux=this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().get(this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().size() - 1);
				
					if(cargafamiliar_nmAux.getId()<0) {
						this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().remove(cargafamiliar_nmAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCargaFamiliar_NM && this.cargafamiliar_nms.size()>0) {
					cargafamiliar_nmAux=this.cargafamiliar_nms.get(this.cargafamiliar_nms.size() - 1);
				
					if(cargafamiliar_nmAux.getId()<0) {
						this.cargafamiliar_nms.remove(cargafamiliar_nmAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCargaFamiliar_NM(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cargafamiliar_nm.getId()<0) {
				this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().remove(this.cargafamiliar_nm);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cargafamiliar_nm.getId()<0) {
				this.cargafamiliar_nms.remove(this.cargafamiliar_nm);
			}
		}			
	}
	
	public void setEstadosInicialesCargaFamiliar_NM(List<CargaFamiliar_NM> cargafamiliar_nmsAux) throws Exception {
		CargaFamiliar_NMConstantesFunciones.setEstadosInicialesCargaFamiliar_NM(cargafamiliar_nmsAux);
	}
	
	public void setEstadosInicialesCargaFamiliar_NM(CargaFamiliar_NM cargafamiliar_nmAux) throws Exception {
		CargaFamiliar_NMConstantesFunciones.setEstadosInicialesCargaFamiliar_NM(cargafamiliar_nmAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCargaFamiliar_NMActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCargaFamiliar_NM("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCargaFamiliar_NMActual()) {
				if(!this.isEsNuevoCargaFamiliar_NM) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCargaFamiliar_NM("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCargaFamiliar_NM=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCargaFamiliar_NMActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Carga Familiar_ N M ?", "MANTENIMIENTO DE Carga Familiar_ N M", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCargaFamiliar_NM("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CargaFamiliar_NM cargafamiliar_nm) throws Exception {
		CargaFamiliar_NMConstantesFunciones.seleccionarAsignar(this.cargafamiliar_nm,cargafamiliar_nm);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCargaFamiliar_NM=this.isPermisoActualizarOriginalCargaFamiliar_NM;
			
			
			this.seleccionarAsignar(cargafamiliar_nm);
			
			

			idEmpleadoActual=cargafamiliar_nm.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CargaFamiliar_NMConstantesFunciones.quitarEspaciosCargaFamiliar_NM(this.cargafamiliar_nm,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCargaFamiliar_NM("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cargafamiliar_nmSessionBean.setsFuncionBusquedaRapida(this.cargafamiliar_nmSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarEmpleadoActual() throws Exception {
		try	{
			Empleado empleadoAux=new Empleado();

			if(this.idEmpleadoActual != null && this.idEmpleadoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(this.idEmpleadoActual);
					empleadoAux= empleadoLogic.getEmpleado();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				empleadosForeignKey=new ArrayList<Empleado>();
				empleadosForeignKey.add(empleadoAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCargaFamiliar_NM) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCargaFamiliar_NM(esParaCancelar);				
				this.cancelarNuevoCargaFamiliar_NM(esParaCancelar);								
			}
			
			this.cargafamiliar_nm=new CargaFamiliar_NM();
			
			this.inicializarCargaFamiliar_NM();
			
			this.actualizarEstadoCeldasBotonesCargaFamiliar_NM("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCargaFamiliar_NM() throws Exception {
		try {
			CargaFamiliar_NMConstantesFunciones.inicializarCargaFamiliar_NM(this.cargafamiliar_nm);
			
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
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCargaFamiliar_NMs(String sAccionBusqueda,List<CargaFamiliar_NM> cargafamiliar_nmsParaReportes) throws Exception {
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
					sPathReporteFinal="CargaFamiliar_NM"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CargaFamiliar_NMMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CargaFamiliar_NMMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CargaFamiliar_NM"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Carga Familiar_ N Mes");		
		parameters.put("busquedapor", CargaFamiliar_NMConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCargaFamiliar_NM=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CargaFamiliar_NMConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CargaFamiliar_NMConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCargaFamiliar_NM=new JRBeanArrayDataSource(CargaFamiliar_NMJInternalFrame.TraerCargaFamiliar_NMBeans(cargafamiliar_nmsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCargaFamiliar_NM);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CargaFamiliar_NMConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CargaFamiliar_NMConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CargaFamiliar_NMBean.TraerCargaFamiliar_NMBeans(cargafamiliar_nmsParaReportes).toArray()));
							
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
				this.generarExcelReporteCargaFamiliar_NMs(sAccionBusqueda,sTipoArchivoReporte,cargafamiliar_nmsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCargaFamiliar_NMs(sAccionBusqueda,sTipoArchivoReporte,cargafamiliar_nmsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCargaFamiliar_NMActionPerformed(null);
					//this.generarExcelReporteCargaFamiliar_NMs(sAccionBusqueda,sTipoArchivoReporte,cargafamiliar_nmsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCargaFamiliar_NMs(sAccionBusqueda,sTipoArchivoReporte,cargafamiliar_nmsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCargaFamiliar_NMs(sAccionBusqueda,sTipoArchivoReporte,cargafamiliar_nmsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCargaFamiliar_NMs(sAccionBusqueda,sTipoArchivoReporte,cargafamiliar_nmsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCargaFamiliar_NMs(String sAccionBusqueda,String sTipoArchivoReporte,List<CargaFamiliar_NM> cargafamiliar_nmsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargafamiliar_nm";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CargaFamiliar_NMs");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCargaFamiliar_NM("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CargaFamiliar_NM cargafamiliar_nm : cargafamiliar_nmsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CargaFamiliar_NMConstantesFunciones.generarExcelReporteDataCargaFamiliar_NM("NORMAL",row,workbook,cargafamiliar_nm,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Carga Familiar_ N M",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCargaFamiliar_NM(String sTipo,Row row,Workbook workbook) {
		
		CargaFamiliar_NMConstantesFunciones.generarExcelReporteHeaderCargaFamiliar_NM(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCargaFamiliar_NMs(String sAccionBusqueda,String sTipoArchivoReporte,List<CargaFamiliar_NM> cargafamiliar_nmsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargafamiliar_nm_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CargaFamiliar_NMs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CargaFamiliar_NM cargafamiliar_nm : cargafamiliar_nmsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CargaFamiliar_NMConstantesFunciones.getCargaFamiliar_NMDescripcion(cargafamiliar_nm));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar_nm.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar_nm.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOCARGAFAMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOCARGAFAMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar_nm.gettipocargafami_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOGENERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOGENERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar_nm.gettipogenero_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliar_NMConstantesFunciones.LABEL_IDESTADOCIVIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_IDESTADOCIVIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar_nm.getestadocivil_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliar_NMConstantesFunciones.LABEL_CEDULA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_CEDULA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar_nm.getcedula());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliar_NMConstantesFunciones.LABEL_APELLIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_APELLIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar_nm.getapellido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliar_NMConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar_nm.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliar_NMConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar_nm.getdireccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliar_NMConstantesFunciones.LABEL_FECHANACIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_FECHANACIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar_nm.getfecha_nacimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargaFamiliar_NMConstantesFunciones.LABEL_VALORCUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_VALORCUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargafamiliar_nm.getvalor_cupo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Carga Familiar_ N M",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCargaFamiliar_NMs(String sAccionBusqueda,String sTipoArchivoReporte,List<CargaFamiliar_NM> cargafamiliar_nmsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CargaFamiliar_NM> cargafamiliar_nmsRespaldo=null;
		
		classes=CargaFamiliar_NMConstantesFunciones.getClassesRelationshipsOfCargaFamiliar_NM(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cargafamiliar_nmLogic.setDatosCliente(this.datosCliente);
		this.cargafamiliar_nmLogic.setDatosDeep(this.datosDeep);
		this.cargafamiliar_nmLogic.setIsConDeep(true);
		
		cargafamiliar_nmsRespaldo=this.cargafamiliar_nmLogic.getCargaFamiliar_NMs();
		
		this.cargafamiliar_nmLogic.setCargaFamiliar_NMs(cargafamiliar_nmsParaReportes);	
		this.cargafamiliar_nmLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cargafamiliar_nmsParaReportes=this.cargafamiliar_nmLogic.getCargaFamiliar_NMs();
		this.cargafamiliar_nmLogic.setCargaFamiliar_NMs(cargafamiliar_nmsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargafamiliar_nm_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CargaFamiliar_NMs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCargaFamiliar_NM("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CargaFamiliar_NM cargafamiliar_nm : cargafamiliar_nmsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCargaFamiliar_NM("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CargaFamiliar_NMConstantesFunciones.generarExcelReporteDataCargaFamiliar_NM("NORMAL",row,workbook,cargafamiliar_nm,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CargaFamiliar_NMConstantesFunciones.getCargaFamiliar_NMDescripcion(cargafamiliar_nm));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Carga Familiar_ N M",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCargaFamiliar_NM() throws Exception {		
		this.startProcessCargaFamiliar_NM(true);
	}
	
	public void startProcessCargaFamiliar_NM(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCargaFamiliar_NM ,this.jPanelParametrosReportesCargaFamiliar_NM, this.jScrollPanelDatosCargaFamiliar_NM,this.jPanelPaginacionCargaFamiliar_NM, this.jScrollPanelDatosEdicionCargaFamiliar_NM, this.jPanelAccionesCargaFamiliar_NM,this.jPanelAccionesFormularioCargaFamiliar_NM,this.jmenuBarCargaFamiliar_NM,this.jmenuBarDetalleCargaFamiliar_NM,this.jTtoolBarCargaFamiliar_NM,this.jTtoolBarDetalleCargaFamiliar_NM);		
		
		final JTabbedPane jTabbedPaneBusquedasCargaFamiliar_NM=this.jTabbedPaneBusquedasCargaFamiliar_NM; 
		
		final JPanel jPanelParametrosReportesCargaFamiliar_NM=this.jPanelParametrosReportesCargaFamiliar_NM;
		//final JScrollPane jScrollPanelDatosCargaFamiliar_NM=this.jScrollPanelDatosCargaFamiliar_NM;
		final JTable jTableDatosCargaFamiliar_NM=this.jTableDatosCargaFamiliar_NM;		
		final JPanel jPanelPaginacionCargaFamiliar_NM=this.jPanelPaginacionCargaFamiliar_NM;
		//final JScrollPane jScrollPanelDatosEdicionCargaFamiliar_NM=this.jScrollPanelDatosEdicionCargaFamiliar_NM;
		final JPanel jPanelAccionesCargaFamiliar_NM=this.jPanelAccionesCargaFamiliar_NM;
		
		JPanel jPanelCamposAuxiliarCargaFamiliar_NM=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCargaFamiliar_NM=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
			jPanelCamposAuxiliarCargaFamiliar_NM=this.jInternalFrameDetalleFormCargaFamiliar_NM.jPanelCamposCargaFamiliar_NM;
			jPanelAccionesFormularioAuxiliarCargaFamiliar_NM=this.jInternalFrameDetalleFormCargaFamiliar_NM.jPanelAccionesFormularioCargaFamiliar_NM;
		}
		
		final JPanel jPanelCamposCargaFamiliar_NM=jPanelCamposAuxiliarCargaFamiliar_NM;
		final JPanel jPanelAccionesFormularioCargaFamiliar_NM=jPanelAccionesFormularioAuxiliarCargaFamiliar_NM;
		
		
		final JMenuBar jmenuBarCargaFamiliar_NM=this.jmenuBarCargaFamiliar_NM;
		final JToolBar jTtoolBarCargaFamiliar_NM=this.jTtoolBarCargaFamiliar_NM;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCargaFamiliar_NM=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCargaFamiliar_NM=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
			jmenuBarDetalleAuxiliarCargaFamiliar_NM=this.jInternalFrameDetalleFormCargaFamiliar_NM.jmenuBarDetalleCargaFamiliar_NM;
			jTtoolBarDetalleAuxiliarCargaFamiliar_NM=this.jInternalFrameDetalleFormCargaFamiliar_NM.jTtoolBarDetalleCargaFamiliar_NM;
		}
		
		final JMenuBar jmenuBarDetalleCargaFamiliar_NM=jmenuBarDetalleAuxiliarCargaFamiliar_NM;
		final JToolBar jTtoolBarDetalleCargaFamiliar_NM=jTtoolBarDetalleAuxiliarCargaFamiliar_NM;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCargaFamiliar_NM;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCargaFamiliar_NM;
			processRunnable.jTableDatos=jTableDatosCargaFamiliar_NM;
			processRunnable.jPanelCampos=jPanelCamposCargaFamiliar_NM;
			processRunnable.jPanelPaginacion=jPanelPaginacionCargaFamiliar_NM;
			processRunnable.jPanelAcciones=jPanelAccionesCargaFamiliar_NM;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCargaFamiliar_NM;
			
			
			processRunnable.jmenuBar=jmenuBarCargaFamiliar_NM;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCargaFamiliar_NM;
			processRunnable.jTtoolBar=jTtoolBarCargaFamiliar_NM;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCargaFamiliar_NM;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCargaFamiliar_NM ,jPanelParametrosReportesCargaFamiliar_NM,jTableDatosCargaFamiliar_NM, /*jScrollPanelDatosCargaFamiliar_NM,*/jPanelCamposCargaFamiliar_NM,jPanelPaginacionCargaFamiliar_NM, /*jScrollPanelDatosEdicionCargaFamiliar_NM,*/ jPanelAccionesCargaFamiliar_NM,jPanelAccionesFormularioCargaFamiliar_NM,jmenuBarCargaFamiliar_NM,jmenuBarDetalleCargaFamiliar_NM,jTtoolBarCargaFamiliar_NM,jTtoolBarDetalleCargaFamiliar_NM);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCargaFamiliar_NM ,jPanelParametrosReportesCargaFamiliar_NM, jScrollPanelDatosCargaFamiliar_NM,jPanelPaginacionCargaFamiliar_NM, jScrollPanelDatosEdicionCargaFamiliar_NM, jPanelAccionesCargaFamiliar_NM,jPanelAccionesFormularioCargaFamiliar_NM,jmenuBarCargaFamiliar_NM,jmenuBarDetalleCargaFamiliar_NM,jTtoolBarCargaFamiliar_NM,jTtoolBarDetalleCargaFamiliar_NM);
						
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
	
	public void finishProcessCargaFamiliar_NM() {// throws Exception 
		this.finishProcessCargaFamiliar_NM(true);
	}
	
	public void finishProcessCargaFamiliar_NM(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCargaFamiliar_NM ,this.jPanelParametrosReportesCargaFamiliar_NM, this.jScrollPanelDatosCargaFamiliar_NM,this.jPanelPaginacionCargaFamiliar_NM, this.jScrollPanelDatosEdicionCargaFamiliar_NM, this.jPanelAccionesCargaFamiliar_NM,this.jPanelAccionesFormularioCargaFamiliar_NM,this.jmenuBarCargaFamiliar_NM,this.jmenuBarDetalleCargaFamiliar_NM,this.jTtoolBarCargaFamiliar_NM,this.jTtoolBarDetalleCargaFamiliar_NM);		
		
		final JTabbedPane jTabbedPaneBusquedasCargaFamiliar_NM=this.jTabbedPaneBusquedasCargaFamiliar_NM; 
		
		final JPanel jPanelParametrosReportesCargaFamiliar_NM=this.jPanelParametrosReportesCargaFamiliar_NM;
		//final JScrollPane jScrollPanelDatosCargaFamiliar_NM=this.jScrollPanelDatosCargaFamiliar_NM;
		final JTable jTableDatosCargaFamiliar_NM=this.jTableDatosCargaFamiliar_NM;		
		final JPanel jPanelPaginacionCargaFamiliar_NM=this.jPanelPaginacionCargaFamiliar_NM;
		//final JScrollPane jScrollPanelDatosEdicionCargaFamiliar_NM=this.jScrollPanelDatosEdicionCargaFamiliar_NM;
		final JPanel jPanelAccionesCargaFamiliar_NM=this.jPanelAccionesCargaFamiliar_NM;
		
		JPanel jPanelCamposAuxiliarCargaFamiliar_NM=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCargaFamiliar_NM=new JPanel();
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
			jPanelCamposAuxiliarCargaFamiliar_NM=this.jInternalFrameDetalleFormCargaFamiliar_NM.jPanelCamposCargaFamiliar_NM;
			jPanelAccionesFormularioAuxiliarCargaFamiliar_NM=this.jInternalFrameDetalleFormCargaFamiliar_NM.jPanelAccionesFormularioCargaFamiliar_NM;
		}
		
		final JPanel jPanelCamposCargaFamiliar_NM=jPanelCamposAuxiliarCargaFamiliar_NM;
		final JPanel jPanelAccionesFormularioCargaFamiliar_NM=jPanelAccionesFormularioAuxiliarCargaFamiliar_NM;
		
		
		final JMenuBar jmenuBarCargaFamiliar_NM=this.jmenuBarCargaFamiliar_NM;		
		final JToolBar jTtoolBarCargaFamiliar_NM=this.jTtoolBarCargaFamiliar_NM;
				
		JMenuBar jmenuBarDetalleAuxiliarCargaFamiliar_NM=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCargaFamiliar_NM=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
			jmenuBarDetalleAuxiliarCargaFamiliar_NM=this.jInternalFrameDetalleFormCargaFamiliar_NM.jmenuBarDetalleCargaFamiliar_NM;
			jTtoolBarDetalleAuxiliarCargaFamiliar_NM=this.jInternalFrameDetalleFormCargaFamiliar_NM.jTtoolBarDetalleCargaFamiliar_NM;		
		}
		
		final JMenuBar jmenuBarDetalleCargaFamiliar_NM=jmenuBarDetalleAuxiliarCargaFamiliar_NM;
		final JToolBar jTtoolBarDetalleCargaFamiliar_NM=jTtoolBarDetalleAuxiliarCargaFamiliar_NM;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCargaFamiliar_NM;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCargaFamiliar_NM;
			processRunnable.jTableDatos=jTableDatosCargaFamiliar_NM;
			processRunnable.jPanelCampos=jPanelCamposCargaFamiliar_NM;
			processRunnable.jPanelPaginacion=jPanelPaginacionCargaFamiliar_NM;
			processRunnable.jPanelAcciones=jPanelAccionesCargaFamiliar_NM;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCargaFamiliar_NM;
			
			
			processRunnable.jmenuBar=jmenuBarCargaFamiliar_NM;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCargaFamiliar_NM;
			processRunnable.jTtoolBar=jTtoolBarCargaFamiliar_NM;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCargaFamiliar_NM;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCargaFamiliar_NM ,jPanelParametrosReportesCargaFamiliar_NM, jTableDatosCargaFamiliar_NM,/*jScrollPanelDatosCargaFamiliar_NM,*/jPanelCamposCargaFamiliar_NM,jPanelPaginacionCargaFamiliar_NM, /*jScrollPanelDatosEdicionCargaFamiliar_NM,*/ jPanelAccionesCargaFamiliar_NM,jPanelAccionesFormularioCargaFamiliar_NM,jmenuBarCargaFamiliar_NM,jmenuBarDetalleCargaFamiliar_NM,jTtoolBarCargaFamiliar_NM,jTtoolBarDetalleCargaFamiliar_NM));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCargaFamiliar_NM(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCargaFamiliar_NM(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCargaFamiliar_NM(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCargaFamiliar_NM(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCargaFamiliar_NM,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCargaFamiliar_NM,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCargaFamiliar_NM(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCargaFamiliar_NM,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCargaFamiliar_NM,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cargafamiliar_nmConstantesFunciones.getsFinalQueryCargaFamiliar_NM();
		String  finalQueryPaginacionTodos=this.cargafamiliar_nmConstantesFunciones.getsFinalQueryCargaFamiliar_NM();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CargaFamiliar_NMConstantesFunciones.getArrayColumnasGlobalesNoCargaFamiliar_NM(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CargaFamiliar_NMConstantesFunciones.getArrayColumnasGlobalesCargaFamiliar_NM(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CargaFamiliar_NMConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cargafamiliar_nmsEliminados= new ArrayList<CargaFamiliar_NM>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCargaFamiliar_NM();
		
				///*CargaFamiliar_NMSessionBean*/this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
			
			if(this.cargafamiliar_nmSessionBean==null) {
				this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
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
					this.iNumeroPaginacion=CargaFamiliar_NMConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CargaFamiliar_NMConstantesFunciones.getClassesForeignKeysOfCargaFamiliar_NM(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cargafamiliar_nm."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cargafamiliar_nmsAux= new ArrayList<CargaFamiliar_NM>();
			
				
			cargafamiliar_nmLogic.setDatosCliente(this.datosCliente);
			cargafamiliar_nmLogic.setDatosDeep(this.datosDeep);
			cargafamiliar_nmLogic.setIsConDeep(true);
			
			
			cargafamiliar_nmLogic.getCargaFamiliar_NMDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cargafamiliar_nmLogic.getTodosCargaFamiliar_NMs(finalQueryGlobal,pagination);
					
					//cargafamiliar_nmLogic.getTodosCargaFamiliar_NMsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cargafamiliar_nmLogic.getCargaFamiliar_NMs()==null|| cargafamiliar_nmLogic.getCargaFamiliar_NMs().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cargafamiliar_nmsAux= new ArrayList<CargaFamiliar_NM>();
							cargafamiliar_nmsAux.addAll(cargafamiliar_nmLogic.getCargaFamiliar_NMs());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliar_nmsAux= new ArrayList<CargaFamiliar_NM>();
							cargafamiliar_nmsAux.addAll(cargafamiliar_nms);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cargafamiliar_nmLogic.getTodosCargaFamiliar_NMs(finalQueryGlobal+"",this.pagination);												
							
							//cargafamiliar_nmLogic.getTodosCargaFamiliar_NMsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCargaFamiliar_NMs("Todos",cargafamiliar_nmLogic.getCargaFamiliar_NMs() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cargafamiliar_nmLogic.setCargaFamiliar_NMs(new ArrayList<CargaFamiliar_NM>());					
							cargafamiliar_nmLogic.getCargaFamiliar_NMs().addAll(cargafamiliar_nmsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliar_nms=new ArrayList<CargaFamiliar_NM>();
							cargafamiliar_nms.addAll(cargafamiliar_nmsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCargaFamiliar_NM=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCargaFamiliar_NM=this.idActual;
				
				} else if(this.idCargaFamiliar_NMActual!=null && this.idCargaFamiliar_NMActual!=0L) {
					idCargaFamiliar_NM=idCargaFamiliar_NMActual;
				}
				
					
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndicePorId(idCargaFamiliar_NM);
				
				this.cargafamiliar_nms=new ArrayList<CargaFamiliar_NM>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cargafamiliar_nmLogic.getEntity(idCargaFamiliar_NM);
					
					//cargafamiliar_nmLogic.getEntityWithConnection(idCargaFamiliar_NM);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargafamiliar_nmLogic.setCargaFamiliar_NMs(new ArrayList<CargaFamiliar_NM>());
					cargafamiliar_nmLogic.getCargaFamiliar_NMs().add(cargafamiliar_nmLogic.getCargaFamiliar_NM());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargafamiliar_nms=new ArrayList<CargaFamiliar_NM>();
					this.cargafamiliar_nms.add(cargafamiliar_nm);
				}
				
				if(cargafamiliar_nmLogic.getCargaFamiliar_NM()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cargafamiliar_nmLogic.getCargaFamiliar_NMsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cargafamiliar_nmLogic.getCargaFamiliar_NMs()==null||cargafamiliar_nmLogic.getCargaFamiliar_NMs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cargafamiliar_nms==null|| cargafamiliar_nms.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliar_nmsAux=new ArrayList<CargaFamiliar_NM>();
						cargafamiliar_nmsAux.addAll(cargafamiliar_nmLogic.getCargaFamiliar_NMs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliar_nmsAux=new ArrayList<CargaFamiliar_NM>();
							cargafamiliar_nmsAux.addAll(cargafamiliar_nms);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cargafamiliar_nmLogic.getCargaFamiliar_NMsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCargaFamiliar_NMs("FK_IdEmpleado",cargafamiliar_nmLogic.getCargaFamiliar_NMs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCargaFamiliar_NMs("FK_IdEmpleado",cargafamiliar_nms);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliar_nmLogic.setCargaFamiliar_NMs(new ArrayList<CargaFamiliar_NM>());
						cargafamiliar_nmLogic.getCargaFamiliar_NMs().addAll(cargafamiliar_nmsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliar_nms=new ArrayList<CargaFamiliar_NM>();
							cargafamiliar_nms.addAll(cargafamiliar_nmsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cargafamiliar_nmLogic.getCargaFamiliar_NMsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cargafamiliar_nmLogic.getCargaFamiliar_NMs()==null||cargafamiliar_nmLogic.getCargaFamiliar_NMs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cargafamiliar_nms==null|| cargafamiliar_nms.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliar_nmsAux=new ArrayList<CargaFamiliar_NM>();
						cargafamiliar_nmsAux.addAll(cargafamiliar_nmLogic.getCargaFamiliar_NMs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliar_nmsAux=new ArrayList<CargaFamiliar_NM>();
							cargafamiliar_nmsAux.addAll(cargafamiliar_nms);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cargafamiliar_nmLogic.getCargaFamiliar_NMsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCargaFamiliar_NMs("FK_IdEmpresa",cargafamiliar_nmLogic.getCargaFamiliar_NMs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCargaFamiliar_NMs("FK_IdEmpresa",cargafamiliar_nms);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliar_nmLogic.setCargaFamiliar_NMs(new ArrayList<CargaFamiliar_NM>());
						cargafamiliar_nmLogic.getCargaFamiliar_NMs().addAll(cargafamiliar_nmsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliar_nms=new ArrayList<CargaFamiliar_NM>();
							cargafamiliar_nms.addAll(cargafamiliar_nmsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstadoCivil")) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdEstadoCivil(id_estado_civilFK_IdEstadoCivil);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cargafamiliar_nmLogic.getCargaFamiliar_NMsFK_IdEstadoCivil(finalQueryGlobal,pagination,id_estado_civilFK_IdEstadoCivil);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdEstadoCivil(id_estado_civilFK_IdEstadoCivil);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdEstadoCivil(id_estado_civilFK_IdEstadoCivil);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cargafamiliar_nmLogic.getCargaFamiliar_NMs()==null||cargafamiliar_nmLogic.getCargaFamiliar_NMs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cargafamiliar_nms==null|| cargafamiliar_nms.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliar_nmsAux=new ArrayList<CargaFamiliar_NM>();
						cargafamiliar_nmsAux.addAll(cargafamiliar_nmLogic.getCargaFamiliar_NMs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliar_nmsAux=new ArrayList<CargaFamiliar_NM>();
							cargafamiliar_nmsAux.addAll(cargafamiliar_nms);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cargafamiliar_nmLogic.getCargaFamiliar_NMsFK_IdEstadoCivil(finalQueryGlobal,pagination,id_estado_civilFK_IdEstadoCivil);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdEstadoCivil(id_estado_civilFK_IdEstadoCivil);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdEstadoCivil(id_estado_civilFK_IdEstadoCivil);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCargaFamiliar_NMs("FK_IdEstadoCivil",cargafamiliar_nmLogic.getCargaFamiliar_NMs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCargaFamiliar_NMs("FK_IdEstadoCivil",cargafamiliar_nms);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliar_nmLogic.setCargaFamiliar_NMs(new ArrayList<CargaFamiliar_NM>());
						cargafamiliar_nmLogic.getCargaFamiliar_NMs().addAll(cargafamiliar_nmsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliar_nms=new ArrayList<CargaFamiliar_NM>();
							cargafamiliar_nms.addAll(cargafamiliar_nmsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoCargaFami")) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdTipoCargaFami(id_tipo_carga_famiFK_IdTipoCargaFami);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cargafamiliar_nmLogic.getCargaFamiliar_NMsFK_IdTipoCargaFami(finalQueryGlobal,pagination,id_tipo_carga_famiFK_IdTipoCargaFami);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdTipoCargaFami(id_tipo_carga_famiFK_IdTipoCargaFami);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdTipoCargaFami(id_tipo_carga_famiFK_IdTipoCargaFami);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cargafamiliar_nmLogic.getCargaFamiliar_NMs()==null||cargafamiliar_nmLogic.getCargaFamiliar_NMs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cargafamiliar_nms==null|| cargafamiliar_nms.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliar_nmsAux=new ArrayList<CargaFamiliar_NM>();
						cargafamiliar_nmsAux.addAll(cargafamiliar_nmLogic.getCargaFamiliar_NMs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliar_nmsAux=new ArrayList<CargaFamiliar_NM>();
							cargafamiliar_nmsAux.addAll(cargafamiliar_nms);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cargafamiliar_nmLogic.getCargaFamiliar_NMsFK_IdTipoCargaFami(finalQueryGlobal,pagination,id_tipo_carga_famiFK_IdTipoCargaFami);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdTipoCargaFami(id_tipo_carga_famiFK_IdTipoCargaFami);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdTipoCargaFami(id_tipo_carga_famiFK_IdTipoCargaFami);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCargaFamiliar_NMs("FK_IdTipoCargaFami",cargafamiliar_nmLogic.getCargaFamiliar_NMs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCargaFamiliar_NMs("FK_IdTipoCargaFami",cargafamiliar_nms);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliar_nmLogic.setCargaFamiliar_NMs(new ArrayList<CargaFamiliar_NM>());
						cargafamiliar_nmLogic.getCargaFamiliar_NMs().addAll(cargafamiliar_nmsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliar_nms=new ArrayList<CargaFamiliar_NM>();
							cargafamiliar_nms.addAll(cargafamiliar_nmsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoGenero")) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdTipoGenero(id_tipo_generoFK_IdTipoGenero);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cargafamiliar_nmLogic.getCargaFamiliar_NMsFK_IdTipoGenero(finalQueryGlobal,pagination,id_tipo_generoFK_IdTipoGenero);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdTipoGenero(id_tipo_generoFK_IdTipoGenero);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdTipoGenero(id_tipo_generoFK_IdTipoGenero);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cargafamiliar_nmLogic.getCargaFamiliar_NMs()==null||cargafamiliar_nmLogic.getCargaFamiliar_NMs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cargafamiliar_nms==null|| cargafamiliar_nms.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliar_nmsAux=new ArrayList<CargaFamiliar_NM>();
						cargafamiliar_nmsAux.addAll(cargafamiliar_nmLogic.getCargaFamiliar_NMs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliar_nmsAux=new ArrayList<CargaFamiliar_NM>();
							cargafamiliar_nmsAux.addAll(cargafamiliar_nms);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cargafamiliar_nmLogic.getCargaFamiliar_NMsFK_IdTipoGenero(finalQueryGlobal,pagination,id_tipo_generoFK_IdTipoGenero);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdTipoGenero(id_tipo_generoFK_IdTipoGenero);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargaFamiliar_NMConstantesFunciones.getDetalleIndiceFK_IdTipoGenero(id_tipo_generoFK_IdTipoGenero);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCargaFamiliar_NMs("FK_IdTipoGenero",cargafamiliar_nmLogic.getCargaFamiliar_NMs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCargaFamiliar_NMs("FK_IdTipoGenero",cargafamiliar_nms);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliar_nmLogic.setCargaFamiliar_NMs(new ArrayList<CargaFamiliar_NM>());
						cargafamiliar_nmLogic.getCargaFamiliar_NMs().addAll(cargafamiliar_nmsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliar_nms=new ArrayList<CargaFamiliar_NM>();
							cargafamiliar_nms.addAll(cargafamiliar_nmsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCargaFamiliar_NM();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCargaFamiliar_NM();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cargafamiliar_nmLogic.getCargaFamiliar_NMs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cargafamiliar_nms.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cargafamiliar_nmLogic.getCargaFamiliar_NMs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cargafamiliar_nms.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CargaFamiliar_NM cargafamiliar_nm) {
		Boolean permite=true;
		
		if(this.cargafamiliar_nm.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CargaFamiliar_NMConstantesFunciones.getOrderByListaCargaFamiliar_NM();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CargaFamiliar_NMConstantesFunciones.getOrderByListaCargaFamiliar_NM();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CargaFamiliar_NM cargafamiliar_nm:cargafamiliar_nmLogic.getCargaFamiliar_NMs()) {
				if(cargafamiliar_nm.getsType().equals(Constantes2.S_TOTALES)) {
					cargafamiliar_nmTotales=cargafamiliar_nm;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CargaFamiliar_NM cargafamiliar_nm:this.cargafamiliar_nms) {
				if(cargafamiliar_nm.getsType().equals(Constantes2.S_TOTALES)) {
					cargafamiliar_nmTotales=cargafamiliar_nm;
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
			this.cargafamiliar_nmAux=new CargaFamiliar_NM();
			this.cargafamiliar_nmAux.setsType(Constantes2.S_TOTALES);
			this.cargafamiliar_nmAux.setIsNew(false);
			this.cargafamiliar_nmAux.setIsChanged(false);
			this.cargafamiliar_nmAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CargaFamiliar_NMConstantesFunciones.TotalizarValoresFilaCargaFamiliar_NM(this.cargafamiliar_nmLogic.getCargaFamiliar_NMs(),this.cargafamiliar_nmAux);
				
				this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().add(this.cargafamiliar_nmAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CargaFamiliar_NMConstantesFunciones.TotalizarValoresFilaCargaFamiliar_NM(this.cargafamiliar_nms,this.cargafamiliar_nmAux);
				
				this.cargafamiliar_nms.add(this.cargafamiliar_nmAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cargafamiliar_nmTotales=new CargaFamiliar_NM();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().remove(cargafamiliar_nmTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cargafamiliar_nms.remove(cargafamiliar_nmTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cargafamiliar_nmTotales=new CargaFamiliar_NM();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CargaFamiliar_NM cargafamiliar_nm:cargafamiliar_nmLogic.getCargaFamiliar_NMs()) {
				if(cargafamiliar_nm.getsType().equals(Constantes2.S_TOTALES)) {
					cargafamiliar_nmTotales=cargafamiliar_nm;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CargaFamiliar_NMConstantesFunciones.TotalizarValoresFilaCargaFamiliar_NM(this.cargafamiliar_nmLogic.getCargaFamiliar_NMs(),cargafamiliar_nmTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CargaFamiliar_NM cargafamiliar_nm:this.cargafamiliar_nms) {
				if(cargafamiliar_nm.getsType().equals(Constantes2.S_TOTALES)) {
					cargafamiliar_nmTotales=cargafamiliar_nm;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CargaFamiliar_NMConstantesFunciones.TotalizarValoresFilaCargaFamiliar_NM(this.cargafamiliar_nms,cargafamiliar_nmTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCargaFamiliar_NMsFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCargaFamiliar_NMsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCargaFamiliar_NMsFK_IdEstadoCivil()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoCivil";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCargaFamiliar_NMsFK_IdTipoCargaFami()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoCargaFami";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCargaFamiliar_NMsFK_IdTipoGenero()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoGenero";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCargaFamiliar_NMsFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargafamiliar_nmLogic.getCargaFamiliar_NMsFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCargaFamiliar_NMsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargafamiliar_nmLogic.getCargaFamiliar_NMsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCargaFamiliar_NMsFK_IdEstadoCivil(String sFinalQuery,Long id_estado_civil)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargafamiliar_nmLogic.getCargaFamiliar_NMsFK_IdEstadoCivil(sFinalQuery,this.pagination,id_estado_civil);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCargaFamiliar_NMsFK_IdTipoCargaFami(String sFinalQuery,Long id_tipo_carga_fami)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargafamiliar_nmLogic.getCargaFamiliar_NMsFK_IdTipoCargaFami(sFinalQuery,this.pagination,id_tipo_carga_fami);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCargaFamiliar_NMsFK_IdTipoGenero(String sFinalQuery,Long id_tipo_genero)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargafamiliar_nmLogic.getCargaFamiliar_NMsFK_IdTipoGenero(sFinalQuery,this.pagination,id_tipo_genero);
				
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
	
	public void inicializarPermisosCargaFamiliar_NM() {
		this.isPermisoTodoCargaFamiliar_NM=false;
		this.isPermisoNuevoCargaFamiliar_NM=false;
		this.isPermisoActualizarCargaFamiliar_NM=false;
		this.isPermisoActualizarOriginalCargaFamiliar_NM=false;
		this.isPermisoEliminarCargaFamiliar_NM=false;
		this.isPermisoGuardarCambiosCargaFamiliar_NM=false;
		this.isPermisoConsultaCargaFamiliar_NM=false;
		this.isPermisoBusquedaCargaFamiliar_NM=false;
		this.isPermisoReporteCargaFamiliar_NM=false;		
		this.isPermisoOrdenCargaFamiliar_NM=false;		
		this.isPermisoPaginacionMedioCargaFamiliar_NM=false;		
		this.isPermisoPaginacionAltoCargaFamiliar_NM=false;
		this.isPermisoPaginacionTodoCargaFamiliar_NM=false;
		this.isPermisoCopiarCargaFamiliar_NM=false;		
		this.isPermisoVerFormCargaFamiliar_NM=false;		
		this.isPermisoDuplicarCargaFamiliar_NM=false;		
		this.isPermisoOrdenCargaFamiliar_NM=false;		
	}
	
	public void setPermisosUsuarioCargaFamiliar_NM(Boolean isPermiso) {
		this.isPermisoTodoCargaFamiliar_NM=isPermiso;
		this.isPermisoNuevoCargaFamiliar_NM=isPermiso;
		this.isPermisoActualizarCargaFamiliar_NM=isPermiso;
		this.isPermisoActualizarOriginalCargaFamiliar_NM=isPermiso;
		this.isPermisoEliminarCargaFamiliar_NM=isPermiso;
		this.isPermisoGuardarCambiosCargaFamiliar_NM=isPermiso;
		this.isPermisoConsultaCargaFamiliar_NM=isPermiso;
		this.isPermisoBusquedaCargaFamiliar_NM=isPermiso;
		this.isPermisoReporteCargaFamiliar_NM=isPermiso;
		this.isPermisoOrdenCargaFamiliar_NM=isPermiso;		
		this.isPermisoPaginacionMedioCargaFamiliar_NM=isPermiso;		
		this.isPermisoPaginacionAltoCargaFamiliar_NM=isPermiso;		
		this.isPermisoPaginacionTodoCargaFamiliar_NM=isPermiso;		
		this.isPermisoCopiarCargaFamiliar_NM=isPermiso;		
		this.isPermisoVerFormCargaFamiliar_NM=isPermiso;		
		this.isPermisoDuplicarCargaFamiliar_NM=isPermiso;
		this.isPermisoOrdenCargaFamiliar_NM=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCargaFamiliar_NM(Boolean isPermiso) {
		//this.isPermisoTodoCargaFamiliar_NM=isPermiso;
		this.isPermisoNuevoCargaFamiliar_NM=isPermiso;
		this.isPermisoActualizarCargaFamiliar_NM=isPermiso;
		this.isPermisoActualizarOriginalCargaFamiliar_NM=isPermiso;
		this.isPermisoEliminarCargaFamiliar_NM=isPermiso;
		this.isPermisoGuardarCambiosCargaFamiliar_NM=isPermiso;
		//this.isPermisoConsultaCargaFamiliar_NM=isPermiso;
		//this.isPermisoBusquedaCargaFamiliar_NM=isPermiso;
		//this.isPermisoReporteCargaFamiliar_NM=isPermiso;
		//this.isPermisoOrdenCargaFamiliar_NM=isPermiso;		
		//this.isPermisoPaginacionMedioCargaFamiliar_NM=isPermiso;		
		//this.isPermisoPaginacionAltoCargaFamiliar_NM=isPermiso;		
		//this.isPermisoPaginacionTodoCargaFamiliar_NM=isPermiso;		
		//this.isPermisoCopiarCargaFamiliar_NM=isPermiso;		
		//this.isPermisoDuplicarCargaFamiliar_NM=isPermiso;
		//this.isPermisoOrdenCargaFamiliar_NM=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCargaFamiliar_NMClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CargaFamiliar_NMJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebCargaFamiliar_NM(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCargaFamiliar_NMClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCargaFamiliar_NMClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCargaFamiliar_NMClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCargaFamiliar_NMClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCargaFamiliar_NM() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CargaFamiliar_NMJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CargaFamiliar_NMConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCargaFamiliar_NM=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCargaFamiliar_NM=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCargaFamiliar_NM=this.isPermisoActualizarCargaFamiliar_NM;
			this.isPermisoEliminarCargaFamiliar_NM=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCargaFamiliar_NM=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCargaFamiliar_NM=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCargaFamiliar_NM=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCargaFamiliar_NM=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCargaFamiliar_NM=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCargaFamiliar_NM=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCargaFamiliar_NM=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCargaFamiliar_NM=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCargaFamiliar_NM=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCargaFamiliar_NM=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCargaFamiliar_NM=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCargaFamiliar_NM=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCargaFamiliar_NM=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCargaFamiliar_NM.setToolTipText(this.jTableDatosCargaFamiliar_NM.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCargaFamiliar_NM(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCargaFamiliar_NM(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CargaFamiliar_NMJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CargaFamiliar_NMJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCargaFamiliar_NM() throws Exception {
		Reporte reporte=null;
		
		
		
		
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
	public void inicializarCombosForeignKeyCargaFamiliar_NMListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.tipocargafamisForeignKey=new ArrayList();
				this.tipogenerosForeignKey=new ArrayList();
				this.estadocivilsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCargaFamiliar_NMListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CargaFamiliar_NMJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCargaFamiliar_NMListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoCargaFamiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoGeneroListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoCivilListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoCargaFamiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipocargafamisForeignKey==null||this.tipocargafamisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoCargaFamiConstantesFunciones.getArrayColumnasGlobalesTipoCargaFami(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCargaFamiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoCargaFamiConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoCargaFamisForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoGeneroListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipogenerosForeignKey==null||this.tipogenerosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoGeneroConstantesFunciones.getArrayColumnasGlobalesTipoGenero(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoGeneroConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoGeneroConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoGenerosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoCivilListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadocivilsForeignKey==null||this.estadocivilsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoCivilConstantesFunciones.getArrayColumnasGlobalesEstadoCivil(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoCivilConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoCivilConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoCivilsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCargaFamiliar_NMListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CargaFamiliar_NMParameterReturnGeneral cargafamiliar_nmReturnGeneral=new CargaFamiliar_NMParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.cargafamiliar_nmConstantesFunciones.cargarid_empresaCargaFamiliar_NM)
					 || (this.esRecargarFks && this.cargafamiliar_nmConstantesFunciones.cargarid_empresaCargaFamiliar_NM)) {

					if(!this.cargafamiliar_nmSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+cargafamiliar_nmSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.cargafamiliar_nmConstantesFunciones.cargarid_empleadoCargaFamiliar_NM)
					 || (this.esRecargarFks && this.cargafamiliar_nmConstantesFunciones.cargarid_empleadoCargaFamiliar_NM)) {

					if(!this.cargafamiliar_nmSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+cargafamiliar_nmSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalTipoCargaFami="";

				if(((this.tipocargafamisForeignKey==null||this.tipocargafamisForeignKey.size()<=0) && this.cargafamiliar_nmConstantesFunciones.cargarid_tipo_carga_famiCargaFamiliar_NM)
					 || (this.esRecargarFks && this.cargafamiliar_nmConstantesFunciones.cargarid_tipo_carga_famiCargaFamiliar_NM)) {

					if(!this.cargafamiliar_nmSessionBean.getisBusquedaDesdeForeignKeySesionTipoCargaFami()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoCargaFamiConstantesFunciones.getArrayColumnasGlobalesTipoCargaFami(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoCargaFami=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCargaFamiConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoCargaFami=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoCargaFami, "");
						finalQueryGlobalTipoCargaFami+=TipoCargaFamiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoCargaFamisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoCargaFami=" WHERE " + ConstantesSql.ID + "="+cargafamiliar_nmSessionBean.getlidTipoCargaFamiActual();
					}
				} else {
					finalQueryGlobalTipoCargaFami="NONE";
				}


				String finalQueryGlobalTipoGenero="";

				if(((this.tipogenerosForeignKey==null||this.tipogenerosForeignKey.size()<=0) && this.cargafamiliar_nmConstantesFunciones.cargarid_tipo_generoCargaFamiliar_NM)
					 || (this.esRecargarFks && this.cargafamiliar_nmConstantesFunciones.cargarid_tipo_generoCargaFamiliar_NM)) {

					if(!this.cargafamiliar_nmSessionBean.getisBusquedaDesdeForeignKeySesionTipoGenero()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoGeneroConstantesFunciones.getArrayColumnasGlobalesTipoGenero(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoGenero=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoGeneroConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoGenero=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoGenero, "");
						finalQueryGlobalTipoGenero+=TipoGeneroConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoGenerosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoGenero=" WHERE " + ConstantesSql.ID + "="+cargafamiliar_nmSessionBean.getlidTipoGeneroActual();
					}
				} else {
					finalQueryGlobalTipoGenero="NONE";
				}


				String finalQueryGlobalEstadoCivil="";

				if(((this.estadocivilsForeignKey==null||this.estadocivilsForeignKey.size()<=0) && this.cargafamiliar_nmConstantesFunciones.cargarid_estado_civilCargaFamiliar_NM)
					 || (this.esRecargarFks && this.cargafamiliar_nmConstantesFunciones.cargarid_estado_civilCargaFamiliar_NM)) {

					if(!this.cargafamiliar_nmSessionBean.getisBusquedaDesdeForeignKeySesionEstadoCivil()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoCivilConstantesFunciones.getArrayColumnasGlobalesEstadoCivil(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoCivil=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoCivilConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoCivil=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoCivil, "");
						finalQueryGlobalEstadoCivil+=EstadoCivilConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoCivilsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoCivil=" WHERE " + ConstantesSql.ID + "="+cargafamiliar_nmSessionBean.getlidEstadoCivilActual();
					}
				} else {
					finalQueryGlobalEstadoCivil="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cargafamiliar_nmReturnGeneral=cargafamiliar_nmLogic.cargarCombosLoteForeignKeyCargaFamiliar_NM(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalTipoCargaFami,finalQueryGlobalTipoGenero,finalQueryGlobalEstadoCivil);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=cargafamiliar_nmReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=cargafamiliar_nmReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalTipoCargaFami.equals("NONE")) {
				this.tipocargafamisForeignKey=cargafamiliar_nmReturnGeneral.gettipocargafamisForeignKey();
			}

			if(!finalQueryGlobalTipoGenero.equals("NONE")) {
				this.tipogenerosForeignKey=cargafamiliar_nmReturnGeneral.gettipogenerosForeignKey();
			}

			if(!finalQueryGlobalEstadoCivil.equals("NONE")) {
				this.estadocivilsForeignKey=cargafamiliar_nmReturnGeneral.getestadocivilsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCargaFamiliar_NM()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyTipoCargaFami();
			this.addItemDefectoCombosForeignKeyTipoGenero();
			this.addItemDefectoCombosForeignKeyEstadoCivil();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cargafamiliar_nmSessionBean==null) {
				this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
			}

			if(!this.cargafamiliar_nmSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.cargafamiliar_nmSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				Empleado empleado=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleado.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadosForeignKey,empleado,true)) {

					this.empleadosForeignKey.add(0,empleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoCargaFami()throws Exception {
		try {

			if(!this.cargafamiliar_nmSessionBean.getisBusquedaDesdeForeignKeySesionTipoCargaFami()) {
				TipoCargaFami tipocargafami=new TipoCargaFami();
				TipoCargaFamiConstantesFunciones.setTipoCargaFamiDescripcion(tipocargafami,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipocargafami.setId(null);

				if(!TipoCargaFamiConstantesFunciones.ExisteEnLista(this.tipocargafamisForeignKey,tipocargafami,true)) {

					this.tipocargafamisForeignKey.add(0,tipocargafami);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoGenero()throws Exception {
		try {

			if(!this.cargafamiliar_nmSessionBean.getisBusquedaDesdeForeignKeySesionTipoGenero()) {
				TipoGenero tipogenero=new TipoGenero();
				TipoGeneroConstantesFunciones.setTipoGeneroDescripcion(tipogenero,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipogenero.setId(null);

				if(!TipoGeneroConstantesFunciones.ExisteEnLista(this.tipogenerosForeignKey,tipogenero,true)) {

					this.tipogenerosForeignKey.add(0,tipogenero);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstadoCivil()throws Exception {
		try {

			if(!this.cargafamiliar_nmSessionBean.getisBusquedaDesdeForeignKeySesionEstadoCivil()) {
				EstadoCivil estadocivil=new EstadoCivil();
				EstadoCivilConstantesFunciones.setEstadoCivilDescripcion(estadocivil,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadocivil.setId(null);

				if(!EstadoCivilConstantesFunciones.ExisteEnLista(this.estadocivilsForeignKey,estadocivil,true)) {

					this.estadocivilsForeignKey.add(0,estadocivil);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCargaFamiliar_NM()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCargaFamiliar_NM(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCargaFamiliar_NM()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.cargafamiliar_nm.setfecha_nacimiento(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCargaFamiliar_NM();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCargaFamiliar_NM(CargaFamiliar_NM cargafamiliar_nm)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(cargafamiliar_nm.getid_empleado(),false,"Formulario");
			this.setActualTipoCargaFamiForeignKey(cargafamiliar_nm.getid_tipo_carga_fami(),false,"Formulario");
			this.setActualTipoGeneroForeignKey(cargafamiliar_nm.getid_tipo_genero(),false,"Formulario");
			this.setActualEstadoCivilForeignKey(cargafamiliar_nm.getid_estado_civil(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCargaFamiliar_NM(CargaFamiliar_NM cargafamiliar_nm,String sTipoEvento)throws Exception {	
		try {
			
			

				if(cargafamiliar_nm.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoCargaFamiliar_NM")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(cargafamiliar_nm.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCargaFamiliar_NM()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.cargafamiliar_nmConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualTipoCargaFamiForeignKey(this.cargafamiliar_nmConstantesFunciones.getid_tipo_carga_fami(),false,"Formulario");
			this.setActualTipoGeneroForeignKey(this.cargafamiliar_nmConstantesFunciones.getid_tipo_genero(),false,"Formulario");
			this.setActualEstadoCivilForeignKey(this.cargafamiliar_nmConstantesFunciones.getid_estado_civil(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCargaFamiliar_NM()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCargaFamiliar_NM()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCargaFamiliar_NM()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCargaFamiliar_NM()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCargaFamiliar_NM()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameTipoCargaFamisForeignKey("Todos");
			this.cargarCombosFrameTipoGenerosForeignKey("Todos");
			this.cargarCombosFrameEstadoCivilsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCargaFamiliar_NM(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoCargaFamisForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoGenerosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoCivilsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCargaFamiliar_NM()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empresaCargaFamiliar_NM!=null && this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empresaCargaFamiliar_NM.getItemCount()>0) {
				this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empresaCargaFamiliar_NM.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empleadoCargaFamiliar_NM!=null && this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empleadoCargaFamiliar_NM.getItemCount()>0) {
				this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empleadoCargaFamiliar_NM.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_carga_famiCargaFamiliar_NM!=null && this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_carga_famiCargaFamiliar_NM.getItemCount()>0) {
				this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_carga_famiCargaFamiliar_NM.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_generoCargaFamiliar_NM!=null && this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_generoCargaFamiliar_NM.getItemCount()>0) {
				this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_generoCargaFamiliar_NM.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_estado_civilCargaFamiliar_NM!=null && this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_estado_civilCargaFamiliar_NM.getItemCount()>0) {
				this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_estado_civilCargaFamiliar_NM.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public CargaFamiliar_NMBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CargaFamiliar_NMBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CargaFamiliar_NMBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean(); 
		this.cargafamiliar_nmConstantesFunciones=new CargaFamiliar_NMConstantesFunciones(); 
		this.cargafamiliar_nmBean=new CargaFamiliar_NM();//(this.cargafamiliar_nmConstantesFunciones); 		
		this.cargafamiliar_nmReturnGeneral=new CargaFamiliar_NMParameterReturnGeneral(); 
		
		this.cargafamiliar_nmSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CargaFamiliar_NMBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CargaFamiliar_NMBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CargaFamiliar_NMBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCargaFamiliar_NM(true);
			
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
			
			this.cargafamiliar_nmConstantesFunciones=new CargaFamiliar_NMConstantesFunciones(); 
			this.cargafamiliar_nmBean=new CargaFamiliar_NM();//this.cargafamiliar_nmConstantesFunciones); 			
			this.cargafamiliar_nmReturnGeneral=new CargaFamiliar_NMParameterReturnGeneral(); 
		
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Carga Familiar_ N M Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cargafamiliar_nm=new CargaFamiliar_NM();
			this.cargafamiliar_nms = new ArrayList<CargaFamiliar_NM>();
			this.cargafamiliar_nmsAux = new ArrayList<CargaFamiliar_NM>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic=new CargaFamiliar_NMLogic();
				this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
			}
			
			//this.cargafamiliar_nmSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCargaFamiliar_NM);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCargaFamiliar_NM!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCargaFamiliar_NM);	
					}
					
					if(this.jInternalFrameImportacionCargaFamiliar_NM!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCargaFamiliar_NM);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCargaFamiliar_NM!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCargaFamiliar_NM);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCargaFamiliar_NM);
				this.jInternalFrameDetalleFormCargaFamiliar_NM.setVisible(false);
				this.jInternalFrameDetalleFormCargaFamiliar_NM.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCargaFamiliar_NM!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCargaFamiliar_NM);
					this.jInternalFrameReporteDinamicoCargaFamiliar_NM.setVisible(false);
					this.jInternalFrameReporteDinamicoCargaFamiliar_NM.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCargaFamiliar_NM!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCargaFamiliar_NM);
					this.jInternalFrameImportacionCargaFamiliar_NM.setVisible(false);
					this.jInternalFrameImportacionCargaFamiliar_NM.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCargaFamiliar_NM!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCargaFamiliar_NM);
					this.jInternalFrameOrderByCargaFamiliar_NM.setVisible(false);
					this.jInternalFrameOrderByCargaFamiliar_NM.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCargaFamiliar_NMActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CargaFamiliar_NMConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cargafamiliar_nmReturnGeneral=new CargaFamiliar_NMParameterReturnGeneral();
			
			this.cargafamiliar_nmParameterGeneral=new CargaFamiliar_NMParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cargafamiliar_nmLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CargaFamiliar_NMJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CargaFamiliar_NMConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado(),this.cargafamiliar_nmSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CargaFamiliar_NMConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado(),this.cargafamiliar_nmSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCargaFamiliar_NM=false;
			this.isVisibilidadCeldaDuplicarCargaFamiliar_NM=true;
			this.isVisibilidadCeldaCopiarCargaFamiliar_NM=true;
			this.isVisibilidadCeldaVerFormCargaFamiliar_NM=true;
			this.isVisibilidadCeldaOrdenCargaFamiliar_NM=true;
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM=false;
			this.isVisibilidadCeldaModificarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaActualizarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaEliminarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaCancelarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaGuardarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoCivil=true;
			this.isVisibilidadFK_IdTipoCargaFami=true;
			this.isVisibilidadFK_IdTipoGenero=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCargaFamiliar_NM("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCargaFamiliar_NM();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCargaFamiliar_NM(false);
			
			this.setPermisosUsuarioCargaFamiliar_NM();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() 
				|| (this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() && this.cargafamiliar_nmSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCargaFamiliar_NMClasesRelacionadas();
			}
			
			if(this.cargafamiliar_nmSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCargaFamiliar_NMClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCargaFamiliar_NM();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCargaFamiliar_NM();
			}
			
			if(!this.isPermisoBusquedaCargaFamiliar_NM) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCargaFamiliar_NM.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCargaFamiliar_NM,this.isPermisoPaginacionMedioCargaFamiliar_NM,this.isPermisoPaginacionTodoCargaFamiliar_NM);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CargaFamiliar_NMConstantesFunciones.getTiposSeleccionarCargaFamiliar_NM());
				
				this.tiposColumnasSelect=CargaFamiliar_NMConstantesFunciones.getTiposSeleccionarCargaFamiliar_NM(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
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
			//if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCargaFamiliar_NM();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioCargaFamiliar_NM(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioCargaFamiliar_NM(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCargaFamiliar_NM() ;
			
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
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.tipocargafamiLogic=new TipoCargaFamiLogic();
			this.tipogeneroLogic=new TipoGeneroLogic();
			this.estadocivilLogic=new EstadoCivilLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cargafamiliar_nmImplementable= (CargaFamiliar_NMImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CargaFamiliar_NMConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cargafamiliar_nmImplementableHome= (CargaFamiliar_NMImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CargaFamiliar_NMConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cargafamiliar_nms= new ArrayList<CargaFamiliar_NM>();
			this.cargafamiliar_nmsEliminados= new ArrayList<CargaFamiliar_NM>();
						
			this.isEsNuevoCargaFamiliar_NM=false;
			this.esParaAccionDesdeFormularioCargaFamiliar_NM=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.tipocargafamisForeignKey=new ArrayList<TipoCargaFami>() ;
			this.tipogenerosForeignKey=new ArrayList<TipoGenero>() ;
			this.estadocivilsForeignKey=new ArrayList<EstadoCivil>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCargaFamiliar_NM(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCargaFamiliar_NM();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CargaFamiliar_NMConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCargaFamiliar_NM("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCargaFamiliar_NM(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCargaFamiliar_NM();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCargaFamiliar_NM();
			}
			
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCargaFamiliar_NM.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCargaFamiliar_NM.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCargaFamiliar_NM.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCargaFamiliar_NM(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CargaFamiliar_NM: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCargaFamiliar_NM() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCargaFamiliar_NM")) {
				iIndex=this.jInternalFrameDetalleFormCargaFamiliar_NM.jTabbedPaneRelacionesCargaFamiliar_NM.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCargaFamiliar_NM.jTabbedPaneRelacionesCargaFamiliar_NM.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCargaFamiliar_NM();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyCargaFamiliar_NM(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCargaFamiliar_NM(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCargaFamiliar_NM(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCargaFamiliar_NMListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCargaFamiliar_NM();
		
		this.cargarCombosFrameForeignKeyCargaFamiliar_NM();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCargaFamiliar_NM();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCargaFamiliar_NM();
		}
	}
	
	

	public void cargarCombosForeignKeyEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleado(this.empleadosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoCargaFami(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoCargaFamiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoCargaFami();
				this.cargarCombosFrameTipoCargaFamisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoCargaFami(this.tipocargafamisForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoGenero(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoGeneroListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoGenero();
				this.cargarCombosFrameTipoGenerosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoGenero(this.tipogenerosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoCivil(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoCivilListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoCivil();
				this.cargarCombosFrameEstadoCivilsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoCivil(this.estadocivilsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCargaFamiliar_NMActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cargafamiliar_nmSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCargaFamiliar_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
			
			
			if(jTableDatosCargaFamiliar_NM.getRowCount()>=1) {
				jTableDatosCargaFamiliar_NM.removeRowSelectionInterval(0, jTableDatosCargaFamiliar_NM.getRowCount()-1);						
			}
			
			this.isEsNuevoCargaFamiliar_NM=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCargaFamiliar_NM(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCargaFamiliar_NM(true);			
			//this.cargafamiliar_nm=new CargaFamiliar_NM();
			//this.cargafamiliar_nm.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCargaFamiliar_NM(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCargaFamiliar_NM() ;
			
			if(CargaFamiliar_NMJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCargaFamiliar_NM(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cargafamiliar_nm);	
			this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar_nm);				
			
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
			
			if(this.cargafamiliar_nmSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CargaFamiliar_NM: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCargaFamiliar_NMActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CargaFamiliar_NM> cargafamiliar_nmsSeleccionados=new ArrayList<CargaFamiliar_NM>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCargaFamiliar_NM.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCargaFamiliar_NM.getSelectedRows().length;			
			}
			
			cargafamiliar_nmsSeleccionados=this.getCargaFamiliar_NMsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCargaFamiliar_NM--;			
				//CargaFamiliar_NM cargafamiliar_nmAux= new CargaFamiliar_NM();			
				//cargafamiliar_nmAux.setId(this.iIdNuevoCargaFamiliar_NM);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CargaFamiliar_NM cargafamiliar_nmOrigen=new CargaFamiliar_NM();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CargaFamiliar_NM cargafamiliar_nmOrigen : cargafamiliar_nmsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cargafamiliar_nmOrigen =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargafamiliar_nmOrigen =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCargaFamiliar_NM();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cargafamiliar_nm.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCargaFamiliar_NM(cargafamiliar_nmOrigen,this.cargafamiliar_nm,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().add(this.cargafamiliar_nmAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cargafamiliar_nms.add(this.cargafamiliar_nmAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCargaFamiliar_NM(false);
				
				this.jTableDatosCargaFamiliar_NM.setRowSelectionInterval(this.getIndiceNuevoCargaFamiliar_NM(), this.getIndiceNuevoCargaFamiliar_NM());
				
				int iLastRow =  this.jTableDatosCargaFamiliar_NM.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCargaFamiliar_NM.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCargaFamiliar_NM.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCargaFamiliar_NM(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CargaFamiliar_NM> cargafamiliar_nmsSeleccionados=new ArrayList<CargaFamiliar_NM>();									
		
			CargaFamiliar_NM cargafamiliar_nmOrigen=new CargaFamiliar_NM();
			CargaFamiliar_NM cargafamiliar_nmDestino=new CargaFamiliar_NM();
				
			cargafamiliar_nmsSeleccionados=this.getCargaFamiliar_NMsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCargaFamiliar_NM.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cargafamiliar_nmsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCargaFamiliar_NM.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliar_nmOrigen =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cargafamiliar_nmOrigen =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargafamiliar_nmDestino =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cargafamiliar_nmDestino =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cargafamiliar_nmOrigen =cargafamiliar_nmsSeleccionados.get(0);
				cargafamiliar_nmDestino =cargafamiliar_nmsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCargaFamiliar_NM(cargafamiliar_nmOrigen,cargafamiliar_nmDestino,true,false);
				
				cargafamiliar_nmDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cargafamiliar_nmDestino,cargafamiliar_nmLogic.getCargaFamiliar_NMs());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cargafamiliar_nmDestino,cargafamiliar_nms);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCargaFamiliar_NM(false);
				
				//this.jTableDatosCargaFamiliar_NM.setRowSelectionInterval(this.getIndiceNuevoCargaFamiliar_NM(), this.getIndiceNuevoCargaFamiliar_NM());
				
				int iLastRow =  this.jTableDatosCargaFamiliar_NM.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCargaFamiliar_NM.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCargaFamiliar_NM.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCargaFamiliar_NM(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCargaFamiliar_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCargaFamiliar_NM.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCargaFamiliar_NM.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCargaFamiliar_NM.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCargaFamiliar_NM.setVisible(!isVisible);
			this.jPanelPaginacionCargaFamiliar_NM.setVisible(!isVisible);
			this.jPanelAccionesCargaFamiliar_NM.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCargaFamiliar_NM();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCargaFamiliar_NM();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCargaFamiliar_NM();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCargaFamiliar_NM();
			
			this.abrirFrameOrderByCargaFamiliar_NM();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCargaFamiliar_NM();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCargaFamiliar_NM(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCargaFamiliar_NM);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCargaFamiliar_NM.isMaximum()) {
					this.jInternalFrameDetalleFormCargaFamiliar_NM.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCargaFamiliar_NM.setSize(this.jInternalFrameDetalleFormCargaFamiliar_NM.iWidthFormulario,this.jInternalFrameDetalleFormCargaFamiliar_NM.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCargaFamiliar_NM.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCargaFamiliar_NM.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCargaFamiliar_NM.isMaximum()) {
						this.jInternalFrameDetalleFormCargaFamiliar_NM.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCargaFamiliar_NM.jContentPaneDetalleCargaFamiliar_NM.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCargaFamiliar_NM.jTabbedPaneRelacionesCargaFamiliar_NM.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCargaFamiliar_NM.jContentPaneDetalleCargaFamiliar_NM.getWidth(),CargaFamiliar_NMConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCargaFamiliar_NM.jTabbedPaneRelacionesCargaFamiliar_NM.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCargaFamiliar_NM.jContentPaneDetalleCargaFamiliar_NM.getWidth(),CargaFamiliar_NMConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCargaFamiliar_NM.jTabbedPaneRelacionesCargaFamiliar_NM.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCargaFamiliar_NM.jContentPaneDetalleCargaFamiliar_NM.getWidth(),CargaFamiliar_NMConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCargaFamiliar_NM.setVisible(true);
	        this.jInternalFrameDetalleFormCargaFamiliar_NM.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCargaFamiliar_NM() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCargaFamiliar_NM==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCargaFamiliar_NM=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCargaFamiliar_NM,false,this);
				} else {
					this.jInternalFrameOrderByCargaFamiliar_NM=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCargaFamiliar_NM,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCargaFamiliar_NM);
				this.jInternalFrameOrderByCargaFamiliar_NM.setVisible(false);
				this.jInternalFrameOrderByCargaFamiliar_NM.setSelected(false);
				
				this.jInternalFrameOrderByCargaFamiliar_NM.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCargaFamiliar_NM"));
				
				this.inicializarActualizarBindingTablaOrderByCargaFamiliar_NM();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCargaFamiliar_NM() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCargaFamiliar_NM==null) {
				
				this.jInternalFrameImportacionCargaFamiliar_NM=new ImportacionJInternalFrame(CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCargaFamiliar_NM);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCargaFamiliar_NM);
				this.jInternalFrameImportacionCargaFamiliar_NM.setVisible(false);
				this.jInternalFrameImportacionCargaFamiliar_NM.setSelected(false);


				this.jInternalFrameImportacionCargaFamiliar_NM.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCargaFamiliar_NM"));
				this.jInternalFrameImportacionCargaFamiliar_NM.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCargaFamiliar_NM"));
				this.jInternalFrameImportacionCargaFamiliar_NM.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCargaFamiliar_NM"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCargaFamiliar_NM() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCargaFamiliar_NM==null) {
				this.jInternalFrameReporteDinamicoCargaFamiliar_NM=new ReporteDinamicoJInternalFrame(CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCargaFamiliar_NM);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCargaFamiliar_NM);
				this.jInternalFrameReporteDinamicoCargaFamiliar_NM.setVisible(false);
				this.jInternalFrameReporteDinamicoCargaFamiliar_NM.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCargaFamiliar_NM"));
				this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCargaFamiliar_NM"));
				this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCargaFamiliar_NM"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCargaFamiliar_NM();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCargaFamiliar_NM() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCargaFamiliar_NM);
			
	       	this.jInternalFrameDetalleFormCargaFamiliar_NM.setVisible(false);
	        this.jInternalFrameDetalleFormCargaFamiliar_NM.setSelected(false);
			
			//this.jInternalFrameDetalleFormCargaFamiliar_NM.dispose();
			//this.jInternalFrameDetalleFormCargaFamiliar_NM=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCargaFamiliar_NM() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCargaFamiliar_NM.setVisible(true);
	        this.jInternalFrameReporteDinamicoCargaFamiliar_NM.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCargaFamiliar_NM() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCargaFamiliar_NM.setVisible(true);
	        this.jInternalFrameImportacionCargaFamiliar_NM.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCargaFamiliar_NM() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCargaFamiliar_NM.setVisible(true);
	        this.jInternalFrameOrderByCargaFamiliar_NM.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCargaFamiliar_NM() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCargaFamiliar_NM.setVisible(false);
	        this.jInternalFrameOrderByCargaFamiliar_NM.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCargaFamiliar_NM() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCargaFamiliar_NM.setVisible(false);
	        this.jInternalFrameReporteDinamicoCargaFamiliar_NM.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCargaFamiliar_NM() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCargaFamiliar_NM.setVisible(false);
	        this.jInternalFrameImportacionCargaFamiliar_NM.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCargaFamiliar_NM(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCargaFamiliar_NM(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCargaFamiliar_NM(true);
			//this.isEsNuevoCargaFamiliar_NM=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCargaFamiliar_NM("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCargaFamiliar_NM(false) ;
			
			if(cargafamiliar_nmSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CargaFamiliar_NMJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCargaFamiliar_NM(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCargaFamiliar_NM(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCargaFamiliar_NMActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCargaFamiliar_NM(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCargaFamiliar_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCargaFamiliar_NM(true);
			//this.isEsNuevoCargaFamiliar_NM=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cargafamiliar_nm.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCargaFamiliar_NM("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCargaFamiliar_NM(false) ;
			
			if(CargaFamiliar_NMJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCargaFamiliar_NM(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCargaFamiliar_NM(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.cargafamiliar_nmConstantesFunciones.cargarid_empleadoCargaFamiliar_NM) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCargaFamiliar_NM(false,false);
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado (id);

				this.recargarComboTablaEmpleado(this.empleadosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar_NM,CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCargaFamiliar_NM.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoCargaFami(List<TipoCargaFami> tipocargafamisForeignKey)throws Exception{
		TableColumn tableColumnTipoCargaFami=this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar_NM,CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOCARGAFAMI));
		TableCellEditor tableCellEditorTipoCargaFami =tableColumnTipoCargaFami.getCellEditor();

		TipoCargaFamiTableCell tipocargafamiTableCellFk=(TipoCargaFamiTableCell)tableCellEditorTipoCargaFami;

		if(tipocargafamiTableCellFk!=null) {
			tipocargafamiTableCellFk.settipocargafamisForeignKey(tipocargafamisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCargaFamiliar_NM.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocargafamiTableCellFk.setRowActual(intSelectedRow);
			//tipocargafamiTableCellFk.settipocargafamisForeignKeyActual(tipocargafamisForeignKey);
		//}


		if(tipocargafamiTableCellFk!=null) {
			tipocargafamiTableCellFk.RecargarTipoCargaFamisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoGenero(List<TipoGenero> tipogenerosForeignKey)throws Exception{
		TableColumn tableColumnTipoGenero=this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar_NM,CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOGENERO));
		TableCellEditor tableCellEditorTipoGenero =tableColumnTipoGenero.getCellEditor();

		TipoGeneroTableCell tipogeneroTableCellFk=(TipoGeneroTableCell)tableCellEditorTipoGenero;

		if(tipogeneroTableCellFk!=null) {
			tipogeneroTableCellFk.settipogenerosForeignKey(tipogenerosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCargaFamiliar_NM.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipogeneroTableCellFk.setRowActual(intSelectedRow);
			//tipogeneroTableCellFk.settipogenerosForeignKeyActual(tipogenerosForeignKey);
		//}


		if(tipogeneroTableCellFk!=null) {
			tipogeneroTableCellFk.RecargarTipoGenerosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoCivil(List<EstadoCivil> estadocivilsForeignKey)throws Exception{
		TableColumn tableColumnEstadoCivil=this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar_NM,CargaFamiliar_NMConstantesFunciones.LABEL_IDESTADOCIVIL));
		TableCellEditor tableCellEditorEstadoCivil =tableColumnEstadoCivil.getCellEditor();

		EstadoCivilTableCell estadocivilTableCellFk=(EstadoCivilTableCell)tableCellEditorEstadoCivil;

		if(estadocivilTableCellFk!=null) {
			estadocivilTableCellFk.setestadocivilsForeignKey(estadocivilsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCargaFamiliar_NM.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadocivilTableCellFk.setRowActual(intSelectedRow);
			//estadocivilTableCellFk.setestadocivilsForeignKeyActual(estadocivilsForeignKey);
		//}


		if(estadocivilTableCellFk!=null) {
			estadocivilTableCellFk.RecargarEstadoCivilsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCargaFamiliar_NM(false);
			
			//if(!this.isEsNuevoCargaFamiliar_NM) {								
				int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.cargafamiliar_nm,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
				
			}
			
			if(this.permiteMantenimiento(this.cargafamiliar_nm)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCargaFamiliar_NM=true;
					this.inicializarActualizarBindingTablaCargaFamiliar_NM(false);
					this.isEsNuevoCargaFamiliar_NM=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCargaFamiliar_NM=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCargaFamiliar_NM=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCargaFamiliar_NM(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCargaFamiliar_NM(false);
				
				this.habilitarDeshabilitarControlesCargaFamiliar_NM(false);
			
												
				
				if(CargaFamiliar_NMJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCargaFamiliar_NM();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCargaFamiliar_NMActionPerformed(evt,cargafamiliar_nmSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCargaFamiliar_NM(this.cargafamiliar_nm,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCargaFamiliar_NM.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cargafamiliar_nmSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cargafamiliar_nm.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar_NM.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar_NM.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				this.cargafamiliar_nm.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				this.cargafamiliar_nm.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cargafamiliar_nm)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CargaFamiliar_NMModel) this.jTableDatosCargaFamiliar_NM.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCargaFamiliar_NM=true;
				this.inicializarActualizarBindingTablaCargaFamiliar_NM(false);
				this.isEsNuevoCargaFamiliar_NM=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCargaFamiliar_NM(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCargaFamiliar_NM(false);
				
				this.habilitarDeshabilitarControlesCargaFamiliar_NM(false);
				
				
				
				if(CargaFamiliar_NMJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCargaFamiliar_NM();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCargaFamiliar_NM.getRowCount()>=1) {
				jTableDatosCargaFamiliar_NM.removeRowSelectionInterval(0, jTableDatosCargaFamiliar_NM.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCargaFamiliar_NM(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCargaFamiliar_NM(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCargaFamiliar_NM(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCargaFamiliar_NM(false) ;
			
			this.isEsNuevoCargaFamiliar_NM=false;
			
			if(CargaFamiliar_NMJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCargaFamiliar_NM();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCargaFamiliar_NM(false);
				
				//SI ES MANUAL
				if(CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCargaFamiliar_NM();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCargaFamiliar_NM--;			
			//CargaFamiliar_NM cargafamiliar_nmAux= new CargaFamiliar_NM();			
			//cargafamiliar_nmAux.setId(this.iIdNuevoCargaFamiliar_NM);
			
			if(this.jInternalFrameDetalleFormCargaFamiliar_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCargaFamiliar_NM();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
			
			this.cargafamiliar_nm.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().add(this.cargafamiliar_nmAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cargafamiliar_nms.add(this.cargafamiliar_nmAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCargaFamiliar_NM(false);
			
			this.jTableDatosCargaFamiliar_NM.setRowSelectionInterval(this.getIndiceNuevoCargaFamiliar_NM(), this.getIndiceNuevoCargaFamiliar_NM());
			
			int iLastRow =  this.jTableDatosCargaFamiliar_NM.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCargaFamiliar_NM.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCargaFamiliar_NM.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCargaFamiliar_NM(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCargaFamiliar_NM(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCargaFamiliar_NM(false);
			
			//SI ES MANUAL
			if(CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCargaFamiliar_NM();
			}
			
			//this.abrirFrameTreeCargaFamiliar_NM();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Carga Familiar_ N MES ?", "MANTENIMIENTO DE Carga Familiar_ N M", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCargaFamiliar_NM.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCargaFamiliar_NM();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cargafamiliar_nmReturnGeneral=cargafamiliar_nmLogic.procesarImportacionCargaFamiliar_NMsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cargafamiliar_nmParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCargaFamiliar_NMReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCargaFamiliar_NM.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCargaFamiliar_NM.setFileImportacion(this.jInternalFrameImportacionCargaFamiliar_NM.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCargaFamiliar_NM.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCargaFamiliar_NM.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCargaFamiliar_NM.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCargaFamiliar_NM.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CargaFamiliar_NM> cargafamiliar_nmsSeleccionados=new ArrayList<CargaFamiliar_NM>();		

		cargafamiliar_nmsSeleccionados=this.getCargaFamiliar_NMsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CargaFamiliar_NMBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CargaFamiliar_NMBaseDesign.jrxml";
			
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
			
			this.generarReporteCargaFamiliar_NMs("Todos",cargafamiliar_nmsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Carga Familiar_ N M",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOCARGAFAMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoCargaFami_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoCargaFami_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoCargaFami_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoCargaFami_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOGENERO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoGenero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoGenero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoGenero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoGenero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_IDESTADOCIVIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoCivil_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoCivil_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoCivil_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoCivil_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_CEDULA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_dula_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_dula_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_dula_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_dula_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_APELLIDO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_FECHANACIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaNacimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaNacimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaNacimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaNacimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_VALORCUPO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorCupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorCupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorCupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorCupo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOCARGAFAMI:
					sNombreCampoCategoria="id_tipo_carga_fami";
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOGENERO:
					sNombreCampoCategoria="id_tipo_genero";
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_IDESTADOCIVIL:
					sNombreCampoCategoria="id_estado_civil";
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_CEDULA:
					sNombreCampoCategoria="cedula";
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoria="apellido";
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_FECHANACIMIENTO:
					sNombreCampoCategoria="fecha_nacimiento";
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_VALORCUPO:
					sNombreCampoCategoria="valor_cupo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOCARGAFAMI:
					sNombreCampoCategoriaValor="id_tipo_carga_fami";
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOGENERO:
					sNombreCampoCategoriaValor="id_tipo_genero";
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_IDESTADOCIVIL:
					sNombreCampoCategoriaValor="id_estado_civil";
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_CEDULA:
					sNombreCampoCategoriaValor="cedula";
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoriaValor="apellido";
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_FECHANACIMIENTO:
					sNombreCampoCategoriaValor="fecha_nacimiento";
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_VALORCUPO:
					sNombreCampoCategoriaValor="valor_cupo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOCARGAFAMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Carga Fami",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_carga_fami");
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOGENERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Genero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_genero");
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_IDESTADOCIVIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado Civil",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_civil");
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_CEDULA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cedula",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cedula");
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_APELLIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apellido",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellido");
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_FECHANACIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Nacimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_nacimiento");
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_VALORCUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Cupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_cupo");
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
	
	public void jButtonGenerarExcelReporteDinamicoCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CargaFamiliar_NM> cargafamiliar_nmsSeleccionados=new ArrayList<CargaFamiliar_NM>();		
		
		cargafamiliar_nmsSeleccionados=this.getCargaFamiliar_NMsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargafamiliar_nm";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CargaFamiliar_NMs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CargaFamiliar_NM cargafamiliar_nm:cargafamiliar_nmsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar_nm.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(CargaFamiliar_NM cargafamiliar_nm:cargafamiliar_nmsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar_nm.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOCARGAFAMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOCARGAFAMI);
					iRow++;

					for(CargaFamiliar_NM cargafamiliar_nm:cargafamiliar_nmsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar_nm.gettipocargafami_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOGENERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOGENERO);
					iRow++;

					for(CargaFamiliar_NM cargafamiliar_nm:cargafamiliar_nmsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar_nm.gettipogenero_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_IDESTADOCIVIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_IDESTADOCIVIL);
					iRow++;

					for(CargaFamiliar_NM cargafamiliar_nm:cargafamiliar_nmsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar_nm.getestadocivil_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_CEDULA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_CEDULA);
					iRow++;

					for(CargaFamiliar_NM cargafamiliar_nm:cargafamiliar_nmsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar_nm.getcedula());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_APELLIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_APELLIDO);
					iRow++;

					for(CargaFamiliar_NM cargafamiliar_nm:cargafamiliar_nmsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar_nm.getapellido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(CargaFamiliar_NM cargafamiliar_nm:cargafamiliar_nmsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar_nm.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(CargaFamiliar_NM cargafamiliar_nm:cargafamiliar_nmsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar_nm.getdireccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_FECHANACIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_FECHANACIMIENTO);
					iRow++;

					for(CargaFamiliar_NM cargafamiliar_nm:cargafamiliar_nmsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar_nm.getfecha_nacimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargaFamiliar_NMConstantesFunciones.LABEL_VALORCUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_VALORCUPO);
					iRow++;

					for(CargaFamiliar_NM cargafamiliar_nm:cargafamiliar_nmsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargafamiliar_nm.getvalor_cupo());
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
			//	this.getFilaCabeceraExportarExcelCargaFamiliar_NM(row);				
			//	iRow++;
			//}				
			
			//for(CargaFamiliar_NM cargafamiliar_nmAux:cargafamiliar_nmsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCargaFamiliar_NM(cargafamiliar_nmAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Carga Familiar_ N M",JOptionPane.INFORMATION_MESSAGE);
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
				this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCargaFamiliar_NM(false);
			
			//SI ES MANUAL
			if(CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCargaFamiliar_NM();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCargaFamiliar_NM(false);
			
			//SI ES MANUAL
			if(CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCargaFamiliar_NM();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCargaFamiliar_NM(false);
			
			//SI ES MANUAL
			if(CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCargaFamiliar_NM();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCargaFamiliar_NM() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCargaFamiliar_NM.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCargaFamiliar_NM.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCargaFamiliar_NM.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCargaFamiliar_NM.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCargaFamiliar_NM.setMinimumSize(dimensionMinimum);
		this.jTableDatosCargaFamiliar_NM.setMaximumSize(dimensionMaximum);
		this.jTableDatosCargaFamiliar_NM.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCargaFamiliar_NM(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCargaFamiliar_NM(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCargaFamiliar_NM(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCargaFamiliar_NM(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCargaFamiliar_NM(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCargaFamiliar_NM(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCargaFamiliar_NM(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCargaFamiliar_NM(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCargaFamiliar_NM() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCargaFamiliar_NM();
		
		this.inicializarActualizarBindingBotonesManualCargaFamiliar_NM(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCargaFamiliar_NM();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCargaFamiliar_NM() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCargaFamiliar_NM(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCargaFamiliar_NM(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCargaFamiliar_NM.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCargaFamiliar_NM.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCargaFamiliar_NM.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCargaFamiliar_NM.jCheckBoxPostAccionNuevoCargaFamiliar_NM.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCargaFamiliar_NM.jCheckBoxPostAccionSinCerrarCargaFamiliar_NM.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCargaFamiliar_NM.jCheckBoxPostAccionSinMensajeCargaFamiliar_NM.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCargaFamiliar_NM.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCargaFamiliar_NM.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCargaFamiliar_NM.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
				this.jInternalFrameDetalleFormCargaFamiliar_NM.jCheckBoxPostAccionNuevoCargaFamiliar_NM.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCargaFamiliar_NM.jCheckBoxPostAccionSinCerrarCargaFamiliar_NM.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCargaFamiliar_NM.jCheckBoxPostAccionSinMensajeCargaFamiliar_NM.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCargaFamiliar_NM.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCargaFamiliar_NM.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxTiposAccionesFormularioCargaFamiliar_NM.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCargaFamiliar_NM.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCargaFamiliar_NM!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCargaFamiliar_NM.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCargaFamiliar_NM.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCargaFamiliar_NM.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCargaFamiliar_NM.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCargaFamiliar_NM!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCargaFamiliar_NM.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCargaFamiliar_NM.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCargaFamiliar_NM(Boolean esInicializar) throws Exception {
		try	{	
			if(CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCargaFamiliar_NM(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCargaFamiliar_NM() throws Exception {
		try	{
			if(CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCargaFamiliar_NM();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCargaFamiliar_NM() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxTiposAccionesFormularioCargaFamiliar_NM.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxTiposAccionesFormularioCargaFamiliar_NM.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCargaFamiliar_NM() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCargaFamiliar_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCargaFamiliar_NM.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCargaFamiliar_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCargaFamiliar_NM.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCargaFamiliar_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCargaFamiliar_NM.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCargaFamiliar_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCargaFamiliar_NM.addItem(reporte);
			}
			
			
			if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCargaFamiliar_NM.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCargaFamiliar_NM.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCargaFamiliar_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCargaFamiliar_NM.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCargaFamiliar_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCargaFamiliar_NM.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxTiposAccionesFormularioCargaFamiliar_NM.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxTiposAccionesFormularioCargaFamiliar_NM.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCargaFamiliar_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCargaFamiliar_NM.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCargaFamiliar_NM.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCargaFamiliar_NM();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCargaFamiliar_NM() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCargaFamiliar_NM!=null) {
				this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCargaFamiliar_NM!=null) {
				this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCargaFamiliar_NM!=null) {
				
				if(this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CargaFamiliar_NMConstantesFunciones.getTiposSeleccionarCargaFamiliar_NM(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CargaFamiliar_NMConstantesFunciones.getTiposSeleccionarCargaFamiliar_NM(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CargaFamiliar_NMConstantesFunciones.getTiposSeleccionarCargaFamiliar_NM(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCargaFamiliar_NM()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoCargaFamiliar_NM.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoCargaFamiliar_NM.getSelectedItem()).getId();}
		if(this.jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM.getSelectedItem()!=null){this.id_estado_civilFK_IdEstadoCivil=((EstadoCivil)this.jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM.getSelectedItem()!=null){this.id_tipo_carga_famiFK_IdTipoCargaFami=((TipoCargaFami)this.jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM.getSelectedItem()!=null){this.id_tipo_generoFK_IdTipoGenero=((TipoGenero)this.jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCargaFamiliar_NM(Boolean esInicializar) throws Exception {				
		if(CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCargaFamiliar_NM();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCargaFamiliar_NM() throws Exception {
		this.inicializarActualizarBindingTablaCargaFamiliar_NM(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCargaFamiliar_NM() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCargaFamiliar_NM.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCargaFamiliar_NM.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCargaFamiliar_NM.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CargaFamiliar_NMPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCargaFamiliar_NM.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCargaFamiliar_NM.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CargaFamiliar_NMPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCargaFamiliar_NMOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar_NMOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CargaFamiliar_NMPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCargaFamiliar_NM.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCargaFamiliar_NM.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CargaFamiliar_NMPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCargaFamiliar_NM.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCargaFamiliar_NM(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cargafamiliar_nmLogic.getCargaFamiliar_NMs().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cargafamiliar_nms.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCargaFamiliar_NM.setModel(new CargaFamiliar_NMModel(this.cargafamiliar_nmLogic.getCargaFamiliar_NMs(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCargaFamiliar_NM.setModel(new CargaFamiliar_NMModel(this.cargafamiliar_nms,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCargaFamiliar_NM!=null && this.jInternalFrameOrderByCargaFamiliar_NM.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCargaFamiliar_NM();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar_NM,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CargaFamiliar_NMPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO,cargafamiliar_nmConstantesFunciones.resaltarSeleccionarCargaFamiliar_NM,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO,cargafamiliar_nmConstantesFunciones.resaltarSeleccionarCargaFamiliar_NM,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar_NM,CargaFamiliar_NMConstantesFunciones.LABEL_ID));

		if(this.cargafamiliar_nmConstantesFunciones.mostraridCargaFamiliar_NM && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliar_NMConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cargafamiliar_nmConstantesFunciones.resaltaridCargaFamiliar_NM,this.cargafamiliar_nmConstantesFunciones.activaridCargaFamiliar_NM,iSizeTabla,this,true,"idCargaFamiliar_NM","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargafamiliar_nmConstantesFunciones.resaltaridCargaFamiliar_NM,this.cargafamiliar_nmConstantesFunciones.activaridCargaFamiliar_NM,this,true,"idCargaFamiliar_NM","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar_NM,CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPRESA));

		if(this.cargafamiliar_nmConstantesFunciones.mostrarid_empresaCargaFamiliar_NM && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.cargafamiliar_nmConstantesFunciones.resaltarid_empresaCargaFamiliar_NM,this,this.cargafamiliar_nmConstantesFunciones.activarid_empresaCargaFamiliar_NM,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.cargafamiliar_nmConstantesFunciones.resaltarid_empresaCargaFamiliar_NM,this,this.cargafamiliar_nmConstantesFunciones.activarid_empresaCargaFamiliar_NM,false,"id_empresaCargaFamiliar_NM","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargaFamiliar_NMPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar_NM,CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.cargafamiliar_nmConstantesFunciones.mostrarid_empleadoCargaFamiliar_NM && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.cargafamiliar_nmConstantesFunciones.resaltarid_empleadoCargaFamiliar_NM,this,this.cargafamiliar_nmConstantesFunciones.activarid_empleadoCargaFamiliar_NM,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.cargafamiliar_nmConstantesFunciones.resaltarid_empleadoCargaFamiliar_NM,this,this.cargafamiliar_nmConstantesFunciones.activarid_empleadoCargaFamiliar_NM,true,"id_empleadoCargaFamiliar_NM","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new CargaFamiliar_NMPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar_NM,CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOCARGAFAMI));

		if(this.cargafamiliar_nmConstantesFunciones.mostrarid_tipo_carga_famiCargaFamiliar_NM && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOCARGAFAMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoCargaFamiTableCell(this.tipocargafamisForeignKey,this.cargafamiliar_nmConstantesFunciones.resaltarid_tipo_carga_famiCargaFamiliar_NM,this,this.cargafamiliar_nmConstantesFunciones.activarid_tipo_carga_famiCargaFamiliar_NM,iSizeTabla));
			tableColumn.setCellEditor(new TipoCargaFamiTableCell(this.tipocargafamisForeignKey,this.cargafamiliar_nmConstantesFunciones.resaltarid_tipo_carga_famiCargaFamiliar_NM,this,this.cargafamiliar_nmConstantesFunciones.activarid_tipo_carga_famiCargaFamiliar_NM,true,"id_tipo_carga_famiCargaFamiliar_NM","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargaFamiliar_NMPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar_NM,CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOGENERO));

		if(this.cargafamiliar_nmConstantesFunciones.mostrarid_tipo_generoCargaFamiliar_NM && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOGENERO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoGeneroTableCell(this.tipogenerosForeignKey,this.cargafamiliar_nmConstantesFunciones.resaltarid_tipo_generoCargaFamiliar_NM,this,this.cargafamiliar_nmConstantesFunciones.activarid_tipo_generoCargaFamiliar_NM,iSizeTabla));
			tableColumn.setCellEditor(new TipoGeneroTableCell(this.tipogenerosForeignKey,this.cargafamiliar_nmConstantesFunciones.resaltarid_tipo_generoCargaFamiliar_NM,this,this.cargafamiliar_nmConstantesFunciones.activarid_tipo_generoCargaFamiliar_NM,true,"id_tipo_generoCargaFamiliar_NM","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargaFamiliar_NMPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar_NM,CargaFamiliar_NMConstantesFunciones.LABEL_IDESTADOCIVIL));

		if(this.cargafamiliar_nmConstantesFunciones.mostrarid_estado_civilCargaFamiliar_NM && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliar_NMConstantesFunciones.LABEL_IDESTADOCIVIL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoCivilTableCell(this.estadocivilsForeignKey,this.cargafamiliar_nmConstantesFunciones.resaltarid_estado_civilCargaFamiliar_NM,this,this.cargafamiliar_nmConstantesFunciones.activarid_estado_civilCargaFamiliar_NM,iSizeTabla));
			tableColumn.setCellEditor(new EstadoCivilTableCell(this.estadocivilsForeignKey,this.cargafamiliar_nmConstantesFunciones.resaltarid_estado_civilCargaFamiliar_NM,this,this.cargafamiliar_nmConstantesFunciones.activarid_estado_civilCargaFamiliar_NM,true,"id_estado_civilCargaFamiliar_NM","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargaFamiliar_NMPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar_NM,CargaFamiliar_NMConstantesFunciones.LABEL_CEDULA));

		if(this.cargafamiliar_nmConstantesFunciones.mostrarcedulaCargaFamiliar_NM && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliar_NMConstantesFunciones.LABEL_CEDULA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cargafamiliar_nmConstantesFunciones.resaltarcedulaCargaFamiliar_NM,this.cargafamiliar_nmConstantesFunciones.activarcedulaCargaFamiliar_NM,iSizeTabla,this,true,"cedulaCargaFamiliar_NM","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargafamiliar_nmConstantesFunciones.resaltarcedulaCargaFamiliar_NM,this.cargafamiliar_nmConstantesFunciones.activarcedulaCargaFamiliar_NM,this,true,"cedulaCargaFamiliar_NM","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargaFamiliar_NMPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar_NM,CargaFamiliar_NMConstantesFunciones.LABEL_APELLIDO));

		if(this.cargafamiliar_nmConstantesFunciones.mostrarapellidoCargaFamiliar_NM && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliar_NMConstantesFunciones.LABEL_APELLIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cargafamiliar_nmConstantesFunciones.resaltarapellidoCargaFamiliar_NM,this.cargafamiliar_nmConstantesFunciones.activarapellidoCargaFamiliar_NM,iSizeTabla,this,true,"apellidoCargaFamiliar_NM","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargafamiliar_nmConstantesFunciones.resaltarapellidoCargaFamiliar_NM,this.cargafamiliar_nmConstantesFunciones.activarapellidoCargaFamiliar_NM,this,true,"apellidoCargaFamiliar_NM","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargaFamiliar_NMPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar_NM,CargaFamiliar_NMConstantesFunciones.LABEL_NOMBRE));

		if(this.cargafamiliar_nmConstantesFunciones.mostrarnombreCargaFamiliar_NM && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliar_NMConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cargafamiliar_nmConstantesFunciones.resaltarnombreCargaFamiliar_NM,this.cargafamiliar_nmConstantesFunciones.activarnombreCargaFamiliar_NM,iSizeTabla,this,true,"nombreCargaFamiliar_NM","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargafamiliar_nmConstantesFunciones.resaltarnombreCargaFamiliar_NM,this.cargafamiliar_nmConstantesFunciones.activarnombreCargaFamiliar_NM,this,true,"nombreCargaFamiliar_NM","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargaFamiliar_NMPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar_NM,CargaFamiliar_NMConstantesFunciones.LABEL_DIRECCION));

		if(this.cargafamiliar_nmConstantesFunciones.mostrardireccionCargaFamiliar_NM && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliar_NMConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cargafamiliar_nmConstantesFunciones.resaltardireccionCargaFamiliar_NM,this.cargafamiliar_nmConstantesFunciones.activardireccionCargaFamiliar_NM,iSizeTabla,this,true,"direccionCargaFamiliar_NM","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargafamiliar_nmConstantesFunciones.resaltardireccionCargaFamiliar_NM,this.cargafamiliar_nmConstantesFunciones.activardireccionCargaFamiliar_NM,this,true,"direccionCargaFamiliar_NM","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargaFamiliar_NMPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar_NM,CargaFamiliar_NMConstantesFunciones.LABEL_FECHANACIMIENTO));

		if(this.cargafamiliar_nmConstantesFunciones.mostrarfecha_nacimientoCargaFamiliar_NM && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliar_NMConstantesFunciones.LABEL_FECHANACIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cargafamiliar_nmConstantesFunciones.resaltarfecha_nacimientoCargaFamiliar_NM,this.cargafamiliar_nmConstantesFunciones.activarfecha_nacimientoCargaFamiliar_NM,iSizeTabla,this,true,"fecha_nacimientoCargaFamiliar_NM","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cargafamiliar_nmConstantesFunciones.resaltarfecha_nacimientoCargaFamiliar_NM,this.cargafamiliar_nmConstantesFunciones.activarfecha_nacimientoCargaFamiliar_NM,this,true,"fecha_nacimientoCargaFamiliar_NM","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CargaFamiliar_NMPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar_NM,CargaFamiliar_NMConstantesFunciones.LABEL_VALORCUPO));

		if(this.cargafamiliar_nmConstantesFunciones.mostrarvalor_cupoCargaFamiliar_NM && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargaFamiliar_NMConstantesFunciones.LABEL_VALORCUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cargafamiliar_nmConstantesFunciones.resaltarvalor_cupoCargaFamiliar_NM,this.cargafamiliar_nmConstantesFunciones.activarvalor_cupoCargaFamiliar_NM,iSizeTabla,this,true,"valor_cupoCargaFamiliar_NM","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargafamiliar_nmConstantesFunciones.resaltarvalor_cupoCargaFamiliar_NM,this.cargafamiliar_nmConstantesFunciones.activarvalor_cupoCargaFamiliar_NM,this,true,"valor_cupoCargaFamiliar_NM","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CargaFamiliar_NMPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCargaFamiliar_NM.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCargaFamiliar_NM.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCargaFamiliar_NM && this.isPermisoGuardarCambiosCargaFamiliar_NM) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCargaFamiliar_NM.addColumn(tableColumn);
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
			
			this.jTableDatosCargaFamiliar_NM.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCargaFamiliar_NM && this.isPermisoGuardarCambiosCargaFamiliar_NM) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCargaFamiliar_NM && this.isPermisoGuardarCambiosCargaFamiliar_NM) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCargaFamiliar_NM.moveColumn(this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCargaFamiliar_NM.moveColumn(this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCargaFamiliar_NM.moveColumn(this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCargaFamiliar_NM.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCargaFamiliar_NM.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCargaFamiliar_NM,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCargaFamiliar_NM.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCargaFamiliar_NM.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCargaFamiliar_NM.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cargafamiliar_nmLogic.getCargaFamiliar_NMs().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cargafamiliar_nms.size()-1;
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
		//this.jTableDatosCargaFamiliar_NM.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCargaFamiliar_NM();
			
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
				
				//this.isEsNuevoCargaFamiliar_NM=false;
					
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
			
				if(this.cargafamiliar_nmSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCargaFamiliar_NM==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCargaFamiliar_NM.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCargaFamiliar_NM.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cargafamiliar_nm.getsType().equals("DUPLICADO")
				   || this.cargafamiliar_nm.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCargaFamiliar_NM=true;
				
				} else {
					this.isEsNuevoCargaFamiliar_NM=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
					if(this.cargafamiliar_nm.getId()>=0 && !this.cargafamiliar_nm.getIsNew()) {						
						this.isEsNuevoCargaFamiliar_NM=false;
						
					} else {
						this.isEsNuevoCargaFamiliar_NM=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCargaFamiliar_NM(esRelaciones);						
				
				this.seleccionarCargaFamiliar_NM(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cargafamiliar_nm.getId()<0) {
					this.isEsNuevoCargaFamiliar_NM=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCargaFamiliar_NM(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCargaFamiliar_NM(evt,rowIndex);
				}	
				
				if(this.cargafamiliar_nmSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CargaFamiliar_NM: " + this.dDif); 
					}
				}								
				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCargaFamiliar_NM(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cargafamiliar_nm)) {
					if(this.cargafamiliar_nm.getId()>0) {
						this.cargafamiliar_nm.setIsDeleted(true);
						
						this.cargafamiliar_nmsEliminados.add(this.cargafamiliar_nm);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().remove(this.cargafamiliar_nm);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cargafamiliar_nms.remove(this.cargafamiliar_nm);				
					}
					
					
					((CargaFamiliar_NMModel) this.jTableDatosCargaFamiliar_NM.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCargaFamiliar_NM(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCargaFamiliar_NM(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCargaFamiliar_NM) {
			
			if(this.jInternalFrameDetalleFormCargaFamiliar_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCargaFamiliar_NM.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCargaFamiliar_NM.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCargaFamiliar_NM(this.cargafamiliar_nm);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.cargafamiliar_nmConstantesFunciones.cargarid_empresaCargaFamiliar_NM || this.cargafamiliar_nmConstantesFunciones.event_dependid_empresaCargaFamiliar_NM) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.cargafamiliar_nm.getid_empresa());
									//this.inicializarActualizarBindingCargaFamiliar_NM(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(cargafamiliar_nm.getEmpresa()!=null) {
							this.empresasForeignKey.add(cargafamiliar_nm.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.cargafamiliar_nm.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.cargafamiliar_nmConstantesFunciones.cargarid_empleadoCargaFamiliar_NM || this.cargafamiliar_nmConstantesFunciones.event_dependid_empleadoCargaFamiliar_NM) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.cargafamiliar_nm.getid_empleado());
									//this.inicializarActualizarBindingCargaFamiliar_NM(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(cargafamiliar_nm.getEmpleado()!=null) {
							this.empleadosForeignKey.add(cargafamiliar_nm.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.cargafamiliar_nm.getid_empleado(),false,"Formulario");

					//TipoCargaFami
					if(!this.cargafamiliar_nmConstantesFunciones.cargarid_tipo_carga_famiCargaFamiliar_NM || this.cargafamiliar_nmConstantesFunciones.event_dependid_tipo_carga_famiCargaFamiliar_NM) {
						//this.cargarCombosTipoCargaFamisForeignKeyLista(" where id="+this.cargafamiliar_nm.getid_tipo_carga_fami());
									//this.inicializarActualizarBindingCargaFamiliar_NM(false,false);
						this.tipocargafamisForeignKey=new ArrayList<TipoCargaFami>();

						if(cargafamiliar_nm.getTipoCargaFami()!=null) {
							this.tipocargafamisForeignKey.add(cargafamiliar_nm.getTipoCargaFami());
						}

						this.addItemDefectoCombosForeignKeyTipoCargaFami();
						this.cargarCombosFrameTipoCargaFamisForeignKey("Todos");
					}
					this.setActualTipoCargaFamiForeignKey(this.cargafamiliar_nm.getid_tipo_carga_fami(),false,"Formulario");

					//TipoGenero
					if(!this.cargafamiliar_nmConstantesFunciones.cargarid_tipo_generoCargaFamiliar_NM || this.cargafamiliar_nmConstantesFunciones.event_dependid_tipo_generoCargaFamiliar_NM) {
						//this.cargarCombosTipoGenerosForeignKeyLista(" where id="+this.cargafamiliar_nm.getid_tipo_genero());
									//this.inicializarActualizarBindingCargaFamiliar_NM(false,false);
						this.tipogenerosForeignKey=new ArrayList<TipoGenero>();

						if(cargafamiliar_nm.getTipoGenero()!=null) {
							this.tipogenerosForeignKey.add(cargafamiliar_nm.getTipoGenero());
						}

						this.addItemDefectoCombosForeignKeyTipoGenero();
						this.cargarCombosFrameTipoGenerosForeignKey("Todos");
					}
					this.setActualTipoGeneroForeignKey(this.cargafamiliar_nm.getid_tipo_genero(),false,"Formulario");

					//EstadoCivil
					if(!this.cargafamiliar_nmConstantesFunciones.cargarid_estado_civilCargaFamiliar_NM || this.cargafamiliar_nmConstantesFunciones.event_dependid_estado_civilCargaFamiliar_NM) {
						//this.cargarCombosEstadoCivilsForeignKeyLista(" where id="+this.cargafamiliar_nm.getid_estado_civil());
									//this.inicializarActualizarBindingCargaFamiliar_NM(false,false);
						this.estadocivilsForeignKey=new ArrayList<EstadoCivil>();

						if(cargafamiliar_nm.getEstadoCivil()!=null) {
							this.estadocivilsForeignKey.add(cargafamiliar_nm.getEstadoCivil());
						}

						this.addItemDefectoCombosForeignKeyEstadoCivil();
						this.cargarCombosFrameEstadoCivilsForeignKey("Todos");
					}
					this.setActualEstadoCivilForeignKey(this.cargafamiliar_nm.getid_estado_civil(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCargaFamiliar_NM("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCargaFamiliar_NM(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCargaFamiliar_NM() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCargaFamiliar_NM(CargaFamiliar_NM cargafamiliar_nm) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCargaFamiliar_NM(cargafamiliar_nm,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCargaFamiliar_NM(CargaFamiliar_NM cargafamiliar_nm,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCargaFamiliar_NM(cargafamiliar_nm);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCargaFamiliar_NM(cargafamiliar_nm,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCargaFamiliar_NM(cargafamiliar_nm);
	}
	
	public void setVariablesObjetoActualToFormularioCargaFamiliar_NM(CargaFamiliar_NM cargafamiliar_nm) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCargaFamiliar_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelidCargaFamiliar_NM.setText(cargafamiliar_nm.getId().toString());
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextFieldcedulaCargaFamiliar_NM.setText(cargafamiliar_nm.getcedula());
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreaapellidoCargaFamiliar_NM.setText(cargafamiliar_nm.getapellido());
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreanombreCargaFamiliar_NM.setText(cargafamiliar_nm.getnombre());
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreadireccionCargaFamiliar_NM.setText(cargafamiliar_nm.getdireccion());
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jDateChooserfecha_nacimientoCargaFamiliar_NM.setDate(cargafamiliar_nm.getfecha_nacimiento());
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextFieldvalor_cupoCargaFamiliar_NM.setText(cargafamiliar_nm.getvalor_cupo().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CargaFamiliar_NM cargafamiliar_nmLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cargafamiliar_nmLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CargaFamiliar_NM cargafamiliar_nmLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cargafamiliar_nmLocal=this.cargafamiliar_nm;
			} else {
				cargafamiliar_nmLocal=this.cargafamiliar_nmAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cargafamiliar_nmLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCargaFamiliar_NM(cargafamiliar_nmLocal,true);
					
					if(cargafamiliar_nmSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cargafamiliar_nmLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cargafamiliar_nmLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCargaFamiliar_NM(CargaFamiliar_NM cargafamiliar_nm,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(cargafamiliar_nm,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(cargafamiliar_nm);
	}
	
	public void setVariablesFormularioToObjetoActualCargaFamiliar_NM(CargaFamiliar_NM cargafamiliar_nm,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(cargafamiliar_nm,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCargaFamiliar_NM(CargaFamiliar_NM cargafamiliar_nm,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCargaFamiliar_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelidCargaFamiliar_NM.getText()==null || this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelidCargaFamiliar_NM.getText()=="" || this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelidCargaFamiliar_NM.getText()=="Id") {
				this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelidCargaFamiliar_NM.setText("0");
			}

			if(conColumnasBase) {cargafamiliar_nm.setId(Long.parseLong(this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelidCargaFamiliar_NM.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargaFamiliar_NMConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelIdCargaFamiliar_NM,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargafamiliar_nm.setcedula(this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextFieldcedulaCargaFamiliar_NM.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargaFamiliar_NMConstantesFunciones.LABEL_CEDULA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelcedulaCargaFamiliar_NM,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargafamiliar_nm.setapellido(this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreaapellidoCargaFamiliar_NM.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargaFamiliar_NMConstantesFunciones.LABEL_APELLIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelapellidoCargaFamiliar_NM,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargafamiliar_nm.setnombre(this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreanombreCargaFamiliar_NM.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargaFamiliar_NMConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelnombreCargaFamiliar_NM,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargafamiliar_nm.setdireccion(this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreadireccionCargaFamiliar_NM.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargaFamiliar_NMConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabeldireccionCargaFamiliar_NM,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargafamiliar_nm.setfecha_nacimiento(this.jInternalFrameDetalleFormCargaFamiliar_NM.jDateChooserfecha_nacimientoCargaFamiliar_NM.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargaFamiliar_NMConstantesFunciones.LABEL_FECHANACIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelfecha_nacimientoCargaFamiliar_NM,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargafamiliar_nm.setvalor_cupo(Double.parseDouble(this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextFieldvalor_cupoCargaFamiliar_NM.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargaFamiliar_NMConstantesFunciones.LABEL_VALORCUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelvalor_cupoCargaFamiliar_NM,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCargaFamiliar_NM(CargaFamiliar_NM cargafamiliar_nmBean,CargaFamiliar_NM cargafamiliar_nm,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cargafamiliar_nmBean.getid_empleado()!=null && !cargafamiliar_nmBean.getid_empleado().equals(-1L))) {cargafamiliar_nm.setid_empleado(cargafamiliar_nmBean.getid_empleado());}
			if(conDefault || (!conDefault && cargafamiliar_nmBean.getid_tipo_carga_fami()!=null && !cargafamiliar_nmBean.getid_tipo_carga_fami().equals(-1L))) {cargafamiliar_nm.setid_tipo_carga_fami(cargafamiliar_nmBean.getid_tipo_carga_fami());}
			if(conDefault || (!conDefault && cargafamiliar_nmBean.getid_tipo_genero()!=null && !cargafamiliar_nmBean.getid_tipo_genero().equals(-1L))) {cargafamiliar_nm.setid_tipo_genero(cargafamiliar_nmBean.getid_tipo_genero());}
			if(conDefault || (!conDefault && cargafamiliar_nmBean.getid_estado_civil()!=null && !cargafamiliar_nmBean.getid_estado_civil().equals(-1L))) {cargafamiliar_nm.setid_estado_civil(cargafamiliar_nmBean.getid_estado_civil());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCargaFamiliar_NM(CargaFamiliar_NM cargafamiliar_nmOrigen,CargaFamiliar_NM cargafamiliar_nm,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cargafamiliar_nmOrigen.getId()!=null && !cargafamiliar_nmOrigen.getId().equals(0L))) {cargafamiliar_nm.setId(cargafamiliar_nmOrigen.getId());}}
			if(conDefault || (!conDefault && cargafamiliar_nmOrigen.getid_empleado()!=null && !cargafamiliar_nmOrigen.getid_empleado().equals(-1L))) {cargafamiliar_nm.setid_empleado(cargafamiliar_nmOrigen.getid_empleado());}
			if(conDefault || (!conDefault && cargafamiliar_nmOrigen.getid_tipo_carga_fami()!=null && !cargafamiliar_nmOrigen.getid_tipo_carga_fami().equals(-1L))) {cargafamiliar_nm.setid_tipo_carga_fami(cargafamiliar_nmOrigen.getid_tipo_carga_fami());}
			if(conDefault || (!conDefault && cargafamiliar_nmOrigen.getid_tipo_genero()!=null && !cargafamiliar_nmOrigen.getid_tipo_genero().equals(-1L))) {cargafamiliar_nm.setid_tipo_genero(cargafamiliar_nmOrigen.getid_tipo_genero());}
			if(conDefault || (!conDefault && cargafamiliar_nmOrigen.getid_estado_civil()!=null && !cargafamiliar_nmOrigen.getid_estado_civil().equals(-1L))) {cargafamiliar_nm.setid_estado_civil(cargafamiliar_nmOrigen.getid_estado_civil());}
			if(conDefault || (!conDefault && cargafamiliar_nmOrigen.getcedula()!=null && !cargafamiliar_nmOrigen.getcedula().equals(""))) {cargafamiliar_nm.setcedula(cargafamiliar_nmOrigen.getcedula());}
			if(conDefault || (!conDefault && cargafamiliar_nmOrigen.getapellido()!=null && !cargafamiliar_nmOrigen.getapellido().equals(""))) {cargafamiliar_nm.setapellido(cargafamiliar_nmOrigen.getapellido());}
			if(conDefault || (!conDefault && cargafamiliar_nmOrigen.getnombre()!=null && !cargafamiliar_nmOrigen.getnombre().equals(""))) {cargafamiliar_nm.setnombre(cargafamiliar_nmOrigen.getnombre());}
			if(conDefault || (!conDefault && cargafamiliar_nmOrigen.getdireccion()!=null && !cargafamiliar_nmOrigen.getdireccion().equals(""))) {cargafamiliar_nm.setdireccion(cargafamiliar_nmOrigen.getdireccion());}
			if(conDefault || (!conDefault && cargafamiliar_nmOrigen.getfecha_nacimiento()!=null && !cargafamiliar_nmOrigen.getfecha_nacimiento().equals(new Date()))) {cargafamiliar_nm.setfecha_nacimiento(cargafamiliar_nmOrigen.getfecha_nacimiento());}
			if(conDefault || (!conDefault && cargafamiliar_nmOrigen.getvalor_cupo()!=null && !cargafamiliar_nmOrigen.getvalor_cupo().equals(0.0))) {cargafamiliar_nm.setvalor_cupo(cargafamiliar_nmOrigen.getvalor_cupo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCargaFamiliar_NM(CargaFamiliar_NM cargafamiliar_nm) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelidCargaFamiliar_NM.setText(cargafamiliar_nm.getId().toString());
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextFieldcedulaCargaFamiliar_NM.setText(cargafamiliar_nm.getcedula());
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreaapellidoCargaFamiliar_NM.setText(cargafamiliar_nm.getapellido());
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreanombreCargaFamiliar_NM.setText(cargafamiliar_nm.getnombre());
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreadireccionCargaFamiliar_NM.setText(cargafamiliar_nm.getdireccion());
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jDateChooserfecha_nacimientoCargaFamiliar_NM.setDate(cargafamiliar_nm.getfecha_nacimiento());
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextFieldvalor_cupoCargaFamiliar_NM.setText(cargafamiliar_nm.getvalor_cupo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCargaFamiliar_NM(CargaFamiliar_NMBean cargafamiliar_nmBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelidCargaFamiliar_NM.setText(cargafamiliar_nmBean.getId().toString());
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextFieldcedulaCargaFamiliar_NM.setText(cargafamiliar_nmBean.getcedula());
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreaapellidoCargaFamiliar_NM.setText(cargafamiliar_nmBean.getapellido());
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreanombreCargaFamiliar_NM.setText(cargafamiliar_nmBean.getnombre());
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreadireccionCargaFamiliar_NM.setText(cargafamiliar_nmBean.getdireccion());
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jDateChooserfecha_nacimientoCargaFamiliar_NM.setDate(cargafamiliar_nmBean.getfecha_nacimiento());
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextFieldvalor_cupoCargaFamiliar_NM.setText(cargafamiliar_nmBean.getvalor_cupo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCargaFamiliar_NM(CargaFamiliar_NMParameterReturnGeneral cargafamiliar_nmReturnGeneral,CargaFamiliar_NMBean cargafamiliar_nmBean,Boolean conDefault) throws Exception { 
		try {
			CargaFamiliar_NM cargafamiliar_nmLocal=new CargaFamiliar_NM();
			
			cargafamiliar_nmLocal=cargafamiliar_nmReturnGeneral.getCargaFamiliar_NM();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cargafamiliar_nmLocal.getId()!=null && !cargafamiliar_nmLocal.getId().equals(0L))) {cargafamiliar_nmBean.setId(cargafamiliar_nmLocal.getId());}}
			if(conDefault || (!conDefault && cargafamiliar_nmLocal.getid_empleado()!=null && !cargafamiliar_nmLocal.getid_empleado().equals(-1L))) {cargafamiliar_nmBean.setid_empleado(cargafamiliar_nmLocal.getid_empleado());}
			if(conDefault || (!conDefault && cargafamiliar_nmLocal.getid_tipo_carga_fami()!=null && !cargafamiliar_nmLocal.getid_tipo_carga_fami().equals(-1L))) {cargafamiliar_nmBean.setid_tipo_carga_fami(cargafamiliar_nmLocal.getid_tipo_carga_fami());}
			if(conDefault || (!conDefault && cargafamiliar_nmLocal.getid_tipo_genero()!=null && !cargafamiliar_nmLocal.getid_tipo_genero().equals(-1L))) {cargafamiliar_nmBean.setid_tipo_genero(cargafamiliar_nmLocal.getid_tipo_genero());}
			if(conDefault || (!conDefault && cargafamiliar_nmLocal.getid_estado_civil()!=null && !cargafamiliar_nmLocal.getid_estado_civil().equals(-1L))) {cargafamiliar_nmBean.setid_estado_civil(cargafamiliar_nmLocal.getid_estado_civil());}
			if(conDefault || (!conDefault && cargafamiliar_nmLocal.getcedula()!=null && !cargafamiliar_nmLocal.getcedula().equals(""))) {cargafamiliar_nmBean.setcedula(cargafamiliar_nmLocal.getcedula());}
			if(conDefault || (!conDefault && cargafamiliar_nmLocal.getapellido()!=null && !cargafamiliar_nmLocal.getapellido().equals(""))) {cargafamiliar_nmBean.setapellido(cargafamiliar_nmLocal.getapellido());}
			if(conDefault || (!conDefault && cargafamiliar_nmLocal.getnombre()!=null && !cargafamiliar_nmLocal.getnombre().equals(""))) {cargafamiliar_nmBean.setnombre(cargafamiliar_nmLocal.getnombre());}
			if(conDefault || (!conDefault && cargafamiliar_nmLocal.getdireccion()!=null && !cargafamiliar_nmLocal.getdireccion().equals(""))) {cargafamiliar_nmBean.setdireccion(cargafamiliar_nmLocal.getdireccion());}
			if(conDefault || (!conDefault && cargafamiliar_nmLocal.getfecha_nacimiento()!=null && !cargafamiliar_nmLocal.getfecha_nacimiento().equals(new Date()))) {cargafamiliar_nmBean.setfecha_nacimiento(cargafamiliar_nmLocal.getfecha_nacimiento());}
			if(conDefault || (!conDefault && cargafamiliar_nmLocal.getvalor_cupo()!=null && !cargafamiliar_nmLocal.getvalor_cupo().equals(0.0))) {cargafamiliar_nmBean.setvalor_cupo(cargafamiliar_nmLocal.getvalor_cupo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCargaFamiliar_NMGenerico(Long idCargaFamiliar_NMSeleccionado,JComboBox jComboBoxCargaFamiliar_NM,List<CargaFamiliar_NM> cargafamiliar_nmsLocal)throws Exception {
		try {
			CargaFamiliar_NM  cargafamiliar_nmTemp=null;

			for(CargaFamiliar_NM cargafamiliar_nmAux:cargafamiliar_nmsLocal) {
				if(cargafamiliar_nmAux.getId()!=null && cargafamiliar_nmAux.getId().equals(idCargaFamiliar_NMSeleccionado)) {
					cargafamiliar_nmTemp=cargafamiliar_nmAux;
					break;
				}
			}

			jComboBoxCargaFamiliar_NM.setSelectedItem(cargafamiliar_nmTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCargaFamiliar_NMGenerico(JComboBox jComboBoxCargaFamiliar_NM,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCargaFamiliar_NM.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCargaFamiliar_NM.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCargaFamiliar_NM.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCargaFamiliar_NM.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCargaFamiliar_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCargaFamiliar_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cargafamiliar_nm=(CargaFamiliar_NM) cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cargafamiliar_nm =(CargaFamiliar_NM) cargafamiliar_nms.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cargafamiliar_nm.getIsNew() && !cargafamiliar_nm.getIsChanged() && !cargafamiliar_nm.getIsDeleted()) {
				sDescripcion=cargafamiliar_nm.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cargafamiliar_nm.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!cargafamiliar_nm.getIsNew() && !cargafamiliar_nm.getIsChanged() && !cargafamiliar_nm.getIsDeleted()) {
				sDescripcion=cargafamiliar_nm.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=cargafamiliar_nm.getempleado_descripcion();
			}
		}

		if(sTipo.equals("TipoCargaFami")) {
			//sDescripcion=this.getActualTipoCargaFamiForeignKeyDescripcion((Long)value);
			if(!cargafamiliar_nm.getIsNew() && !cargafamiliar_nm.getIsChanged() && !cargafamiliar_nm.getIsDeleted()) {
				sDescripcion=cargafamiliar_nm.gettipocargafami_descripcion();
			} else {
				//sDescripcion=this.getActualTipoCargaFamiForeignKeyDescripcion((Long)value);
				sDescripcion=cargafamiliar_nm.gettipocargafami_descripcion();
			}
		}

		if(sTipo.equals("TipoGenero")) {
			//sDescripcion=this.getActualTipoGeneroForeignKeyDescripcion((Long)value);
			if(!cargafamiliar_nm.getIsNew() && !cargafamiliar_nm.getIsChanged() && !cargafamiliar_nm.getIsDeleted()) {
				sDescripcion=cargafamiliar_nm.gettipogenero_descripcion();
			} else {
				//sDescripcion=this.getActualTipoGeneroForeignKeyDescripcion((Long)value);
				sDescripcion=cargafamiliar_nm.gettipogenero_descripcion();
			}
		}

		if(sTipo.equals("EstadoCivil")) {
			//sDescripcion=this.getActualEstadoCivilForeignKeyDescripcion((Long)value);
			if(!cargafamiliar_nm.getIsNew() && !cargafamiliar_nm.getIsChanged() && !cargafamiliar_nm.getIsDeleted()) {
				sDescripcion=cargafamiliar_nm.getestadocivil_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoCivilForeignKeyDescripcion((Long)value);
				sDescripcion=cargafamiliar_nm.getestadocivil_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CargaFamiliar_NM cargafamiliar_nmRow=new CargaFamiliar_NM();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cargafamiliar_nmRow=(CargaFamiliar_NM) cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cargafamiliar_nmRow=(CargaFamiliar_NM) cargafamiliar_nms.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCargaFamiliar_NM(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaNuevoCargaFamiliar_NM && this.isPermisoNuevoCargaFamiliar_NM));			
			this.jButtonDuplicarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaDuplicarCargaFamiliar_NM && this.isPermisoDuplicarCargaFamiliar_NM));			
			this.jButtonCopiarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaCopiarCargaFamiliar_NM && this.isPermisoCopiarCargaFamiliar_NM));
			this.jButtonVerFormCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaVerFormCargaFamiliar_NM && this.isPermisoVerFormCargaFamiliar_NM));
			
			this.jButtonAbrirOrderByCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaOrdenCargaFamiliar_NM && this.isPermisoOrdenCargaFamiliar_NM));			
			
			this.jButtonNuevoRelacionesCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM && this.isPermisoNuevoCargaFamiliar_NM));			
			this.jButtonNuevoGuardarCambiosCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaNuevoCargaFamiliar_NM && this.isPermisoNuevoCargaFamiliar_NM && this.isPermisoGuardarCambiosCargaFamiliar_NM));
			
			if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonModificarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaModificarCargaFamiliar_NM && this.isPermisoActualizarCargaFamiliar_NM));	
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonActualizarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaActualizarCargaFamiliar_NM && this.isPermisoActualizarCargaFamiliar_NM));	
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonEliminarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaEliminarCargaFamiliar_NM && this.isPermisoEliminarCargaFamiliar_NM));
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonCancelarCargaFamiliar_NM.setVisible(this.isVisibilidadCeldaCancelarCargaFamiliar_NM);							
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonGuardarCambiosCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaGuardarCargaFamiliar_NM && this.isPermisoGuardarCambiosCargaFamiliar_NM));			
			
			}
						
			this.jButtonGuardarCambiosTablaCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM && this.isPermisoGuardarCambiosCargaFamiliar_NM));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaNuevoCargaFamiliar_NM && this.isPermisoNuevoCargaFamiliar_NM));						
			this.jButtonDuplicarToolBarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaDuplicarCargaFamiliar_NM && this.isPermisoDuplicarCargaFamiliar_NM));						
			this.jButtonCopiarToolBarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaCopiarCargaFamiliar_NM && this.isPermisoCopiarCargaFamiliar_NM));			
			this.jButtonVerFormToolBarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaVerFormCargaFamiliar_NM && this.isPermisoVerFormCargaFamiliar_NM));			
			this.jButtonAbrirOrderByToolBarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaOrdenCargaFamiliar_NM && this.isPermisoOrdenCargaFamiliar_NM));
			this.jButtonNuevoRelacionesToolBarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM && this.isPermisoNuevoCargaFamiliar_NM));			
			this.jButtonNuevoGuardarCambiosToolBarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaNuevoCargaFamiliar_NM && this.isPermisoNuevoCargaFamiliar_NM && this.isPermisoGuardarCambiosCargaFamiliar_NM));			
			
			if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonModificarToolBarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaModificarCargaFamiliar_NM && this.isPermisoActualizarCargaFamiliar_NM));	
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonActualizarToolBarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaActualizarCargaFamiliar_NM  && this.isPermisoActualizarCargaFamiliar_NM));	
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonEliminarToolBarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaEliminarCargaFamiliar_NM && this.isPermisoEliminarCargaFamiliar_NM));
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonCancelarToolBarCargaFamiliar_NM.setVisible(this.isVisibilidadCeldaCancelarCargaFamiliar_NM);				
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonGuardarCambiosToolBarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaGuardarCargaFamiliar_NM && this.isPermisoGuardarCambiosCargaFamiliar_NM));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM && this.isPermisoGuardarCambiosCargaFamiliar_NM));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaNuevoCargaFamiliar_NM && this.isPermisoNuevoCargaFamiliar_NM));			
			this.jMenuItemDuplicarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaDuplicarCargaFamiliar_NM && this.isPermisoDuplicarCargaFamiliar_NM));			
			this.jMenuItemCopiarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaCopiarCargaFamiliar_NM && this.isPermisoCopiarCargaFamiliar_NM));			
			this.jMenuItemVerFormCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaVerFormCargaFamiliar_NM && this.isPermisoVerFormCargaFamiliar_NM));			
			this.jMenuItemAbrirOrderByCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaOrdenCargaFamiliar_NM && this.isPermisoOrdenCargaFamiliar_NM));			
			//this.jMenuItemMostrarOcultarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaOrdenCargaFamiliar_NM && this.isPermisoOrdenCargaFamiliar_NM));
			this.jMenuItemDetalleAbrirOrderByCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaOrdenCargaFamiliar_NM && this.isPermisoOrdenCargaFamiliar_NM));			
			//this.jMenuItemDetalleMostrarOcultarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaOrdenCargaFamiliar_NM && this.isPermisoOrdenCargaFamiliar_NM));			
			this.jMenuItemNuevoRelacionesCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM && this.isPermisoNuevoCargaFamiliar_NM));			
			this.jMenuItemNuevoGuardarCambiosCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaNuevoCargaFamiliar_NM && this.isPermisoNuevoCargaFamiliar_NM && this.isPermisoGuardarCambiosCargaFamiliar_NM));									
			
			if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jMenuItemModificarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaModificarCargaFamiliar_NM && this.isPermisoActualizarCargaFamiliar_NM));	
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jMenuItemActualizarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaActualizarCargaFamiliar_NM && this.isPermisoActualizarCargaFamiliar_NM));	
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jMenuItemEliminarCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaEliminarCargaFamiliar_NM && this.isPermisoEliminarCargaFamiliar_NM));
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jMenuItemCancelarCargaFamiliar_NM.setVisible(this.isVisibilidadCeldaCancelarCargaFamiliar_NM);				
			}
			
			this.jMenuItemGuardarCambiosCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaGuardarCargaFamiliar_NM && this.isPermisoGuardarCambiosCargaFamiliar_NM));						
			this.jMenuItemGuardarCambiosTablaCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM && this.isPermisoGuardarCambiosCargaFamiliar_NM));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCargaFamiliar_NM=this.jButtonNuevoCargaFamiliar_NM.isVisible();
			this.isVisibilidadCeldaDuplicarCargaFamiliar_NM=this.jButtonDuplicarCargaFamiliar_NM.isVisible();
			this.isVisibilidadCeldaCopiarCargaFamiliar_NM=this.jButtonCopiarCargaFamiliar_NM.isVisible();
			this.isVisibilidadCeldaVerFormCargaFamiliar_NM=this.jButtonVerFormCargaFamiliar_NM.isVisible();
			
			this.isVisibilidadCeldaOrdenCargaFamiliar_NM=this.jButtonAbrirOrderByCargaFamiliar_NM.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM=this.jButtonNuevoRelacionesCargaFamiliar_NM.isVisible();
			this.isVisibilidadCeldaModificarCargaFamiliar_NM=this.jButtonModificarCargaFamiliar_NM.isVisible();
			
			if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
			this.isVisibilidadCeldaActualizarCargaFamiliar_NM=this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonActualizarCargaFamiliar_NM.isVisible();
			this.isVisibilidadCeldaEliminarCargaFamiliar_NM=this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonEliminarCargaFamiliar_NM.isVisible();
			this.isVisibilidadCeldaCancelarCargaFamiliar_NM=this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonCancelarCargaFamiliar_NM.isVisible();
			this.isVisibilidadCeldaGuardarCargaFamiliar_NM=this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonGuardarCambiosCargaFamiliar_NM.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM=this.jButtonGuardarCambiosTablaCargaFamiliar_NM.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCargaFamiliar_NM=this.jButtonNuevoToolBarCargaFamiliar_NM.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM=this.jButtonNuevoRelacionesToolBarCargaFamiliar_NM.isVisible();
			
			if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
			this.isVisibilidadCeldaModificarCargaFamiliar_NM=this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonModificarToolBarCargaFamiliar_NM.isVisible();
			this.isVisibilidadCeldaActualizarCargaFamiliar_NM=this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonActualizarToolBarCargaFamiliar_NM.isVisible();
			this.isVisibilidadCeldaEliminarCargaFamiliar_NM=this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonEliminarToolBarCargaFamiliar_NM.isVisible();
			this.isVisibilidadCeldaCancelarCargaFamiliar_NM=this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonCancelarToolBarCargaFamiliar_NM.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCargaFamiliar_NM=this.jButtonGuardarCambiosToolBarCargaFamiliar_NM.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM=this.jButtonGuardarCambiosTablaToolBarCargaFamiliar_NM.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCargaFamiliar_NM=this.jMenuItemNuevoCargaFamiliar_NM.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM=this.jMenuItemNuevoRelacionesCargaFamiliar_NM.isVisible();
			
			if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
			this.isVisibilidadCeldaModificarCargaFamiliar_NM=this.jInternalFrameDetalleFormCargaFamiliar_NM.jMenuItemModificarCargaFamiliar_NM.isVisible();
			this.isVisibilidadCeldaActualizarCargaFamiliar_NM=this.jInternalFrameDetalleFormCargaFamiliar_NM.jMenuItemActualizarCargaFamiliar_NM.isVisible();
			this.isVisibilidadCeldaEliminarCargaFamiliar_NM=this.jInternalFrameDetalleFormCargaFamiliar_NM.jMenuItemEliminarCargaFamiliar_NM.isVisible();
			this.isVisibilidadCeldaCancelarCargaFamiliar_NM=this.jInternalFrameDetalleFormCargaFamiliar_NM.jMenuItemCancelarCargaFamiliar_NM.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCargaFamiliar_NM=this.jMenuItemGuardarCambiosCargaFamiliar_NM.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM=this.jMenuItemGuardarCambiosTablaCargaFamiliar_NM.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCargaFamiliar_NM(Boolean esInicializar) {
		if(CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cargafamiliar_nmSessionBean.getConGuardarRelaciones()) {
				//if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCargaFamiliar_NM();
			}
			
			this.inicializarActualizarBindingBotonesManualCargaFamiliar_NM(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCargaFamiliar_NM() {
		this.jButtonNuevoCargaFamiliar_NM.setVisible(this.isPermisoNuevoCargaFamiliar_NM);			
		this.jButtonDuplicarCargaFamiliar_NM.setVisible(this.isPermisoDuplicarCargaFamiliar_NM);			
		this.jButtonCopiarCargaFamiliar_NM.setVisible(this.isPermisoCopiarCargaFamiliar_NM);			
		this.jButtonVerFormCargaFamiliar_NM.setVisible(this.isPermisoVerFormCargaFamiliar_NM);			
		
		this.jButtonAbrirOrderByCargaFamiliar_NM.setVisible(this.isPermisoOrdenCargaFamiliar_NM);					
		
		this.jButtonNuevoRelacionesCargaFamiliar_NM.setVisible(this.isPermisoNuevoCargaFamiliar_NM);			
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonModificarCargaFamiliar_NM.setVisible(this.isPermisoActualizarCargaFamiliar_NM);	
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonActualizarCargaFamiliar_NM.setVisible(this.isPermisoActualizarCargaFamiliar_NM);	
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonEliminarCargaFamiliar_NM.setVisible(this.isPermisoEliminarCargaFamiliar_NM);
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonCancelarCargaFamiliar_NM.setVisible(this.isVisibilidadCeldaCancelarCargaFamiliar_NM);						
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonGuardarCambiosCargaFamiliar_NM.setVisible(this.isPermisoGuardarCambiosCargaFamiliar_NM);							
		}
		
		this.jButtonGuardarCambiosTablaCargaFamiliar_NM.setVisible(this.isPermisoActualizarCargaFamiliar_NM);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCargaFamiliar_NM() {
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonModificarCargaFamiliar_NM.setVisible(this.isPermisoActualizarCargaFamiliar_NM);	
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonActualizarCargaFamiliar_NM.setVisible(this.isPermisoActualizarCargaFamiliar_NM);	
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonEliminarCargaFamiliar_NM.setVisible(this.isPermisoEliminarCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonCancelarCargaFamiliar_NM.setVisible(this.isVisibilidadCeldaCancelarCargaFamiliar_NM);							
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonGuardarCambiosCargaFamiliar_NM.setVisible((this.isVisibilidadCeldaGuardarCargaFamiliar_NM && this.isPermisoGuardarCambiosCargaFamiliar_NM));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCargaFamiliar_NM() {
		if(CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCargaFamiliar_NM();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCargaFamiliar_NM() {
	}
	
	public void jTableDatosCargaFamiliar_NMListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCargaFamiliar_NM(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCargaFamiliar_NMBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.getcargafamiliar_nm(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar_nm==null) {
						this.cargafamiliar_nm = new CargaFamiliar_NM();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.cargafamiliar_nm,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
				}

				if(this.cargafamiliar_nm.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cargafamiliar_nm.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar_NM(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCargaFamiliar_NMUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCargaFamiliar_NM(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCargaFamiliar_NM.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCargaFamiliar_NM.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.getcargafamiliar_nm(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cargafamiliar_nmLogic.getConnexion());

				if(this.cargafamiliar_nm.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cargafamiliar_nm.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCargaFamiliar_NM=(TitledBorder)this.jScrollPanelDatosCargaFamiliar_NM.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCargaFamiliar_NM.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCargaFamiliar_NMBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.getcargafamiliar_nm(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar_nm==null) {
						this.cargafamiliar_nm = new CargaFamiliar_NM();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.cargafamiliar_nm,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
				}

				if(this.cargafamiliar_nm.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cargafamiliar_nm.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar_NM(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoCargaFamiliar_NMActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="Empleado";

			if(!this.sFinalQueryGeneral_empleado.equals("")) {
				this.empleadoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_empleado);
				this.empleadoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.empleadoBeanSwingJInternalFrame.procesarBusqueda(this.empleadoBeanSwingJInternalFrame.sAccionBusqueda);
				this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingEmpleado(false);
			}

			if(!this.sFinalQueryComboEmpleado.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderCargaFamiliar_NM=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosCargaFamiliar_NM.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCargaFamiliar_NM=(TitledBorder)this.jScrollPanelDatosCargaFamiliar_NM.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderCargaFamiliar_NM.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoCargaFamiliar_NMUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebCargaFamiliar_NM(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCargaFamiliar_NM.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCargaFamiliar_NM.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.getcargafamiliar_nm(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.cargafamiliar_nmLogic.getConnexion());

				if(this.cargafamiliar_nm.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.cargafamiliar_nm.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCargaFamiliar_NM=(TitledBorder)this.jScrollPanelDatosCargaFamiliar_NM.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderCargaFamiliar_NM.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoCargaFamiliar_NMBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.getcargafamiliar_nm(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar_nm==null) {
						this.cargafamiliar_nm = new CargaFamiliar_NM();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.cargafamiliar_nm,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
				}

				if(this.cargafamiliar_nm.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.cargafamiliar_nm.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar_NM(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_carga_famiCargaFamiliar_NMUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocargafami=true;

			idTienePermisotipocargafami=this.tienePermisosUsuarioEnPaginaWebCargaFamiliar_NM(TipoCargaFamiConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocargafami) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCargaFamiliar_NM.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCargaFamiliar_NM.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.getcargafamiliar_nm(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);

				this.tipocargafamiBeanSwingJInternalFrame=new TipoCargaFamiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocargafamiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocargafamiBeanSwingJInternalFrame.getTipoCargaFamiLogic().setConnexion(this.cargafamiliar_nmLogic.getConnexion());

				if(this.cargafamiliar_nm.getid_tipo_carga_fami()!=null) {
					this.tipocargafamiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocargafamiBeanSwingJInternalFrame.setIdActual(this.cargafamiliar_nm.getid_tipo_carga_fami());
					this.tipocargafamiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocargafamiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocargafamiBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCargaFami();
				}

				JInternalFrameBase jinternalFrame =this.tipocargafamiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCargaFamiliar_NM=(TitledBorder)this.jScrollPanelDatosCargaFamiliar_NM.getBorder();
				TitledBorder titledBordertipocargafami=(TitledBorder)this.tipocargafamiBeanSwingJInternalFrame.jScrollPanelDatosTipoCargaFami.getBorder();

				titledBordertipocargafami.setTitle(titledBorderCargaFamiliar_NM.getTitle() + " -> Tipo Carga Fami");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_carga_famiCargaFamiliar_NMBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.getcargafamiliar_nm(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar_nm==null) {
						this.cargafamiliar_nm = new CargaFamiliar_NM();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.cargafamiliar_nm,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
				}

				if(this.cargafamiliar_nm.getid_tipo_carga_fami()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_carga_fami = "+this.cargafamiliar_nm.getid_tipo_carga_fami().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar_NM(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_generoCargaFamiliar_NMUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipogenero=true;

			idTienePermisotipogenero=this.tienePermisosUsuarioEnPaginaWebCargaFamiliar_NM(TipoGeneroConstantesFunciones.CLASSNAME);

			if(idTienePermisotipogenero) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCargaFamiliar_NM.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCargaFamiliar_NM.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.getcargafamiliar_nm(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);

				this.tipogeneroBeanSwingJInternalFrame=new TipoGeneroBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipogeneroBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipogeneroBeanSwingJInternalFrame.getTipoGeneroLogic().setConnexion(this.cargafamiliar_nmLogic.getConnexion());

				if(this.cargafamiliar_nm.getid_tipo_genero()!=null) {
					this.tipogeneroBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipogeneroBeanSwingJInternalFrame.setIdActual(this.cargafamiliar_nm.getid_tipo_genero());
					this.tipogeneroBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipogeneroBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipogeneroBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoGenero();
				}

				JInternalFrameBase jinternalFrame =this.tipogeneroBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCargaFamiliar_NM=(TitledBorder)this.jScrollPanelDatosCargaFamiliar_NM.getBorder();
				TitledBorder titledBordertipogenero=(TitledBorder)this.tipogeneroBeanSwingJInternalFrame.jScrollPanelDatosTipoGenero.getBorder();

				titledBordertipogenero.setTitle(titledBorderCargaFamiliar_NM.getTitle() + " -> Tipo Genero");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_generoCargaFamiliar_NMBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.getcargafamiliar_nm(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar_nm==null) {
						this.cargafamiliar_nm = new CargaFamiliar_NM();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.cargafamiliar_nm,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
				}

				if(this.cargafamiliar_nm.getid_tipo_genero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_genero = "+this.cargafamiliar_nm.getid_tipo_genero().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar_NM(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_civilCargaFamiliar_NMUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadocivil=true;

			idTienePermisoestadocivil=this.tienePermisosUsuarioEnPaginaWebCargaFamiliar_NM(EstadoCivilConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadocivil) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCargaFamiliar_NM.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCargaFamiliar_NM.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.getcargafamiliar_nm(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);

				this.estadocivilBeanSwingJInternalFrame=new EstadoCivilBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadocivilBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadocivilBeanSwingJInternalFrame.getEstadoCivilLogic().setConnexion(this.cargafamiliar_nmLogic.getConnexion());

				if(this.cargafamiliar_nm.getid_estado_civil()!=null) {
					this.estadocivilBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadocivilBeanSwingJInternalFrame.setIdActual(this.cargafamiliar_nm.getid_estado_civil());
					this.estadocivilBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadocivilBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadocivilBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoCivil();
				}

				JInternalFrameBase jinternalFrame =this.estadocivilBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCargaFamiliar_NM=(TitledBorder)this.jScrollPanelDatosCargaFamiliar_NM.getBorder();
				TitledBorder titledBorderestadocivil=(TitledBorder)this.estadocivilBeanSwingJInternalFrame.jScrollPanelDatosEstadoCivil.getBorder();

				titledBorderestadocivil.setTitle(titledBorderCargaFamiliar_NM.getTitle() + " -> Estado Civil");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_civilCargaFamiliar_NMBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.getcargafamiliar_nm(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar_nm==null) {
						this.cargafamiliar_nm = new CargaFamiliar_NM();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.cargafamiliar_nm,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
				}

				if(this.cargafamiliar_nm.getid_estado_civil()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_civil = "+this.cargafamiliar_nm.getid_estado_civil().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar_NM(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncedulaCargaFamiliar_NMBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.getcargafamiliar_nm(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar_nm==null) {
						this.cargafamiliar_nm = new CargaFamiliar_NM();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.cargafamiliar_nm,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
				}

				if(this.cargafamiliar_nm.getcedula()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cedula like '%"+this.cargafamiliar_nm.getcedula()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar_NM(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidoCargaFamiliar_NMBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.getcargafamiliar_nm(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar_nm==null) {
						this.cargafamiliar_nm = new CargaFamiliar_NM();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.cargafamiliar_nm,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
				}

				if(this.cargafamiliar_nm.getapellido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellido like '%"+this.cargafamiliar_nm.getapellido()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar_NM(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCargaFamiliar_NMBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.getcargafamiliar_nm(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar_nm==null) {
						this.cargafamiliar_nm = new CargaFamiliar_NM();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.cargafamiliar_nm,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
				}

				if(this.cargafamiliar_nm.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.cargafamiliar_nm.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar_NM(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionCargaFamiliar_NMBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.getcargafamiliar_nm(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar_nm==null) {
						this.cargafamiliar_nm = new CargaFamiliar_NM();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.cargafamiliar_nm,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
				}

				if(this.cargafamiliar_nm.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.cargafamiliar_nm.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar_NM(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_nacimientoCargaFamiliar_NMBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.getcargafamiliar_nm(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar_nm==null) {
						this.cargafamiliar_nm = new CargaFamiliar_NM();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.cargafamiliar_nm,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
				}

				if(this.cargafamiliar_nm.getfecha_nacimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_nacimiento = '"+Funciones2.getStringPostgresDate(this.cargafamiliar_nm.getfecha_nacimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar_NM(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_cupoCargaFamiliar_NMBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.getcargafamiliar_nm(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargafamiliar_nm==null) {
						this.cargafamiliar_nm = new CargaFamiliar_NM();
					}

					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.cargafamiliar_nm,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);
				}

				if(this.cargafamiliar_nm.getvalor_cupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_cupo = "+this.cargafamiliar_nm.getvalor_cupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargaFamiliar_NM(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCargaFamiliar_NM(false,false);

			this.getCargaFamiliar_NMsFK_IdEmpleado();

			this.inicializarActualizarBindingCargaFamiliar_NM(false);

			//if(CargaFamiliar_NMBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCargaFamiliar_NM(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCargaFamiliar_NM(false,false);

			this.getCargaFamiliar_NMsFK_IdEmpresa();

			this.inicializarActualizarBindingCargaFamiliar_NM(false);

			//if(CargaFamiliar_NMBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCargaFamiliar_NM(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoCivilCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCargaFamiliar_NM(false,false);

			this.getCargaFamiliar_NMsFK_IdEstadoCivil();

			this.inicializarActualizarBindingCargaFamiliar_NM(false);

			//if(CargaFamiliar_NMBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCargaFamiliar_NM(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoCargaFamiCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCargaFamiliar_NM(false,false);

			this.getCargaFamiliar_NMsFK_IdTipoCargaFami();

			this.inicializarActualizarBindingCargaFamiliar_NM(false);

			//if(CargaFamiliar_NMBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCargaFamiliar_NM(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoGeneroCargaFamiliar_NMActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCargaFamiliar_NM(false,false);

			this.getCargaFamiliar_NMsFK_IdTipoGenero();

			this.inicializarActualizarBindingCargaFamiliar_NM(false);

			//if(CargaFamiliar_NMBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCargaFamiliar_NM(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargafamiliar_nmLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCargaFamiliar_NM() {
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
			this.jInternalFrameDetalleFormCargaFamiliar_NM.setVisible(false);	    			
			this.jInternalFrameDetalleFormCargaFamiliar_NM.dispose();
			this.jInternalFrameDetalleFormCargaFamiliar_NM=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCargaFamiliar_NM!=null) {
			this.jInternalFrameReporteDinamicoCargaFamiliar_NM.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCargaFamiliar_NM.dispose();
			this.jInternalFrameReporteDinamicoCargaFamiliar_NM=null;
		}
		
		if(this.jInternalFrameImportacionCargaFamiliar_NM!=null) {
			this.jInternalFrameImportacionCargaFamiliar_NM.setVisible(false);	    			
			this.jInternalFrameImportacionCargaFamiliar_NM.dispose();
			this.jInternalFrameImportacionCargaFamiliar_NM=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCargaFamiliar_NM();
			
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
			
			
			if(sTipo.equals("NuevoCargaFamiliar_NM")) {
				jButtonNuevoCargaFamiliar_NMActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCargaFamiliar_NM")) {
				jButtonDuplicarCargaFamiliar_NMActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCargaFamiliar_NM")) {
				jButtonCopiarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("VerFormCargaFamiliar_NM")) {
				jButtonVerFormCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCargaFamiliar_NM")) {
				jButtonNuevoCargaFamiliar_NMActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCargaFamiliar_NM")) {
				jButtonDuplicarCargaFamiliar_NMActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCargaFamiliar_NM")) {
				jButtonNuevoCargaFamiliar_NMActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCargaFamiliar_NM")) {
				jButtonDuplicarCargaFamiliar_NMActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCargaFamiliar_NM")) {
				jButtonNuevoCargaFamiliar_NMActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCargaFamiliar_NM")) {
				jButtonNuevoCargaFamiliar_NMActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCargaFamiliar_NM")) {
				jButtonNuevoCargaFamiliar_NMActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCargaFamiliar_NM")) {
				jButtonModificarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCargaFamiliar_NM")) {
				jButtonModificarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCargaFamiliar_NM")) {
				jButtonModificarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCargaFamiliar_NM")) {
				jButtonActualizarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCargaFamiliar_NM")) {
				jButtonActualizarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCargaFamiliar_NM")) {
				jButtonActualizarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("EliminarCargaFamiliar_NM")) {
				jButtonEliminarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCargaFamiliar_NM")) {
				jButtonEliminarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCargaFamiliar_NM")) {
				jButtonEliminarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("CancelarCargaFamiliar_NM")) {
				jButtonCancelarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCargaFamiliar_NM")) {
				jButtonCancelarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCargaFamiliar_NM")) {
				jButtonCancelarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("CerrarCargaFamiliar_NM")) {
				jButtonCerrarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCargaFamiliar_NM")) {
				jButtonCerrarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCargaFamiliar_NM")) {
				jButtonCerrarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCargaFamiliar_NM")) {
				jButtonMostrarOcultarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCargaFamiliar_NM")) {
				jButtonCancelarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCargaFamiliar_NM")) {
				jButtonGuardarCambiosCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCargaFamiliar_NM")) {
				jButtonGuardarCambiosCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCargaFamiliar_NM")) {
				jButtonCopiarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCargaFamiliar_NM")) {
				jButtonVerFormCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCargaFamiliar_NM")) {
				jButtonGuardarCambiosCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCargaFamiliar_NM")) {
				jButtonCopiarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCargaFamiliar_NM")) {
				jButtonVerFormCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCargaFamiliar_NM")) {
				jButtonGuardarCambiosCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCargaFamiliar_NM")) {
				jButtonGuardarCambiosCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCargaFamiliar_NM")) {
				jButtonGuardarCambiosCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCargaFamiliar_NM")) {
				jButtonRecargarInformacionCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCargaFamiliar_NM")) {
				jButtonRecargarInformacionCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCargaFamiliar_NM")) {
				jButtonRecargarInformacionCargaFamiliar_NMActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCargaFamiliar_NM")) {
				jButtonAnterioresCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCargaFamiliar_NM")) {
				jButtonAnterioresCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCargaFamiliar_NM")) {
				jButtonAnterioresCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCargaFamiliar_NM")) {
				jButtonSiguientesCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCargaFamiliar_NM")) {
				jButtonSiguientesCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCargaFamiliar_NM")) {
				jButtonSiguientesCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCargaFamiliar_NM") || sTipo.equals("MenuItemDetalleAbrirOrderByCargaFamiliar_NM")) {
				jButtonAbrirOrderByCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCargaFamiliar_NM") || sTipo.equals("MenuItemDetalleMostrarOcultarCargaFamiliar_NM")) {
				jButtonMostrarOcultarCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCargaFamiliar_NM")) {
				jButtonNuevoGuardarCambiosCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCargaFamiliar_NM")) {
				jButtonNuevoGuardarCambiosCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCargaFamiliar_NM")) {
				jButtonNuevoGuardarCambiosCargaFamiliar_NMActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCargaFamiliar_NM")) {
				jButtonCerrarReporteDinamicoCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCargaFamiliar_NM")) {
				jButtonGenerarReporteDinamicoCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCargaFamiliar_NM")) {
				
				jButtonGenerarExcelReporteDinamicoCargaFamiliar_NMActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCargaFamiliar_NM")) {
				jButtonCerrarImportacionCargaFamiliar_NMActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCargaFamiliar_NM")) {
				
				jButtonGenerarImportacionCargaFamiliar_NMActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCargaFamiliar_NM")) {
				
				jButtonAbrirImportacionCargaFamiliar_NMActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCargaFamiliar_NM")) {
				jComboBoxTiposAccionesCargaFamiliar_NMActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCargaFamiliar_NM")) {
				jComboBoxTiposRelacionesCargaFamiliar_NMActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCargaFamiliar_NM")) {
				jComboBoxTiposAccionesCargaFamiliar_NMActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCargaFamiliar_NM")) {
				
				jComboBoxTiposSeleccionarCargaFamiliar_NMActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCargaFamiliar_NM")) {
				jTextFieldValorCampoGeneralCargaFamiliar_NMActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCargaFamiliar_NM")) {
				jButtonAbrirOrderByCargaFamiliar_NMActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCargaFamiliar_NM")) {
				jButtonAbrirOrderByCargaFamiliar_NMActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCargaFamiliar_NM")) {
				jButtonCerrarOrderByCargaFamiliar_NMActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCargaFamiliar_NMBusqueda")) {
				this.jButtonidCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCargaFamiliar_NMUpdate")) {
				this.jButtonid_empresaCargaFamiliar_NMUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCargaFamiliar_NMBusqueda")) {
				this.jButtonid_empresaCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoCargaFamiliar_NM")) {
				this.jButtonid_empleadoCargaFamiliar_NMActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoCargaFamiliar_NMUpdate")) {
				this.jButtonid_empleadoCargaFamiliar_NMUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoCargaFamiliar_NMBusqueda")) {
				this.jButtonid_empleadoCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_carga_famiCargaFamiliar_NMUpdate")) {
				this.jButtonid_tipo_carga_famiCargaFamiliar_NMUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_carga_famiCargaFamiliar_NMBusqueda")) {
				this.jButtonid_tipo_carga_famiCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_generoCargaFamiliar_NMUpdate")) {
				this.jButtonid_tipo_generoCargaFamiliar_NMUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_generoCargaFamiliar_NMBusqueda")) {
				this.jButtonid_tipo_generoCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_civilCargaFamiliar_NMUpdate")) {
				this.jButtonid_estado_civilCargaFamiliar_NMUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_civilCargaFamiliar_NMBusqueda")) {
				this.jButtonid_estado_civilCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cedulaCargaFamiliar_NMBusqueda")) {
				this.jButtoncedulaCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoCargaFamiliar_NMBusqueda")) {
				this.jButtonapellidoCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCargaFamiliar_NMBusqueda")) {
				this.jButtonnombreCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionCargaFamiliar_NMBusqueda")) {
				this.jButtondireccionCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_nacimientoCargaFamiliar_NMBusqueda")) {
				this.jButtonfecha_nacimientoCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_cupoCargaFamiliar_NMBusqueda")) {
				this.jButtonvalor_cupoCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoCargaFamiliar_NM")) {
				this.jButtonid_empleadoCargaFamiliar_NMActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEmpleadoCargaFamiliar_NM")) {
				this.jButtonFK_IdEmpleadoCargaFamiliar_NMActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstadoCivilCargaFamiliar_NM")) {
				this.jButtonFK_IdEstadoCivilCargaFamiliar_NMActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoCargaFamiCargaFamiliar_NM")) {
				this.jButtonFK_IdTipoCargaFamiCargaFamiliar_NMActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoGeneroCargaFamiliar_NM")) {
				this.jButtonFK_IdTipoGeneroCargaFamiliar_NMActionPerformed(evt);
			}
			
			;
			
			
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCargaFamiliar_NM();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargaFamiliar_NMActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar_nm);
				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
				
				


				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CargaFamiliar_NM cargafamiliar_nmLocal=null;
			
			if(!this.getEsControlTabla()) {
				cargafamiliar_nmLocal=this.cargafamiliar_nm;
			} else {
				cargafamiliar_nmLocal=this.cargafamiliar_nmAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar_nm);
				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
							
				
				


				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargaFamiliar_NMActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmAnterior =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargafamiliar_nmAnterior =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
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
			
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
			
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
			
			


			
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargaFamiliar_NMActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar_nm);
				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
								
						
				


				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar_NM.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar_nm);
				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
								
				
				


				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargaFamiliar_NMActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmAnterior =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargafamiliar_nmAnterior =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar_nm);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargaFamiliar_NMActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmAnterior =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargafamiliar_nmAnterior =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargaFamiliar_NMActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar_nm);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar_nm);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar_nm);
				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
							
				
				


				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar_NM.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargaFamiliar_NMActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar_nmAnterior =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cargafamiliar_nmAnterior =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
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
			
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
			
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
			
			


			
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargaFamiliar_NMActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar_nm);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar_nm);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar_nm);
				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
								
				
				


				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargaFamiliar_NMActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmAnterior =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargafamiliar_nmAnterior =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargaFamiliar_NMActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar_nm);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar_nm);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargaFamiliar_NMActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar_nm);
				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCargaFamiliar_NM")) {
					jCheckBoxSeleccionarTodosCargaFamiliar_NMItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCargaFamiliar_NM")) {
					jCheckBoxSeleccionadosCargaFamiliar_NMItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCargaFamiliar_NM")) {
					
				}
				
				


				
				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar_nm);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar_nm);
				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
												
				
				


				
				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargaFamiliar_NMActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargafamiliar_nmAnterior =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cargafamiliar_nmAnterior =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargaFamiliar_NMActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar_nm);
				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
				
				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
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
			
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
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
			
			


			
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargaFamiliar_NMActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar_nm);
				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar_NM.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar_NM.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargafamiliar_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargafamiliar_nm);
				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
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
				
				


				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargaFamiliar_NM.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargaFamiliar_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargaFamiliar_NMActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargafamiliar_nmAnterior =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargafamiliar_nmAnterior =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCargaFamiliar_NM")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCargaFamiliar_NMListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCargaFamiliar_NM.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cargafamiliar_nm =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cargafamiliar_nm);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCargaFamiliar_NM")) {
				
				}
				
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCargaFamiliar_NM")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCargaFamiliar_NM.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCargaFamiliar_NM")) {
			
			}
			
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCargaFamiliar_NM();
			
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
			
			if(sTipo.equals("NuevoCargaFamiliar_NM")) {
				jButtonNuevoCargaFamiliar_NMActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCargaFamiliar_NM")) {
				jButtonDuplicarCargaFamiliar_NMActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCargaFamiliar_NM")) {
				jButtonCopiarCargaFamiliar_NMActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCargaFamiliar_NM")) {
				jButtonVerFormCargaFamiliar_NMActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCargaFamiliar_NM")) {
				jButtonNuevoCargaFamiliar_NMActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCargaFamiliar_NM")) {
				jButtonModificarCargaFamiliar_NMActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCargaFamiliar_NM")) {
				jButtonActualizarCargaFamiliar_NMActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCargaFamiliar_NM")) {
				jButtonEliminarCargaFamiliar_NMActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCargaFamiliar_NM")) {
				jButtonGuardarCambiosCargaFamiliar_NMActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCargaFamiliar_NM")) {
				jButtonCancelarCargaFamiliar_NMActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCargaFamiliar_NM")) {
				jButtonCerrarCargaFamiliar_NMActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCargaFamiliar_NM")) {
				jButtonGuardarCambiosCargaFamiliar_NMActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCargaFamiliar_NM")) {
				jButtonNuevoGuardarCambiosCargaFamiliar_NMActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCargaFamiliar_NM")) {
				jButtonAbrirOrderByCargaFamiliar_NMActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCargaFamiliar_NM")) {
				jButtonRecargarInformacionCargaFamiliar_NMActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCargaFamiliar_NM")) {
				jButtonAnterioresCargaFamiliar_NMActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCargaFamiliar_NM")) {
				jButtonSiguientesCargaFamiliar_NMActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCargaFamiliar_NMBusqueda")) {
				this.jButtonidCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCargaFamiliar_NMUpdate")) {
				this.jButtonid_empresaCargaFamiliar_NMUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCargaFamiliar_NMBusqueda")) {
				this.jButtonid_empresaCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoCargaFamiliar_NM")) {
				this.jButtonid_empleadoCargaFamiliar_NMActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoCargaFamiliar_NMUpdate")) {
				this.jButtonid_empleadoCargaFamiliar_NMUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoCargaFamiliar_NMBusqueda")) {
				this.jButtonid_empleadoCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_carga_famiCargaFamiliar_NMUpdate")) {
				this.jButtonid_tipo_carga_famiCargaFamiliar_NMUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_carga_famiCargaFamiliar_NMBusqueda")) {
				this.jButtonid_tipo_carga_famiCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_generoCargaFamiliar_NMUpdate")) {
				this.jButtonid_tipo_generoCargaFamiliar_NMUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_generoCargaFamiliar_NMBusqueda")) {
				this.jButtonid_tipo_generoCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_civilCargaFamiliar_NMUpdate")) {
				this.jButtonid_estado_civilCargaFamiliar_NMUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_civilCargaFamiliar_NMBusqueda")) {
				this.jButtonid_estado_civilCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cedulaCargaFamiliar_NMBusqueda")) {
				this.jButtoncedulaCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoCargaFamiliar_NMBusqueda")) {
				this.jButtonapellidoCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCargaFamiliar_NMBusqueda")) {
				this.jButtonnombreCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionCargaFamiliar_NMBusqueda")) {
				this.jButtondireccionCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_nacimientoCargaFamiliar_NMBusqueda")) {
				this.jButtonfecha_nacimientoCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_cupoCargaFamiliar_NMBusqueda")) {
				this.jButtonvalor_cupoCargaFamiliar_NMBusquedaActionPerformed(evt);
			}
			
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCargaFamiliar_NM();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCargaFamiliar_NM")) {
				closingInternalFrameCargaFamiliar_NM();
				
			} else if(sTipo.equals("jButtonCancelarCargaFamiliar_NM")) {
				JInternalFrameBase jInternalFrameDetalleFormCargaFamiliar_NM = (JInternalFrameBase)evt.getSource();
	            	
	            CargaFamiliar_NMBeanSwingJInternalFrame jInternalFrameParent=(CargaFamiliar_NMBeanSwingJInternalFrame)jInternalFrameDetalleFormCargaFamiliar_NM.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCargaFamiliar_NMActionPerformed(null);
			}
			
			CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cargafamiliar_nm,new Object(),this.cargafamiliar_nmParameterGeneral,this.cargafamiliar_nmReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCargaFamiliar_NM(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCargaFamiliar_NM(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCargaFamiliar_NM(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cargafamiliar_nm)) {
			if(!esControlTabla) {
				if(CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.cargafamiliar_nm,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);			
				}
				
				if(this.cargafamiliar_nmSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCargaFamiliar_NM(this.cargafamiliar_nm,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cargafamiliar_nmReturnGeneral=cargafamiliar_nmLogic.procesarEventosCargaFamiliar_NMsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cargafamiliar_nmLogic.getCargaFamiliar_NMs(),this.cargafamiliar_nm,this.cargafamiliar_nmParameterGeneral,this.isEsNuevoCargaFamiliar_NM,classes);//this.cargafamiliar_nmLogic.getCargaFamiliar_NM()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCargaFamiliar_NM(this.cargafamiliar_nmReturnGeneral,this.cargafamiliar_nmBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cargafamiliar_nmSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCargaFamiliar_NM(classes,this.cargafamiliar_nmReturnGeneral,this.cargafamiliar_nmBean,false);
					}
						
					if(this.cargafamiliar_nmReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCargaFamiliar_NM(this.cargafamiliar_nmReturnGeneral.getCargaFamiliar_NM());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCargaFamiliar_NM(this.cargafamiliar_nmReturnGeneral.getCargaFamiliar_NM());	
					}
						
					if(this.cargafamiliar_nmReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCargaFamiliar_NM(this.cargafamiliar_nmReturnGeneral.getCargaFamiliar_NM(),classes);//this.cargafamiliar_nmBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCargaFamiliar_NM(this.cargafamiliar_nm,classes);//this.cargafamiliar_nmBean);									
				}
			
				if(CargaFamiliar_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCargaFamiliar_NM(this.cargafamiliar_nm,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCargaFamiliar_NM(this.cargafamiliar_nm);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cargafamiliar_nmAnterior!=null) {
						this.cargafamiliar_nm=this.cargafamiliar_nmAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cargafamiliar_nmReturnGeneral=cargafamiliar_nmLogic.procesarEventosCargaFamiliar_NMsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cargafamiliar_nmLogic.getCargaFamiliar_NMs(),this.cargafamiliar_nm,this.cargafamiliar_nmParameterGeneral,this.isEsNuevoCargaFamiliar_NM,classes);//this.cargafamiliar_nmLogic.getCargaFamiliar_NM()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cargafamiliar_nmSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cargafamiliar_nmReturnGeneral.getCargaFamiliar_NM(),cargafamiliar_nmLogic.getCargaFamiliar_NMs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cargafamiliar_nmReturnGeneral.getCargaFamiliar_NM(),this.cargafamiliar_nms);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCargaFamiliar_NM.repaint();
				
				//((AbstractTableModel) this.jTableDatosCargaFamiliar_NM.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCargaFamiliar_NM();
			}
		}
	}
	
	public void actualizarVisualTableDatosCargaFamiliar_NM() throws Exception {
		
		CargaFamiliar_NMModel cargafamiliar_nmModel=(CargaFamiliar_NMModel)this.jTableDatosCargaFamiliar_NM.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cargafamiliar_nmModel.cargafamiliar_nms=this.cargafamiliar_nmLogic.getCargaFamiliar_NMs();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cargafamiliar_nmModel.cargafamiliar_nms=this.cargafamiliar_nms;
		}
		
		
		((CargaFamiliar_NMModel) this.jTableDatosCargaFamiliar_NM.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCargaFamiliar_NM() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcargafamiliar_nmAnterior(),this.cargafamiliar_nmLogic.getCargaFamiliar_NMs());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcargafamiliar_nmAnterior(),this.cargafamiliar_nms);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCargaFamiliar_NM();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCargaFamiliar_NM(CargaFamiliar_NM cargafamiliar_nm,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
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
										
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cargafamiliar_nm,new Object(),generalEntityParameterGeneral,this.cargafamiliar_nmReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cargafamiliar_nmSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CargaFamiliar_NMConstantesFunciones.getClassesRelationshipsOfCargaFamiliar_NM(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CargaFamiliar_NMConstantesFunciones.getClassesRelationshipsFromStringsOfCargaFamiliar_NM(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCargaFamiliar_NM(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CargaFamiliar_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cargafamiliar_nm,new Object(),generalEntityParameterGeneral,this.cargafamiliar_nmReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCargaFamiliar_NM(CargaFamiliar_NMBean cargafamiliar_nmBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCargaFamiliar_NM(ArrayList<Classe> classes,CargaFamiliar_NMReturnGeneral cargafamiliar_nmReturnGeneral,CargaFamiliar_NMBean cargafamiliar_nmBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCargaFamiliar_NM(CargaFamiliar_NM cargafamiliar_nm,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cargafamiliar_nm)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCargaFamiliar_NM = new CargaFamiliar_NMDetalleFormJInternalFrame(jDesktopPane,this.cargafamiliar_nmSessionBean.getConGuardarRelaciones(),this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.setVisible(false);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.setSelected(false);						
		
		this.jInternalFrameDetalleFormCargaFamiliar_NM.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCargaFamiliar_NM.cargafamiliar_nmLogic=this.cargafamiliar_nmLogic;
		
		this.cargarCombosFrameForeignKeyCargaFamiliar_NM("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCargaFamiliar_NM();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCargaFamiliar_NM();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCargaFamiliar_NM("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCargaFamiliar_NM();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCargaFamiliar_NM.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCargaFamiliar_NM"));
		
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonModificarCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"ModificarCargaFamiliar_NM"));

		
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonModificarToolBarCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"ModificarToolBarCargaFamiliar_NM"));
					
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jMenuItemModificarCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"MenuItemModificarCargaFamiliar_NM"));		
		
		
		
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonActualizarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"ActualizarCargaFamiliar_NM"));
		
		
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonActualizarToolBarCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCargaFamiliar_NM"));
						
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jMenuItemActualizarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCargaFamiliar_NM"));		
		
		
		
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonEliminarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"EliminarCargaFamiliar_NM"));
		
		
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonEliminarToolBarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"EliminarToolBarCargaFamiliar_NM"));
								
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jMenuItemEliminarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCargaFamiliar_NM"));		
		
		
		
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonCancelarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"CancelarCargaFamiliar_NM"));
		
		
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonCancelarToolBarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"CancelarToolBarCargaFamiliar_NM"));
					
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jMenuItemCancelarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCargaFamiliar_NM"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jMenuItemDetalleCerrarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCargaFamiliar_NM"));		
		
		
		
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonGuardarCambiosToolBarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCargaFamiliar_NM"));
		
		
		
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonGuardarCambiosToolBarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCargaFamiliar_NM"));
		
		
		
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxTiposAccionesFormularioCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCargaFamiliar_NM"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonidCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"idCargaFamiliar_NMBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_empresaCargaFamiliar_NMUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCargaFamiliar_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_empresaCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCargaFamiliar_NMBusqueda"));
		//jButtonid_empleadoCargaFamiliar_NM.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoCargaFamiliar_NMActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_empleadoCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"id_empleadoCargaFamiliar_NM"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_empleadoCargaFamiliar_NMUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoCargaFamiliar_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_empleadoCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoCargaFamiliar_NMBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_tipo_carga_famiCargaFamiliar_NMUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_carga_famiCargaFamiliar_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_tipo_carga_famiCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_carga_famiCargaFamiliar_NMBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_tipo_generoCargaFamiliar_NMUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_generoCargaFamiliar_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_tipo_generoCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_generoCargaFamiliar_NMBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_estado_civilCargaFamiliar_NMUpdate.addActionListener(new ButtonActionListener(this,"id_estado_civilCargaFamiliar_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_estado_civilCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_civilCargaFamiliar_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtoncedulaCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"cedulaCargaFamiliar_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonapellidoCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCargaFamiliar_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonnombreCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"nombreCargaFamiliar_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtondireccionCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"direccionCargaFamiliar_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonfecha_nacimientoCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"fecha_nacimientoCargaFamiliar_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonvalor_cupoCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"valor_cupoCargaFamiliar_NMBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jTabbedPaneRelacionesCargaFamiliar_NM.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCargaFamiliar_NM"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCargaFamiliar_NM"));
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar_NM.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCargaFamiliar_NM"));
		}
		
		this.jTableDatosCargaFamiliar_NM.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCargaFamiliar_NM"));
		
		this.jTableDatosCargaFamiliar_NM.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCargaFamiliar_NM"));
		
		this.jButtonNuevoCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"NuevoCargaFamiliar_NM"));
		
		this.jButtonDuplicarCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"DuplicarCargaFamiliar_NM"));
		
		this.jButtonCopiarCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"CopiarCargaFamiliar_NM"));
		
		this.jButtonVerFormCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"VerFormCargaFamiliar_NM"));
		
		
		this.jButtonNuevoToolBarCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"NuevoToolBarCargaFamiliar_NM"));
			
		this.jButtonDuplicarToolBarCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCargaFamiliar_NM"));
			
		this.jMenuItemNuevoCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCargaFamiliar_NM"));
			
		this.jMenuItemDuplicarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCargaFamiliar_NM"));		
		
		
		this.jButtonNuevoRelacionesCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCargaFamiliar_NM"));
		
		
		this.jButtonNuevoRelacionesToolBarCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCargaFamiliar_NM"));
			
		this.jMenuItemNuevoRelacionesCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCargaFamiliar_NM"));		
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonModificarCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"ModificarCargaFamiliar_NM"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonModificarToolBarCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"ModificarToolBarCargaFamiliar_NM"));
			
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jMenuItemModificarCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"MenuItemModificarCargaFamiliar_NM"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonActualizarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"ActualizarCargaFamiliar_NM"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonActualizarToolBarCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCargaFamiliar_NM"));
				
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jMenuItemActualizarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCargaFamiliar_NM"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonEliminarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"EliminarCargaFamiliar_NM"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonEliminarToolBarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"EliminarToolBarCargaFamiliar_NM"));
						
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jMenuItemEliminarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCargaFamiliar_NM"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonCancelarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"CancelarCargaFamiliar_NM"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonCancelarToolBarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"CancelarToolBarCargaFamiliar_NM"));
			
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jMenuItemCancelarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCargaFamiliar_NM"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCargaFamiliar_NM"));		
		
		
		this.jButtonCerrarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"CerrarCargaFamiliar_NM"));
		
		
		this.jButtonCerrarToolBarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"CerrarToolBarCargaFamiliar_NM"));
			
		this.jMenuItemCerrarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCargaFamiliar_NM"));
			
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jMenuItemDetalleCerrarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCargaFamiliar_NM"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonGuardarCambiosCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosCargaFamiliar_NM"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonGuardarCambiosToolBarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCargaFamiliar_NM"));
		}
		
		this.jButtonCopiarToolBarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"CopiarToolBarCargaFamiliar_NM"));
			
		this.jButtonVerFormToolBarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"VerFormToolBarCargaFamiliar_NM"));
		
		this.jMenuItemGuardarCambiosCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCargaFamiliar_NM"));
			
		this.jMenuItemCopiarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCargaFamiliar_NM"));		
		
		this.jMenuItemVerFormCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCargaFamiliar_NM"));		
		
		
		this.jButtonGuardarCambiosTablaCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCargaFamiliar_NM"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCargaFamiliar_NM"));
			
		this.jMenuItemGuardarCambiosTablaCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCargaFamiliar_NM"));		
		
		
		
		this.jButtonRecargarInformacionCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"RecargarInformacionCargaFamiliar_NM"));
					
		this.jButtonRecargarInformacionToolBarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCargaFamiliar_NM"));
		
		this.jMenuItemRecargarInformacionCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCargaFamiliar_NM"));		
		
		
		
		this.jButtonAnterioresCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"AnterioresCargaFamiliar_NM"));
		
		
		this.jButtonAnterioresToolBarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCargaFamiliar_NM"));
		
		this.jMenuItemAnterioresCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCargaFamiliar_NM"));		
		
		
		this.jButtonSiguientesCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"SiguientesCargaFamiliar_NM"));
		
		
		this.jButtonSiguientesToolBarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCargaFamiliar_NM"));
			
		this.jMenuItemSiguientesCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCargaFamiliar_NM"));
			
		this.jMenuItemAbrirOrderByCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCargaFamiliar_NM"));
			
		this.jMenuItemMostrarOcultarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCargaFamiliar_NM"));
			
		this.jMenuItemDetalleAbrirOrderByCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCargaFamiliar_NM"));
			
		this.jMenuItemDetalleMostarOcultarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCargaFamiliar_NM"));		
		
		
		this.jButtonNuevoGuardarCambiosCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCargaFamiliar_NM"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCargaFamiliar_NM"));
			
		this.jMenuItemNuevoGuardarCambiosCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCargaFamiliar_NM"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCargaFamiliar_NM.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCargaFamiliar_NM"));

		this.jCheckBoxSeleccionadosCargaFamiliar_NM.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCargaFamiliar_NM"));
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxTiposAccionesFormularioCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCargaFamiliar_NM"));
		}
		
		
		this.jComboBoxTiposRelacionesCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"TiposRelacionesCargaFamiliar_NM"));
			
		this.jComboBoxTiposAccionesCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"TiposAccionesCargaFamiliar_NM"));
					
		this.jComboBoxTiposSeleccionarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCargaFamiliar_NM"));
			
		this.jTextFieldValorCampoGeneralCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCargaFamiliar_NM"));		
		
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonidCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"idCargaFamiliar_NMBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_empresaCargaFamiliar_NMUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCargaFamiliar_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_empresaCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCargaFamiliar_NMBusqueda"));
		//jButtonid_empleadoCargaFamiliar_NM.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoCargaFamiliar_NMActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_empleadoCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"id_empleadoCargaFamiliar_NM"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_empleadoCargaFamiliar_NMUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoCargaFamiliar_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_empleadoCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoCargaFamiliar_NMBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_tipo_carga_famiCargaFamiliar_NMUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_carga_famiCargaFamiliar_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_tipo_carga_famiCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_carga_famiCargaFamiliar_NMBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_tipo_generoCargaFamiliar_NMUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_generoCargaFamiliar_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_tipo_generoCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_generoCargaFamiliar_NMBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_estado_civilCargaFamiliar_NMUpdate.addActionListener(new ButtonActionListener(this,"id_estado_civilCargaFamiliar_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_estado_civilCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_civilCargaFamiliar_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtoncedulaCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"cedulaCargaFamiliar_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonapellidoCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCargaFamiliar_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonnombreCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"nombreCargaFamiliar_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtondireccionCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"direccionCargaFamiliar_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonfecha_nacimientoCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"fecha_nacimientoCargaFamiliar_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonvalor_cupoCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"valor_cupoCargaFamiliar_NMBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoCargaFamiliar_NM"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"id_empleadoCargaFamiliar_NM"));

			this.jButtonFK_IdEstadoCivilCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"FK_IdEstadoCivilCargaFamiliar_NM"));

			this.jButtonFK_IdTipoCargaFamiCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"FK_IdTipoCargaFamiCargaFamiliar_NM"));

			this.jButtonFK_IdTipoGeneroCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"FK_IdTipoGeneroCargaFamiliar_NM"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCargaFamiliar_NM!=null) {
				this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCargaFamiliar_NM"));
				this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCargaFamiliar_NM"));
				this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCargaFamiliar_NM"));
			}
			
			//this.jButtonCerrarReporteDinamicoCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCargaFamiliar_NM"));				
			//this.jButtonGenerarReporteDinamicoCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCargaFamiliar_NM"));
			//this.jButtonGenerarExcelReporteDinamicoCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCargaFamiliar_NM"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCargaFamiliar_NM!=null) {
				this.jInternalFrameImportacionCargaFamiliar_NM.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCargaFamiliar_NM"));
				this.jInternalFrameImportacionCargaFamiliar_NM.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCargaFamiliar_NM"));
				this.jInternalFrameImportacionCargaFamiliar_NM.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCargaFamiliar_NM"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"AbrirOrderByCargaFamiliar_NM"));
			
			this.jButtonAbrirOrderByToolBarCargaFamiliar_NM.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCargaFamiliar_NM"));			
			
			if(this.jInternalFrameOrderByCargaFamiliar_NM!=null) {
				this.jInternalFrameOrderByCargaFamiliar_NM.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCargaFamiliar_NM"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jTabbedPaneRelacionesCargaFamiliar_NM.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCargaFamiliar_NM"));
		
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
            		closingInternalFrameCargaFamiliar_NM();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCargaFamiliar_NM.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCargaFamiliar_NM = (JInternalFrameBase)event.getSource();
	            	
	            CargaFamiliar_NMBeanSwingJInternalFrame jInternalFrameParent=(CargaFamiliar_NMBeanSwingJInternalFrame)jInternalFrameDetalleFormCargaFamiliar_NM.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCargaFamiliar_NMActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCargaFamiliar_NM.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCargaFamiliar_NMListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCargaFamiliar_NM.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCargaFamiliar_NM.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargaFamiliar_NMActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargaFamiliar_NMActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargaFamiliar_NMActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCargaFamiliar_NM";
		inputMap = this.jButtonNuevoCargaFamiliar_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCargaFamiliar_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCargaFamiliar_NMActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargaFamiliar_NMActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargaFamiliar_NMActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargaFamiliar_NMActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCargaFamiliar_NM";
		inputMap = this.jButtonNuevoRelacionesCargaFamiliar_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCargaFamiliar_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCargaFamiliar_NMActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCargaFamiliar_NM";
		inputMap = this.jButtonModificarCargaFamiliar_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCargaFamiliar_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCargaFamiliar_NMActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCargaFamiliar_NM";
		inputMap = this.jButtonActualizarCargaFamiliar_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCargaFamiliar_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCargaFamiliar_NMActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCargaFamiliar_NM";
		inputMap = this.jButtonEliminarCargaFamiliar_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCargaFamiliar_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCargaFamiliar_NMActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCargaFamiliar_NM";
		inputMap = this.jButtonCancelarCargaFamiliar_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCargaFamiliar_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCargaFamiliar_NMActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCargaFamiliar_NM";
		inputMap = this.jButtonCerrarCargaFamiliar_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCargaFamiliar_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCargaFamiliar_NMActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonGuardarCambiosCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCargaFamiliar_NM";
		inputMap = this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonGuardarCambiosCargaFamiliar_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonGuardarCambiosCargaFamiliar_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCargaFamiliar_NMActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCargaFamiliar_NM.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCargaFamiliar_NMItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCargaFamiliar_NM.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCargaFamiliar_NMActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCargaFamiliar_NM.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCargaFamiliar_NMActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCargaFamiliar_NM.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCargaFamiliar_NMActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonidCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"idCargaFamiliar_NMBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_empresaCargaFamiliar_NMUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCargaFamiliar_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_empresaCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCargaFamiliar_NMBusqueda"));
		//jButtonid_empleadoCargaFamiliar_NM.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoCargaFamiliar_NMActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_empleadoCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"id_empleadoCargaFamiliar_NM"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_empleadoCargaFamiliar_NMUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoCargaFamiliar_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_empleadoCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoCargaFamiliar_NMBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_tipo_carga_famiCargaFamiliar_NMUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_carga_famiCargaFamiliar_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_tipo_carga_famiCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_carga_famiCargaFamiliar_NMBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_tipo_generoCargaFamiliar_NMUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_generoCargaFamiliar_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_tipo_generoCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_generoCargaFamiliar_NMBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_estado_civilCargaFamiliar_NMUpdate.addActionListener(new ButtonActionListener(this,"id_estado_civilCargaFamiliar_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_estado_civilCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_civilCargaFamiliar_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtoncedulaCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"cedulaCargaFamiliar_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonapellidoCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCargaFamiliar_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonnombreCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"nombreCargaFamiliar_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtondireccionCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"direccionCargaFamiliar_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonfecha_nacimientoCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"fecha_nacimientoCargaFamiliar_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonvalor_cupoCargaFamiliar_NMBusqueda.addActionListener(new ButtonActionListener(this,"valor_cupoCargaFamiliar_NMBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoCargaFamiliar_NM"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"id_empleadoCargaFamiliar_NM"));

		this.jButtonFK_IdEstadoCivilCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"FK_IdEstadoCivilCargaFamiliar_NM"));

		this.jButtonFK_IdTipoCargaFamiCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"FK_IdTipoCargaFamiCargaFamiliar_NM"));

		this.jButtonFK_IdTipoGeneroCargaFamiliar_NM.addActionListener(new ButtonActionListener(this,"FK_IdTipoGeneroCargaFamiliar_NM"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCargaFamiliar_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCargaFamiliar_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCargaFamiliar_NMActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCargaFamiliar_NM.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCargaFamiliar_NM(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CargaFamiliar_NM cargafamiliar_nmAux:this.cargafamiliar_nmLogic.getCargaFamiliar_NMs()) {
					cargafamiliar_nmAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CargaFamiliar_NM cargafamiliar_nmAux:cargafamiliar_nms) {
					cargafamiliar_nmAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCargaFamiliar_NMItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCargaFamiliar_NM(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CargaFamiliar_NM cargafamiliar_nmAux:this.cargafamiliar_nmLogic.getCargaFamiliar_NMs()) {
						cargafamiliar_nmAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CargaFamiliar_NM cargafamiliar_nmAux:cargafamiliar_nms) {
						cargafamiliar_nmAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CargaFamiliar_NM cargafamiliar_nmAux:this.cargafamiliar_nmLogic.getCargaFamiliar_NMs()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CargaFamiliar_NM cargafamiliar_nmAux:cargafamiliar_nms) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCargaFamiliar_NM(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCargaFamiliar_NM.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCargaFamiliar_NM.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar_NM,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCargaFamiliar_NMItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCargaFamiliar_NM(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCargaFamiliar_NM.getSelectedRows();
			
			CargaFamiliar_NM cargafamiliar_nmLocal=new CargaFamiliar_NM();
			
			//this.seleccionarTodosCargaFamiliar_NM(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargafamiliar_nmLocal =(CargaFamiliar_NM) this.cargafamiliar_nmLogic.getCargaFamiliar_NMs().toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cargafamiliar_nmLocal =(CargaFamiliar_NM) this.cargafamiliar_nms.toArray()[this.jTableDatosCargaFamiliar_NM.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cargafamiliar_nmLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CargaFamiliar_NM cargafamiliar_nmAux:this.cargafamiliar_nmLogic.getCargaFamiliar_NMs()) {
						cargafamiliar_nmAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CargaFamiliar_NM cargafamiliar_nmAux:cargafamiliar_nms) {
						cargafamiliar_nmAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCargaFamiliar_NM(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCargaFamiliar_NM.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCargaFamiliar_NM.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCargaFamiliar_NM,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCargaFamiliar_NMItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCargaFamiliar_NMParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCargaFamiliar_NMActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCargaFamiliar_NM(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCargaFamiliar_NM.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CargaFamiliar_NM cargafamiliar_nmAux:this.cargafamiliar_nmLogic.getCargaFamiliar_NMs()) {
				
						if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_CEDULA)) {
							existe=true;
							cargafamiliar_nmAux.setcedula(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							cargafamiliar_nmAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cargafamiliar_nmAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							cargafamiliar_nmAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_FECHANACIMIENTO)) {
							existe=true;
							cargafamiliar_nmAux.setfecha_nacimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_VALORCUPO)) {
							existe=true;
							cargafamiliar_nmAux.setvalor_cupo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CargaFamiliar_NM cargafamiliar_nmAux:cargafamiliar_nms) {
					
						if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_CEDULA)) {
							existe=true;
							cargafamiliar_nmAux.setcedula(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							cargafamiliar_nmAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cargafamiliar_nmAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							cargafamiliar_nmAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_FECHANACIMIENTO)) {
							existe=true;
							cargafamiliar_nmAux.setfecha_nacimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_VALORCUPO)) {
							existe=true;
							cargafamiliar_nmAux.setvalor_cupo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCargaFamiliar_NM(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCargaFamiliar_NMActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCargaFamiliar_NM(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCargaFamiliar_NM=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCargaFamiliar_NM.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxTiposAccionesFormularioCargaFamiliar_NM.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCargaFamiliar_NM) {				
					conSplash=true;//false;										
					
					//this.startProcessCargaFamiliar_NM(conSplash);
				
					this.generarReporteCargaFamiliar_NMsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCargaFamiliar_NM.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxTiposAccionesFormularioCargaFamiliar_NM.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCargaFamiliar_NMsSeleccionados();
				//this.jComboBoxTiposAccionesCargaFamiliar_NM.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCargaFamiliar_NMsSeleccionados(false);
				//this.jComboBoxTiposAccionesCargaFamiliar_NM.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCargaFamiliar_NMsSeleccionados(true);
				//this.jComboBoxTiposAccionesCargaFamiliar_NM.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCargaFamiliar_NM();
				
				this.exportarCargaFamiliar_NMsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCargaFamiliar_NM.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxTiposAccionesFormularioCargaFamiliar_NM.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCargaFamiliar_NMs();
				//this.importarCargaFamiliar_NMs();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCargaFamiliar_NM.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxTiposAccionesFormularioCargaFamiliar_NM.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCargaFamiliar_NM();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCargaFamiliar_NMsSeleccionados();
				//this.jComboBoxTiposAccionesCargaFamiliar_NM.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Carga Familiar_ N M", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCargaFamiliar_NM();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCargaFamiliar_NM)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCargaFamiliar_NM(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Carga Familiar_ N M",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCargaFamiliar_NM.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxTiposAccionesFormularioCargaFamiliar_NM.setSelectedIndex(0);					
				}	
			} 			
			else if(CargaFamiliar_NMBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCargaFamiliar_NM) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCargaFamiliar_NM(conSplash);
					
						//this.actualizarParametrosGeneralCargaFamiliar_NM();
						
						this.generarReporteProcesoAccionCargaFamiliar_NMsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCargaFamiliar_NM.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxTiposAccionesFormularioCargaFamiliar_NM.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CargaFamiliar_NMBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Carga Familiar_ N MES SELECCIONADOS?", "MANTENIMIENTO DE Carga Familiar_ N M", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCargaFamiliar_NM();
				
						this.actualizarParametrosGeneralCargaFamiliar_NM();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cargafamiliar_nmReturnGeneral=cargafamiliar_nmLogic.procesarAccionCargaFamiliar_NMsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cargafamiliar_nmLogic.getCargaFamiliar_NMs(),this.cargafamiliar_nmParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCargaFamiliar_NMReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCargaFamiliar_NM.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxTiposAccionesFormularioCargaFamiliar_NM.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCargaFamiliar_NM();
					
					CargaFamiliar_NMBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCargaFamiliar_NMReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCargaFamiliar_NM.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxTiposAccionesFormularioCargaFamiliar_NM.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCargaFamiliar_NM(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCargaFamiliar_NMActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCargaFamiliar_NM();
			
			if(this.jInternalFrameDetalleFormCargaFamiliar_NM==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CargaFamiliar_NM> cargafamiliar_nmsSeleccionados=new ArrayList<CargaFamiliar_NM>();		
			CargaFamiliar_NM cargafamiliar_nm=new CargaFamiliar_NM();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCargaFamiliar_NM(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCargaFamiliar_NM.getSelectedItem();
			
			
			
			
			cargafamiliar_nmsSeleccionados=this.getCargaFamiliar_NMsSeleccionados(true);
			//this.sTipoAccion;
			
			if(cargafamiliar_nmsSeleccionados.size()==1) {
				for(CargaFamiliar_NM cargafamiliar_nmAux:cargafamiliar_nmsSeleccionados) {
					cargafamiliar_nm=cargafamiliar_nmAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCargaFamiliar_NM();
			
      		//this.finishProcessCargaFamiliar_NM(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCargaFamiliar_NMReturnGeneral() throws Exception {
		if(this.cargafamiliar_nmReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cargafamiliar_nmReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cargafamiliar_nmReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cargafamiliar_nmReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cargafamiliar_nmReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cargafamiliar_nmReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCargaFamiliar_NM(false);
		}
		
		if(this.cargafamiliar_nmReturnGeneral.getConRetornoLista() || this.cargafamiliar_nmReturnGeneral.getConRetornoObjeto()) {
			if(this.cargafamiliar_nmReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cargafamiliar_nmLogic.setCargaFamiliar_NMs(this.cargafamiliar_nmReturnGeneral.getCargaFamiliar_NMs());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cargafamiliar_nmReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cargafamiliar_nmLogic.setCargaFamiliar_NM(this.cargafamiliar_nmReturnGeneral.getCargaFamiliar_NM());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCargaFamiliar_NM(false);
		}
	}
	
	public void actualizarParametrosGeneralCargaFamiliar_NM() throws Exception {
		
		
	}
	
	public ArrayList<CargaFamiliar_NM> getCargaFamiliar_NMsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CargaFamiliar_NM> cargafamiliar_nmsSeleccionados=new ArrayList<CargaFamiliar_NM>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCargaFamiliar_NM) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CargaFamiliar_NM cargafamiliar_nmAux:cargafamiliar_nmLogic.getCargaFamiliar_NMs()) {
					if(cargafamiliar_nmAux.getIsSelected()) {
						cargafamiliar_nmsSeleccionados.add(cargafamiliar_nmAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CargaFamiliar_NM cargafamiliar_nmAux:this.cargafamiliar_nms) {
					if(cargafamiliar_nmAux.getIsSelected()) {
						cargafamiliar_nmsSeleccionados.add(cargafamiliar_nmAux);				
					}
				}
			}
			
			if(cargafamiliar_nmsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cargafamiliar_nmsSeleccionados.addAll(this.cargafamiliar_nmLogic.getCargaFamiliar_NMs());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cargafamiliar_nmsSeleccionados.addAll(this.cargafamiliar_nms);				
					}
				}
			}
		} else {
			cargafamiliar_nmsSeleccionados.add(this.cargafamiliar_nm);
		}
		
		return cargafamiliar_nmsSeleccionados;
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
	
	public void generarReporteCargaFamiliar_NMsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCargaFamiliar_NMsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCargaFamiliar_NMsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCargaFamiliar_NMsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCargaFamiliar_NMsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Carga Familiar_ N M",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCargaFamiliar_NMsSeleccionados() throws Exception {
		ArrayList<CargaFamiliar_NM> cargafamiliar_nmsSeleccionados=new ArrayList<CargaFamiliar_NM>();		
		
		cargafamiliar_nmsSeleccionados=this.getCargaFamiliar_NMsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCargaFamiliar_NMs("Todos",cargafamiliar_nmsSeleccionados);
		
	}	
	
	public void generarReporteNormalCargaFamiliar_NMsSeleccionados() throws Exception {
		ArrayList<CargaFamiliar_NM> cargafamiliar_nmsSeleccionados=new ArrayList<CargaFamiliar_NM>();		
		
		cargafamiliar_nmsSeleccionados=this.getCargaFamiliar_NMsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCargaFamiliar_NMs("Todos",cargafamiliar_nmsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCargaFamiliar_NMsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CargaFamiliar_NM> cargafamiliar_nmsSeleccionados=new ArrayList<CargaFamiliar_NM>();
		
		cargafamiliar_nmsSeleccionados=this.getCargaFamiliar_NMsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCargaFamiliar_NMs("Todos",cargafamiliar_nmsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCargaFamiliar_NMsSeleccionados() throws Exception {
		ArrayList<CargaFamiliar_NM> cargafamiliar_nmsSeleccionados=new ArrayList<CargaFamiliar_NM>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCargaFamiliar_NM();
		
		
		cargafamiliar_nmsSeleccionados=this.getCargaFamiliar_NMsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCargaFamiliar_NM();
		
		
		//this.generarReporteCargaFamiliar_NMs("Todos",cargafamiliar_nmsSeleccionados ,cargafamiliar_nmImplementable,cargafamiliar_nmImplementableHome);
	}
	
	public void mostrarImportacionCargaFamiliar_NMs() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCargaFamiliar_NM();
		
		this.abrirFrameImportacionCargaFamiliar_NM();		
		
			
		//this.generarReporteCargaFamiliar_NMs("Todos",cargafamiliar_nmsSeleccionados ,cargafamiliar_nmImplementable,cargafamiliar_nmImplementableHome);
	}
	
	public void importarCargaFamiliar_NMs() throws Exception {		
	
	}
	
	public void exportarCargaFamiliar_NMsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCargaFamiliar_NMsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCargaFamiliar_NMsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCargaFamiliar_NMsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Carga Familiar_ N M",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCargaFamiliar_NMsSeleccionados() throws Exception {
		ArrayList<CargaFamiliar_NM> cargafamiliar_nmsSeleccionados=new ArrayList<CargaFamiliar_NM>();		
		
		cargafamiliar_nmsSeleccionados=this.getCargaFamiliar_NMsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargafamiliar_nm."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCargaFamiliar_NM(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CargaFamiliar_NM cargafamiliar_nmAux:cargafamiliar_nmsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCargaFamiliar_NM(cargafamiliar_nmAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cargafamiliar_nmAux.setsDetalleGeneralEntityReporte(cargafamiliar_nmAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Carga Familiar_ N M",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCargaFamiliar_NM(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CargaFamiliar_NMConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliar_NMConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOCARGAFAMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOGENERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliar_NMConstantesFunciones.LABEL_IDESTADOCIVIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliar_NMConstantesFunciones.LABEL_CEDULA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliar_NMConstantesFunciones.LABEL_APELLIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliar_NMConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliar_NMConstantesFunciones.LABEL_DIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliar_NMConstantesFunciones.LABEL_FECHANACIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargaFamiliar_NMConstantesFunciones.LABEL_VALORCUPO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCargaFamiliar_NM(CargaFamiliar_NM cargafamiliar_nm,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cargafamiliar_nm.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar_nm.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar_nm.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar_nm.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar_nm.gettipocargafami_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar_nm.gettipogenero_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar_nm.getestadocivil_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar_nm.getcedula();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar_nm.getapellido();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar_nm.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar_nm.getdireccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar_nm.getfecha_nacimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargafamiliar_nm.getvalor_cupo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCargaFamiliar_NMsSeleccionados() throws Exception {
		ArrayList<CargaFamiliar_NM> cargafamiliar_nmsSeleccionados=new ArrayList<CargaFamiliar_NM>();		
		
		cargafamiliar_nmsSeleccionados=this.getCargaFamiliar_NMsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargafamiliar_nm.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CargaFamiliar_NMs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCargaFamiliar_NM(row);				
				iRow++;
			}				
			
			for(CargaFamiliar_NM cargafamiliar_nmAux:cargafamiliar_nmsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCargaFamiliar_NM(cargafamiliar_nmAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Carga Familiar_ N M",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCargaFamiliar_NMsSeleccionados() throws Exception {
		ArrayList<CargaFamiliar_NM> cargafamiliar_nmsSeleccionados=new ArrayList<CargaFamiliar_NM>();		
		
		cargafamiliar_nmsSeleccionados=this.getCargaFamiliar_NMsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargafamiliar_nm.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cargafamiliar_nms");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cargafamiliar_nm");
			//elementRoot.appendChild(element);
		
			for(CargaFamiliar_NM cargafamiliar_nmAux:cargafamiliar_nmsSeleccionados) {
				element = document.createElement("cargafamiliar_nm");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCargaFamiliar_NM(cargafamiliar_nmAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Carga Familiar_ N M",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCargaFamiliar_NM(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOCARGAFAMI);
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOGENERO);
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_IDESTADOCIVIL);
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_CEDULA);
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_APELLIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_DIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_FECHANACIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CargaFamiliar_NMConstantesFunciones.LABEL_VALORCUPO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCargaFamiliar_NM(CargaFamiliar_NM cargafamiliar_nm,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar_nm.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar_nm.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar_nm.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar_nm.gettipocargafami_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar_nm.gettipogenero_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar_nm.getestadocivil_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar_nm.getcedula());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar_nm.getapellido());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar_nm.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar_nm.getdireccion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar_nm.getfecha_nacimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(cargafamiliar_nm.getvalor_cupo());				
	}
	
	public void setFilaDatosExportarXmlCargaFamiliar_NM(CargaFamiliar_NM cargafamiliar_nm,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CargaFamiliar_NMConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cargafamiliar_nm.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CargaFamiliar_NMConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cargafamiliar_nm.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CargaFamiliar_NMConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cargafamiliar_nm.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(CargaFamiliar_NMConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(cargafamiliar_nm.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementtipocargafami_descripcion = document.createElement(CargaFamiliar_NMConstantesFunciones.IDTIPOCARGAFAMI);
		elementtipocargafami_descripcion.appendChild(document.createTextNode(cargafamiliar_nm.gettipocargafami_descripcion()));
		element.appendChild(elementtipocargafami_descripcion);

		Element elementtipogenero_descripcion = document.createElement(CargaFamiliar_NMConstantesFunciones.IDTIPOGENERO);
		elementtipogenero_descripcion.appendChild(document.createTextNode(cargafamiliar_nm.gettipogenero_descripcion()));
		element.appendChild(elementtipogenero_descripcion);

		Element elementestadocivil_descripcion = document.createElement(CargaFamiliar_NMConstantesFunciones.IDESTADOCIVIL);
		elementestadocivil_descripcion.appendChild(document.createTextNode(cargafamiliar_nm.getestadocivil_descripcion()));
		element.appendChild(elementestadocivil_descripcion);

		Element elementcedula = document.createElement(CargaFamiliar_NMConstantesFunciones.CEDULA);
		elementcedula.appendChild(document.createTextNode(cargafamiliar_nm.getcedula().trim()));
		element.appendChild(elementcedula);

		Element elementapellido = document.createElement(CargaFamiliar_NMConstantesFunciones.APELLIDO);
		elementapellido.appendChild(document.createTextNode(cargafamiliar_nm.getapellido().trim()));
		element.appendChild(elementapellido);

		Element elementnombre = document.createElement(CargaFamiliar_NMConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(cargafamiliar_nm.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdireccion = document.createElement(CargaFamiliar_NMConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(cargafamiliar_nm.getdireccion().trim()));
		element.appendChild(elementdireccion);

		Element elementfecha_nacimiento = document.createElement(CargaFamiliar_NMConstantesFunciones.FECHANACIMIENTO);
		elementfecha_nacimiento.appendChild(document.createTextNode(cargafamiliar_nm.getfecha_nacimiento().toString().trim()));
		element.appendChild(elementfecha_nacimiento);

		Element elementvalor_cupo = document.createElement(CargaFamiliar_NMConstantesFunciones.VALORCUPO);
		elementvalor_cupo.appendChild(document.createTextNode(cargafamiliar_nm.getvalor_cupo().toString().trim()));
		element.appendChild(elementvalor_cupo);
	}
	
	public void generarReporteGroupGenericoCargaFamiliar_NMsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CargaFamiliar_NM> cargafamiliar_nmsSeleccionados=new ArrayList<CargaFamiliar_NM>();
		
		cargafamiliar_nmsSeleccionados=this.getCargaFamiliar_NMsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCargaFamiliar_NM(cargafamiliar_nmsSeleccionados);
		
		this.generarReporteCargaFamiliar_NMs("Todos",cargafamiliar_nmsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCargaFamiliar_NM(ArrayList<CargaFamiliar_NM> cargafamiliar_nmsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CargaFamiliar_NM cargafamiliar_nmAux:cargafamiliar_nmsSeleccionados) {
				cargafamiliar_nmAux.setsDetalleGeneralEntityReporte(cargafamiliar_nmAux.toString());
			
				if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cargafamiliar_nmAux.setsDescripcionGeneralEntityReporte1(cargafamiliar_nmAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					cargafamiliar_nmAux.setsDescripcionGeneralEntityReporte1(cargafamiliar_nmAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOCARGAFAMI)) {
					existe=true;
					cargafamiliar_nmAux.setsDescripcionGeneralEntityReporte1(cargafamiliar_nmAux.gettipocargafami_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_IDTIPOGENERO)) {
					existe=true;
					cargafamiliar_nmAux.setsDescripcionGeneralEntityReporte1(cargafamiliar_nmAux.gettipogenero_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_IDESTADOCIVIL)) {
					existe=true;
					cargafamiliar_nmAux.setsDescripcionGeneralEntityReporte1(cargafamiliar_nmAux.getestadocivil_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_CEDULA)) {
					existe=true;
					cargafamiliar_nmAux.setsDescripcionGeneralEntityReporte1(cargafamiliar_nmAux.getcedula());
				}
				 else if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_APELLIDO)) {
					existe=true;
					cargafamiliar_nmAux.setsDescripcionGeneralEntityReporte1(cargafamiliar_nmAux.getapellido());
				}
				 else if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					cargafamiliar_nmAux.setsDescripcionGeneralEntityReporte1(cargafamiliar_nmAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					cargafamiliar_nmAux.setsDescripcionGeneralEntityReporte1(cargafamiliar_nmAux.getdireccion());
				}
				 else if(sTipoSeleccionar.equals(CargaFamiliar_NMConstantesFunciones.LABEL_FECHANACIMIENTO)) {
					existe=true;
					cargafamiliar_nmAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cargafamiliar_nmAux.getfecha_nacimiento()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargaFamiliar_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCargaFamiliar_NM(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCargaFamiliar_NM=true;
				this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM=true;
				this.isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM=true;
			}
			
			this.isVisibilidadCeldaModificarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaActualizarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaEliminarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaCancelarCargaFamiliar_NM=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargaFamiliar_NM=true;
				} else {
					this.isVisibilidadCeldaGuardarCargaFamiliar_NM=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCargaFamiliar_NM=false;
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM=false;
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM=false;
			this.isVisibilidadCeldaModificarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaActualizarCargaFamiliar_NM=true;
			this.isVisibilidadCeldaEliminarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaCancelarCargaFamiliar_NM=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargaFamiliar_NM=true;
				} else {
					this.isVisibilidadCeldaGuardarCargaFamiliar_NM=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCargaFamiliar_NM=false;
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM=false;
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM=false;
			this.isVisibilidadCeldaModificarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaActualizarCargaFamiliar_NM=true;
			this.isVisibilidadCeldaEliminarCargaFamiliar_NM=true;
			this.isVisibilidadCeldaCancelarCargaFamiliar_NM=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargaFamiliar_NM=true;
				} else {
					this.isVisibilidadCeldaGuardarCargaFamiliar_NM=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCargaFamiliar_NM=false;
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM=false;
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM=false;
			this.isVisibilidadCeldaModificarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaActualizarCargaFamiliar_NM=true;
			this.isVisibilidadCeldaEliminarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaCancelarCargaFamiliar_NM=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargaFamiliar_NM=false;
				} else {
					this.isVisibilidadCeldaGuardarCargaFamiliar_NM=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCargaFamiliar_NM=true;
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM=true;
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM=true;
			this.isVisibilidadCeldaModificarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaActualizarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaEliminarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaCancelarCargaFamiliar_NM=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargaFamiliar_NM=true;
				} else {
					this.isVisibilidadCeldaGuardarCargaFamiliar_NM=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCargaFamiliar_NM=false;
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM=false;
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM=false;
			this.isVisibilidadCeldaActualizarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaEliminarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaCancelarCargaFamiliar_NM=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargaFamiliar_NM=false;
				} else {
					this.isVisibilidadCeldaGuardarCargaFamiliar_NM=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCargaFamiliar_NM=false;
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM=false;
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM=false;
			this.isVisibilidadCeldaModificarCargaFamiliar_NM=true;
			this.isVisibilidadCeldaActualizarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaEliminarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaCancelarCargaFamiliar_NM=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargaFamiliar_NM=false;
				} else {
					this.isVisibilidadCeldaGuardarCargaFamiliar_NM=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CargaFamiliar_NMJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCargaFamiliar_NM=true;
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM=true;
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM=true;
		} else {
			this.actualizarEstadoPanelsCargaFamiliar_NM(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCargaFamiliar_NM=false;
			//this.isVisibilidadCeldaVerFormCargaFamiliar_NM=false;
			this.isVisibilidadCeldaDuplicarCargaFamiliar_NM=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cargafamiliar_nmSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM=false;
		} else {
			this.isVisibilidadCeldaNuevoCargaFamiliar_NM=false;
			this.isVisibilidadCeldaGuardarCambiosCargaFamiliar_NM=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
			if(!cargafamiliar_nmSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM=false;												
			}
			
			this.jButtonCerrarCargaFamiliar_NM.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCargaFamiliar_NM=false;
		}
		
		if(!this.permiteMantenimiento(this.cargafamiliar_nm)) {
			this.isVisibilidadCeldaActualizarCargaFamiliar_NM=false;
			this.isVisibilidadCeldaEliminarCargaFamiliar_NM=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCargaFamiliar_NM() {
	}
	
	public void actualizarEstadoPanelsCargaFamiliar_NM(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCargaFamiliar_NM!=null) {
				this.jScrollPanelDatosEdicionCargaFamiliar_NM.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargaFamiliar_NM!=null) {
				this.jTabbedPaneBusquedasCargaFamiliar_NM.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCargaFamiliar_NM!=null) {
				this.jScrollPanelDatosCargaFamiliar_NM.setVisible(true);
			}
			
			if(this.jPanelPaginacionCargaFamiliar_NM!=null) {
				this.jPanelPaginacionCargaFamiliar_NM.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCargaFamiliar_NM!=null) {
				this.jPanelParametrosReportesCargaFamiliar_NM.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCargaFamiliar_NM!=null) {
				this.jScrollPanelDatosEdicionCargaFamiliar_NM.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargaFamiliar_NM!=null) {
				this.jTabbedPaneBusquedasCargaFamiliar_NM.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCargaFamiliar_NM!=null) {
				this.jScrollPanelDatosCargaFamiliar_NM.setVisible(false);
			}
			
			if(this.jPanelPaginacionCargaFamiliar_NM!=null) {
				this.jPanelPaginacionCargaFamiliar_NM.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCargaFamiliar_NM!=null) {
				this.jPanelParametrosReportesCargaFamiliar_NM.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCargaFamiliar_NM!=null) {
				this.jScrollPanelDatosEdicionCargaFamiliar_NM.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargaFamiliar_NM!=null) {
				this.jTabbedPaneBusquedasCargaFamiliar_NM.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCargaFamiliar_NM!=null) {
				this.jScrollPanelDatosCargaFamiliar_NM.setVisible(false);
			}
			
			if(this.jPanelPaginacionCargaFamiliar_NM!=null) {
				this.jPanelPaginacionCargaFamiliar_NM.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCargaFamiliar_NM!=null) {
				this.jPanelParametrosReportesCargaFamiliar_NM.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCargaFamiliar_NM!=null) {
				this.jScrollPanelDatosEdicionCargaFamiliar_NM.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargaFamiliar_NM!=null) {
				this.jTabbedPaneBusquedasCargaFamiliar_NM.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCargaFamiliar_NM!=null) {
				this.jScrollPanelDatosCargaFamiliar_NM.setVisible(false);
			}
			
			if(this.jPanelPaginacionCargaFamiliar_NM!=null) {
				this.jPanelPaginacionCargaFamiliar_NM.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCargaFamiliar_NM!=null) {
				this.jPanelParametrosReportesCargaFamiliar_NM.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCargaFamiliar_NM!=null) {
				this.jScrollPanelDatosEdicionCargaFamiliar_NM.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargaFamiliar_NM!=null) {
				this.jTabbedPaneBusquedasCargaFamiliar_NM.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCargaFamiliar_NM!=null) {
				this.jScrollPanelDatosCargaFamiliar_NM.setVisible(true);
			}
			
			if(this.jPanelPaginacionCargaFamiliar_NM!=null) {
				this.jPanelPaginacionCargaFamiliar_NM.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCargaFamiliar_NM!=null) {
				this.jPanelParametrosReportesCargaFamiliar_NM.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCargaFamiliar_NM!=null) {
				this.jScrollPanelDatosEdicionCargaFamiliar_NM.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargaFamiliar_NM!=null) {
				this.jTabbedPaneBusquedasCargaFamiliar_NM.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCargaFamiliar_NM!=null) {
				this.jScrollPanelDatosCargaFamiliar_NM.setVisible(true);
			}
			
			if(this.jPanelPaginacionCargaFamiliar_NM!=null) {
				this.jPanelPaginacionCargaFamiliar_NM.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCargaFamiliar_NM!=null) {
				this.jPanelParametrosReportesCargaFamiliar_NM.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCargaFamiliar_NM!=null) {
				this.jScrollPanelDatosEdicionCargaFamiliar_NM.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargaFamiliar_NM!=null) {
				this.jTabbedPaneBusquedasCargaFamiliar_NM.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCargaFamiliar_NM!=null) {
				this.jScrollPanelDatosCargaFamiliar_NM.setVisible(true);
			}
			
			if(this.jPanelPaginacionCargaFamiliar_NM!=null) {
				this.jPanelPaginacionCargaFamiliar_NM.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCargaFamiliar_NM!=null) {
				this.jPanelParametrosReportesCargaFamiliar_NM.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCargaFamiliar_NM!=null) {
					this.jTabbedPaneBusquedasCargaFamiliar_NM.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCargaFamiliar_NM!=null) {
				this.jPanelParametrosReportesCargaFamiliar_NM.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargaFamiliar_NM!=null) {
				this.jTabbedPaneBusquedasCargaFamiliar_NM.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCargaFamiliar_NM!=null) {
				this.jPanelParametrosReportesCargaFamiliar_NM.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(jPanelFK_IdEmpleadoCargaFamiliar_NM);}

			this.isVisibilidadFK_IdEstadoCivil=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstadoCivil) {this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(jPanelFK_IdEstadoCivilCargaFamiliar_NM);}

			this.isVisibilidadFK_IdTipoCargaFami=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoCargaFami) {this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(jPanelFK_IdTipoCargaFamiCargaFamiliar_NM);}

			this.isVisibilidadFK_IdTipoGenero=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoGenero) {this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(jPanelFK_IdTipoGeneroCargaFamiliar_NM);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(jPanelFK_IdEmpleadoCargaFamiliar_NM);}

			this.isVisibilidadFK_IdEstadoCivil=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstadoCivil) {this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(jPanelFK_IdEstadoCivilCargaFamiliar_NM);}

			this.isVisibilidadFK_IdTipoCargaFami=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTipoCargaFami) {this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(jPanelFK_IdTipoCargaFamiCargaFamiliar_NM);}

			this.isVisibilidadFK_IdTipoGenero=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTipoGenero) {this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(jPanelFK_IdTipoGeneroCargaFamiliar_NM);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoCargaFami(Boolean isParaTipoCargaFami){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoCargaFamiNegation=!isParaTipoCargaFami;

			this.isVisibilidadFK_IdEmpleado=isParaTipoCargaFamiNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(jPanelFK_IdEmpleadoCargaFamiliar_NM);}

			this.isVisibilidadFK_IdEstadoCivil=isParaTipoCargaFamiNegation;
			if(!this.isVisibilidadFK_IdEstadoCivil) {this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(jPanelFK_IdEstadoCivilCargaFamiliar_NM);}

			this.isVisibilidadFK_IdTipoCargaFami=isParaTipoCargaFami;
			if(!this.isVisibilidadFK_IdTipoCargaFami) {this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(jPanelFK_IdTipoCargaFamiCargaFamiliar_NM);}

			this.isVisibilidadFK_IdTipoGenero=isParaTipoCargaFamiNegation;
			if(!this.isVisibilidadFK_IdTipoGenero) {this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(jPanelFK_IdTipoGeneroCargaFamiliar_NM);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoGenero(Boolean isParaTipoGenero){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoGeneroNegation=!isParaTipoGenero;

			this.isVisibilidadFK_IdEmpleado=isParaTipoGeneroNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(jPanelFK_IdEmpleadoCargaFamiliar_NM);}

			this.isVisibilidadFK_IdEstadoCivil=isParaTipoGeneroNegation;
			if(!this.isVisibilidadFK_IdEstadoCivil) {this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(jPanelFK_IdEstadoCivilCargaFamiliar_NM);}

			this.isVisibilidadFK_IdTipoCargaFami=isParaTipoGeneroNegation;
			if(!this.isVisibilidadFK_IdTipoCargaFami) {this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(jPanelFK_IdTipoCargaFamiCargaFamiliar_NM);}

			this.isVisibilidadFK_IdTipoGenero=isParaTipoGenero;
			if(!this.isVisibilidadFK_IdTipoGenero) {this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(jPanelFK_IdTipoGeneroCargaFamiliar_NM);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoCivil(Boolean isParaEstadoCivil){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoCivilNegation=!isParaEstadoCivil;

			this.isVisibilidadFK_IdEmpleado=isParaEstadoCivilNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(jPanelFK_IdEmpleadoCargaFamiliar_NM);}

			this.isVisibilidadFK_IdEstadoCivil=isParaEstadoCivil;
			if(!this.isVisibilidadFK_IdEstadoCivil) {this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(jPanelFK_IdEstadoCivilCargaFamiliar_NM);}

			this.isVisibilidadFK_IdTipoCargaFami=isParaEstadoCivilNegation;
			if(!this.isVisibilidadFK_IdTipoCargaFami) {this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(jPanelFK_IdTipoCargaFamiCargaFamiliar_NM);}

			this.isVisibilidadFK_IdTipoGenero=isParaEstadoCivilNegation;
			if(!this.isVisibilidadFK_IdTipoGenero) {this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(jPanelFK_IdTipoGeneroCargaFamiliar_NM);}
		}
		
	}
	
	
	
	

	public String registrarSesionCargaFamiliar_NMParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(cargafamiliar_nmSessionBean==null) {
				cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(cargafamiliar_nmSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.cargafamiliar_nmFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(CargaFamiliar_NMConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionCargaFamiliar_NM(true);
			//empleadoSessionBean.setlidCargaFamiliar_NMActual(this.idCargaFamiliar_NMActual);

			cargafamiliar_nmSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCargaFamiliar_NM(true);
			cargafamiliar_nmSessionBean.setlIdCargaFamiliar_NMActualForeignKey(this.idCargaFamiliar_NMActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CargaFamiliar_NMSessionBean cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
		
		if(this.cargafamiliar_nmSessionBean==null) {
			this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
		}
		
		this.cargafamiliar_nmSessionBean.setsUltimaBusquedaCargaFamiliar_NM(this.getsAccionBusqueda());
		this.cargafamiliar_nmSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cargafamiliar_nmSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			cargafamiliar_nmSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			cargafamiliar_nmSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstadoCivil")) {
			cargafamiliar_nmSessionBean.setid_estado_civil(this.getid_estado_civilFK_IdEstadoCivil());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoCargaFami")) {
			cargafamiliar_nmSessionBean.setid_tipo_carga_fami(this.getid_tipo_carga_famiFK_IdTipoCargaFami());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoGenero")) {
			cargafamiliar_nmSessionBean.setid_tipo_genero(this.getid_tipo_generoFK_IdTipoGenero());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CargaFamiliar_NMSessionBean cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
		
		if(this.cargafamiliar_nmSessionBean==null) {
			this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
		}
		
		if(this.cargafamiliar_nmSessionBean.getsUltimaBusquedaCargaFamiliar_NM()!=null&&!this.cargafamiliar_nmSessionBean.getsUltimaBusquedaCargaFamiliar_NM().equals("")) {
			this.setsAccionBusqueda(cargafamiliar_nmSessionBean.getsUltimaBusquedaCargaFamiliar_NM());
			this.setiNumeroPaginacion(cargafamiliar_nmSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cargafamiliar_nmSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(cargafamiliar_nmSessionBean.getid_empleado());
				cargafamiliar_nmSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(cargafamiliar_nmSessionBean.getid_empresa());
				cargafamiliar_nmSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstadoCivil")) {
				this.setid_estado_civilFK_IdEstadoCivil(cargafamiliar_nmSessionBean.getid_estado_civil());
				cargafamiliar_nmSessionBean.setid_estado_civil(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoCargaFami")) {
				this.setid_tipo_carga_famiFK_IdTipoCargaFami(cargafamiliar_nmSessionBean.getid_tipo_carga_fami());
				cargafamiliar_nmSessionBean.setid_tipo_carga_fami(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoGenero")) {
				this.setid_tipo_generoFK_IdTipoGenero(cargafamiliar_nmSessionBean.getid_tipo_genero());
				cargafamiliar_nmSessionBean.setid_tipo_genero(-1L);
			}
		}
		
		this.cargafamiliar_nmSessionBean.setsUltimaBusquedaCargaFamiliar_NM("");
		this.cargafamiliar_nmSessionBean.setiNumeroPaginacion(CargaFamiliar_NMConstantesFunciones.INUMEROPAGINACION);
		this.cargafamiliar_nmSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCargaFamiliar_NM(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCargaFamiliar_NM() {
		this.updateBorderResaltarBusquedasFormularioCargaFamiliar_NM();
		this.updateVisibilidadBusquedasFormularioCargaFamiliar_NM();
		this.updateHabilitarBusquedasFormularioCargaFamiliar_NM();
	}
	
	public void updateBorderResaltarBusquedasFormularioCargaFamiliar_NM() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCargaFamiliar_NM.getComponents().length>0) {
	

		if(this.cargafamiliar_nmConstantesFunciones.resaltarFK_IdEmpleadoCargaFamiliar_NM!=null) {
			index= this.jTabbedPaneBusquedasCargaFamiliar_NM.indexOfComponent(this.jPanelFK_IdEmpleadoCargaFamiliar_NM);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar_NM.getComponent(index);
				jPanel.setBorder(this.cargafamiliar_nmConstantesFunciones.resaltarFK_IdEmpleadoCargaFamiliar_NM);
			}
		}

		if(this.cargafamiliar_nmConstantesFunciones.resaltarFK_IdEstadoCivilCargaFamiliar_NM!=null) {
			index= this.jTabbedPaneBusquedasCargaFamiliar_NM.indexOfComponent(this.jPanelFK_IdEstadoCivilCargaFamiliar_NM);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar_NM.getComponent(index);
				jPanel.setBorder(this.cargafamiliar_nmConstantesFunciones.resaltarFK_IdEstadoCivilCargaFamiliar_NM);
			}
		}

		if(this.cargafamiliar_nmConstantesFunciones.resaltarFK_IdTipoCargaFamiCargaFamiliar_NM!=null) {
			index= this.jTabbedPaneBusquedasCargaFamiliar_NM.indexOfComponent(this.jPanelFK_IdTipoCargaFamiCargaFamiliar_NM);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar_NM.getComponent(index);
				jPanel.setBorder(this.cargafamiliar_nmConstantesFunciones.resaltarFK_IdTipoCargaFamiCargaFamiliar_NM);
			}
		}

		if(this.cargafamiliar_nmConstantesFunciones.resaltarFK_IdTipoGeneroCargaFamiliar_NM!=null) {
			index= this.jTabbedPaneBusquedasCargaFamiliar_NM.indexOfComponent(this.jPanelFK_IdTipoGeneroCargaFamiliar_NM);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar_NM.getComponent(index);
				jPanel.setBorder(this.cargafamiliar_nmConstantesFunciones.resaltarFK_IdTipoGeneroCargaFamiliar_NM);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCargaFamiliar_NM() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCargaFamiliar_NM.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCargaFamiliar_NM.indexOfComponent(this.jPanelFK_IdEmpleadoCargaFamiliar_NM);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar_NM.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarFK_IdEmpleadoCargaFamiliar_NM);
			if(!this.cargafamiliar_nmConstantesFunciones.mostrarFK_IdEmpleadoCargaFamiliar_NM && index>-1) {
				this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(index);
			}

			index= this.jTabbedPaneBusquedasCargaFamiliar_NM.indexOfComponent(this.jPanelFK_IdEstadoCivilCargaFamiliar_NM);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar_NM.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarFK_IdEstadoCivilCargaFamiliar_NM);
			if(!this.cargafamiliar_nmConstantesFunciones.mostrarFK_IdEstadoCivilCargaFamiliar_NM && index>-1) {
				this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(index);
			}

			index= this.jTabbedPaneBusquedasCargaFamiliar_NM.indexOfComponent(this.jPanelFK_IdTipoCargaFamiCargaFamiliar_NM);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar_NM.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarFK_IdTipoCargaFamiCargaFamiliar_NM);
			if(!this.cargafamiliar_nmConstantesFunciones.mostrarFK_IdTipoCargaFamiCargaFamiliar_NM && index>-1) {
				this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(index);
			}

			index= this.jTabbedPaneBusquedasCargaFamiliar_NM.indexOfComponent(this.jPanelFK_IdTipoGeneroCargaFamiliar_NM);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar_NM.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarFK_IdTipoGeneroCargaFamiliar_NM);
			if(!this.cargafamiliar_nmConstantesFunciones.mostrarFK_IdTipoGeneroCargaFamiliar_NM && index>-1) {
				this.jTabbedPaneBusquedasCargaFamiliar_NM.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCargaFamiliar_NM() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCargaFamiliar_NM.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCargaFamiliar_NM.indexOfComponent(this.jPanelFK_IdEmpleadoCargaFamiliar_NM);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar_NM.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cargafamiliar_nmConstantesFunciones.activarFK_IdEmpleadoCargaFamiliar_NM);
				this.jTabbedPaneBusquedasCargaFamiliar_NM.setEnabledAt(index,this.cargafamiliar_nmConstantesFunciones.activarFK_IdEmpleadoCargaFamiliar_NM);
			}

			index= this.jTabbedPaneBusquedasCargaFamiliar_NM.indexOfComponent(this.jPanelFK_IdEstadoCivilCargaFamiliar_NM);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar_NM.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cargafamiliar_nmConstantesFunciones.activarFK_IdEstadoCivilCargaFamiliar_NM);
				this.jTabbedPaneBusquedasCargaFamiliar_NM.setEnabledAt(index,this.cargafamiliar_nmConstantesFunciones.activarFK_IdEstadoCivilCargaFamiliar_NM);
			}

			index= this.jTabbedPaneBusquedasCargaFamiliar_NM.indexOfComponent(this.jPanelFK_IdTipoCargaFamiCargaFamiliar_NM);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar_NM.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cargafamiliar_nmConstantesFunciones.activarFK_IdTipoCargaFamiCargaFamiliar_NM);
				this.jTabbedPaneBusquedasCargaFamiliar_NM.setEnabledAt(index,this.cargafamiliar_nmConstantesFunciones.activarFK_IdTipoCargaFamiCargaFamiliar_NM);
			}

			index= this.jTabbedPaneBusquedasCargaFamiliar_NM.indexOfComponent(this.jPanelFK_IdTipoGeneroCargaFamiliar_NM);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar_NM.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cargafamiliar_nmConstantesFunciones.activarFK_IdTipoGeneroCargaFamiliar_NM);
				this.jTabbedPaneBusquedasCargaFamiliar_NM.setEnabledAt(index,this.cargafamiliar_nmConstantesFunciones.activarFK_IdTipoGeneroCargaFamiliar_NM);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCargaFamiliar_NM(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasCargaFamiliar_NM.indexOfComponent(this.jPanelFK_IdEmpleadoCargaFamiliar_NM);

			this.jTabbedPaneBusquedasCargaFamiliar_NM.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar_NM.getComponent(index);

			this.cargafamiliar_nmConstantesFunciones.setResaltarFK_IdEmpleadoCargaFamiliar_NM(resaltar);

			jPanel.setBorder(this.cargafamiliar_nmConstantesFunciones.resaltarFK_IdEmpleadoCargaFamiliar_NM);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstadoCivil")) {
			index= this.jTabbedPaneBusquedasCargaFamiliar_NM.indexOfComponent(this.jPanelFK_IdEstadoCivilCargaFamiliar_NM);

			this.jTabbedPaneBusquedasCargaFamiliar_NM.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar_NM.getComponent(index);

			this.cargafamiliar_nmConstantesFunciones.setResaltarFK_IdEstadoCivilCargaFamiliar_NM(resaltar);

			jPanel.setBorder(this.cargafamiliar_nmConstantesFunciones.resaltarFK_IdEstadoCivilCargaFamiliar_NM);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoCargaFami")) {
			index= this.jTabbedPaneBusquedasCargaFamiliar_NM.indexOfComponent(this.jPanelFK_IdTipoCargaFamiCargaFamiliar_NM);

			this.jTabbedPaneBusquedasCargaFamiliar_NM.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar_NM.getComponent(index);

			this.cargafamiliar_nmConstantesFunciones.setResaltarFK_IdTipoCargaFamiCargaFamiliar_NM(resaltar);

			jPanel.setBorder(this.cargafamiliar_nmConstantesFunciones.resaltarFK_IdTipoCargaFamiCargaFamiliar_NM);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoGenero")) {
			index= this.jTabbedPaneBusquedasCargaFamiliar_NM.indexOfComponent(this.jPanelFK_IdTipoGeneroCargaFamiliar_NM);

			this.jTabbedPaneBusquedasCargaFamiliar_NM.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargaFamiliar_NM.getComponent(index);

			this.cargafamiliar_nmConstantesFunciones.setResaltarFK_IdTipoGeneroCargaFamiliar_NM(resaltar);

			jPanel.setBorder(this.cargafamiliar_nmConstantesFunciones.resaltarFK_IdTipoGeneroCargaFamiliar_NM);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCargaFamiliar_NM.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCargaFamiliar_NM() throws Exception {

		if(this.jInternalFrameDetalleFormCargaFamiliar_NM==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCargaFamiliar_NM();
		this.updateVisibilidadResaltarControlesFormularioCargaFamiliar_NM();
		this.updateHabilitarResaltarControlesFormularioCargaFamiliar_NM();
		
	}
	
	public void updateBorderResaltarControlesFormularioCargaFamiliar_NM() throws Exception {
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cargafamiliar_nmConstantesFunciones.resaltaridCargaFamiliar_NM!=null && this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelidCargaFamiliar_NM.setBorder(this.cargafamiliar_nmConstantesFunciones.resaltaridCargaFamiliar_NM);}
		if(this.cargafamiliar_nmConstantesFunciones.resaltarid_empresaCargaFamiliar_NM!=null && this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empresaCargaFamiliar_NM.setBorder(this.cargafamiliar_nmConstantesFunciones.resaltarid_empresaCargaFamiliar_NM);}
		if(this.cargafamiliar_nmConstantesFunciones.resaltarid_empleadoCargaFamiliar_NM!=null && this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empleadoCargaFamiliar_NM.setBorder(this.cargafamiliar_nmConstantesFunciones.resaltarid_empleadoCargaFamiliar_NM);}
		if(this.cargafamiliar_nmConstantesFunciones.resaltarid_tipo_carga_famiCargaFamiliar_NM!=null && this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_carga_famiCargaFamiliar_NM.setBorder(this.cargafamiliar_nmConstantesFunciones.resaltarid_tipo_carga_famiCargaFamiliar_NM);}
		if(this.cargafamiliar_nmConstantesFunciones.resaltarid_tipo_generoCargaFamiliar_NM!=null && this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_generoCargaFamiliar_NM.setBorder(this.cargafamiliar_nmConstantesFunciones.resaltarid_tipo_generoCargaFamiliar_NM);}
		if(this.cargafamiliar_nmConstantesFunciones.resaltarid_estado_civilCargaFamiliar_NM!=null && this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_estado_civilCargaFamiliar_NM.setBorder(this.cargafamiliar_nmConstantesFunciones.resaltarid_estado_civilCargaFamiliar_NM);}
		if(this.cargafamiliar_nmConstantesFunciones.resaltarcedulaCargaFamiliar_NM!=null && this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextFieldcedulaCargaFamiliar_NM.setBorder(this.cargafamiliar_nmConstantesFunciones.resaltarcedulaCargaFamiliar_NM);}
		if(this.cargafamiliar_nmConstantesFunciones.resaltarapellidoCargaFamiliar_NM!=null && this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreaapellidoCargaFamiliar_NM.setBorder(this.cargafamiliar_nmConstantesFunciones.resaltarapellidoCargaFamiliar_NM);}
		if(this.cargafamiliar_nmConstantesFunciones.resaltarnombreCargaFamiliar_NM!=null && this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreanombreCargaFamiliar_NM.setBorder(this.cargafamiliar_nmConstantesFunciones.resaltarnombreCargaFamiliar_NM);}
		if(this.cargafamiliar_nmConstantesFunciones.resaltardireccionCargaFamiliar_NM!=null && this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreadireccionCargaFamiliar_NM.setBorder(this.cargafamiliar_nmConstantesFunciones.resaltardireccionCargaFamiliar_NM);}
		if(this.cargafamiliar_nmConstantesFunciones.resaltarfecha_nacimientoCargaFamiliar_NM!=null && this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {this.jInternalFrameDetalleFormCargaFamiliar_NM.jDateChooserfecha_nacimientoCargaFamiliar_NM.setBorder(this.cargafamiliar_nmConstantesFunciones.resaltarfecha_nacimientoCargaFamiliar_NM);}
		if(this.cargafamiliar_nmConstantesFunciones.resaltarvalor_cupoCargaFamiliar_NM!=null && this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextFieldvalor_cupoCargaFamiliar_NM.setBorder(this.cargafamiliar_nmConstantesFunciones.resaltarvalor_cupoCargaFamiliar_NM);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCargaFamiliar_NM() throws Exception {		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
	
		//this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelidCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostraridCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jPanelidCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostraridCargaFamiliar_NM);
		//this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empresaCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarid_empresaCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jPanelid_empresaCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarid_empresaCargaFamiliar_NM);
		//this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empleadoCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarid_empleadoCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jPanelid_empleadoCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarid_empleadoCargaFamiliar_NM);
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_empleadoCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarid_empleadoCargaFamiliar_NM);
		//this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_carga_famiCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarid_tipo_carga_famiCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jPanelid_tipo_carga_famiCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarid_tipo_carga_famiCargaFamiliar_NM);
		//this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_generoCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarid_tipo_generoCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jPanelid_tipo_generoCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarid_tipo_generoCargaFamiliar_NM);
		//this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_estado_civilCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarid_estado_civilCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jPanelid_estado_civilCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarid_estado_civilCargaFamiliar_NM);
		//this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextFieldcedulaCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarcedulaCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jPanelcedulaCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarcedulaCargaFamiliar_NM);
		//this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreaapellidoCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarapellidoCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jPanelapellidoCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarapellidoCargaFamiliar_NM);
		//this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreanombreCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarnombreCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jPanelnombreCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarnombreCargaFamiliar_NM);
		//this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreadireccionCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrardireccionCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jPaneldireccionCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrardireccionCargaFamiliar_NM);
		//this.jInternalFrameDetalleFormCargaFamiliar_NM.jDateChooserfecha_nacimientoCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarfecha_nacimientoCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jPanelfecha_nacimientoCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarfecha_nacimientoCargaFamiliar_NM);
		//this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextFieldvalor_cupoCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarvalor_cupoCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jPanelvalor_cupoCargaFamiliar_NM.setVisible(this.cargafamiliar_nmConstantesFunciones.mostrarvalor_cupoCargaFamiliar_NM);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCargaFamiliar_NM() throws Exception {
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCargaFamiliar_NM!=null) {
	
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jLabelidCargaFamiliar_NM.setEnabled(this.cargafamiliar_nmConstantesFunciones.activaridCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empresaCargaFamiliar_NM.setEnabled(this.cargafamiliar_nmConstantesFunciones.activarid_empresaCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_empleadoCargaFamiliar_NM.setEnabled(this.cargafamiliar_nmConstantesFunciones.activarid_empleadoCargaFamiliar_NM);
			this.jInternalFrameDetalleFormCargaFamiliar_NM.jButtonid_empleadoCargaFamiliar_NM.setEnabled(this.cargafamiliar_nmConstantesFunciones.activarid_empleadoCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_carga_famiCargaFamiliar_NM.setEnabled(this.cargafamiliar_nmConstantesFunciones.activarid_tipo_carga_famiCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_tipo_generoCargaFamiliar_NM.setEnabled(this.cargafamiliar_nmConstantesFunciones.activarid_tipo_generoCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jComboBoxid_estado_civilCargaFamiliar_NM.setEnabled(this.cargafamiliar_nmConstantesFunciones.activarid_estado_civilCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextFieldcedulaCargaFamiliar_NM.setEnabled(this.cargafamiliar_nmConstantesFunciones.activarcedulaCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreaapellidoCargaFamiliar_NM.setEnabled(this.cargafamiliar_nmConstantesFunciones.activarapellidoCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreanombreCargaFamiliar_NM.setEnabled(this.cargafamiliar_nmConstantesFunciones.activarnombreCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextAreadireccionCargaFamiliar_NM.setEnabled(this.cargafamiliar_nmConstantesFunciones.activardireccionCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jDateChooserfecha_nacimientoCargaFamiliar_NM.setEnabled(this.cargafamiliar_nmConstantesFunciones.activarfecha_nacimientoCargaFamiliar_NM);
		this.jInternalFrameDetalleFormCargaFamiliar_NM.jTextFieldvalor_cupoCargaFamiliar_NM.setEnabled(this.cargafamiliar_nmConstantesFunciones.activarvalor_cupoCargaFamiliar_NM);
		}
	}
	
		
}