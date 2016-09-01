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

import com.bydan.erp.nomina.util.EnfermedadConstantesFunciones;
import com.bydan.erp.nomina.util.EnfermedadParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EnfermedadParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.EnfermedadBean;
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
public class EnfermedadBeanSwingJInternalFrame extends EnfermedadJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EnfermedadBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Enfermedad> enfermedadValidator = new ClassValidator<Enfermedad>(Enfermedad.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Enfermedad enfermedad;	
	public Enfermedad enfermedadAux;
	public Enfermedad enfermedadAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Enfermedad enfermedadTotales;
	public Long idEnfermedadActual;
	public Long iIdNuevoEnfermedad=0L;
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

	public String sFinalQueryComboTipoEnfermedad="";

	public List<TipoEnfermedad> tipoenfermedadsForeignKey;

	public List<TipoEnfermedad> gettipoenfermedadsForeignKey() {
		return tipoenfermedadsForeignKey;
	}

	public void settipoenfermedadsForeignKey(List<TipoEnfermedad> tipoenfermedadsForeignKey) {
		this.tipoenfermedadsForeignKey = tipoenfermedadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoEnfermedad tipoenfermedadForeignKey;

	public TipoEnfermedad gettipoenfermedadForeignKey() {
		return tipoenfermedadForeignKey;
	}

	public void settipoenfermedadForeignKey(TipoEnfermedad tipoenfermedadForeignKey) {
		this.tipoenfermedadForeignKey = tipoenfermedadForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosEmpleadoEnfer=false;

	public Boolean getIsTienePermisosEmpleadoEnfer() {
		return isTienePermisosEmpleadoEnfer;
	}

	public void setIsTienePermisosEmpleadoEnfer(Boolean isTienePermisosEmpleadoEnfer) {
		this.isTienePermisosEmpleadoEnfer= isTienePermisosEmpleadoEnfer;
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
	
	public Boolean isPermisoTodoEnfermedad;
	public Boolean isPermisoNuevoEnfermedad;
	public Boolean isPermisoActualizarEnfermedad;
	public Boolean isPermisoActualizarOriginalEnfermedad;
	public Boolean isPermisoEliminarEnfermedad;
	public Boolean isPermisoGuardarCambiosEnfermedad;
	public Boolean isPermisoConsultaEnfermedad;
	public Boolean isPermisoBusquedaEnfermedad;
	public Boolean isPermisoReporteEnfermedad;
	public Boolean isPermisoPaginacionMedioEnfermedad;
	public Boolean isPermisoPaginacionAltoEnfermedad;
	public Boolean isPermisoPaginacionTodoEnfermedad;
	public Boolean isPermisoCopiarEnfermedad;
	public Boolean isPermisoVerFormEnfermedad;
	public Boolean isPermisoDuplicarEnfermedad;
	public Boolean isPermisoOrdenEnfermedad;
	
	
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
	
	public EnfermedadParameterReturnGeneral enfermedadReturnGeneral;
	public EnfermedadParameterReturnGeneral enfermedadParameterGeneral;
	
	

	public EmpleadoEnferLogic empleadoenferLogic=null;

	public EmpleadoEnferLogic getEmpleadoEnferLogic() {
		return empleadoenferLogic;
	}

	public void setEmpleadoEnferLogic(EmpleadoEnferLogic empleadoenferLogic) {
		this.empleadoenferLogic = empleadoenferLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEnfermedad=false;
	public Boolean esParaAccionDesdeFormularioEnfermedad=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EnfermedadSessionBeanAdditional enfermedadSessionBeanAdditional=null;
	
	public EnfermedadSessionBeanAdditional getEnfermedadSessionBeanAdditional() {
		return this.enfermedadSessionBeanAdditional;
	}
	
	public void setEnfermedadSessionBeanAdditional(EnfermedadSessionBeanAdditional enfermedadSessionBeanAdditional) {
		try {
			this.enfermedadSessionBeanAdditional=enfermedadSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EnfermedadBeanSwingJInternalFrameAdditional enfermedadBeanSwingJInternalFrameAdditional=null;
	//public class EnfermedadBeanSwingJInternalFrame
	
	public EnfermedadBeanSwingJInternalFrameAdditional getEnfermedadBeanSwingJInternalFrameAdditional() {
		return this.enfermedadBeanSwingJInternalFrameAdditional;
	}
	
	public void setEnfermedadBeanSwingJInternalFrameAdditional(EnfermedadBeanSwingJInternalFrameAdditional enfermedadBeanSwingJInternalFrameAdditional) {
		try {
			this.enfermedadBeanSwingJInternalFrameAdditional=enfermedadBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EnfermedadLogic enfermedadLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Enfermedad enfermedadBean;
	public EnfermedadConstantesFunciones enfermedadConstantesFunciones;
	//public EnfermedadParameterReturnGeneral enfermedadReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoEnfermedadLogic tipoenfermedadLogic;
	
	//PARAMETROS
	
	
	//public List<Enfermedad> enfermedads;	
	//public List<Enfermedad> enfermedadsEliminados;
	//public List<Enfermedad> enfermedadsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEnfermedad=false;
	public Boolean isVisibilidadCeldaDuplicarEnfermedad=true;
	public Boolean isVisibilidadCeldaCopiarEnfermedad=true;
	public Boolean isVisibilidadCeldaVerFormEnfermedad=true;
	public Boolean isVisibilidadCeldaOrdenEnfermedad=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEnfermedad=false;
	public Boolean isVisibilidadCeldaModificarEnfermedad=false;
	public Boolean isVisibilidadCeldaActualizarEnfermedad=false;
	public Boolean isVisibilidadCeldaEliminarEnfermedad=false;
	public Boolean isVisibilidadCeldaCancelarEnfermedad=false;
	public Boolean isVisibilidadCeldaGuardarEnfermedad=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEnfermedad=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoEnfermedad=false;
	
	public Long getiIdNuevoEnfermedad() {
		return this.iIdNuevoEnfermedad;
	}

	public void setiIdNuevoEnfermedad(Long iIdNuevoEnfermedad) {
		this.iIdNuevoEnfermedad = iIdNuevoEnfermedad;
	}
	
	public Long getidEnfermedadActual() {
		return this.idEnfermedadActual;
	}

	public void setidEnfermedadActual(Long idEnfermedadActual) {
		this.idEnfermedadActual = idEnfermedadActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Enfermedad getenfermedad() {
		return this.enfermedad;
	}

	public void setenfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	public Enfermedad getenfermedadAux() {
		return this.enfermedadAux;
	}

	public void setenfermedadAux(Enfermedad enfermedadAux) {
		this.enfermedadAux = enfermedadAux;
	}				
	
	public Enfermedad getenfermedadAnterior() {
		return this.enfermedadAnterior;
	}

	public void setenfermedadAnterior(Enfermedad enfermedadAnterior) {
		this.enfermedadAnterior = enfermedadAnterior;
	}	
	
	public Enfermedad getenfermedadTotales() {
		return this.enfermedadTotales;
	}

	public void setenfermedadTotales(Enfermedad enfermedadTotales) {
		this.enfermedadTotales = enfermedadTotales;
	}	
	
	public Enfermedad getenfermedadBean() {
		return this.enfermedadBean;
	}

	public void setenfermedadBean(Enfermedad enfermedadBean) {
		this.enfermedadBean = enfermedadBean;
	}	
	
	public EnfermedadParameterReturnGeneral getenfermedadReturnGeneral() {
		return this.enfermedadReturnGeneral;
	}

	public void setenfermedadReturnGeneral(EnfermedadParameterReturnGeneral enfermedadReturnGeneral) {
		this.enfermedadReturnGeneral = enfermedadReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_tipo_enfermedadFK_IdTipoEnfermedad=-1L;

	public Long getid_tipo_enfermedadFK_IdTipoEnfermedad() {
		return this.id_tipo_enfermedadFK_IdTipoEnfermedad;
	}

	public void setid_tipo_enfermedadFK_IdTipoEnfermedad(Long id_tipo_enfermedadFK_IdTipoEnfermedad) {
		this.id_tipo_enfermedadFK_IdTipoEnfermedad = id_tipo_enfermedadFK_IdTipoEnfermedad;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EnfermedadLogic getEnfermedadLogic()	{		
		return enfermedadLogic;
	}

	public void setEnfermedadLogic(EnfermedadLogic enfermedadLogic) {
		this.enfermedadLogic = enfermedadLogic;
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
	
	public Boolean getIsEsNuevoEnfermedad() {
		return isEsNuevoEnfermedad;
	}

	public void setIsEsNuevoEnfermedad(Boolean isEsNuevoEnfermedad) {
		this.isEsNuevoEnfermedad = isEsNuevoEnfermedad;
	}

	public Boolean getEsParaAccionDesdeFormularioEnfermedad() {
		return esParaAccionDesdeFormularioEnfermedad;
	}
	
	public void setEsParaAccionDesdeFormularioEnfermedad(Boolean esParaAccionDesdeFormularioEnfermedad) {
		this.esParaAccionDesdeFormularioEnfermedad = esParaAccionDesdeFormularioEnfermedad;
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

			if(this.enfermedadSessionBean==null) {
				this.enfermedadSessionBean=new EnfermedadSessionBean();
			}

			if(!this.enfermedadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(enfermedadSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTipoEnfermedadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoenfermedadsForeignKey=new ArrayList<TipoEnfermedad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoEnfermedadLogic tipoenfermedadLogic=new TipoEnfermedadLogic();

			//tipoenfermedadLogic.getTipoEnfermedadDataAccess().setIsForForeingKeyData(true);

			if(this.enfermedadSessionBean==null) {
				this.enfermedadSessionBean=new EnfermedadSessionBean();
			}

			if(!this.enfermedadSessionBean.getisBusquedaDesdeForeignKeySesionTipoEnfermedad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoenfermedadLogic.getTipoEnfermedadDataAccess().setIsForForeingKeyData(true);

					tipoenfermedadLogic.getTodosTipoEnfermedadsWithConnection(sFinalQuery,new Pagination());

					this.tipoenfermedadsForeignKey=tipoenfermedadLogic.getTipoEnfermedads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoEnfermedad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoenfermedadLogic.getEntityWithConnection(enfermedadSessionBean.getlidTipoEnfermedadActual());
					this.tipoenfermedadsForeignKey.add(tipoenfermedadLogic.getTipoEnfermedad());
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

					if(this.enfermedad!=null) {
						this.enfermedad.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEnfermedad!=null) {
						this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_empresaEnfermedad.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEnfermedad.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEnfermedad!=null) {
						if(this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_empresaEnfermedad.getItemCount()>0) {
							this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_empresaEnfermedad.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEnfermedadGenerico)throws Exception
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
				jComboBoxid_empresaEnfermedadGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEnfermedadGenerico!=null && jComboBoxid_empresaEnfermedadGenerico.getItemCount()>0) {
					jComboBoxid_empresaEnfermedadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoEnfermedadForeignKey(Long idTipoEnfermedadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoEnfermedad  tipoenfermedadTemp=null;

			for(TipoEnfermedad tipoenfermedadAux:tipoenfermedadsForeignKey) {
				if(tipoenfermedadAux.getId()!=null && tipoenfermedadAux.getId().equals(idTipoEnfermedadSeleccionado)) {
					tipoenfermedadTemp=tipoenfermedadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoenfermedadTemp!=null) {

					if(this.enfermedad!=null) {
						this.enfermedad.setTipoEnfermedad(tipoenfermedadTemp);
					}

					if(this.jInternalFrameDetalleFormEnfermedad!=null) {
						this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_tipo_enfermedadEnfermedad.setSelectedItem(tipoenfermedadTemp);
					}
				} else {
					//jComboBoxid_tipo_enfermedadEnfermedad.setSelectedItem(tipoenfermedadTemp);
					if(this.jInternalFrameDetalleFormEnfermedad!=null) {
						if(this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_tipo_enfermedadEnfermedad.getItemCount()>0) {
							this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_tipo_enfermedadEnfermedad.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoEnfermedad") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoenfermedadTemp!=null && jComboBoxid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad!=null) {
						jComboBoxid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad.setSelectedItem(tipoenfermedadTemp);
					} else {
						if(jComboBoxid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad!=null) {
							//jComboBoxid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad.setSelectedItem(tipoenfermedadTemp);
							if(jComboBoxid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad.getItemCount()>0) {
								jComboBoxid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad.setSelectedIndex(0);
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

	public String getActualTipoEnfermedadForeignKeyDescripcion(Long idTipoEnfermedadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoEnfermedad  tipoenfermedadTemp=null;

			for(TipoEnfermedad tipoenfermedadAux:tipoenfermedadsForeignKey) {
				if(tipoenfermedadAux.getId()!=null && tipoenfermedadAux.getId().equals(idTipoEnfermedadSeleccionado)) {
					tipoenfermedadTemp=tipoenfermedadAux;
					break;
				}
			}


			sDescripcion=TipoEnfermedadConstantesFunciones.getTipoEnfermedadDescripcion(tipoenfermedadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoEnfermedadForeignKeyGenerico(Long idTipoEnfermedadSeleccionado,JComboBox jComboBoxid_tipo_enfermedadEnfermedadGenerico)throws Exception
	{
		try
		{
			TipoEnfermedad  tipoenfermedadTemp=null;

			for(TipoEnfermedad tipoenfermedadAux:tipoenfermedadsForeignKey) {
				if(tipoenfermedadAux.getId()!=null && tipoenfermedadAux.getId().equals(idTipoEnfermedadSeleccionado)) {
					tipoenfermedadTemp=tipoenfermedadAux;
					break;
				}
			}

			if(tipoenfermedadTemp!=null) {
				jComboBoxid_tipo_enfermedadEnfermedadGenerico.setSelectedItem(tipoenfermedadTemp);
			} else {
				if(jComboBoxid_tipo_enfermedadEnfermedadGenerico!=null && jComboBoxid_tipo_enfermedadEnfermedadGenerico.getItemCount()>0) {
					jComboBoxid_tipo_enfermedadEnfermedadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Enfermedad enfermedad,JComboBox jComboBoxid_empresaEnfermedadGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEnfermedadGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_empresaEnfermedad.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEnfermedadGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				enfermedad.setid_empresa(empresaAux.getId());
				enfermedad.setempresa_descripcion(EnfermedadConstantesFunciones.getEmpresaDescripcion(empresaAux));
				enfermedad.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoEnfermedadForeignKey(Enfermedad enfermedad,JComboBox jComboBoxid_tipo_enfermedadEnfermedadGenerico)throws Exception
	{
		try
		{
			TipoEnfermedad  tipoenfermedadAux=new TipoEnfermedad();

			if(jComboBoxid_tipo_enfermedadEnfermedadGenerico==null) {
				tipoenfermedadAux=(TipoEnfermedad)this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_tipo_enfermedadEnfermedad.getSelectedItem();
			} else {
				tipoenfermedadAux=(TipoEnfermedad)jComboBoxid_tipo_enfermedadEnfermedadGenerico.getSelectedItem();
			}

			if(tipoenfermedadAux!=null && tipoenfermedadAux.getId()!=null) {
				enfermedad.setid_tipo_enfermedad(tipoenfermedadAux.getId());
				enfermedad.settipoenfermedad_descripcion(EnfermedadConstantesFunciones.getTipoEnfermedadDescripcion(tipoenfermedadAux));
				enfermedad.setTipoEnfermedad(tipoenfermedadAux);			}
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

					if(!EnfermedadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEnfermedad!=null) { 
							this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_empresaEnfermedad.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_empresaEnfermedad.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEnfermedad!=null) { 
					}

					if(!EnfermedadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoEnfermedadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoEnfermedad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EnfermedadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEnfermedad!=null) { 
							this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_tipo_enfermedadEnfermedad.removeAllItems();

							for(TipoEnfermedad tipoenfermedad:this.tipoenfermedadsForeignKey) {
								this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_tipo_enfermedadEnfermedad.addItem(tipoenfermedad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEnfermedad!=null) { 
					}

					if(!EnfermedadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoEnfermedad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EnfermedadJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad.removeAllItems();

							for(TipoEnfermedad tipoenfermedad:this.tipoenfermedadsForeignKey) {
								this.jComboBoxid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad.addItem(tipoenfermedad);
							}
						}

						if(!EnfermedadJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEnfermedad!=null) {
							this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_empresaEnfermedad.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEnfermedad!=null) {
							this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_empresaEnfermedad.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoEnfermedadForeignKey(TipoEnfermedad tipoenfermedad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEnfermedad!=null) {
							this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_tipo_enfermedadEnfermedad.setSelectedItem(tipoenfermedad);
						}
					} else {
						if(this.jInternalFrameDetalleFormEnfermedad!=null) {
							this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_tipo_enfermedadEnfermedad.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad.setSelectedItem(tipoenfermedad);
						} else {
							this.jComboBoxid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEnfermedad() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EnfermedadConstantesFunciones.refrescarForeignKeysDescripcionesEnfermedad(this.enfermedadLogic.getEnfermedads());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EnfermedadConstantesFunciones.refrescarForeignKeysDescripcionesEnfermedad(this.enfermedads);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoEnfermedad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//enfermedadLogic.setEnfermedads(this.enfermedads);
			enfermedadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EnfermedadParameterReturnGeneral getEnfermedadParameterGeneral() {
		return this.enfermedadParameterGeneral;
	}
	
	public void setEnfermedadParameterGeneral(EnfermedadParameterReturnGeneral enfermedadParameterGeneral) {
		this.enfermedadParameterGeneral = enfermedadParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEnfermedad() {
		return isPermisoTodoEnfermedad;
	}

	public void setIsPermisoTodoEnfermedad(Boolean isPermisoTodoEnfermedad) {
		this.isPermisoTodoEnfermedad = isPermisoTodoEnfermedad;
	}

	public Boolean getIsPermisoNuevoEnfermedad() {
		return isPermisoNuevoEnfermedad;
	}

	public void setIsPermisoNuevoEnfermedad(Boolean isPermisoNuevoEnfermedad) {
		this.isPermisoNuevoEnfermedad = isPermisoNuevoEnfermedad;
	}

	public Boolean getIsPermisoActualizarEnfermedad() {
		return isPermisoActualizarEnfermedad;
	}

	public void setIsPermisoActualizarEnfermedad(Boolean isPermisoActualizarEnfermedad) {
		this.isPermisoActualizarEnfermedad = isPermisoActualizarEnfermedad;
	}

	public Boolean getIsPermisoEliminarEnfermedad() {
		return isPermisoEliminarEnfermedad;
	}

	public void setIsPermisoEliminarEnfermedad(Boolean isPermisoEliminarEnfermedad) {
		this.isPermisoEliminarEnfermedad = isPermisoEliminarEnfermedad;
	}

	public Boolean getIsPermisoGuardarCambiosEnfermedad() {
		return isPermisoGuardarCambiosEnfermedad;
	}

	public void setIsPermisoGuardarCambiosEnfermedad(Boolean isPermisoGuardarCambiosEnfermedad) {
		this.isPermisoGuardarCambiosEnfermedad = isPermisoGuardarCambiosEnfermedad;
	}
	
	public Boolean getIsPermisoConsultaEnfermedad() {
		return isPermisoConsultaEnfermedad;
	}

	public void setIsPermisoConsultaEnfermedad(Boolean isPermisoConsultaEnfermedad) {
		this.isPermisoConsultaEnfermedad = isPermisoConsultaEnfermedad;
	}

	public Boolean getIsPermisoBusquedaEnfermedad() {
		return isPermisoBusquedaEnfermedad;
	}

	public void setIsPermisoBusquedaEnfermedad(Boolean isPermisoBusquedaEnfermedad) {
		this.isPermisoBusquedaEnfermedad = isPermisoBusquedaEnfermedad;
	}

	public Boolean getIsPermisoReporteEnfermedad() {
		return isPermisoReporteEnfermedad;
	}

	public void setIsPermisoReporteEnfermedad(Boolean isPermisoReporteEnfermedad) {
		this.isPermisoReporteEnfermedad = isPermisoReporteEnfermedad;
	}
	
	public Boolean getIsPermisoPaginacionMedioEnfermedad() {
		return isPermisoPaginacionMedioEnfermedad;
	}

	public void setIsPermisoPaginacionMedioEnfermedad(Boolean isPermisoPaginacionMedioEnfermedad) {
		this.isPermisoPaginacionMedioEnfermedad = isPermisoPaginacionMedioEnfermedad;
	}
	
	public Boolean getIsPermisoPaginacionTodoEnfermedad() {
		return isPermisoPaginacionTodoEnfermedad;
	}

	public void setIsPermisoPaginacionTodoEnfermedad(Boolean isPermisoPaginacionTodoEnfermedad) {
		this.isPermisoPaginacionTodoEnfermedad = isPermisoPaginacionTodoEnfermedad;
	}
	
	public Boolean getIsPermisoPaginacionAltoEnfermedad() {
		return isPermisoPaginacionAltoEnfermedad;
	}

	public void setIsPermisoPaginacionAltoEnfermedad(Boolean isPermisoPaginacionAltoEnfermedad) {
		this.isPermisoPaginacionAltoEnfermedad = isPermisoPaginacionAltoEnfermedad;
	}
	
	public Boolean getIsPermisoCopiarEnfermedad() {
		return isPermisoCopiarEnfermedad;
	}

	public void setIsPermisoCopiarEnfermedad(Boolean isPermisoCopiarEnfermedad) {
		this.isPermisoCopiarEnfermedad = isPermisoCopiarEnfermedad;
	}
	
	public Boolean getIsPermisoVerFormEnfermedad() {
		return isPermisoVerFormEnfermedad;
	}

	public void setIsPermisoVerFormEnfermedad(Boolean isPermisoVerFormEnfermedad) {
		this.isPermisoVerFormEnfermedad = isPermisoVerFormEnfermedad;
	}
	
	public Boolean getIsPermisoDuplicarEnfermedad() {
		return isPermisoDuplicarEnfermedad;
	}

	public void setIsPermisoDuplicarEnfermedad(Boolean isPermisoDuplicarEnfermedad) {
		this.isPermisoDuplicarEnfermedad = isPermisoDuplicarEnfermedad;
	}
	
	public Boolean getIsPermisoOrdenEnfermedad() {
		return isPermisoOrdenEnfermedad;
	}

	public void setIsPermisoOrdenEnfermedad(Boolean isPermisoOrdenEnfermedad) {
		this.isPermisoOrdenEnfermedad = isPermisoOrdenEnfermedad;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEnfermedad() {
		return isVisibilidadCeldaNuevoEnfermedad;
	}

	public void setIsVisibilidadCeldaNuevoEnfermedad(Boolean isVisibilidadCeldaNuevoEnfermedad) {
		this.isVisibilidadCeldaNuevoEnfermedad = isVisibilidadCeldaNuevoEnfermedad;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEnfermedad() {
		return isVisibilidadCeldaDuplicarEnfermedad;
	}

	public void setIsVisibilidadCeldaDuplicarEnfermedad(Boolean isVisibilidadCeldaDuplicarEnfermedad) {
		this.isVisibilidadCeldaDuplicarEnfermedad = isVisibilidadCeldaDuplicarEnfermedad;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEnfermedad() {
		return isVisibilidadCeldaCopiarEnfermedad;
	}

	public void setIsVisibilidadCeldaCopiarEnfermedad(Boolean isVisibilidadCeldaCopiarEnfermedad) {
		this.isVisibilidadCeldaCopiarEnfermedad = isVisibilidadCeldaCopiarEnfermedad;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEnfermedad() {
		return isVisibilidadCeldaVerFormEnfermedad;
	}

	public void setIsVisibilidadCeldaVerFormEnfermedad(Boolean isVisibilidadCeldaVerFormEnfermedad) {
		this.isVisibilidadCeldaVerFormEnfermedad = isVisibilidadCeldaVerFormEnfermedad;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEnfermedad() {
		return isVisibilidadCeldaOrdenEnfermedad;
	}

	public void setIsVisibilidadCeldaOrdenEnfermedad(Boolean isVisibilidadCeldaOrdenEnfermedad) {
		this.isVisibilidadCeldaOrdenEnfermedad = isVisibilidadCeldaOrdenEnfermedad;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEnfermedad() {
		return isVisibilidadCeldaNuevoRelacionesEnfermedad;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEnfermedad(Boolean isVisibilidadCeldaNuevoRelacionesEnfermedad) {
		this.isVisibilidadCeldaNuevoRelacionesEnfermedad = isVisibilidadCeldaNuevoRelacionesEnfermedad;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEnfermedad() {
		return isVisibilidadCeldaModificarEnfermedad;
	}

	public void setIsVisibilidadCeldaModificarEnfermedad(Boolean isVisibilidadCeldaModificarEnfermedad) {
		this.isVisibilidadCeldaModificarEnfermedad = isVisibilidadCeldaModificarEnfermedad;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEnfermedad() {
		return isVisibilidadCeldaActualizarEnfermedad;
	}

	public void setIsVisibilidadCeldaActualizarEnfermedad(Boolean isVisibilidadCeldaActualizarEnfermedad) {
		this.isVisibilidadCeldaActualizarEnfermedad = isVisibilidadCeldaActualizarEnfermedad;
	}

	public Boolean getIsVisibilidadCeldaEliminarEnfermedad() {
		return isVisibilidadCeldaEliminarEnfermedad;
	}

	public void setIsVisibilidadCeldaEliminarEnfermedad(Boolean isVisibilidadCeldaEliminarEnfermedad) {
		this.isVisibilidadCeldaEliminarEnfermedad = isVisibilidadCeldaEliminarEnfermedad;
	}

	public Boolean getIsVisibilidadCeldaCancelarEnfermedad() {
		return isVisibilidadCeldaCancelarEnfermedad;
	}

	public void setIsVisibilidadCeldaCancelarEnfermedad(Boolean isVisibilidadCeldaCancelarEnfermedad) {
		this.isVisibilidadCeldaCancelarEnfermedad = isVisibilidadCeldaCancelarEnfermedad;
	}

	public Boolean getIsVisibilidadCeldaGuardarEnfermedad() {
		return isVisibilidadCeldaGuardarEnfermedad;
	}

	public void setIsVisibilidadCeldaGuardarEnfermedad(Boolean isVisibilidadCeldaGuardarEnfermedad) {
		this.isVisibilidadCeldaGuardarEnfermedad = isVisibilidadCeldaGuardarEnfermedad;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEnfermedad() {
		return isVisibilidadCeldaGuardarCambiosEnfermedad;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEnfermedad(Boolean isVisibilidadCeldaGuardarCambiosEnfermedad) {
		this.isVisibilidadCeldaGuardarCambiosEnfermedad = isVisibilidadCeldaGuardarCambiosEnfermedad;
	}
		
	public EnfermedadSessionBean getenfermedadSessionBean() {
		return this.enfermedadSessionBean;
	}
	
	public void setenfermedadSessionBean(EnfermedadSessionBean enfermedadSessionBean) {
		this.enfermedadSessionBean=enfermedadSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTipoEnfermedad() {
		return this.isVisibilidadFK_IdTipoEnfermedad;
	}

	public void setisVisibilidadFK_IdTipoEnfermedad(Boolean isVisibilidadFK_IdTipoEnfermedad) {
		this.isVisibilidadFK_IdTipoEnfermedad=isVisibilidadFK_IdTipoEnfermedad;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEnfermedad(Enfermedad enfermedad)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(enfermedad,null);
				this.setActualParaGuardarTipoEnfermedadForeignKey(enfermedad,null);
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
	
	public void bugActualizarReferenciaActual(Enfermedad enfermedad,Enfermedad enfermedadAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEnfermedad(enfermedad);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		enfermedadAux.setId(enfermedad.getId());
		enfermedadAux.setVersionRow(enfermedad.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEnfermedad();
		
			int intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedad =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.enfermedad =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEnfermedad(this.enfermedad,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(this.enfermedad);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = enfermedadValidator.getInvalidValues(this.enfermedad);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			enfermedadLogic.setDatosCliente(datosCliente);
			enfermedadLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				enfermedadAux=new  Enfermedad();
				
				enfermedadAux.setIsNew(true);
				enfermedadAux.setIsChanged(true);
				
				enfermedadAux.setEnfermedadOriginal(this.enfermedad);
				
				enfermedadAux.setId(this.enfermedad.getId());	
				enfermedadAux.setVersionRow(this.enfermedad.getVersionRow());	
				enfermedadAux.setid_empresa(this.enfermedad.getid_empresa());	
				enfermedadAux.setid_tipo_enfermedad(this.enfermedad.getid_tipo_enfermedad());	
				enfermedadAux.setnombre(this.enfermedad.getnombre());	
				enfermedadAux.setdescripcion(this.enfermedad.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.enfermedadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.enfermedadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(enfermedadAux,enfermedadLogic.getEnfermedads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(enfermedadAux,enfermedads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.enfermedadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.enfermedadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						enfermedadLogic.saveEnfermedads();//WithConnection
						//enfermedadLogic.getSetVersionRowEnfermedads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.enfermedad,enfermedadAux);
					
					this.refrescarForeignKeysDescripcionesEnfermedad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.enfermedadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenferLogic.getEmpleadoEnfers().addAll(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenfersEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenfers.addAll(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenfersEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								enfermedadLogic.saveEnfermedadRelaciones(enfermedadAux,this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenferLogic.getEmpleadoEnfers());//WithConnection
								//enfermedadLogic.getSetVersionRowEnfermedads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.enfermedad,enfermedadAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenferLogic.setEmpleadoEnfers(new ArrayList<EmpleadoEnfer>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenfers= new ArrayList<EmpleadoEnfer>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.quitarFilaTotales();}
							enfermedadAux.setEmpleadoEnfers(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenferLogic.getEmpleadoEnfers());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.enfermedadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.enfermedadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(enfermedadAux,enfermedadLogic.getEnfermedads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(enfermedadAux,enfermedads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.enfermedad,enfermedadAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				enfermedadAux=new  Enfermedad();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.enfermedadSessionBean.getEsGuardarRelacionado() 
					|| (this.enfermedadSessionBean.getEsGuardarRelacionado() && this.enfermedad.getId()>=0)) {
						
					enfermedadAux.setIsNew(false);
				}
				
				enfermedadAux.setIsDeleted(false);
			
				enfermedadAux.setId(this.enfermedad.getId());	
				enfermedadAux.setVersionRow(this.enfermedad.getVersionRow());	
				enfermedadAux.setid_empresa(this.enfermedad.getid_empresa());	
				enfermedadAux.setid_tipo_enfermedad(this.enfermedad.getid_tipo_enfermedad());	
				enfermedadAux.setnombre(this.enfermedad.getnombre());	
				enfermedadAux.setdescripcion(this.enfermedad.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(enfermedadAux,enfermedadLogic.getEnfermedads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(enfermedadAux,enfermedads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.enfermedadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.enfermedadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						enfermedadLogic.saveEnfermedads();//WithConnection
						//enfermedadLogic.getSetVersionRowEnfermedads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.enfermedad,enfermedadAux);
					
					this.refrescarForeignKeysDescripcionesEnfermedad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.enfermedadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenferLogic.getEmpleadoEnfers().addAll(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenfersEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenfers.addAll(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenfersEliminados);
						}
						//ARCHITECTURE
						
						if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								enfermedadLogic.saveEnfermedadRelaciones(enfermedadAux,this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenferLogic.getEmpleadoEnfers());//WithConnection
								//enfermedadLogic.getSetVersionRowEnfermedads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.enfermedad,enfermedadAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenferLogic.setEmpleadoEnfers(new ArrayList<EmpleadoEnfer>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenfers= new ArrayList<EmpleadoEnfer>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.quitarFilaTotales();}
							enfermedadAux.setEmpleadoEnfers(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenferLogic.getEmpleadoEnfers());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.enfermedadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.enfermedadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(enfermedadAux,enfermedadLogic.getEnfermedads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(enfermedadAux,enfermedads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.enfermedad,enfermedadAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				enfermedadAux=new  Enfermedad();
				
				enfermedadAux.setIsNew(false);
				enfermedadAux.setIsChanged(false);
				
				enfermedadAux.setIsDeleted(true);
				
				enfermedadAux.setId(this.enfermedad.getId());	
				enfermedadAux.setVersionRow(this.enfermedad.getVersionRow());	
				enfermedadAux.setid_empresa(this.enfermedad.getid_empresa());	
				enfermedadAux.setid_tipo_enfermedad(this.enfermedad.getid_tipo_enfermedad());	
				enfermedadAux.setnombre(this.enfermedad.getnombre());	
				enfermedadAux.setdescripcion(this.enfermedad.getdescripcion());	
				
				if(this.enfermedadSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.enfermedadAux.getId()>=0) {	
						this.enfermedadsEliminados.add(enfermedadAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(enfermedadAux,enfermedadLogic.getEnfermedads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(enfermedadAux,enfermedads);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.enfermedadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.enfermedadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						enfermedadLogic.saveEnfermedads();//WithConnection
						//enfermedadLogic.getSetVersionRowEnfermedads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.enfermedadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenferLogic.getEmpleadoEnfers().addAll(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenfersEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenfers.addAll(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenfersEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								enfermedadLogic.saveEnfermedadRelaciones(enfermedadAux,this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenferLogic.getEmpleadoEnfers());//WithConnection
								//enfermedadLogic.getSetVersionRowEnfermedads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenferLogic.setEmpleadoEnfers(new ArrayList<EmpleadoEnfer>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenfers= new ArrayList<EmpleadoEnfer>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.quitarFilaTotales();}
							enfermedadAux.setEmpleadoEnfers(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenferLogic.getEmpleadoEnfers());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.enfermedadSessionBean.getEstaModoGuardarRelaciones() 
								|| this.enfermedadSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(enfermedadAux,enfermedadLogic.getEnfermedads());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(enfermedadAux,enfermedads);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.getEnfermedads().addAll(this.enfermedadsEliminados);
					
					enfermedadLogic.saveEnfermedads();//WithConnection
					//enfermedadLogic.getSetVersionRowEnfermedads();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEnfermedad();
				
				this.enfermedadsEliminados= new ArrayList<Enfermedad>();		
			}
			
			if(this.enfermedadSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.enfermedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Enfermedad GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Enfermedad",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.enfermedad=enfermedadAux;
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
      		//this.finishProcessEnfermedad();
      	}
		
	}	
	
	public void actualizarRelaciones(Enfermedad enfermedadLocal) throws Exception {
		
		if(this.enfermedadSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				enfermedadLocal.setEmpleadoEnfers(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenferLogic.getEmpleadoEnfers());
			
			} else {
			
				enfermedadLocal.setEmpleadoEnfers(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenfers);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Enfermedad enfermedadLocal) throws Exception {	
		if(this.enfermedadSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				enfermedadLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoEnfermedadDetalleFormJInternalFrame.class)) {
				TipoEnfermedadBeanSwingJInternalFrame tipoenfermedadBeanSwingJInternalFrameLocal=(TipoEnfermedadBeanSwingJInternalFrame) ((TipoEnfermedadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoenfermedadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoEnfermedad(tipoenfermedadBeanSwingJInternalFrameLocal.gettipoenfermedad(),true);
				tipoenfermedadBeanSwingJInternalFrameLocal.actualizarLista(tipoenfermedadBeanSwingJInternalFrameLocal.tipoenfermedad,this.tipoenfermedadsForeignKey);

				tipoenfermedadBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoenfermedadBeanSwingJInternalFrameLocal.tipoenfermedad);

				enfermedadLocal.setTipoEnfermedad(tipoenfermedadBeanSwingJInternalFrameLocal.tipoenfermedad);

				this.addItemDefectoCombosForeignKeyTipoEnfermedad();
				this.cargarCombosFrameTipoEnfermedadsForeignKey("Formulario");
				this.setActualTipoEnfermedadForeignKey(tipoenfermedadBeanSwingJInternalFrameLocal.tipoenfermedad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEnfermedadActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.enfermedad =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.enfermedad =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = enfermedadValidator.getInvalidValues(this.enfermedad);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Enfermedad enfermedad,List<Enfermedad> enfermedads) throws Exception {
		try	{		
			EnfermedadConstantesFunciones.actualizarLista(enfermedad,enfermedads,this.enfermedadSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Enfermedad enfermedad,List<Enfermedad> enfermedads) throws Exception {
		try	{			
			EnfermedadConstantesFunciones.actualizarSelectedLista(enfermedad,enfermedads);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Enfermedad> enfermedadsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				enfermedadsLocal=this.enfermedadLogic.getEnfermedads();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				enfermedadsLocal=this.enfermedads;
			}
			//ARCHITECTURE
		
			for(Enfermedad enfermedadLocal:enfermedadsLocal) {
				if(this.permiteMantenimiento(enfermedadLocal) && enfermedadLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EnfermedadConstantesFunciones.getEnfermedadLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EnfermedadConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEnfermedad.jLabelid_empresaEnfermedad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EnfermedadConstantesFunciones.IDTIPOENFERMEDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEnfermedad.jLabelid_tipo_enfermedadEnfermedad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EnfermedadConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEnfermedad.jLabelnombreEnfermedad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EnfermedadConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEnfermedad.jLabeldescripcionEnfermedad,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEnfermedad.jLabelid_empresaEnfermedad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEnfermedad.jLabelid_tipo_enfermedadEnfermedad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEnfermedad.jLabelnombreEnfermedad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEnfermedad.jLabeldescripcionEnfermedad,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("EmpleadoEnfer")) {
			if(this.enfermedad==null) {
				this.enfermedad= new Enfermedad();
			}

			if(this.enfermedadSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEnfermedad
				this.setVariablesFormularioToObjetoActualEnfermedad(this.enfermedad,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(this.enfermedad);

				this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.getempleadoenfer().setEnfermedad(this.enfermedad);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEnfermedad--;	
		
		
		this.enfermedadAux=new Enfermedad();
		
		this.enfermedadAux.setId(this.iIdNuevoEnfermedad);
		this.enfermedadAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.enfermedadLogic.getEnfermedads().add(this.enfermedadAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.enfermedads.add(this.enfermedadAux);
		}
		//ARCHITECTURE
		
		this.enfermedad=this.enfermedadAux;
		
		if(EnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEnfermedad(this.enfermedad);
			this.setVariablesObjetoActualToFormularioForeignKeyEnfermedad(this.enfermedad);
		}
				
		//this.setDefaultControlesEnfermedad();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEnfermedad();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEnfermedad();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEnfermedad();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEnfermedad(this.enfermedadBean,this.enfermedad,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(this.enfermedad);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EnfermedadConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.enfermedadSessionBean.getConGuardarRelaciones()) {
			classes=EnfermedadConstantesFunciones.getClassesRelationshipsOfEnfermedad(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.enfermedadReturnGeneral=enfermedadLogic.procesarEventosEnfermedadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.enfermedadLogic.getEnfermedads(),this.enfermedad,this.enfermedadParameterGeneral,this.isEsNuevoEnfermedad,classes);//this.enfermedadLogic.getEnfermedad()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEnfermedad(this.enfermedadReturnGeneral,this.enfermedadBean,false);
		
		if(this.enfermedadReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEnfermedad(this.enfermedadReturnGeneral.getEnfermedad());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEnfermedad(this.enfermedadReturnGeneral.getEnfermedad());
		}
		
		if(this.enfermedadReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEnfermedad(this.enfermedadReturnGeneral.getEnfermedad(),classes);//this.enfermedadBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEnfermedad(this.enfermedad,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEnfermedad();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEnfermedad();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EnfermedadBeanSwingJInternalFrameAdditional.RecargarFormEnfermedad(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEnfermedad(false);
						
			if(enfermedadSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenferSessionBean.getEsGuardarRelacionado() && EmpleadoEnferJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoEnferActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EnfermedadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEnfermedad();
			}
			
			this.actualizarVisualTableDatosEnfermedad();
			
			this.jTableDatosEnfermedad.setRowSelectionInterval(this.getIndiceNuevoEnfermedad(), this.getIndiceNuevoEnfermedad());
			
			this.seleccionarFilaTablaEnfermedadActual();
						
			this.actualizarEstadoCeldasBotonesEnfermedad("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEnfermedad(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEnfermedad.jTextAreanombreEnfermedad.setEnabled(isHabilitar && this.enfermedadConstantesFunciones.activarnombreEnfermedad);
		this.jInternalFrameDetalleFormEnfermedad.jTextAreadescripcionEnfermedad.setEnabled(isHabilitar && this.enfermedadConstantesFunciones.activardescripcionEnfermedad);	
		//
		this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_empresaEnfermedad.setEnabled(isHabilitar && this.enfermedadConstantesFunciones.activarid_empresaEnfermedad);
		this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_tipo_enfermedadEnfermedad.setEnabled(isHabilitar && this.enfermedadConstantesFunciones.activarid_tipo_enfermedadEnfermedad);
	};
	
	public void setDefaultControlesEnfermedad() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEnfermedad(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.enfermedadSessionBean.setConGuardarRelaciones(true);			
			this.enfermedadSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEnfermedad.jTabbedPaneRelacionesEnfermedad.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenferSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.enfermedadSessionBean.setConGuardarRelaciones(false);			
			this.enfermedadSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEnfermedad.jTabbedPaneRelacionesEnfermedad.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenferSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEnfermedad() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Enfermedad enfermedadAux:this.enfermedadLogic.getEnfermedads()) {
				if(enfermedadAux.getId().equals(this.iIdNuevoEnfermedad)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Enfermedad enfermedadAux:this.enfermedads) {
				if(enfermedadAux.getId().equals(this.iIdNuevoEnfermedad)) {
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
	
	public int getIndiceActualEnfermedad(Enfermedad enfermedad,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Enfermedad enfermedadAux:this.enfermedadLogic.getEnfermedads()) {
				if(enfermedadAux.getId().equals(enfermedad.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Enfermedad enfermedadAux:this.enfermedads) {
				if(enfermedadAux.getId().equals(enfermedad.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEnfermedad(Enfermedad enfermedadOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Enfermedad enfermedadAux:this.enfermedadLogic.getEnfermedads()) {
				if(enfermedadAux.getEnfermedadOriginal().getId().equals(enfermedadOriginal.getId())) {
					existe=true;
					enfermedadOriginal.setId(enfermedadAux.getId());
					enfermedadOriginal.setVersionRow(enfermedadAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Enfermedad enfermedadAux:this.enfermedads) {
				if(enfermedadAux.getEnfermedadOriginal().getId().equals(enfermedadOriginal.getId())) {
					existe=true;
					enfermedadOriginal.setId(enfermedadAux.getId());
					enfermedadOriginal.setVersionRow(enfermedadAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEnfermedad(Boolean esParaCancelar) throws Exception {
		enfermedadsAux=new ArrayList<Enfermedad>();
		enfermedadAux=new Enfermedad();
		
		if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Enfermedad enfermedadAux:this.enfermedadLogic.getEnfermedads()) {
					if(enfermedadAux.getId()<0) {
						enfermedadsAux.add(enfermedadAux);
					}		
				}
				this.iIdNuevoEnfermedad=0L;
				this.enfermedadLogic.getEnfermedads().removeAll(enfermedadsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Enfermedad enfermedadAux:this.enfermedads) {
					if(enfermedadAux.getId()<0) {
						enfermedadsAux.add(enfermedadAux);
					}		
				}
				this.iIdNuevoEnfermedad=0L;
				this.enfermedads.removeAll(enfermedadsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEnfermedad 
					&& this.enfermedadLogic.getEnfermedads().size()>0
					) {
					enfermedadAux=this.enfermedadLogic.getEnfermedads().get(this.enfermedadLogic.getEnfermedads().size() - 1);
				
					if(enfermedadAux.getId()<0) {
						this.enfermedadLogic.getEnfermedads().remove(enfermedadAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEnfermedad && this.enfermedads.size()>0) {
					enfermedadAux=this.enfermedads.get(this.enfermedads.size() - 1);
				
					if(enfermedadAux.getId()<0) {
						this.enfermedads.remove(enfermedadAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEnfermedad(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(enfermedad.getId()<0) {
				this.enfermedadLogic.getEnfermedads().remove(this.enfermedad);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(enfermedad.getId()<0) {
				this.enfermedads.remove(this.enfermedad);
			}
		}			
	}
	
	public void setEstadosInicialesEnfermedad(List<Enfermedad> enfermedadsAux) throws Exception {
		EnfermedadConstantesFunciones.setEstadosInicialesEnfermedad(enfermedadsAux);
	}
	
	public void setEstadosInicialesEnfermedad(Enfermedad enfermedadAux) throws Exception {
		EnfermedadConstantesFunciones.setEstadosInicialesEnfermedad(enfermedadAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEnfermedadActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEnfermedad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEnfermedadActual()) {
				if(!this.isEsNuevoEnfermedad) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEnfermedad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEnfermedad=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEnfermedadActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Enfermedad ?", "MANTENIMIENTO DE Enfermedad", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEnfermedad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Enfermedad enfermedad) throws Exception {
		EnfermedadConstantesFunciones.seleccionarAsignar(this.enfermedad,enfermedad);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEnfermedad=this.isPermisoActualizarOriginalEnfermedad;
			
			
			this.seleccionarAsignar(enfermedad);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EnfermedadConstantesFunciones.quitarEspaciosEnfermedad(this.enfermedad,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEnfermedad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.enfermedadSessionBean.setsFuncionBusquedaRapida(this.enfermedadSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEnfermedad) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEnfermedad(esParaCancelar);				
				this.cancelarNuevoEnfermedad(esParaCancelar);								
			}
			
			this.enfermedad=new Enfermedad();
			
			this.inicializarEnfermedad();
			
			this.actualizarEstadoCeldasBotonesEnfermedad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEnfermedad() throws Exception {
		try {
			EnfermedadConstantesFunciones.inicializarEnfermedad(this.enfermedad);
			
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
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.enfermedadLogic.getEnfermedads().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEnfermedads(String sAccionBusqueda,List<Enfermedad> enfermedadsParaReportes) throws Exception {
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
					sPathReporteFinal="Enfermedad"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EnfermedadMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EnfermedadMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Enfermedad"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Enfermedades");		
		parameters.put("busquedapor", EnfermedadConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(EmpleadoEnfer.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EnfermedadLogic enfermedadLogicAuxiliar=new EnfermedadLogic();
					enfermedadLogicAuxiliar.setDatosCliente(enfermedadLogic.getDatosCliente());				
					enfermedadLogicAuxiliar.setEnfermedads(enfermedadsParaReportes);
					
					enfermedadLogicAuxiliar.cargarRelacionesLoteForeignKeyEnfermedadWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					enfermedadsParaReportes=enfermedadLogicAuxiliar.getEnfermedads();
					
					//enfermedadLogic.getNewConnexionToDeep();
					
					//for (Enfermedad enfermedad:enfermedadsParaReportes) {
					//	enfermedadLogic.deepLoad(enfermedad, false, DeepLoadType.INCLUDE, classes);
					//}						
					//enfermedadLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//enfermedadLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileEmpleadoEnfer = AuxiliarReportes.class.getResourceAsStream("EmpleadoEnferDetalleRelacionesDesign.jasper");
			parameters.put("subreport_empleadoenfer", reportFileEmpleadoEnfer);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEnfermedad=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EnfermedadConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EnfermedadConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEnfermedad=new JRBeanArrayDataSource(EnfermedadJInternalFrame.TraerEnfermedadBeans(enfermedadsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEnfermedad);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EnfermedadConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EnfermedadConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EnfermedadBean.TraerEnfermedadBeans(enfermedadsParaReportes).toArray()));
							
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
				this.generarExcelReporteEnfermedads(sAccionBusqueda,sTipoArchivoReporte,enfermedadsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEnfermedads(sAccionBusqueda,sTipoArchivoReporte,enfermedadsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEnfermedadActionPerformed(null);
					//this.generarExcelReporteEnfermedads(sAccionBusqueda,sTipoArchivoReporte,enfermedadsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEnfermedads(sAccionBusqueda,sTipoArchivoReporte,enfermedadsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEnfermedads(sAccionBusqueda,sTipoArchivoReporte,enfermedadsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEnfermedads(sAccionBusqueda,sTipoArchivoReporte,enfermedadsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEnfermedads(String sAccionBusqueda,String sTipoArchivoReporte,List<Enfermedad> enfermedadsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"enfermedad";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Enfermedads");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEnfermedad("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Enfermedad enfermedad : enfermedadsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EnfermedadConstantesFunciones.generarExcelReporteDataEnfermedad("NORMAL",row,workbook,enfermedad,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.enfermedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Enfermedad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEnfermedad(String sTipo,Row row,Workbook workbook) {
		
		EnfermedadConstantesFunciones.generarExcelReporteHeaderEnfermedad(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEnfermedads(String sAccionBusqueda,String sTipoArchivoReporte,List<Enfermedad> enfermedadsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"enfermedad_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Enfermedads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Enfermedad enfermedad : enfermedadsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EnfermedadConstantesFunciones.getEnfermedadDescripcion(enfermedad));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EnfermedadConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EnfermedadConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(enfermedad.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EnfermedadConstantesFunciones.LABEL_IDTIPOENFERMEDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EnfermedadConstantesFunciones.LABEL_IDTIPOENFERMEDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(enfermedad.gettipoenfermedad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EnfermedadConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EnfermedadConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(enfermedad.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EnfermedadConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EnfermedadConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(enfermedad.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.enfermedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Enfermedad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEnfermedads(String sAccionBusqueda,String sTipoArchivoReporte,List<Enfermedad> enfermedadsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Enfermedad> enfermedadsRespaldo=null;
		
		classes=EnfermedadConstantesFunciones.getClassesRelationshipsOfEnfermedad(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.enfermedadLogic.setDatosCliente(this.datosCliente);
		this.enfermedadLogic.setDatosDeep(this.datosDeep);
		this.enfermedadLogic.setIsConDeep(true);
		
		enfermedadsRespaldo=this.enfermedadLogic.getEnfermedads();
		
		this.enfermedadLogic.setEnfermedads(enfermedadsParaReportes);	
		this.enfermedadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		enfermedadsParaReportes=this.enfermedadLogic.getEnfermedads();
		this.enfermedadLogic.setEnfermedads(enfermedadsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"enfermedad_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Enfermedads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEnfermedad("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Enfermedad enfermedad : enfermedadsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEnfermedad("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EnfermedadConstantesFunciones.generarExcelReporteDataEnfermedad("NORMAL",row,workbook,enfermedad,cellStyleDataAux);
		
			
			


				//EmpleadoEnfer
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO))) {

				if(enfermedad.getEmpleadoEnfers()!=null && enfermedad.getEmpleadoEnfers().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EmpleadoEnferConstantesFunciones.generarExcelReporteHeaderEmpleadoEnfer("RELACIONADO",row,workbook);
				}

				if(enfermedad.getEmpleadoEnfers()!=null) {
					i2=0;
					for(EmpleadoEnfer empleadoenfer : enfermedad.getEmpleadoEnfers()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EmpleadoEnferConstantesFunciones.generarExcelReporteDataEmpleadoEnfer("RELACIONADO",row,workbook,empleadoenfer,cellStyleDataAuxHijo);
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
		cell.setCellValue(EnfermedadConstantesFunciones.getEnfermedadDescripcion(enfermedad));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.enfermedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Enfermedad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEnfermedad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEnfermedad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEnfermedad.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEnfermedad.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEnfermedad() throws Exception {		
		this.startProcessEnfermedad(true);
	}
	
	public void startProcessEnfermedad(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEnfermedad ,this.jPanelParametrosReportesEnfermedad, this.jScrollPanelDatosEnfermedad,this.jPanelPaginacionEnfermedad, this.jScrollPanelDatosEdicionEnfermedad, this.jPanelAccionesEnfermedad,this.jPanelAccionesFormularioEnfermedad,this.jmenuBarEnfermedad,this.jmenuBarDetalleEnfermedad,this.jTtoolBarEnfermedad,this.jTtoolBarDetalleEnfermedad);		
		
		final JTabbedPane jTabbedPaneBusquedasEnfermedad=this.jTabbedPaneBusquedasEnfermedad; 
		
		final JPanel jPanelParametrosReportesEnfermedad=this.jPanelParametrosReportesEnfermedad;
		//final JScrollPane jScrollPanelDatosEnfermedad=this.jScrollPanelDatosEnfermedad;
		final JTable jTableDatosEnfermedad=this.jTableDatosEnfermedad;		
		final JPanel jPanelPaginacionEnfermedad=this.jPanelPaginacionEnfermedad;
		//final JScrollPane jScrollPanelDatosEdicionEnfermedad=this.jScrollPanelDatosEdicionEnfermedad;
		final JPanel jPanelAccionesEnfermedad=this.jPanelAccionesEnfermedad;
		
		JPanel jPanelCamposAuxiliarEnfermedad=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEnfermedad=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) {
			jPanelCamposAuxiliarEnfermedad=this.jInternalFrameDetalleFormEnfermedad.jPanelCamposEnfermedad;
			jPanelAccionesFormularioAuxiliarEnfermedad=this.jInternalFrameDetalleFormEnfermedad.jPanelAccionesFormularioEnfermedad;
		}
		
		final JPanel jPanelCamposEnfermedad=jPanelCamposAuxiliarEnfermedad;
		final JPanel jPanelAccionesFormularioEnfermedad=jPanelAccionesFormularioAuxiliarEnfermedad;
		
		
		final JMenuBar jmenuBarEnfermedad=this.jmenuBarEnfermedad;
		final JToolBar jTtoolBarEnfermedad=this.jTtoolBarEnfermedad;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEnfermedad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEnfermedad=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) {
			jmenuBarDetalleAuxiliarEnfermedad=this.jInternalFrameDetalleFormEnfermedad.jmenuBarDetalleEnfermedad;
			jTtoolBarDetalleAuxiliarEnfermedad=this.jInternalFrameDetalleFormEnfermedad.jTtoolBarDetalleEnfermedad;
		}
		
		final JMenuBar jmenuBarDetalleEnfermedad=jmenuBarDetalleAuxiliarEnfermedad;
		final JToolBar jTtoolBarDetalleEnfermedad=jTtoolBarDetalleAuxiliarEnfermedad;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEnfermedad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEnfermedad;
			processRunnable.jTableDatos=jTableDatosEnfermedad;
			processRunnable.jPanelCampos=jPanelCamposEnfermedad;
			processRunnable.jPanelPaginacion=jPanelPaginacionEnfermedad;
			processRunnable.jPanelAcciones=jPanelAccionesEnfermedad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEnfermedad;
			
			
			processRunnable.jmenuBar=jmenuBarEnfermedad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEnfermedad;
			processRunnable.jTtoolBar=jTtoolBarEnfermedad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEnfermedad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEnfermedad ,jPanelParametrosReportesEnfermedad,jTableDatosEnfermedad, /*jScrollPanelDatosEnfermedad,*/jPanelCamposEnfermedad,jPanelPaginacionEnfermedad, /*jScrollPanelDatosEdicionEnfermedad,*/ jPanelAccionesEnfermedad,jPanelAccionesFormularioEnfermedad,jmenuBarEnfermedad,jmenuBarDetalleEnfermedad,jTtoolBarEnfermedad,jTtoolBarDetalleEnfermedad);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEnfermedad ,jPanelParametrosReportesEnfermedad, jScrollPanelDatosEnfermedad,jPanelPaginacionEnfermedad, jScrollPanelDatosEdicionEnfermedad, jPanelAccionesEnfermedad,jPanelAccionesFormularioEnfermedad,jmenuBarEnfermedad,jmenuBarDetalleEnfermedad,jTtoolBarEnfermedad,jTtoolBarDetalleEnfermedad);
						
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
	
	public void finishProcessEnfermedad() {// throws Exception 
		this.finishProcessEnfermedad(true);
	}
	
	public void finishProcessEnfermedad(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEnfermedad ,this.jPanelParametrosReportesEnfermedad, this.jScrollPanelDatosEnfermedad,this.jPanelPaginacionEnfermedad, this.jScrollPanelDatosEdicionEnfermedad, this.jPanelAccionesEnfermedad,this.jPanelAccionesFormularioEnfermedad,this.jmenuBarEnfermedad,this.jmenuBarDetalleEnfermedad,this.jTtoolBarEnfermedad,this.jTtoolBarDetalleEnfermedad);		
		
		final JTabbedPane jTabbedPaneBusquedasEnfermedad=this.jTabbedPaneBusquedasEnfermedad; 
		
		final JPanel jPanelParametrosReportesEnfermedad=this.jPanelParametrosReportesEnfermedad;
		//final JScrollPane jScrollPanelDatosEnfermedad=this.jScrollPanelDatosEnfermedad;
		final JTable jTableDatosEnfermedad=this.jTableDatosEnfermedad;		
		final JPanel jPanelPaginacionEnfermedad=this.jPanelPaginacionEnfermedad;
		//final JScrollPane jScrollPanelDatosEdicionEnfermedad=this.jScrollPanelDatosEdicionEnfermedad;
		final JPanel jPanelAccionesEnfermedad=this.jPanelAccionesEnfermedad;
		
		JPanel jPanelCamposAuxiliarEnfermedad=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEnfermedad=new JPanel();
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) {
			jPanelCamposAuxiliarEnfermedad=this.jInternalFrameDetalleFormEnfermedad.jPanelCamposEnfermedad;
			jPanelAccionesFormularioAuxiliarEnfermedad=this.jInternalFrameDetalleFormEnfermedad.jPanelAccionesFormularioEnfermedad;
		}
		
		final JPanel jPanelCamposEnfermedad=jPanelCamposAuxiliarEnfermedad;
		final JPanel jPanelAccionesFormularioEnfermedad=jPanelAccionesFormularioAuxiliarEnfermedad;
		
		
		final JMenuBar jmenuBarEnfermedad=this.jmenuBarEnfermedad;		
		final JToolBar jTtoolBarEnfermedad=this.jTtoolBarEnfermedad;
				
		JMenuBar jmenuBarDetalleAuxiliarEnfermedad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEnfermedad=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) {
			jmenuBarDetalleAuxiliarEnfermedad=this.jInternalFrameDetalleFormEnfermedad.jmenuBarDetalleEnfermedad;
			jTtoolBarDetalleAuxiliarEnfermedad=this.jInternalFrameDetalleFormEnfermedad.jTtoolBarDetalleEnfermedad;		
		}
		
		final JMenuBar jmenuBarDetalleEnfermedad=jmenuBarDetalleAuxiliarEnfermedad;
		final JToolBar jTtoolBarDetalleEnfermedad=jTtoolBarDetalleAuxiliarEnfermedad;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEnfermedad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEnfermedad;
			processRunnable.jTableDatos=jTableDatosEnfermedad;
			processRunnable.jPanelCampos=jPanelCamposEnfermedad;
			processRunnable.jPanelPaginacion=jPanelPaginacionEnfermedad;
			processRunnable.jPanelAcciones=jPanelAccionesEnfermedad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEnfermedad;
			
			
			processRunnable.jmenuBar=jmenuBarEnfermedad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEnfermedad;
			processRunnable.jTtoolBar=jTtoolBarEnfermedad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEnfermedad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEnfermedad ,jPanelParametrosReportesEnfermedad, jTableDatosEnfermedad,/*jScrollPanelDatosEnfermedad,*/jPanelCamposEnfermedad,jPanelPaginacionEnfermedad, /*jScrollPanelDatosEdicionEnfermedad,*/ jPanelAccionesEnfermedad,jPanelAccionesFormularioEnfermedad,jmenuBarEnfermedad,jmenuBarDetalleEnfermedad,jTtoolBarEnfermedad,jTtoolBarDetalleEnfermedad));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEnfermedad(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEnfermedad(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEnfermedad(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEnfermedad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEnfermedad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEnfermedad,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEnfermedad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEnfermedad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEnfermedad,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.enfermedadConstantesFunciones.getsFinalQueryEnfermedad();
		String  finalQueryPaginacionTodos=this.enfermedadConstantesFunciones.getsFinalQueryEnfermedad();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EnfermedadConstantesFunciones.getArrayColumnasGlobalesNoEnfermedad(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EnfermedadConstantesFunciones.getArrayColumnasGlobalesEnfermedad(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EnfermedadConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.enfermedadsEliminados= new ArrayList<Enfermedad>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEnfermedad();
		
				///*EnfermedadSessionBean*/this.enfermedadSessionBean=new EnfermedadSessionBean();
			
			if(this.enfermedadSessionBean==null) {
				this.enfermedadSessionBean=new EnfermedadSessionBean();
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
					this.iNumeroPaginacion=EnfermedadConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EnfermedadConstantesFunciones.getClassesForeignKeysOfEnfermedad(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/enfermedad."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			enfermedadsAux= new ArrayList<Enfermedad>();
			
				
			enfermedadLogic.setDatosCliente(this.datosCliente);
			enfermedadLogic.setDatosDeep(this.datosDeep);
			enfermedadLogic.setIsConDeep(true);
			
			
			enfermedadLogic.getEnfermedadDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					enfermedadLogic.getTodosEnfermedads(finalQueryGlobal,pagination);
					
					//enfermedadLogic.getTodosEnfermedadsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(enfermedadLogic.getEnfermedads()==null|| enfermedadLogic.getEnfermedads().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							enfermedadsAux= new ArrayList<Enfermedad>();
							enfermedadsAux.addAll(enfermedadLogic.getEnfermedads());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							enfermedadsAux= new ArrayList<Enfermedad>();
							enfermedadsAux.addAll(enfermedads);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							enfermedadLogic.getTodosEnfermedads(finalQueryGlobal+"",this.pagination);												
							
							//enfermedadLogic.getTodosEnfermedadsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEnfermedads("Todos",enfermedadLogic.getEnfermedads() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							enfermedadLogic.setEnfermedads(new ArrayList<Enfermedad>());					
							enfermedadLogic.getEnfermedads().addAll(enfermedadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							enfermedads=new ArrayList<Enfermedad>();
							enfermedads.addAll(enfermedadsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEnfermedad=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEnfermedad=this.idActual;
				
				} else if(this.idEnfermedadActual!=null && this.idEnfermedadActual!=0L) {
					idEnfermedad=idEnfermedadActual;
				}
				
					
				this.sDetalleReporte=EnfermedadConstantesFunciones.getDetalleIndicePorId(idEnfermedad);
				
				this.enfermedads=new ArrayList<Enfermedad>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					enfermedadLogic.getEntity(idEnfermedad);
					
					//enfermedadLogic.getEntityWithConnection(idEnfermedad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					enfermedadLogic.setEnfermedads(new ArrayList<Enfermedad>());
					enfermedadLogic.getEnfermedads().add(enfermedadLogic.getEnfermedad());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.enfermedads=new ArrayList<Enfermedad>();
					this.enfermedads.add(enfermedad);
				}
				
				if(enfermedadLogic.getEnfermedad()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EnfermedadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					enfermedadLogic.getEnfermedadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EnfermedadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EnfermedadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=enfermedadLogic.getEnfermedads()==null||enfermedadLogic.getEnfermedads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=enfermedads==null|| enfermedads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						enfermedadsAux=new ArrayList<Enfermedad>();
						enfermedadsAux.addAll(enfermedadLogic.getEnfermedads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							enfermedadsAux=new ArrayList<Enfermedad>();
							enfermedadsAux.addAll(enfermedads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							enfermedadLogic.getEnfermedadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EnfermedadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EnfermedadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEnfermedads("FK_IdEmpresa",enfermedadLogic.getEnfermedads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEnfermedads("FK_IdEmpresa",enfermedads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						enfermedadLogic.setEnfermedads(new ArrayList<Enfermedad>());
						enfermedadLogic.getEnfermedads().addAll(enfermedadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							enfermedads=new ArrayList<Enfermedad>();
							enfermedads.addAll(enfermedadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoEnfermedad")) {
				this.sDetalleReporte=EnfermedadConstantesFunciones.getDetalleIndiceFK_IdTipoEnfermedad(id_tipo_enfermedadFK_IdTipoEnfermedad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					enfermedadLogic.getEnfermedadsFK_IdTipoEnfermedad(finalQueryGlobal,pagination,id_tipo_enfermedadFK_IdTipoEnfermedad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EnfermedadConstantesFunciones.getDetalleIndiceFK_IdTipoEnfermedad(id_tipo_enfermedadFK_IdTipoEnfermedad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EnfermedadConstantesFunciones.getDetalleIndiceFK_IdTipoEnfermedad(id_tipo_enfermedadFK_IdTipoEnfermedad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=enfermedadLogic.getEnfermedads()==null||enfermedadLogic.getEnfermedads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=enfermedads==null|| enfermedads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						enfermedadsAux=new ArrayList<Enfermedad>();
						enfermedadsAux.addAll(enfermedadLogic.getEnfermedads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							enfermedadsAux=new ArrayList<Enfermedad>();
							enfermedadsAux.addAll(enfermedads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							enfermedadLogic.getEnfermedadsFK_IdTipoEnfermedad(finalQueryGlobal,pagination,id_tipo_enfermedadFK_IdTipoEnfermedad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EnfermedadConstantesFunciones.getDetalleIndiceFK_IdTipoEnfermedad(id_tipo_enfermedadFK_IdTipoEnfermedad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EnfermedadConstantesFunciones.getDetalleIndiceFK_IdTipoEnfermedad(id_tipo_enfermedadFK_IdTipoEnfermedad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEnfermedads("FK_IdTipoEnfermedad",enfermedadLogic.getEnfermedads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEnfermedads("FK_IdTipoEnfermedad",enfermedads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						enfermedadLogic.setEnfermedads(new ArrayList<Enfermedad>());
						enfermedadLogic.getEnfermedads().addAll(enfermedadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							enfermedads=new ArrayList<Enfermedad>();
							enfermedads.addAll(enfermedadsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEnfermedad();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEnfermedad();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=enfermedadLogic.getEnfermedads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=enfermedads.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=enfermedadLogic.getEnfermedads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=enfermedads.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Enfermedad enfermedad) {
		Boolean permite=true;
		
		if(this.enfermedad.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EnfermedadConstantesFunciones.getOrderByListaEnfermedad();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EnfermedadConstantesFunciones.getOrderByListaEnfermedad();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Enfermedad enfermedad:enfermedadLogic.getEnfermedads()) {
				if(enfermedad.getsType().equals(Constantes2.S_TOTALES)) {
					enfermedadTotales=enfermedad;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Enfermedad enfermedad:this.enfermedads) {
				if(enfermedad.getsType().equals(Constantes2.S_TOTALES)) {
					enfermedadTotales=enfermedad;
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
			this.enfermedadAux=new Enfermedad();
			this.enfermedadAux.setsType(Constantes2.S_TOTALES);
			this.enfermedadAux.setIsNew(false);
			this.enfermedadAux.setIsChanged(false);
			this.enfermedadAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EnfermedadConstantesFunciones.TotalizarValoresFilaEnfermedad(this.enfermedadLogic.getEnfermedads(),this.enfermedadAux);
				
				this.enfermedadLogic.getEnfermedads().add(this.enfermedadAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EnfermedadConstantesFunciones.TotalizarValoresFilaEnfermedad(this.enfermedads,this.enfermedadAux);
				
				this.enfermedads.add(this.enfermedadAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		enfermedadTotales=new Enfermedad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.enfermedadLogic.getEnfermedads().remove(enfermedadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.enfermedads.remove(enfermedadTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		enfermedadTotales=new Enfermedad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Enfermedad enfermedad:enfermedadLogic.getEnfermedads()) {
				if(enfermedad.getsType().equals(Constantes2.S_TOTALES)) {
					enfermedadTotales=enfermedad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EnfermedadConstantesFunciones.TotalizarValoresFilaEnfermedad(this.enfermedadLogic.getEnfermedads(),enfermedadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Enfermedad enfermedad:this.enfermedads) {
				if(enfermedad.getsType().equals(Constantes2.S_TOTALES)) {
					enfermedadTotales=enfermedad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EnfermedadConstantesFunciones.TotalizarValoresFilaEnfermedad(this.enfermedads,enfermedadTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEnfermedadsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEnfermedadsFK_IdTipoEnfermedad()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoEnfermedad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEnfermedadsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					enfermedadLogic.getEnfermedadsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEnfermedadsFK_IdTipoEnfermedad(String sFinalQuery,Long id_tipo_enfermedad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					enfermedadLogic.getEnfermedadsFK_IdTipoEnfermedad(sFinalQuery,this.pagination,id_tipo_enfermedad);
				
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
	
	public void inicializarPermisosEnfermedad() {
		this.isPermisoTodoEnfermedad=false;
		this.isPermisoNuevoEnfermedad=false;
		this.isPermisoActualizarEnfermedad=false;
		this.isPermisoActualizarOriginalEnfermedad=false;
		this.isPermisoEliminarEnfermedad=false;
		this.isPermisoGuardarCambiosEnfermedad=false;
		this.isPermisoConsultaEnfermedad=false;
		this.isPermisoBusquedaEnfermedad=false;
		this.isPermisoReporteEnfermedad=false;		
		this.isPermisoOrdenEnfermedad=false;		
		this.isPermisoPaginacionMedioEnfermedad=false;		
		this.isPermisoPaginacionAltoEnfermedad=false;
		this.isPermisoPaginacionTodoEnfermedad=false;
		this.isPermisoCopiarEnfermedad=false;		
		this.isPermisoVerFormEnfermedad=false;		
		this.isPermisoDuplicarEnfermedad=false;		
		this.isPermisoOrdenEnfermedad=false;		
	}
	
	public void setPermisosUsuarioEnfermedad(Boolean isPermiso) {
		this.isPermisoTodoEnfermedad=isPermiso;
		this.isPermisoNuevoEnfermedad=isPermiso;
		this.isPermisoActualizarEnfermedad=isPermiso;
		this.isPermisoActualizarOriginalEnfermedad=isPermiso;
		this.isPermisoEliminarEnfermedad=isPermiso;
		this.isPermisoGuardarCambiosEnfermedad=isPermiso;
		this.isPermisoConsultaEnfermedad=isPermiso;
		this.isPermisoBusquedaEnfermedad=isPermiso;
		this.isPermisoReporteEnfermedad=isPermiso;
		this.isPermisoOrdenEnfermedad=isPermiso;		
		this.isPermisoPaginacionMedioEnfermedad=isPermiso;		
		this.isPermisoPaginacionAltoEnfermedad=isPermiso;		
		this.isPermisoPaginacionTodoEnfermedad=isPermiso;		
		this.isPermisoCopiarEnfermedad=isPermiso;		
		this.isPermisoVerFormEnfermedad=isPermiso;		
		this.isPermisoDuplicarEnfermedad=isPermiso;
		this.isPermisoOrdenEnfermedad=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEnfermedad(Boolean isPermiso) {
		//this.isPermisoTodoEnfermedad=isPermiso;
		this.isPermisoNuevoEnfermedad=isPermiso;
		this.isPermisoActualizarEnfermedad=isPermiso;
		this.isPermisoActualizarOriginalEnfermedad=isPermiso;
		this.isPermisoEliminarEnfermedad=isPermiso;
		this.isPermisoGuardarCambiosEnfermedad=isPermiso;
		//this.isPermisoConsultaEnfermedad=isPermiso;
		//this.isPermisoBusquedaEnfermedad=isPermiso;
		//this.isPermisoReporteEnfermedad=isPermiso;
		//this.isPermisoOrdenEnfermedad=isPermiso;		
		//this.isPermisoPaginacionMedioEnfermedad=isPermiso;		
		//this.isPermisoPaginacionAltoEnfermedad=isPermiso;		
		//this.isPermisoPaginacionTodoEnfermedad=isPermiso;		
		//this.isPermisoCopiarEnfermedad=isPermiso;		
		//this.isPermisoDuplicarEnfermedad=isPermiso;
		//this.isPermisoOrdenEnfermedad=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEnfermedadClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(EmpleadoEnferConstantesFunciones.SNOMBREOPCION);
		
		if(EnfermedadJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosEmpleadoEnfer=false;
		this.isTienePermisosEmpleadoEnfer=this.verificarGetPermisosUsuarioOpcionEnfermedadClaseRelacionada(this.opcionsRelacionadas,EmpleadoEnferConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEnfermedad(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEnfermedadClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosEmpleadoEnfer=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEnfermedadClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEnfermedadClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEnfermedadClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosEmpleadoEnfer && this.jInternalFrameDetalleFormEnfermedad!=null && this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEnfermedad.jTabbedPaneRelacionesEnfermedad.remove(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEnfermedad() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EnfermedadJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.enfermedadSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EnfermedadConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEnfermedad=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEnfermedad=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEnfermedad=this.isPermisoActualizarEnfermedad;
			this.isPermisoEliminarEnfermedad=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEnfermedad=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEnfermedad=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEnfermedad=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEnfermedad=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEnfermedad=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEnfermedad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEnfermedad=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEnfermedad=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEnfermedad=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEnfermedad=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEnfermedad=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEnfermedad=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEnfermedad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.enfermedadSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEnfermedad.setToolTipText(this.jTableDatosEnfermedad.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEnfermedad(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEnfermedad(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EnfermedadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EnfermedadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEnfermedad() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosEmpleadoEnfer && this.enfermedadConstantesFunciones.mostrarEmpleadoEnferEnfermedad && !EnfermedadConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Empleado Enfer");
			reporte.setsDescripcion("Empleado Enfer");
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
	public void inicializarCombosForeignKeyEnfermedadListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipoenfermedadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEnfermedadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EnfermedadJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEnfermedadListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoEnfermedadListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoEnfermedadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoenfermedadsForeignKey==null||this.tipoenfermedadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoEnfermedadConstantesFunciones.getArrayColumnasGlobalesTipoEnfermedad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoEnfermedadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoEnfermedadConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoEnfermedadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyEnfermedadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EnfermedadParameterReturnGeneral enfermedadReturnGeneral=new EnfermedadParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.enfermedadConstantesFunciones.cargarid_empresaEnfermedad)
					 || (this.esRecargarFks && this.enfermedadConstantesFunciones.cargarid_empresaEnfermedad)) {

					if(!this.enfermedadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+enfermedadSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoEnfermedad="";

				if(((this.tipoenfermedadsForeignKey==null||this.tipoenfermedadsForeignKey.size()<=0) && this.enfermedadConstantesFunciones.cargarid_tipo_enfermedadEnfermedad)
					 || (this.esRecargarFks && this.enfermedadConstantesFunciones.cargarid_tipo_enfermedadEnfermedad)) {

					if(!this.enfermedadSessionBean.getisBusquedaDesdeForeignKeySesionTipoEnfermedad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoEnfermedadConstantesFunciones.getArrayColumnasGlobalesTipoEnfermedad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoEnfermedad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoEnfermedadConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoEnfermedad=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoEnfermedad, "");
						finalQueryGlobalTipoEnfermedad+=TipoEnfermedadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoEnfermedadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoEnfermedad=" WHERE " + ConstantesSql.ID + "="+enfermedadSessionBean.getlidTipoEnfermedadActual();
					}
				} else {
					finalQueryGlobalTipoEnfermedad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				enfermedadReturnGeneral=enfermedadLogic.cargarCombosLoteForeignKeyEnfermedad(finalQueryGlobalEmpresa,finalQueryGlobalTipoEnfermedad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=enfermedadReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoEnfermedad.equals("NONE")) {
				this.tipoenfermedadsForeignKey=enfermedadReturnGeneral.gettipoenfermedadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEnfermedad()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoEnfermedad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.enfermedadSessionBean==null) {
				this.enfermedadSessionBean=new EnfermedadSessionBean();
			}

			if(!this.enfermedadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTipoEnfermedad()throws Exception {
		try {

			if(!this.enfermedadSessionBean.getisBusquedaDesdeForeignKeySesionTipoEnfermedad()) {
				TipoEnfermedad tipoenfermedad=new TipoEnfermedad();
				TipoEnfermedadConstantesFunciones.setTipoEnfermedadDescripcion(tipoenfermedad,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoenfermedad.setId(null);

				if(!TipoEnfermedadConstantesFunciones.ExisteEnLista(this.tipoenfermedadsForeignKey,tipoenfermedad,true)) {

					this.tipoenfermedadsForeignKey.add(0,tipoenfermedad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyEnfermedad()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEnfermedad(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEnfermedad()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEnfermedad();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEnfermedad(Enfermedad enfermedad)throws Exception {	
		try {
			
			this.setActualTipoEnfermedadForeignKey(enfermedad.getid_tipo_enfermedad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEnfermedad(Enfermedad enfermedad,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEnfermedad()throws Exception {	
		try {
			
			this.setActualTipoEnfermedadForeignKey(this.enfermedadConstantesFunciones.getid_tipo_enfermedad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEnfermedad()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEnfermedad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEnfermedad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEnfermedad()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEnfermedad()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoEnfermedadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEnfermedad(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoEnfermedadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEnfermedad()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_empresaEnfermedad!=null && this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_empresaEnfermedad.getItemCount()>0) {
				this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_empresaEnfermedad.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_tipo_enfermedadEnfermedad!=null && this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_tipo_enfermedadEnfermedad.getItemCount()>0) {
				this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_tipo_enfermedadEnfermedad.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public EnfermedadBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EnfermedadBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EnfermedadBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.enfermedadSessionBean=new EnfermedadSessionBean(); 
		this.enfermedadConstantesFunciones=new EnfermedadConstantesFunciones(); 
		this.enfermedadBean=new Enfermedad();//(this.enfermedadConstantesFunciones); 		
		this.enfermedadReturnGeneral=new EnfermedadParameterReturnGeneral(); 
		
		this.enfermedadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.enfermedadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EnfermedadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EnfermedadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EnfermedadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEnfermedad(true);
			
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
			
			this.enfermedadConstantesFunciones=new EnfermedadConstantesFunciones(); 
			this.enfermedadBean=new Enfermedad();//this.enfermedadConstantesFunciones); 			
			this.enfermedadReturnGeneral=new EnfermedadParameterReturnGeneral(); 
		
			EnfermedadBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Enfermedad Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.enfermedad=new Enfermedad();
			this.enfermedads = new ArrayList<Enfermedad>();
			this.enfermedadsAux = new ArrayList<Enfermedad>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic=new EnfermedadLogic();
				this.enfermedadLogic.getNewConnexionToDeep("");
			}
			
			//this.enfermedadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.enfermedadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEnfermedad);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEnfermedad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEnfermedad);	
					}
					
					if(this.jInternalFrameImportacionEnfermedad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEnfermedad);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEnfermedad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEnfermedad);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEnfermedad!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEnfermedad);
				this.jInternalFrameDetalleFormEnfermedad.setVisible(false);
				this.jInternalFrameDetalleFormEnfermedad.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEnfermedad!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEnfermedad);
					this.jInternalFrameReporteDinamicoEnfermedad.setVisible(false);
					this.jInternalFrameReporteDinamicoEnfermedad.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEnfermedad!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEnfermedad);
					this.jInternalFrameImportacionEnfermedad.setVisible(false);
					this.jInternalFrameImportacionEnfermedad.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEnfermedad!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEnfermedad);
					this.jInternalFrameOrderByEnfermedad.setVisible(false);
					this.jInternalFrameOrderByEnfermedad.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEnfermedadActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EnfermedadConstantesFunciones.INUMEROPAGINACION;
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
			
			this.enfermedadReturnGeneral=new EnfermedadParameterReturnGeneral();
			
			this.enfermedadParameterGeneral=new EnfermedadParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.enfermedadLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EnfermedadJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.enfermedadSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(EmpleadoEnferConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EnfermedadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.enfermedadSessionBean.getEsGuardarRelacionado(),this.enfermedadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EnfermedadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.enfermedadSessionBean.getEsGuardarRelacionado(),this.enfermedadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEnfermedad=false;
			this.isVisibilidadCeldaDuplicarEnfermedad=true;
			this.isVisibilidadCeldaCopiarEnfermedad=true;
			this.isVisibilidadCeldaVerFormEnfermedad=true;
			this.isVisibilidadCeldaOrdenEnfermedad=true;
			this.isVisibilidadCeldaNuevoRelacionesEnfermedad=false;
			this.isVisibilidadCeldaModificarEnfermedad=false;
			this.isVisibilidadCeldaActualizarEnfermedad=false;
			this.isVisibilidadCeldaEliminarEnfermedad=false;
			this.isVisibilidadCeldaCancelarEnfermedad=false;
			this.isVisibilidadCeldaGuardarEnfermedad=false;
			this.isVisibilidadCeldaGuardarCambiosEnfermedad=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoEnfermedad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEnfermedad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEnfermedad();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEnfermedad(false);
			
			this.setPermisosUsuarioEnfermedad();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.enfermedadSessionBean.getEsGuardarRelacionado() 
				|| (this.enfermedadSessionBean.getEsGuardarRelacionado() && this.enfermedadSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEnfermedadClasesRelacionadas();
			}
			
			if(this.enfermedadSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEnfermedadClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EnfermedadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEnfermedad();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEnfermedad();
			}
			
			if(!this.isPermisoBusquedaEnfermedad) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEnfermedad.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEnfermedad,this.isPermisoPaginacionMedioEnfermedad,this.isPermisoPaginacionTodoEnfermedad);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EnfermedadConstantesFunciones.getTiposSeleccionarEnfermedad());
				
				this.tiposColumnasSelect=EnfermedadConstantesFunciones.getTiposSeleccionarEnfermedad(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEnfermedad();				
				//this.tiposRelacionesSelect=EnfermedadConstantesFunciones.getTiposRelacionesEnfermedad(true);
				
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
			//if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEnfermedad();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEnfermedad(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEnfermedad(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEnfermedad() ;
			
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
			
			
			this.empleadoenferLogic=new EmpleadoEnferLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.tipoenfermedadLogic=new TipoEnfermedadLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				enfermedadImplementable= (EnfermedadImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EnfermedadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				enfermedadImplementableHome= (EnfermedadImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EnfermedadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.enfermedads= new ArrayList<Enfermedad>();
			this.enfermedadsEliminados= new ArrayList<Enfermedad>();
						
			this.isEsNuevoEnfermedad=false;
			this.esParaAccionDesdeFormularioEnfermedad=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipoenfermedadsForeignKey=new ArrayList<TipoEnfermedad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEnfermedad(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEnfermedad();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EnfermedadBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EnfermedadConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEnfermedad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEnfermedad(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEnfermedad!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEnfermedad();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEnfermedad();
			}
			
			EnfermedadBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEnfermedad.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEnfermedad.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEnfermedad.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEnfermedad(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Enfermedad: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEnfermedad() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEnfermedad")) {
				iIndex=this.jInternalFrameDetalleFormEnfermedad.jTabbedPaneRelacionesEnfermedad.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEnfermedad.jTabbedPaneRelacionesEnfermedad.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();	
				
				

				if(sTitle.equals("Empleado Enferes")) {
					if(!EmpleadoEnferJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEnfermedad();

						this.cargarParteTabPanelRelacionadaEmpleadoEnfer(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEnfermedad();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaEmpleadoEnfer(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEnfermedad.cargarSessionConBeanSwingJInternalFrameEmpleadoEnfer(false,true,iIndex);
		this.jButtonEmpleadoEnferActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEmpleadoEnfer();

		//this.jTabbedPaneRelacionesEnfermedad.updateUI();
		//this.jTabbedPaneRelacionesEnfermedad.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEnfermedad.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("EmpleadoEnfer")) {
				int row=this.jTableDatosEnfermedad.getSelectedRow();
				jButtonEmpleadoEnferActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Empleado Enfer")) {

					if(this.isTienePermisosEmpleadoEnfer && this.enfermedadConstantesFunciones.mostrarEmpleadoEnferEnfermedad && !EnfermedadConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Empleado Enferes"+"("+EmpleadoEnferConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Empleado Enferes");

						if(enfermedadConstantesFunciones.resaltarEmpleadoEnferEnfermedad!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(enfermedadConstantesFunciones.resaltarEmpleadoEnferEnfermedad);
						}

						jmenuItem.setEnabled(this.enfermedadConstantesFunciones.activarEmpleadoEnferEnfermedad);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"EmpleadoEnfer"));

						

						this.jInternalFrameDetalleFormEnfermedad.jmenuDetalleEnfermedad.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEnfermedad(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEnfermedad(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEnfermedad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEnfermedadListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEnfermedad();
		
		this.cargarCombosFrameForeignKeyEnfermedad();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEnfermedad();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEnfermedad();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoEnfermedad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoEnfermedadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoEnfermedad();
				this.cargarCombosFrameTipoEnfermedadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoEnfermedad(this.tipoenfermedadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoEnfermedadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.enfermedadSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEnfermedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
			
			
			if(jTableDatosEnfermedad.getRowCount()>=1) {
				jTableDatosEnfermedad.removeRowSelectionInterval(0, jTableDatosEnfermedad.getRowCount()-1);						
			}
			
			this.isEsNuevoEnfermedad=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEnfermedad(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEnfermedad(true);			
			//this.enfermedad=new Enfermedad();
			//this.enfermedad.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEnfermedad(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEnfermedad() ;
			
			if(EnfermedadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEnfermedad(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.enfermedad);	
			this.actualizarInformacion("INFO_PADRE",false,this.enfermedad);				
			
			EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
			
			if(this.enfermedadSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Enfermedad: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEnfermedadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Enfermedad> enfermedadsSeleccionados=new ArrayList<Enfermedad>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEnfermedad.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEnfermedad.getSelectedRows().length;			
			}
			
			enfermedadsSeleccionados=this.getEnfermedadsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEnfermedad--;			
				//Enfermedad enfermedadAux= new Enfermedad();			
				//enfermedadAux.setId(this.iIdNuevoEnfermedad);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Enfermedad enfermedadOrigen=new Enfermedad();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Enfermedad enfermedadOrigen : enfermedadsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							enfermedadOrigen =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							enfermedadOrigen =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEnfermedad();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.enfermedad.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEnfermedad(enfermedadOrigen,this.enfermedad,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(this.enfermedad);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.enfermedadLogic.getEnfermedads().add(this.enfermedadAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.enfermedads.add(this.enfermedadAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEnfermedad(false);
				
				this.jTableDatosEnfermedad.setRowSelectionInterval(this.getIndiceNuevoEnfermedad(), this.getIndiceNuevoEnfermedad());
				
				int iLastRow =  this.jTableDatosEnfermedad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEnfermedad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEnfermedad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEnfermedad(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Enfermedad> enfermedadsSeleccionados=new ArrayList<Enfermedad>();									
		
			Enfermedad enfermedadOrigen=new Enfermedad();
			Enfermedad enfermedadDestino=new Enfermedad();
				
			enfermedadsSeleccionados=this.getEnfermedadsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEnfermedad.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || enfermedadsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEnfermedad.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						enfermedadOrigen =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						enfermedadOrigen =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						enfermedadDestino =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						enfermedadDestino =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				enfermedadOrigen =enfermedadsSeleccionados.get(0);
				enfermedadDestino =enfermedadsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEnfermedad(enfermedadOrigen,enfermedadDestino,true,false);
				
				enfermedadDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(enfermedadDestino,enfermedadLogic.getEnfermedads());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(enfermedadDestino,enfermedads);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEnfermedad(false);
				
				//this.jTableDatosEnfermedad.setRowSelectionInterval(this.getIndiceNuevoEnfermedad(), this.getIndiceNuevoEnfermedad());
				
				int iLastRow =  this.jTableDatosEnfermedad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEnfermedad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEnfermedad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEnfermedad(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEnfermedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEnfermedad.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEnfermedad.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEnfermedad.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEnfermedad.setVisible(!isVisible);
			this.jPanelPaginacionEnfermedad.setVisible(!isVisible);
			this.jPanelAccionesEnfermedad.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEnfermedad();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEnfermedad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEnfermedad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEnfermedad();
			
			this.abrirFrameOrderByEnfermedad();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEnfermedad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEnfermedad(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEnfermedad);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEnfermedad.isMaximum()) {
					this.jInternalFrameDetalleFormEnfermedad.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEnfermedad.setSize(this.jInternalFrameDetalleFormEnfermedad.iWidthFormulario,this.jInternalFrameDetalleFormEnfermedad.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEnfermedad.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEnfermedad.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEnfermedad.isMaximum()) {
						this.jInternalFrameDetalleFormEnfermedad.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEnfermedad.jContentPaneDetalleEnfermedad.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEnfermedad.jTabbedPaneRelacionesEnfermedad.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEnfermedad.jContentPaneDetalleEnfermedad.getWidth(),EnfermedadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEnfermedad.jTabbedPaneRelacionesEnfermedad.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEnfermedad.jContentPaneDetalleEnfermedad.getWidth(),EnfermedadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEnfermedad.jTabbedPaneRelacionesEnfermedad.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEnfermedad.jContentPaneDetalleEnfermedad.getWidth(),EnfermedadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(EmpleadoEnferJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEmpleadoEnfer();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEnfermedad.setVisible(true);
	        this.jInternalFrameDetalleFormEnfermedad.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEnfermedad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEnfermedad==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEnfermedad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEnfermedad,false,this);
				} else {
					this.jInternalFrameOrderByEnfermedad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEnfermedad,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEnfermedad);
				this.jInternalFrameOrderByEnfermedad.setVisible(false);
				this.jInternalFrameOrderByEnfermedad.setSelected(false);
				
				this.jInternalFrameOrderByEnfermedad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEnfermedad"));
				
				this.inicializarActualizarBindingTablaOrderByEnfermedad();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEnfermedad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEnfermedad==null) {
				
				this.jInternalFrameImportacionEnfermedad=new ImportacionJInternalFrame(EnfermedadConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEnfermedad);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEnfermedad);
				this.jInternalFrameImportacionEnfermedad.setVisible(false);
				this.jInternalFrameImportacionEnfermedad.setSelected(false);


				this.jInternalFrameImportacionEnfermedad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEnfermedad"));
				this.jInternalFrameImportacionEnfermedad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEnfermedad"));
				this.jInternalFrameImportacionEnfermedad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEnfermedad"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEnfermedad() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEnfermedad==null) {
				this.jInternalFrameReporteDinamicoEnfermedad=new ReporteDinamicoJInternalFrame(EnfermedadConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEnfermedad);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEnfermedad);
				this.jInternalFrameReporteDinamicoEnfermedad.setVisible(false);
				this.jInternalFrameReporteDinamicoEnfermedad.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEnfermedad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEnfermedad"));
				this.jInternalFrameReporteDinamicoEnfermedad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEnfermedad"));
				this.jInternalFrameReporteDinamicoEnfermedad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEnfermedad"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEnfermedad();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaEmpleadoEnfer() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoEnfer.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEnfermedad.jContentPaneDetalleEnfermedad.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoEnfer.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoEnfer.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoEnfer.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEnfermedad() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEnfermedad);
			
	       	this.jInternalFrameDetalleFormEnfermedad.setVisible(false);
	        this.jInternalFrameDetalleFormEnfermedad.setSelected(false);
			
			//this.jInternalFrameDetalleFormEnfermedad.dispose();
			//this.jInternalFrameDetalleFormEnfermedad=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEnfermedad() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEnfermedad.setVisible(true);
	        this.jInternalFrameReporteDinamicoEnfermedad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEnfermedad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEnfermedad.setVisible(true);
	        this.jInternalFrameImportacionEnfermedad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEnfermedad() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEnfermedad.setVisible(true);
	        this.jInternalFrameOrderByEnfermedad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEnfermedad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEnfermedad.setVisible(false);
	        this.jInternalFrameOrderByEnfermedad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEnfermedad() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEnfermedad.setVisible(false);
	        this.jInternalFrameReporteDinamicoEnfermedad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEnfermedad() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEnfermedad.setVisible(false);
	        this.jInternalFrameImportacionEnfermedad.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEnfermedad(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEnfermedad(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEnfermedad(true);
			//this.isEsNuevoEnfermedad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedad =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.enfermedad =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEnfermedad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEnfermedad(false) ;
			
			if(enfermedadSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenferSessionBean.getEsGuardarRelacionado() && EmpleadoEnferJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoEnferActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EnfermedadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEnfermedad(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEnfermedad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEnfermedadActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedad =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.enfermedad =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEnfermedad(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEnfermedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEnfermedad(true);
			//this.isEsNuevoEnfermedad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedad =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.enfermedad =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.enfermedad.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEnfermedad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEnfermedad(false) ;
			
			if(EnfermedadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEnfermedad(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEnfermedad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoEnfermedad(List<TipoEnfermedad> tipoenfermedadsForeignKey)throws Exception{
		TableColumn tableColumnTipoEnfermedad=this.jTableDatosEnfermedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEnfermedad,EnfermedadConstantesFunciones.LABEL_IDTIPOENFERMEDAD));
		TableCellEditor tableCellEditorTipoEnfermedad =tableColumnTipoEnfermedad.getCellEditor();

		TipoEnfermedadTableCell tipoenfermedadTableCellFk=(TipoEnfermedadTableCell)tableCellEditorTipoEnfermedad;

		if(tipoenfermedadTableCellFk!=null) {
			tipoenfermedadTableCellFk.settipoenfermedadsForeignKey(tipoenfermedadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEnfermedad.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoenfermedadTableCellFk.setRowActual(intSelectedRow);
			//tipoenfermedadTableCellFk.settipoenfermedadsForeignKeyActual(tipoenfermedadsForeignKey);
		//}


		if(tipoenfermedadTableCellFk!=null) {
			tipoenfermedadTableCellFk.RecargarTipoEnfermedadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEnfermedad(false);
			
			//if(!this.isEsNuevoEnfermedad) {								
				int intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedad =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.enfermedad =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEnfermedad(this.enfermedad,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(this.enfermedad);
				
			}
			
			if(this.permiteMantenimiento(this.enfermedad)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.enfermedadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEnfermedad=true;
					this.inicializarActualizarBindingTablaEnfermedad(false);
					this.isEsNuevoEnfermedad=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEnfermedad=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEnfermedad=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEnfermedad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEnfermedad(false);
				
				this.habilitarDeshabilitarControlesEnfermedad(false);
			
												
				
				if(EnfermedadJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEnfermedad();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEnfermedadActionPerformed(evt,enfermedadSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEnfermedad(this.enfermedad,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEnfermedad.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,enfermedadSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.enfermedad.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Enfermedad.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Enfermedad.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedad =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				this.enfermedad.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.enfermedad =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				this.enfermedad.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.enfermedad)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.enfermedadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EnfermedadModel) this.jTableDatosEnfermedad.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEnfermedad=true;
				this.inicializarActualizarBindingTablaEnfermedad(false);
				this.isEsNuevoEnfermedad=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEnfermedad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEnfermedad(false);
				
				this.habilitarDeshabilitarControlesEnfermedad(false);
				
				
				
				if(EnfermedadJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEnfermedad();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEnfermedadActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEnfermedad.getRowCount()>=1) {
				jTableDatosEnfermedad.removeRowSelectionInterval(0, jTableDatosEnfermedad.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEnfermedad(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEnfermedad(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEnfermedad(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEnfermedad(false) ;
			
			this.isEsNuevoEnfermedad=false;
			
			if(EnfermedadJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEnfermedad();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEnfermedadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEnfermedad(false);
				
				//SI ES MANUAL
				if(EnfermedadJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEnfermedad();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEnfermedadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEnfermedad--;			
			//Enfermedad enfermedadAux= new Enfermedad();			
			//enfermedadAux.setId(this.iIdNuevoEnfermedad);
			
			if(this.jInternalFrameDetalleFormEnfermedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEnfermedad();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(this.enfermedad);
			
			this.enfermedad.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.enfermedadLogic.getEnfermedads().add(this.enfermedadAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.enfermedads.add(this.enfermedadAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEnfermedad(false);
			
			this.jTableDatosEnfermedad.setRowSelectionInterval(this.getIndiceNuevoEnfermedad(), this.getIndiceNuevoEnfermedad());
			
			int iLastRow =  this.jTableDatosEnfermedad.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEnfermedad.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEnfermedad.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEnfermedad(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEnfermedadActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEnfermedad(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEnfermedad(false);
			
			//SI ES MANUAL
			if(EnfermedadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEnfermedad();
			}
			
			//this.abrirFrameTreeEnfermedad();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEnfermedadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE EnfermedadES ?", "MANTENIMIENTO DE Enfermedad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEnfermedad.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEnfermedad();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.enfermedadReturnGeneral=enfermedadLogic.procesarImportacionEnfermedadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.enfermedadParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEnfermedadReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEnfermedadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEnfermedad.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEnfermedad.setFileImportacion(this.jInternalFrameImportacionEnfermedad.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEnfermedad.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEnfermedad.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEnfermedad.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEnfermedad.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEnfermedadActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Enfermedad> enfermedadsSeleccionados=new ArrayList<Enfermedad>();		

		enfermedadsSeleccionados=this.getEnfermedadsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEnfermedad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEnfermedad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EnfermedadBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EnfermedadBaseDesign.jrxml";
			
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
			
			this.generarReporteEnfermedads("Todos",enfermedadsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.enfermedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Enfermedad",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEnfermedad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEnfermedad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EnfermedadConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EnfermedadConstantesFunciones.LABEL_IDTIPOENFERMEDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoEnfermedad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoEnfermedad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoEnfermedad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoEnfermedad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EnfermedadConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EnfermedadConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEnfermedad.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEnfermedad.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEnfermedad.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EnfermedadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EnfermedadConstantesFunciones.LABEL_IDTIPOENFERMEDAD:
					sNombreCampoCategoria="id_tipo_enfermedad";
					break;

				case EnfermedadConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case EnfermedadConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEnfermedad.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EnfermedadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EnfermedadConstantesFunciones.LABEL_IDTIPOENFERMEDAD:
					sNombreCampoCategoriaValor="id_tipo_enfermedad";
					break;

				case EnfermedadConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case EnfermedadConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEnfermedad.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEnfermedad.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EnfermedadConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EnfermedadConstantesFunciones.LABEL_IDTIPOENFERMEDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Enfermedad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_enfermedad");
					break;

				case EnfermedadConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case EnfermedadConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoEnfermedadActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Enfermedad> enfermedadsSeleccionados=new ArrayList<Enfermedad>();		
		
		enfermedadsSeleccionados=this.getEnfermedadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"enfermedad";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Enfermedads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEnfermedad.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEnfermedad.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EnfermedadConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EnfermedadConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Enfermedad enfermedad:enfermedadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(enfermedad.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EnfermedadConstantesFunciones.LABEL_IDTIPOENFERMEDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EnfermedadConstantesFunciones.LABEL_IDTIPOENFERMEDAD);
					iRow++;

					for(Enfermedad enfermedad:enfermedadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(enfermedad.gettipoenfermedad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EnfermedadConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EnfermedadConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Enfermedad enfermedad:enfermedadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(enfermedad.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EnfermedadConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EnfermedadConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Enfermedad enfermedad:enfermedadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(enfermedad.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelEnfermedad(row);				
			//	iRow++;
			//}				
			
			//for(Enfermedad enfermedadAux:enfermedadsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEnfermedad(enfermedadAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.enfermedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Enfermedad",JOptionPane.INFORMATION_MESSAGE);
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
				this.enfermedadLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEnfermedad(false);
			
			//SI ES MANUAL
			if(EnfermedadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEnfermedad();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEnfermedadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEnfermedad(false);
			
			//SI ES MANUAL
			if(EnfermedadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEnfermedad();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEnfermedadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEnfermedad(false);
			
			//SI ES MANUAL
			if(EnfermedadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEnfermedad();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEnfermedad() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEnfermedad.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEnfermedad.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEnfermedad.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEnfermedad.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEnfermedad.setMinimumSize(dimensionMinimum);
		this.jTableDatosEnfermedad.setMaximumSize(dimensionMaximum);
		this.jTableDatosEnfermedad.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEnfermedad(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEnfermedad(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEnfermedad(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEnfermedad(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEnfermedad(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEnfermedad(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEnfermedad(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEnfermedad(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EnfermedadJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEnfermedad() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEnfermedad();
		
		this.inicializarActualizarBindingBotonesManualEnfermedad(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEnfermedad();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEnfermedad() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEnfermedad(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEnfermedad(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEnfermedad.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEnfermedad.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEnfermedad.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEnfermedad!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEnfermedad.jCheckBoxPostAccionNuevoEnfermedad.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEnfermedad.jCheckBoxPostAccionSinCerrarEnfermedad.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEnfermedad.jCheckBoxPostAccionSinMensajeEnfermedad.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEnfermedad.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEnfermedad.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEnfermedad.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEnfermedad!=null) {
				this.jInternalFrameDetalleFormEnfermedad.jCheckBoxPostAccionNuevoEnfermedad.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEnfermedad.jCheckBoxPostAccionSinCerrarEnfermedad.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEnfermedad.jCheckBoxPostAccionSinMensajeEnfermedad.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEnfermedad.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEnfermedad.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEnfermedad!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEnfermedad.jComboBoxTiposAccionesFormularioEnfermedad.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEnfermedad.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEnfermedad!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEnfermedad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEnfermedad.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEnfermedad.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEnfermedad.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEnfermedad.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEnfermedad!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEnfermedad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEnfermedad.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEnfermedad.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEnfermedad(Boolean esInicializar) throws Exception {
		try	{	
			if(EnfermedadJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEnfermedad(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEnfermedad() throws Exception {
		try	{
			if(EnfermedadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEnfermedad();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEnfermedad() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEnfermedad.jComboBoxTiposAccionesFormularioEnfermedad.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEnfermedad.jComboBoxTiposAccionesFormularioEnfermedad.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEnfermedad() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEnfermedad.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEnfermedad.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEnfermedad.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEnfermedad.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEnfermedad.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEnfermedad.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEnfermedad.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEnfermedad.addItem(reporte);
			}
			
			
			if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEnfermedad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEnfermedad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEnfermedad.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEnfermedad.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEnfermedad.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEnfermedad.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEnfermedad!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEnfermedad.jComboBoxTiposAccionesFormularioEnfermedad.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEnfermedad.jComboBoxTiposAccionesFormularioEnfermedad.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEnfermedad.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEnfermedad.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEnfermedad.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEnfermedad();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEnfermedad() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEnfermedad!=null) {
				this.jInternalFrameReporteDinamicoEnfermedad.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEnfermedad.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEnfermedad!=null) {
				this.jInternalFrameReporteDinamicoEnfermedad.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEnfermedad.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEnfermedad!=null) {
				
				if(this.jInternalFrameReporteDinamicoEnfermedad.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEnfermedad.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEnfermedad.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEnfermedad.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEnfermedad.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEnfermedad.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEnfermedad()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad.getSelectedItem()!=null){this.id_tipo_enfermedadFK_IdTipoEnfermedad=((TipoEnfermedad)this.jComboBoxid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEnfermedad(Boolean esInicializar) throws Exception {				
		if(EnfermedadJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEnfermedad();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEnfermedad() throws Exception {
		this.inicializarActualizarBindingTablaEnfermedad(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEnfermedad() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEnfermedad.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEnfermedad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEnfermedad.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EnfermedadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEnfermedad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEnfermedad.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EnfermedadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEnfermedadOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEnfermedadOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EnfermedadPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEnfermedad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEnfermedad.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EnfermedadPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEnfermedad.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEnfermedad(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=enfermedadLogic.getEnfermedads().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=enfermedads.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEnfermedad.setModel(new EnfermedadModel(this.enfermedadLogic.getEnfermedads(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEnfermedad.setModel(new EnfermedadModel(this.enfermedads,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEnfermedad!=null && this.jInternalFrameOrderByEnfermedad.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEnfermedad();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEnfermedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEnfermedad,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EnfermedadPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EnfermedadConstantesFunciones.SCLASSWEBTITULO,enfermedadConstantesFunciones.resaltarSeleccionarEnfermedad,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EnfermedadConstantesFunciones.SCLASSWEBTITULO,enfermedadConstantesFunciones.resaltarSeleccionarEnfermedad,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEnfermedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEnfermedad,EnfermedadConstantesFunciones.LABEL_ID));

		if(this.enfermedadConstantesFunciones.mostraridEnfermedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EnfermedadConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.enfermedadConstantesFunciones.resaltaridEnfermedad,this.enfermedadConstantesFunciones.activaridEnfermedad,this,true,"idEnfermedad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.enfermedadConstantesFunciones.resaltaridEnfermedad,this.enfermedadConstantesFunciones.activaridEnfermedad,this,true,"idEnfermedad","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEnfermedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEnfermedad,EnfermedadConstantesFunciones.LABEL_IDEMPRESA));

		if(this.enfermedadConstantesFunciones.mostrarid_empresaEnfermedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EnfermedadConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.enfermedadConstantesFunciones.resaltarid_empresaEnfermedad,this,this.enfermedadConstantesFunciones.activarid_empresaEnfermedad));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.enfermedadConstantesFunciones.resaltarid_empresaEnfermedad,this,this.enfermedadConstantesFunciones.activarid_empresaEnfermedad,false,"id_empresaEnfermedad","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EnfermedadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEnfermedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEnfermedad,EnfermedadConstantesFunciones.LABEL_IDTIPOENFERMEDAD));

		if(this.enfermedadConstantesFunciones.mostrarid_tipo_enfermedadEnfermedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EnfermedadConstantesFunciones.LABEL_IDTIPOENFERMEDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoEnfermedadTableCell(this.tipoenfermedadsForeignKey,this.enfermedadConstantesFunciones.resaltarid_tipo_enfermedadEnfermedad,this,this.enfermedadConstantesFunciones.activarid_tipo_enfermedadEnfermedad));
			tableColumn.setCellEditor(new TipoEnfermedadTableCell(this.tipoenfermedadsForeignKey,this.enfermedadConstantesFunciones.resaltarid_tipo_enfermedadEnfermedad,this,this.enfermedadConstantesFunciones.activarid_tipo_enfermedadEnfermedad,true,"id_tipo_enfermedadEnfermedad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EnfermedadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEnfermedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEnfermedad,EnfermedadConstantesFunciones.LABEL_NOMBRE));

		if(this.enfermedadConstantesFunciones.mostrarnombreEnfermedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EnfermedadConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.enfermedadConstantesFunciones.resaltarnombreEnfermedad,this.enfermedadConstantesFunciones.activarnombreEnfermedad,this,true,"nombreEnfermedad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.enfermedadConstantesFunciones.resaltarnombreEnfermedad,this.enfermedadConstantesFunciones.activarnombreEnfermedad,this,true,"nombreEnfermedad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EnfermedadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEnfermedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEnfermedad,EnfermedadConstantesFunciones.LABEL_DESCRIPCION));

		if(this.enfermedadConstantesFunciones.mostrardescripcionEnfermedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EnfermedadConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.enfermedadConstantesFunciones.resaltardescripcionEnfermedad,this.enfermedadConstantesFunciones.activardescripcionEnfermedad,this,true,"descripcionEnfermedad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.enfermedadConstantesFunciones.resaltardescripcionEnfermedad,this.enfermedadConstantesFunciones.activardescripcionEnfermedad,this,true,"descripcionEnfermedad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EnfermedadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.enfermedadSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosEmpleadoEnfer && this.enfermedadConstantesFunciones.mostrarEmpleadoEnferEnfermedad && !EnfermedadConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Empleado Enferes");
				tableColumn.setHeaderValue("Empleado Enferes");
				tableColumn.setCellRenderer(new EmpleadoEnferTableCell(enfermedadConstantesFunciones.resaltarEmpleadoEnferEnfermedad,this,this.enfermedadConstantesFunciones.activarEmpleadoEnferEnfermedad));
				tableColumn.setCellEditor(new EmpleadoEnferTableCell(enfermedadConstantesFunciones.resaltarEmpleadoEnferEnfermedad,this,this.enfermedadConstantesFunciones.activarEmpleadoEnferEnfermedad));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEnfermedad.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.enfermedadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.enfermedadSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEnfermedad.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.enfermedadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.enfermedadSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEnfermedad.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEnfermedad && this.isPermisoGuardarCambiosEnfermedad) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.enfermedadSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.enfermedadSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEnfermedad.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.enfermedadSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEnfermedad.addColumn(tableColumn);
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
			
			this.jTableDatosEnfermedad.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEnfermedad && this.isPermisoGuardarCambiosEnfermedad) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.enfermedadSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEnfermedad && this.isPermisoGuardarCambiosEnfermedad) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEnfermedad.moveColumn(this.jTableDatosEnfermedad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEnfermedad.moveColumn(this.jTableDatosEnfermedad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.enfermedadSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEnfermedad.moveColumn(this.jTableDatosEnfermedad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEnfermedad.moveColumn(this.jTableDatosEnfermedad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEnfermedad.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEnfermedad.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEnfermedad,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEnfermedad.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEnfermedad.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEnfermedad.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEnfermedad.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEnfermedad.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=enfermedadLogic.getEnfermedads().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=enfermedads.size()-1;
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
		//this.jTableDatosEnfermedad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEnfermedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEnfermedad();
			
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
				
				//this.isEsNuevoEnfermedad=false;
					
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
			
				if(this.enfermedadSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEnfermedad==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEnfermedad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEnfermedad.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedad =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.enfermedad =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.enfermedad.getsType().equals("DUPLICADO")
				   || this.enfermedad.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEnfermedad=true;
				
				} else {
					this.isEsNuevoEnfermedad=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {
					if(this.enfermedad.getId()>=0 && !this.enfermedad.getIsNew()) {						
						this.isEsNuevoEnfermedad=false;
						
					} else {
						this.isEsNuevoEnfermedad=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEnfermedad(esRelaciones);						
				
				this.seleccionarEnfermedad(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.enfermedad.getId()<0) {
					this.isEsNuevoEnfermedad=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEnfermedad(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEnfermedad(evt,rowIndex);
				}	
				
				if(this.enfermedadSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Enfermedad: " + this.dDif); 
					}
				}								
				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEnfermedad(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.enfermedad)) {
					if(this.enfermedad.getId()>0) {
						this.enfermedad.setIsDeleted(true);
						
						this.enfermedadsEliminados.add(this.enfermedad);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.enfermedadLogic.getEnfermedads().remove(this.enfermedad);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.enfermedads.remove(this.enfermedad);				
					}
					
					
					((EnfermedadModel) this.jTableDatosEnfermedad.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEnfermedad(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEnfermedad(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEnfermedad) {
			
			if(this.jInternalFrameDetalleFormEnfermedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEnfermedad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEnfermedad.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedad =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.enfermedad =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEnfermedad(this.enfermedad);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.enfermedadConstantesFunciones.cargarid_empresaEnfermedad || this.enfermedadConstantesFunciones.event_dependid_empresaEnfermedad) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.enfermedad.getid_empresa());
									//this.inicializarActualizarBindingEnfermedad(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(enfermedad.getEmpresa()!=null) {
							this.empresasForeignKey.add(enfermedad.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.enfermedad.getid_empresa(),false,"Formulario");

					//TipoEnfermedad
					if(!this.enfermedadConstantesFunciones.cargarid_tipo_enfermedadEnfermedad || this.enfermedadConstantesFunciones.event_dependid_tipo_enfermedadEnfermedad) {
						//this.cargarCombosTipoEnfermedadsForeignKeyLista(" where id="+this.enfermedad.getid_tipo_enfermedad());
									//this.inicializarActualizarBindingEnfermedad(false,false);
						this.tipoenfermedadsForeignKey=new ArrayList<TipoEnfermedad>();

						if(enfermedad.getTipoEnfermedad()!=null) {
							this.tipoenfermedadsForeignKey.add(enfermedad.getTipoEnfermedad());
						}

						this.addItemDefectoCombosForeignKeyTipoEnfermedad();
						this.cargarCombosFrameTipoEnfermedadsForeignKey("Todos");
					}
					this.setActualTipoEnfermedadForeignKey(this.enfermedad.getid_tipo_enfermedad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEnfermedad("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEnfermedad(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEnfermedad() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEnfermedad(Enfermedad enfermedad) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEnfermedad(enfermedad,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEnfermedad(Enfermedad enfermedad,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEnfermedad(enfermedad);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEnfermedad(enfermedad,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEnfermedad(enfermedad);
	}
	
	public void setVariablesObjetoActualToFormularioEnfermedad(Enfermedad enfermedad) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEnfermedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEnfermedad.jLabelidEnfermedad.setText(enfermedad.getId().toString());
			this.jInternalFrameDetalleFormEnfermedad.jTextAreanombreEnfermedad.setText(enfermedad.getnombre());
			this.jInternalFrameDetalleFormEnfermedad.jTextAreadescripcionEnfermedad.setText(enfermedad.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Enfermedad enfermedadLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,enfermedadLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Enfermedad enfermedadLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				enfermedadLocal=this.enfermedad;
			} else {
				enfermedadLocal=this.enfermedadAnterior;
			}
		}
		
		if(this.permiteMantenimiento(enfermedadLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEnfermedad(enfermedadLocal,true);
					
					if(enfermedadSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(enfermedadLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.enfermedadSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(enfermedadLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEnfermedad(Enfermedad enfermedad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEnfermedad(enfermedad,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(enfermedad);
	}
	
	public void setVariablesFormularioToObjetoActualEnfermedad(Enfermedad enfermedad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEnfermedad(enfermedad,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEnfermedad(Enfermedad enfermedad,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEnfermedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEnfermedad.jLabelidEnfermedad.getText()==null || this.jInternalFrameDetalleFormEnfermedad.jLabelidEnfermedad.getText()=="" || this.jInternalFrameDetalleFormEnfermedad.jLabelidEnfermedad.getText()=="Id") {
				this.jInternalFrameDetalleFormEnfermedad.jLabelidEnfermedad.setText("0");
			}

			if(conColumnasBase) {enfermedad.setId(Long.parseLong(this.jInternalFrameDetalleFormEnfermedad.jLabelidEnfermedad.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EnfermedadConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEnfermedad.jLabelIdEnfermedad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			enfermedad.setnombre(this.jInternalFrameDetalleFormEnfermedad.jTextAreanombreEnfermedad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EnfermedadConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEnfermedad.jLabelnombreEnfermedad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			enfermedad.setdescripcion(this.jInternalFrameDetalleFormEnfermedad.jTextAreadescripcionEnfermedad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EnfermedadConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEnfermedad.jLabeldescripcionEnfermedad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEnfermedad(Enfermedad enfermedadBean,Enfermedad enfermedad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && enfermedadBean.getid_tipo_enfermedad()!=null && !enfermedadBean.getid_tipo_enfermedad().equals(-1L))) {enfermedad.setid_tipo_enfermedad(enfermedadBean.getid_tipo_enfermedad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEnfermedad(Enfermedad enfermedadOrigen,Enfermedad enfermedad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && enfermedadOrigen.getId()!=null && !enfermedadOrigen.getId().equals(0L))) {enfermedad.setId(enfermedadOrigen.getId());}}
			if(conDefault || (!conDefault && enfermedadOrigen.getid_tipo_enfermedad()!=null && !enfermedadOrigen.getid_tipo_enfermedad().equals(-1L))) {enfermedad.setid_tipo_enfermedad(enfermedadOrigen.getid_tipo_enfermedad());}
			if(conDefault || (!conDefault && enfermedadOrigen.getnombre()!=null && !enfermedadOrigen.getnombre().equals(""))) {enfermedad.setnombre(enfermedadOrigen.getnombre());}
			if(conDefault || (!conDefault && enfermedadOrigen.getdescripcion()!=null && !enfermedadOrigen.getdescripcion().equals(""))) {enfermedad.setdescripcion(enfermedadOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEnfermedad(Enfermedad enfermedad) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEnfermedad.jLabelidEnfermedad.setText(enfermedad.getId().toString());
			this.jInternalFrameDetalleFormEnfermedad.jTextAreanombreEnfermedad.setText(enfermedad.getnombre());
			this.jInternalFrameDetalleFormEnfermedad.jTextAreadescripcionEnfermedad.setText(enfermedad.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEnfermedad(EnfermedadBean enfermedadBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEnfermedad.jLabelidEnfermedad.setText(enfermedadBean.getId().toString());
			this.jInternalFrameDetalleFormEnfermedad.jTextAreanombreEnfermedad.setText(enfermedadBean.getnombre());
			this.jInternalFrameDetalleFormEnfermedad.jTextAreadescripcionEnfermedad.setText(enfermedadBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEnfermedad(EnfermedadParameterReturnGeneral enfermedadReturnGeneral,EnfermedadBean enfermedadBean,Boolean conDefault) throws Exception { 
		try {
			Enfermedad enfermedadLocal=new Enfermedad();
			
			enfermedadLocal=enfermedadReturnGeneral.getEnfermedad();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && enfermedadLocal.getId()!=null && !enfermedadLocal.getId().equals(0L))) {enfermedadBean.setId(enfermedadLocal.getId());}}
			if(conDefault || (!conDefault && enfermedadLocal.getid_tipo_enfermedad()!=null && !enfermedadLocal.getid_tipo_enfermedad().equals(-1L))) {enfermedadBean.setid_tipo_enfermedad(enfermedadLocal.getid_tipo_enfermedad());}
			if(conDefault || (!conDefault && enfermedadLocal.getnombre()!=null && !enfermedadLocal.getnombre().equals(""))) {enfermedadBean.setnombre(enfermedadLocal.getnombre());}
			if(conDefault || (!conDefault && enfermedadLocal.getdescripcion()!=null && !enfermedadLocal.getdescripcion().equals(""))) {enfermedadBean.setdescripcion(enfermedadLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEnfermedadGenerico(Long idEnfermedadSeleccionado,JComboBox jComboBoxEnfermedad,List<Enfermedad> enfermedadsLocal)throws Exception {
		try {
			Enfermedad  enfermedadTemp=null;

			for(Enfermedad enfermedadAux:enfermedadsLocal) {
				if(enfermedadAux.getId()!=null && enfermedadAux.getId().equals(idEnfermedadSeleccionado)) {
					enfermedadTemp=enfermedadAux;
					break;
				}
			}

			jComboBoxEnfermedad.setSelectedItem(enfermedadTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEnfermedadGenerico(JComboBox jComboBoxEnfermedad,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEnfermedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEnfermedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEnfermedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEnfermedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEnfermedad.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEnfermedad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEnfermedad.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEnfermedad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEnfermedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEnfermedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("EmpleadoEnfer")) {
			jButtonEmpleadoEnferActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			enfermedad=(Enfermedad) enfermedadLogic.getEnfermedads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			enfermedad =(Enfermedad) enfermedads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!enfermedad.getIsNew() && !enfermedad.getIsChanged() && !enfermedad.getIsDeleted()) {
				sDescripcion=enfermedad.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=enfermedad.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoEnfermedad")) {
			//sDescripcion=this.getActualTipoEnfermedadForeignKeyDescripcion((Long)value);
			if(!enfermedad.getIsNew() && !enfermedad.getIsChanged() && !enfermedad.getIsDeleted()) {
				sDescripcion=enfermedad.gettipoenfermedad_descripcion();
			} else {
				//sDescripcion=this.getActualTipoEnfermedadForeignKeyDescripcion((Long)value);
				sDescripcion=enfermedad.gettipoenfermedad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Enfermedad enfermedadRow=new Enfermedad();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			enfermedadRow=(Enfermedad) enfermedadLogic.getEnfermedads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			enfermedadRow=(Enfermedad) enfermedads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonEmpleadoEnferActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Enfermedad enfermedad) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEnfermedad==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.enfermedad = (Enfermedad)this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.enfermedad = (Enfermedad)this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(enfermedad!=null) {
						this.enfermedad = enfermedad;
					} else {
						this.enfermedad = new Enfermedad();
					}
				}

				if(this.isTienePermisosEmpleadoEnfer && this.permiteMantenimiento(this.enfermedad)) {
					EmpleadoEnferBeanSwingJInternalFrame empleadoenferBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFramePopup=new EmpleadoEnferBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						empleadoenferBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFramePopup;
					} else {
						empleadoenferBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame;
					}

					List<Enfermedad> enfermedads=new ArrayList<Enfermedad>();
					enfermedads.add(this.enfermedad);
					if(!esRelacionado) {
						//empleadoenferBeanSwingJInternalFrame.empleadoenferSessionBean.setConGuardarRelaciones(false);
						//empleadoenferBeanSwingJInternalFrame.empleadoenferSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					empleadoenferBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEnfermedad.cargarEmpleadoEnferBeanSwingJInternalFrame(enfermedads,this.enfermedad,empleadoenferBeanSwingJInternalFrame,/*conInicializar,*/empleadoenferBeanSwingJInternalFrame.empleadoenferSessionBean.getConGuardarRelaciones(),empleadoenferBeanSwingJInternalFrame.empleadoenferSessionBean.getEsGuardarRelacionado());
					empleadoenferBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						empleadoenferBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoEnfer("no_relacionado");

						empleadoenferBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EmpleadoEnferConstantesFunciones.ITAMANIOFILATABLA + (EmpleadoEnferConstantesFunciones.ITAMANIOFILATABLA/2));

						empleadoenferBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEnfermedad=(TitledBorder)this.jScrollPanelDatosEnfermedad.getBorder();
						TitledBorder titledBorderEmpleadoEnfer=(TitledBorder)empleadoenferBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoEnfer.getBorder();

						titledBorderEmpleadoEnfer.setTitle(titledBorderEnfermedad.getTitle() + " -> Empleado Enfer");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,empleadoenferBeanSwingJInternalFrame);
						}

						empleadoenferBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(empleadoenferBeanSwingJInternalFrame);

						empleadoenferBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.enfermedadSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Empleado Enfer",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEnfermedad(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEnfermedad.setVisible((this.isVisibilidadCeldaNuevoEnfermedad && this.isPermisoNuevoEnfermedad));			
			this.jButtonDuplicarEnfermedad.setVisible((this.isVisibilidadCeldaDuplicarEnfermedad && this.isPermisoDuplicarEnfermedad));			
			this.jButtonCopiarEnfermedad.setVisible((this.isVisibilidadCeldaCopiarEnfermedad && this.isPermisoCopiarEnfermedad));
			this.jButtonVerFormEnfermedad.setVisible((this.isVisibilidadCeldaVerFormEnfermedad && this.isPermisoVerFormEnfermedad));
			
			this.jButtonAbrirOrderByEnfermedad.setVisible((this.isVisibilidadCeldaOrdenEnfermedad && this.isPermisoOrdenEnfermedad));			
			
			this.jButtonNuevoRelacionesEnfermedad.setVisible((this.isVisibilidadCeldaNuevoRelacionesEnfermedad && this.isPermisoNuevoEnfermedad));			
			this.jButtonNuevoGuardarCambiosEnfermedad.setVisible((this.isVisibilidadCeldaNuevoEnfermedad && this.isPermisoNuevoEnfermedad && this.isPermisoGuardarCambiosEnfermedad));
			
			if(this.jInternalFrameDetalleFormEnfermedad!=null) {
			this.jInternalFrameDetalleFormEnfermedad.jButtonModificarEnfermedad.setVisible((this.isVisibilidadCeldaModificarEnfermedad && this.isPermisoActualizarEnfermedad));	
			this.jInternalFrameDetalleFormEnfermedad.jButtonActualizarEnfermedad.setVisible((this.isVisibilidadCeldaActualizarEnfermedad && this.isPermisoActualizarEnfermedad));	
			this.jInternalFrameDetalleFormEnfermedad.jButtonEliminarEnfermedad.setVisible((this.isVisibilidadCeldaEliminarEnfermedad && this.isPermisoEliminarEnfermedad));
			this.jInternalFrameDetalleFormEnfermedad.jButtonCancelarEnfermedad.setVisible(this.isVisibilidadCeldaCancelarEnfermedad);							
			this.jInternalFrameDetalleFormEnfermedad.jButtonGuardarCambiosEnfermedad.setVisible((this.isVisibilidadCeldaGuardarEnfermedad && this.isPermisoGuardarCambiosEnfermedad));			
			
			}
						
			this.jButtonGuardarCambiosTablaEnfermedad.setVisible((this.isVisibilidadCeldaGuardarCambiosEnfermedad && this.isPermisoGuardarCambiosEnfermedad));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEnfermedad.setVisible((this.isVisibilidadCeldaNuevoEnfermedad && this.isPermisoNuevoEnfermedad));						
			this.jButtonDuplicarToolBarEnfermedad.setVisible((this.isVisibilidadCeldaDuplicarEnfermedad && this.isPermisoDuplicarEnfermedad));						
			this.jButtonCopiarToolBarEnfermedad.setVisible((this.isVisibilidadCeldaCopiarEnfermedad && this.isPermisoCopiarEnfermedad));			
			this.jButtonVerFormToolBarEnfermedad.setVisible((this.isVisibilidadCeldaVerFormEnfermedad && this.isPermisoVerFormEnfermedad));			
			this.jButtonAbrirOrderByToolBarEnfermedad.setVisible((this.isVisibilidadCeldaOrdenEnfermedad && this.isPermisoOrdenEnfermedad));
			this.jButtonNuevoRelacionesToolBarEnfermedad.setVisible((this.isVisibilidadCeldaNuevoRelacionesEnfermedad && this.isPermisoNuevoEnfermedad));			
			this.jButtonNuevoGuardarCambiosToolBarEnfermedad.setVisible((this.isVisibilidadCeldaNuevoEnfermedad && this.isPermisoNuevoEnfermedad && this.isPermisoGuardarCambiosEnfermedad));			
			
			if(this.jInternalFrameDetalleFormEnfermedad!=null) {
			this.jInternalFrameDetalleFormEnfermedad.jButtonModificarToolBarEnfermedad.setVisible((this.isVisibilidadCeldaModificarEnfermedad && this.isPermisoActualizarEnfermedad));	
			this.jInternalFrameDetalleFormEnfermedad.jButtonActualizarToolBarEnfermedad.setVisible((this.isVisibilidadCeldaActualizarEnfermedad  && this.isPermisoActualizarEnfermedad));	
			this.jInternalFrameDetalleFormEnfermedad.jButtonEliminarToolBarEnfermedad.setVisible((this.isVisibilidadCeldaEliminarEnfermedad && this.isPermisoEliminarEnfermedad));
			this.jInternalFrameDetalleFormEnfermedad.jButtonCancelarToolBarEnfermedad.setVisible(this.isVisibilidadCeldaCancelarEnfermedad);				
			this.jInternalFrameDetalleFormEnfermedad.jButtonGuardarCambiosToolBarEnfermedad.setVisible((this.isVisibilidadCeldaGuardarEnfermedad && this.isPermisoGuardarCambiosEnfermedad));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEnfermedad.setVisible((this.isVisibilidadCeldaGuardarCambiosEnfermedad && this.isPermisoGuardarCambiosEnfermedad));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEnfermedad.setVisible((this.isVisibilidadCeldaNuevoEnfermedad && this.isPermisoNuevoEnfermedad));			
			this.jMenuItemDuplicarEnfermedad.setVisible((this.isVisibilidadCeldaDuplicarEnfermedad && this.isPermisoDuplicarEnfermedad));			
			this.jMenuItemCopiarEnfermedad.setVisible((this.isVisibilidadCeldaCopiarEnfermedad && this.isPermisoCopiarEnfermedad));			
			this.jMenuItemVerFormEnfermedad.setVisible((this.isVisibilidadCeldaVerFormEnfermedad && this.isPermisoVerFormEnfermedad));			
			this.jMenuItemAbrirOrderByEnfermedad.setVisible((this.isVisibilidadCeldaOrdenEnfermedad && this.isPermisoOrdenEnfermedad));			
			//this.jMenuItemMostrarOcultarEnfermedad.setVisible((this.isVisibilidadCeldaOrdenEnfermedad && this.isPermisoOrdenEnfermedad));
			this.jMenuItemDetalleAbrirOrderByEnfermedad.setVisible((this.isVisibilidadCeldaOrdenEnfermedad && this.isPermisoOrdenEnfermedad));			
			//this.jMenuItemDetalleMostrarOcultarEnfermedad.setVisible((this.isVisibilidadCeldaOrdenEnfermedad && this.isPermisoOrdenEnfermedad));			
			this.jMenuItemNuevoRelacionesEnfermedad.setVisible((this.isVisibilidadCeldaNuevoRelacionesEnfermedad && this.isPermisoNuevoEnfermedad));			
			this.jMenuItemNuevoGuardarCambiosEnfermedad.setVisible((this.isVisibilidadCeldaNuevoEnfermedad && this.isPermisoNuevoEnfermedad && this.isPermisoGuardarCambiosEnfermedad));									
			
			if(this.jInternalFrameDetalleFormEnfermedad!=null) {
			this.jInternalFrameDetalleFormEnfermedad.jMenuItemModificarEnfermedad.setVisible((this.isVisibilidadCeldaModificarEnfermedad && this.isPermisoActualizarEnfermedad));	
			this.jInternalFrameDetalleFormEnfermedad.jMenuItemActualizarEnfermedad.setVisible((this.isVisibilidadCeldaActualizarEnfermedad && this.isPermisoActualizarEnfermedad));	
			this.jInternalFrameDetalleFormEnfermedad.jMenuItemEliminarEnfermedad.setVisible((this.isVisibilidadCeldaEliminarEnfermedad && this.isPermisoEliminarEnfermedad));
			this.jInternalFrameDetalleFormEnfermedad.jMenuItemCancelarEnfermedad.setVisible(this.isVisibilidadCeldaCancelarEnfermedad);				
			}
			
			this.jMenuItemGuardarCambiosEnfermedad.setVisible((this.isVisibilidadCeldaGuardarEnfermedad && this.isPermisoGuardarCambiosEnfermedad));						
			this.jMenuItemGuardarCambiosTablaEnfermedad.setVisible((this.isVisibilidadCeldaGuardarCambiosEnfermedad && this.isPermisoGuardarCambiosEnfermedad));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEnfermedad=this.jButtonNuevoEnfermedad.isVisible();
			this.isVisibilidadCeldaDuplicarEnfermedad=this.jButtonDuplicarEnfermedad.isVisible();
			this.isVisibilidadCeldaCopiarEnfermedad=this.jButtonCopiarEnfermedad.isVisible();
			this.isVisibilidadCeldaVerFormEnfermedad=this.jButtonVerFormEnfermedad.isVisible();
			
			this.isVisibilidadCeldaOrdenEnfermedad=this.jButtonAbrirOrderByEnfermedad.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEnfermedad=this.jButtonNuevoRelacionesEnfermedad.isVisible();
			this.isVisibilidadCeldaModificarEnfermedad=this.jButtonModificarEnfermedad.isVisible();
			
			if(this.jInternalFrameDetalleFormEnfermedad!=null) {
			this.isVisibilidadCeldaActualizarEnfermedad=this.jInternalFrameDetalleFormEnfermedad.jButtonActualizarEnfermedad.isVisible();
			this.isVisibilidadCeldaEliminarEnfermedad=this.jInternalFrameDetalleFormEnfermedad.jButtonEliminarEnfermedad.isVisible();
			this.isVisibilidadCeldaCancelarEnfermedad=this.jInternalFrameDetalleFormEnfermedad.jButtonCancelarEnfermedad.isVisible();
			this.isVisibilidadCeldaGuardarEnfermedad=this.jInternalFrameDetalleFormEnfermedad.jButtonGuardarCambiosEnfermedad.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEnfermedad=this.jButtonGuardarCambiosTablaEnfermedad.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEnfermedad=this.jButtonNuevoToolBarEnfermedad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEnfermedad=this.jButtonNuevoRelacionesToolBarEnfermedad.isVisible();
			
			if(this.jInternalFrameDetalleFormEnfermedad!=null) {
			this.isVisibilidadCeldaModificarEnfermedad=this.jInternalFrameDetalleFormEnfermedad.jButtonModificarToolBarEnfermedad.isVisible();
			this.isVisibilidadCeldaActualizarEnfermedad=this.jInternalFrameDetalleFormEnfermedad.jButtonActualizarToolBarEnfermedad.isVisible();
			this.isVisibilidadCeldaEliminarEnfermedad=this.jInternalFrameDetalleFormEnfermedad.jButtonEliminarToolBarEnfermedad.isVisible();
			this.isVisibilidadCeldaCancelarEnfermedad=this.jInternalFrameDetalleFormEnfermedad.jButtonCancelarToolBarEnfermedad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEnfermedad=this.jButtonGuardarCambiosToolBarEnfermedad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEnfermedad=this.jButtonGuardarCambiosTablaToolBarEnfermedad.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEnfermedad=this.jMenuItemNuevoEnfermedad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEnfermedad=this.jMenuItemNuevoRelacionesEnfermedad.isVisible();
			
			if(this.jInternalFrameDetalleFormEnfermedad!=null) {
			this.isVisibilidadCeldaModificarEnfermedad=this.jInternalFrameDetalleFormEnfermedad.jMenuItemModificarEnfermedad.isVisible();
			this.isVisibilidadCeldaActualizarEnfermedad=this.jInternalFrameDetalleFormEnfermedad.jMenuItemActualizarEnfermedad.isVisible();
			this.isVisibilidadCeldaEliminarEnfermedad=this.jInternalFrameDetalleFormEnfermedad.jMenuItemEliminarEnfermedad.isVisible();
			this.isVisibilidadCeldaCancelarEnfermedad=this.jInternalFrameDetalleFormEnfermedad.jMenuItemCancelarEnfermedad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEnfermedad=this.jMenuItemGuardarCambiosEnfermedad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEnfermedad=this.jMenuItemGuardarCambiosTablaEnfermedad.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEnfermedad(Boolean esInicializar) {
		if(EnfermedadJInternalFrame.ISBINDING_MANUAL) {			
			if(this.enfermedadSessionBean.getConGuardarRelaciones()) {
				//if(this.enfermedadSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEnfermedad();
			}
			
			this.inicializarActualizarBindingBotonesManualEnfermedad(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEnfermedad() {
		this.jButtonNuevoEnfermedad.setVisible(this.isPermisoNuevoEnfermedad);			
		this.jButtonDuplicarEnfermedad.setVisible(this.isPermisoDuplicarEnfermedad);			
		this.jButtonCopiarEnfermedad.setVisible(this.isPermisoCopiarEnfermedad);			
		this.jButtonVerFormEnfermedad.setVisible(this.isPermisoVerFormEnfermedad);			
		
		this.jButtonAbrirOrderByEnfermedad.setVisible(this.isPermisoOrdenEnfermedad);					
		
		this.jButtonNuevoRelacionesEnfermedad.setVisible(this.isPermisoNuevoEnfermedad);			
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEnfermedad.jButtonModificarEnfermedad.setVisible(this.isPermisoActualizarEnfermedad);	
			this.jInternalFrameDetalleFormEnfermedad.jButtonActualizarEnfermedad.setVisible(this.isPermisoActualizarEnfermedad);	
			this.jInternalFrameDetalleFormEnfermedad.jButtonEliminarEnfermedad.setVisible(this.isPermisoEliminarEnfermedad);
			this.jInternalFrameDetalleFormEnfermedad.jButtonCancelarEnfermedad.setVisible(this.isVisibilidadCeldaCancelarEnfermedad);						
			this.jInternalFrameDetalleFormEnfermedad.jButtonGuardarCambiosEnfermedad.setVisible(this.isPermisoGuardarCambiosEnfermedad);							
		}
		
		this.jButtonGuardarCambiosTablaEnfermedad.setVisible(this.isPermisoActualizarEnfermedad);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEnfermedad() {
		this.jInternalFrameDetalleFormEnfermedad.jButtonModificarEnfermedad.setVisible(this.isPermisoActualizarEnfermedad);	
		this.jInternalFrameDetalleFormEnfermedad.jButtonActualizarEnfermedad.setVisible(this.isPermisoActualizarEnfermedad);	
		this.jInternalFrameDetalleFormEnfermedad.jButtonEliminarEnfermedad.setVisible(this.isPermisoEliminarEnfermedad);
		this.jInternalFrameDetalleFormEnfermedad.jButtonCancelarEnfermedad.setVisible(this.isVisibilidadCeldaCancelarEnfermedad);							
		this.jInternalFrameDetalleFormEnfermedad.jButtonGuardarCambiosEnfermedad.setVisible((this.isVisibilidadCeldaGuardarEnfermedad && this.isPermisoGuardarCambiosEnfermedad));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEnfermedad() {
		if(EnfermedadJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEnfermedad();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEnfermedad() {
	}
	
	public void jTableDatosEnfermedadListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEnfermedad(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEnfermedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEnfermedad(this.getenfermedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(this.enfermedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.enfermedad =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.enfermedad =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.enfermedad==null) {
						this.enfermedad = new Enfermedad();
					}

					this.setVariablesFormularioToObjetoActualEnfermedad(this.enfermedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(this.enfermedad);
				}

				if(this.enfermedad.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.enfermedad.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEnfermedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEnfermedadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEnfermedad(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEnfermedad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEnfermedad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedad =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.enfermedad =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEnfermedad(this.getenfermedad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(this.enfermedad);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.enfermedadLogic.getConnexion());

				if(this.enfermedad.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.enfermedad.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEnfermedad=(TitledBorder)this.jScrollPanelDatosEnfermedad.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEnfermedad.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEnfermedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEnfermedad(this.getenfermedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(this.enfermedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.enfermedad =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.enfermedad =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.enfermedad==null) {
						this.enfermedad = new Enfermedad();
					}

					this.setVariablesFormularioToObjetoActualEnfermedad(this.enfermedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(this.enfermedad);
				}

				if(this.enfermedad.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.enfermedad.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEnfermedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_enfermedadEnfermedadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoenfermedad=true;

			idTienePermisotipoenfermedad=this.tienePermisosUsuarioEnPaginaWebEnfermedad(TipoEnfermedadConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoenfermedad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEnfermedad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEnfermedad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedad =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.enfermedad =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEnfermedad(this.getenfermedad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(this.enfermedad);

				this.tipoenfermedadBeanSwingJInternalFrame=new TipoEnfermedadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoenfermedadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoenfermedadBeanSwingJInternalFrame.getTipoEnfermedadLogic().setConnexion(this.enfermedadLogic.getConnexion());

				if(this.enfermedad.getid_tipo_enfermedad()!=null) {
					this.tipoenfermedadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoenfermedadBeanSwingJInternalFrame.setIdActual(this.enfermedad.getid_tipo_enfermedad());
					this.tipoenfermedadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoenfermedadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoenfermedadBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoEnfermedad();
				}

				JInternalFrameBase jinternalFrame =this.tipoenfermedadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEnfermedad=(TitledBorder)this.jScrollPanelDatosEnfermedad.getBorder();
				TitledBorder titledBordertipoenfermedad=(TitledBorder)this.tipoenfermedadBeanSwingJInternalFrame.jScrollPanelDatosTipoEnfermedad.getBorder();

				titledBordertipoenfermedad.setTitle(titledBorderEnfermedad.getTitle() + " -> Tipo Enfermedad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_enfermedadEnfermedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEnfermedad(this.getenfermedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(this.enfermedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.enfermedad =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.enfermedad =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.enfermedad==null) {
						this.enfermedad = new Enfermedad();
					}

					this.setVariablesFormularioToObjetoActualEnfermedad(this.enfermedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(this.enfermedad);
				}

				if(this.enfermedad.getid_tipo_enfermedad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_enfermedad = "+this.enfermedad.getid_tipo_enfermedad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEnfermedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEnfermedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEnfermedad(this.getenfermedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(this.enfermedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.enfermedad =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.enfermedad =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.enfermedad==null) {
						this.enfermedad = new Enfermedad();
					}

					this.setVariablesFormularioToObjetoActualEnfermedad(this.enfermedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(this.enfermedad);
				}

				if(this.enfermedad.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.enfermedad.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEnfermedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionEnfermedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEnfermedad(this.getenfermedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(this.enfermedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.enfermedad =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.enfermedad =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.enfermedad==null) {
						this.enfermedad = new Enfermedad();
					}

					this.setVariablesFormularioToObjetoActualEnfermedad(this.enfermedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(this.enfermedad);
				}

				if(this.enfermedad.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.enfermedad.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEnfermedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaEnfermedadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEnfermedad(false,false);

			this.getEnfermedadsFK_IdEmpresa();

			this.inicializarActualizarBindingEnfermedad(false);

			//if(EnfermedadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEnfermedad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoEnfermedadEnfermedadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEnfermedad(false,false);

			this.getEnfermedadsFK_IdTipoEnfermedad();

			this.inicializarActualizarBindingEnfermedad(false);

			//if(EnfermedadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEnfermedad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.enfermedadLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEnfermedad() {
		if(this.jInternalFrameDetalleFormEnfermedad!=null) {
		

		if(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) {
			this.jInternalFrameDetalleFormEnfermedad.setVisible(false);	    			
			this.jInternalFrameDetalleFormEnfermedad.dispose();
			this.jInternalFrameDetalleFormEnfermedad=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEnfermedad!=null) {
			this.jInternalFrameReporteDinamicoEnfermedad.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEnfermedad.dispose();
			this.jInternalFrameReporteDinamicoEnfermedad=null;
		}
		
		if(this.jInternalFrameImportacionEnfermedad!=null) {
			this.jInternalFrameImportacionEnfermedad.setVisible(false);	    			
			this.jInternalFrameImportacionEnfermedad.dispose();
			this.jInternalFrameImportacionEnfermedad=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEnfermedad();
			
			EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
			
			
			if(sTipo.equals("NuevoEnfermedad")) {
				jButtonNuevoEnfermedadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEnfermedad")) {
				jButtonDuplicarEnfermedadActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEnfermedad")) {
				jButtonCopiarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("VerFormEnfermedad")) {
				jButtonVerFormEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEnfermedad")) {
				jButtonNuevoEnfermedadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEnfermedad")) {
				jButtonDuplicarEnfermedadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEnfermedad")) {
				jButtonNuevoEnfermedadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEnfermedad")) {
				jButtonDuplicarEnfermedadActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEnfermedad")) {
				jButtonNuevoEnfermedadActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEnfermedad")) {
				jButtonNuevoEnfermedadActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEnfermedad")) {
				jButtonNuevoEnfermedadActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEnfermedad")) {
				jButtonModificarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEnfermedad")) {
				jButtonModificarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEnfermedad")) {
				jButtonModificarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEnfermedad")) {
				jButtonActualizarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEnfermedad")) {
				jButtonActualizarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEnfermedad")) {
				jButtonActualizarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("EliminarEnfermedad")) {
				jButtonEliminarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEnfermedad")) {
				jButtonEliminarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEnfermedad")) {
				jButtonEliminarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("CancelarEnfermedad")) {
				jButtonCancelarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEnfermedad")) {
				jButtonCancelarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEnfermedad")) {
				jButtonCancelarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("CerrarEnfermedad")) {
				jButtonCerrarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEnfermedad")) {
				jButtonCerrarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEnfermedad")) {
				jButtonCerrarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEnfermedad")) {
				jButtonMostrarOcultarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEnfermedad")) {
				jButtonCancelarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEnfermedad")) {
				jButtonGuardarCambiosEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEnfermedad")) {
				jButtonGuardarCambiosEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEnfermedad")) {
				jButtonCopiarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEnfermedad")) {
				jButtonVerFormEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEnfermedad")) {
				jButtonGuardarCambiosEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEnfermedad")) {
				jButtonCopiarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEnfermedad")) {
				jButtonVerFormEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEnfermedad")) {
				jButtonGuardarCambiosEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEnfermedad")) {
				jButtonGuardarCambiosEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEnfermedad")) {
				jButtonGuardarCambiosEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEnfermedad")) {
				jButtonRecargarInformacionEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEnfermedad")) {
				jButtonRecargarInformacionEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEnfermedad")) {
				jButtonRecargarInformacionEnfermedadActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEnfermedad")) {
				jButtonAnterioresEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEnfermedad")) {
				jButtonAnterioresEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEnfermedad")) {
				jButtonAnterioresEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEnfermedad")) {
				jButtonSiguientesEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEnfermedad")) {
				jButtonSiguientesEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEnfermedad")) {
				jButtonSiguientesEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEnfermedad") || sTipo.equals("MenuItemDetalleAbrirOrderByEnfermedad")) {
				jButtonAbrirOrderByEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEnfermedad") || sTipo.equals("MenuItemDetalleMostrarOcultarEnfermedad")) {
				jButtonMostrarOcultarEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEnfermedad")) {
				jButtonNuevoGuardarCambiosEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEnfermedad")) {
				jButtonNuevoGuardarCambiosEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEnfermedad")) {
				jButtonNuevoGuardarCambiosEnfermedadActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEnfermedad")) {
				jButtonCerrarReporteDinamicoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEnfermedad")) {
				jButtonGenerarReporteDinamicoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEnfermedad")) {
				
				jButtonGenerarExcelReporteDinamicoEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEnfermedad")) {
				jButtonCerrarImportacionEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEnfermedad")) {
				
				jButtonGenerarImportacionEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEnfermedad")) {
				
				jButtonAbrirImportacionEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEnfermedad")) {
				jComboBoxTiposAccionesEnfermedadActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEnfermedad")) {
				jComboBoxTiposRelacionesEnfermedadActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEnfermedad")) {
				jComboBoxTiposAccionesEnfermedadActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEnfermedad")) {
				
				jComboBoxTiposSeleccionarEnfermedadActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEnfermedad")) {
				jTextFieldValorCampoGeneralEnfermedadActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEnfermedad")) {
				jButtonAbrirOrderByEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEnfermedad")) {
				jButtonAbrirOrderByEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEnfermedad")) {
				jButtonCerrarOrderByEnfermedadActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEnfermedadBusqueda")) {
				this.jButtonidEnfermedadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEnfermedadUpdate")) {
				this.jButtonid_empresaEnfermedadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEnfermedadBusqueda")) {
				this.jButtonid_empresaEnfermedadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_enfermedadEnfermedadUpdate")) {
				this.jButtonid_tipo_enfermedadEnfermedadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_enfermedadEnfermedadBusqueda")) {
				this.jButtonid_tipo_enfermedadEnfermedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEnfermedadBusqueda")) {
				this.jButtonnombreEnfermedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionEnfermedadBusqueda")) {
				this.jButtondescripcionEnfermedadBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTipoEnfermedadEnfermedad")) {
				this.jButtonFK_IdTipoEnfermedadEnfermedadActionPerformed(evt);
			}
			
			;
			
			
			EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEnfermedad();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEnfermedadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.enfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.enfermedad);
				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
				
				


				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Enfermedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Enfermedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Enfermedad enfermedadLocal=null;
			
			if(!this.getEsControlTabla()) {
				enfermedadLocal=this.enfermedad;
			} else {
				enfermedadLocal=this.enfermedadAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.enfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.enfermedad);
				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
							
				
				


				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Enfermedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Enfermedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEnfermedadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadAnterior =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.enfermedadAnterior =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
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
			
			EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
			
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
			
			


			
			EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEnfermedadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.enfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.enfermedad);
				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
								
						
				


				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Enfermedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Enfermedad.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.enfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.enfermedad);
				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
								
				
				


				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Enfermedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Enfermedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEnfermedadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadAnterior =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.enfermedadAnterior =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.enfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.enfermedad);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEnfermedadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadAnterior =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.enfermedadAnterior =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEnfermedadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.enfermedad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.enfermedad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.enfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.enfermedad);
				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
							
				
				


				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Enfermedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Enfermedad.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEnfermedadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.enfermedadAnterior =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.enfermedadAnterior =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
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
			
			EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
			
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
			
			


			
			EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEnfermedadActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.enfermedad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.enfermedad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.enfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.enfermedad);
				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
								
				
				


				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Enfermedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Enfermedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEnfermedadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadAnterior =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.enfermedadAnterior =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEnfermedadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.enfermedad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.enfermedad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEnfermedadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.enfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.enfermedad);
				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEnfermedad")) {
					jCheckBoxSeleccionarTodosEnfermedadItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEnfermedad")) {
					jCheckBoxSeleccionadosEnfermedadItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEnfermedad")) {
					
				}
				
				


				
				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Enfermedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Enfermedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.enfermedad);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.enfermedad);
				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
												
				
				


				
				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Enfermedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Enfermedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEnfermedadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.enfermedadAnterior =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.enfermedadAnterior =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEnfermedadActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.enfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.enfermedad);
				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
				
				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
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
			
			EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
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
			
			


			
			EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEnfermedadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.enfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.enfermedad);
				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Enfermedad.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Enfermedad.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.enfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.enfermedad);
				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
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
				
				


				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Enfermedad.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Enfermedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEnfermedadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.enfermedadAnterior =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.enfermedadAnterior =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEnfermedad")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEnfermedadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEnfermedad.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.enfermedad =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.enfermedad =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.enfermedad);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEnfermedad")) {
				
				}
				
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEnfermedad")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEnfermedad.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEnfermedad")) {
			
			}
			
			EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEnfermedad();
			
			EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
			
			if(sTipo.equals("NuevoEnfermedad")) {
				jButtonNuevoEnfermedadActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEnfermedad")) {
				jButtonDuplicarEnfermedadActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEnfermedad")) {
				jButtonCopiarEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEnfermedad")) {
				jButtonVerFormEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEnfermedad")) {
				jButtonNuevoEnfermedadActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEnfermedad")) {
				jButtonModificarEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEnfermedad")) {
				jButtonActualizarEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEnfermedad")) {
				jButtonEliminarEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEnfermedad")) {
				jButtonGuardarCambiosEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEnfermedad")) {
				jButtonCancelarEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEnfermedad")) {
				jButtonCerrarEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEnfermedad")) {
				jButtonGuardarCambiosEnfermedadActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEnfermedad")) {
				jButtonNuevoGuardarCambiosEnfermedadActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEnfermedad")) {
				jButtonAbrirOrderByEnfermedadActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEnfermedad")) {
				jButtonRecargarInformacionEnfermedadActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEnfermedad")) {
				jButtonAnterioresEnfermedadActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEnfermedad")) {
				jButtonSiguientesEnfermedadActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEnfermedadBusqueda")) {
				this.jButtonidEnfermedadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEnfermedadUpdate")) {
				this.jButtonid_empresaEnfermedadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEnfermedadBusqueda")) {
				this.jButtonid_empresaEnfermedadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_enfermedadEnfermedadUpdate")) {
				this.jButtonid_tipo_enfermedadEnfermedadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_enfermedadEnfermedadBusqueda")) {
				this.jButtonid_tipo_enfermedadEnfermedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEnfermedadBusqueda")) {
				this.jButtonnombreEnfermedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionEnfermedadBusqueda")) {
				this.jButtondescripcionEnfermedadBusquedaActionPerformed(evt);
			}
			
			EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEnfermedad();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEnfermedad")) {
				closingInternalFrameEnfermedad();
				
			} else if(sTipo.equals("jButtonCancelarEnfermedad")) {
				JInternalFrameBase jInternalFrameDetalleFormEnfermedad = (JInternalFrameBase)evt.getSource();
	            	
	            EnfermedadBeanSwingJInternalFrame jInternalFrameParent=(EnfermedadBeanSwingJInternalFrame)jInternalFrameDetalleFormEnfermedad.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEnfermedadActionPerformed(null);
			}
			
			EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.enfermedad,new Object(),this.enfermedadParameterGeneral,this.enfermedadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEnfermedad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEnfermedad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEnfermedad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.enfermedad)) {
			if(!esControlTabla) {
				if(EnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEnfermedad(this.enfermedad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(this.enfermedad);			
				}
				
				if(this.enfermedadSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEnfermedad(this.enfermedad,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.enfermedadReturnGeneral=enfermedadLogic.procesarEventosEnfermedadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.enfermedadLogic.getEnfermedads(),this.enfermedad,this.enfermedadParameterGeneral,this.isEsNuevoEnfermedad,classes);//this.enfermedadLogic.getEnfermedad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEnfermedad(this.enfermedadReturnGeneral,this.enfermedadBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.enfermedadSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEnfermedad(classes,this.enfermedadReturnGeneral,this.enfermedadBean,false);
					}
						
					if(this.enfermedadReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEnfermedad(this.enfermedadReturnGeneral.getEnfermedad());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEnfermedad(this.enfermedadReturnGeneral.getEnfermedad());	
					}
						
					if(this.enfermedadReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEnfermedad(this.enfermedadReturnGeneral.getEnfermedad(),classes);//this.enfermedadBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEnfermedad(this.enfermedad,classes);//this.enfermedadBean);									
				}
			
				if(EnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEnfermedad(this.enfermedad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEnfermedad(this.enfermedad);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.enfermedadAnterior!=null) {
						this.enfermedad=this.enfermedadAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.enfermedadReturnGeneral=enfermedadLogic.procesarEventosEnfermedadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.enfermedadLogic.getEnfermedads(),this.enfermedad,this.enfermedadParameterGeneral,this.isEsNuevoEnfermedad,classes);//this.enfermedadLogic.getEnfermedad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.enfermedadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.enfermedadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.enfermedadReturnGeneral.getEnfermedad(),enfermedadLogic.getEnfermedads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.enfermedadReturnGeneral.getEnfermedad(),this.enfermedads);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEnfermedad.repaint();
				
				//((AbstractTableModel) this.jTableDatosEnfermedad.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEnfermedad();
			}
		}
	}
	
	public void actualizarVisualTableDatosEnfermedad() throws Exception {
		
		EnfermedadModel enfermedadModel=(EnfermedadModel)this.jTableDatosEnfermedad.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			enfermedadModel.enfermedads=this.enfermedadLogic.getEnfermedads();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			enfermedadModel.enfermedads=this.enfermedads;
		}
		
		
		((EnfermedadModel) this.jTableDatosEnfermedad.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEnfermedad() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getenfermedadAnterior(),this.enfermedadLogic.getEnfermedads());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getenfermedadAnterior(),this.enfermedads);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEnfermedad();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEnfermedad(Enfermedad enfermedad,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoEnfer.class)) {
					this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenferLogic.setEmpleadoEnfers(enfermedad.getEmpleadoEnfers());
					this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoEnfer(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
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
										
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.enfermedad,new Object(),generalEntityParameterGeneral,this.enfermedadReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.enfermedadSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EnfermedadConstantesFunciones.getClassesRelationshipsOfEnfermedad(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EnfermedadConstantesFunciones.getClassesRelationshipsFromStringsOfEnfermedad(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEnfermedad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.enfermedad,new Object(),generalEntityParameterGeneral,this.enfermedadReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEnfermedad(EnfermedadBean enfermedadBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoEnfer.class)) {
					this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenferLogic.setEmpleadoEnfers(enfermedad.getEmpleadoEnfers());
					this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoEnfer(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEnfermedad(ArrayList<Classe> classes,EnfermedadReturnGeneral enfermedadReturnGeneral,EnfermedadBean enfermedadBean,Boolean conDefault) throws Exception {
		
			this.enfermedadBean.setEmpleadoEnfers(enfermedadReturnGeneral.getEnfermedad().getEmpleadoEnfers());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEnfermedad(Enfermedad enfermedad,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoEnfer.class)) {
					enfermedad.setEmpleadoEnfers(this.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.empleadoenferLogic.getEmpleadoEnfers());
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
		if(!paraTabla && !this.permiteMantenimiento(this.enfermedad)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEnfermedad = new EnfermedadDetalleFormJInternalFrame(jDesktopPane,this.enfermedadSessionBean.getConGuardarRelaciones(),this.enfermedadSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEnfermedad);
		this.jInternalFrameDetalleFormEnfermedad.setVisible(false);
		this.jInternalFrameDetalleFormEnfermedad.setSelected(false);						
		
		this.jInternalFrameDetalleFormEnfermedad.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEnfermedad.enfermedadLogic=this.enfermedadLogic;
		
		this.cargarCombosFrameForeignKeyEnfermedad("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEnfermedad();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEnfermedad();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEnfermedad("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEnfermedad();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEnfermedad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEnfermedad"));
		
		this.jInternalFrameDetalleFormEnfermedad.jButtonModificarEnfermedad.addActionListener(new ButtonActionListener(this,"ModificarEnfermedad"));

		
		this.jInternalFrameDetalleFormEnfermedad.jButtonModificarToolBarEnfermedad.addActionListener(new ButtonActionListener(this,"ModificarToolBarEnfermedad"));
					
		this.jInternalFrameDetalleFormEnfermedad.jMenuItemModificarEnfermedad.addActionListener(new ButtonActionListener(this,"MenuItemModificarEnfermedad"));		
		
		
		
		this.jInternalFrameDetalleFormEnfermedad.jButtonActualizarEnfermedad.addActionListener (new ButtonActionListener(this,"ActualizarEnfermedad"));
		
		
		this.jInternalFrameDetalleFormEnfermedad.jButtonActualizarToolBarEnfermedad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEnfermedad"));
						
		this.jInternalFrameDetalleFormEnfermedad.jMenuItemActualizarEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEnfermedad"));		
		
		
		
		this.jInternalFrameDetalleFormEnfermedad.jButtonEliminarEnfermedad.addActionListener (new ButtonActionListener(this,"EliminarEnfermedad"));
		
		
		this.jInternalFrameDetalleFormEnfermedad.jButtonEliminarToolBarEnfermedad.addActionListener (new ButtonActionListener(this,"EliminarToolBarEnfermedad"));
								
		this.jInternalFrameDetalleFormEnfermedad.jMenuItemEliminarEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEnfermedad"));		
		
		
		
		this.jInternalFrameDetalleFormEnfermedad.jButtonCancelarEnfermedad.addActionListener (new ButtonActionListener(this,"CancelarEnfermedad"));
		
		
		this.jInternalFrameDetalleFormEnfermedad.jButtonCancelarToolBarEnfermedad.addActionListener (new ButtonActionListener(this,"CancelarToolBarEnfermedad"));
					
		this.jInternalFrameDetalleFormEnfermedad.jMenuItemCancelarEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEnfermedad"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEnfermedad.jMenuItemDetalleCerrarEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEnfermedad"));		
		
		
		
		this.jInternalFrameDetalleFormEnfermedad.jButtonGuardarCambiosToolBarEnfermedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEnfermedad"));
		
		
		
		this.jInternalFrameDetalleFormEnfermedad.jButtonGuardarCambiosToolBarEnfermedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEnfermedad"));
		
		
		
		this.jInternalFrameDetalleFormEnfermedad.jComboBoxTiposAccionesFormularioEnfermedad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEnfermedad"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEnfermedad.jButtonidEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"idEnfermedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEnfermedad.jButtonid_empresaEnfermedadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEnfermedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEnfermedad.jButtonid_empresaEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEnfermedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEnfermedad.jButtonid_tipo_enfermedadEnfermedadUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_enfermedadEnfermedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEnfermedad.jButtonid_tipo_enfermedadEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_enfermedadEnfermedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEnfermedad.jButtonnombreEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"nombreEnfermedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEnfermedad.jButtondescripcionEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEnfermedadBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEnfermedad.jTabbedPaneRelacionesEnfermedad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEnfermedad"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEnfermedad"));
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEnfermedad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEnfermedad"));
		}
		
		this.jTableDatosEnfermedad.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEnfermedad"));
		
		this.jTableDatosEnfermedad.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEnfermedad"));
		
		this.jButtonNuevoEnfermedad.addActionListener(new ButtonActionListener(this,"NuevoEnfermedad"));
		
		this.jButtonDuplicarEnfermedad.addActionListener(new ButtonActionListener(this,"DuplicarEnfermedad"));
		
		this.jButtonCopiarEnfermedad.addActionListener(new ButtonActionListener(this,"CopiarEnfermedad"));
		
		this.jButtonVerFormEnfermedad.addActionListener(new ButtonActionListener(this,"VerFormEnfermedad"));
		
		
		this.jButtonNuevoToolBarEnfermedad.addActionListener(new ButtonActionListener(this,"NuevoToolBarEnfermedad"));
			
		this.jButtonDuplicarToolBarEnfermedad.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEnfermedad"));
			
		this.jMenuItemNuevoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEnfermedad"));
			
		this.jMenuItemDuplicarEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEnfermedad"));		
		
		
		this.jButtonNuevoRelacionesEnfermedad.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEnfermedad"));
		
		
		this.jButtonNuevoRelacionesToolBarEnfermedad.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEnfermedad"));
			
		this.jMenuItemNuevoRelacionesEnfermedad.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEnfermedad"));		
		
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEnfermedad.jButtonModificarEnfermedad.addActionListener(new ButtonActionListener(this,"ModificarEnfermedad"));
		}
		
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEnfermedad.jButtonModificarToolBarEnfermedad.addActionListener(new ButtonActionListener(this,"ModificarToolBarEnfermedad"));
			
			this.jInternalFrameDetalleFormEnfermedad.jMenuItemModificarEnfermedad.addActionListener(new ButtonActionListener(this,"MenuItemModificarEnfermedad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEnfermedad.jButtonActualizarEnfermedad.addActionListener (new ButtonActionListener(this,"ActualizarEnfermedad"));
		}
		
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEnfermedad.jButtonActualizarToolBarEnfermedad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEnfermedad"));
				
			this.jInternalFrameDetalleFormEnfermedad.jMenuItemActualizarEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEnfermedad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEnfermedad.jButtonEliminarEnfermedad.addActionListener (new ButtonActionListener(this,"EliminarEnfermedad"));
		}
		
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEnfermedad.jButtonEliminarToolBarEnfermedad.addActionListener (new ButtonActionListener(this,"EliminarToolBarEnfermedad"));
						
			this.jInternalFrameDetalleFormEnfermedad.jMenuItemEliminarEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEnfermedad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEnfermedad.jButtonCancelarEnfermedad.addActionListener (new ButtonActionListener(this,"CancelarEnfermedad"));
		}
		
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEnfermedad.jButtonCancelarToolBarEnfermedad.addActionListener (new ButtonActionListener(this,"CancelarToolBarEnfermedad"));
			
			this.jInternalFrameDetalleFormEnfermedad.jMenuItemCancelarEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEnfermedad"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEnfermedad.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEnfermedad"));		
		
		
		this.jButtonCerrarEnfermedad.addActionListener (new ButtonActionListener(this,"CerrarEnfermedad"));
		
		
		this.jButtonCerrarToolBarEnfermedad.addActionListener (new ButtonActionListener(this,"CerrarToolBarEnfermedad"));
			
		this.jMenuItemCerrarEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEnfermedad"));
			
		if(this.jInternalFrameDetalleFormEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEnfermedad.jMenuItemDetalleCerrarEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEnfermedad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEnfermedad.jButtonGuardarCambiosEnfermedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosEnfermedad"));
		}
		
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEnfermedad.jButtonGuardarCambiosToolBarEnfermedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEnfermedad"));
		}
		
		this.jButtonCopiarToolBarEnfermedad.addActionListener (new ButtonActionListener(this,"CopiarToolBarEnfermedad"));
			
		this.jButtonVerFormToolBarEnfermedad.addActionListener (new ButtonActionListener(this,"VerFormToolBarEnfermedad"));
		
		this.jMenuItemGuardarCambiosEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEnfermedad"));
			
		this.jMenuItemCopiarEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEnfermedad"));		
		
		this.jMenuItemVerFormEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEnfermedad"));		
		
		
		this.jButtonGuardarCambiosTablaEnfermedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEnfermedad"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEnfermedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEnfermedad"));
			
		this.jMenuItemGuardarCambiosTablaEnfermedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEnfermedad"));		
		
		
		
		this.jButtonRecargarInformacionEnfermedad.addActionListener (new ButtonActionListener(this,"RecargarInformacionEnfermedad"));
					
		this.jButtonRecargarInformacionToolBarEnfermedad.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEnfermedad"));
		
		this.jMenuItemRecargarInformacionEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEnfermedad"));		
		
		
		
		this.jButtonAnterioresEnfermedad.addActionListener (new ButtonActionListener(this,"AnterioresEnfermedad"));
		
		
		this.jButtonAnterioresToolBarEnfermedad.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEnfermedad"));
		
		this.jMenuItemAnterioresEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEnfermedad"));		
		
		
		this.jButtonSiguientesEnfermedad.addActionListener (new ButtonActionListener(this,"SiguientesEnfermedad"));
		
		
		this.jButtonSiguientesToolBarEnfermedad.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEnfermedad"));
			
		this.jMenuItemSiguientesEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEnfermedad"));
			
		this.jMenuItemAbrirOrderByEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEnfermedad"));
			
		this.jMenuItemMostrarOcultarEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEnfermedad"));
			
		this.jMenuItemDetalleAbrirOrderByEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEnfermedad"));
			
		this.jMenuItemDetalleMostarOcultarEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEnfermedad"));		
		
		
		this.jButtonNuevoGuardarCambiosEnfermedad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEnfermedad"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEnfermedad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEnfermedad"));
			
		this.jMenuItemNuevoGuardarCambiosEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEnfermedad"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEnfermedad.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEnfermedad"));

		this.jCheckBoxSeleccionadosEnfermedad.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEnfermedad"));
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEnfermedad.jComboBoxTiposAccionesFormularioEnfermedad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEnfermedad"));
		}
		
		
		this.jComboBoxTiposRelacionesEnfermedad.addActionListener (new ButtonActionListener(this,"TiposRelacionesEnfermedad"));
			
		this.jComboBoxTiposAccionesEnfermedad.addActionListener (new ButtonActionListener(this,"TiposAccionesEnfermedad"));
					
		this.jComboBoxTiposSeleccionarEnfermedad.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEnfermedad"));
			
		this.jTextFieldValorCampoGeneralEnfermedad.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEnfermedad"));		
		
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEnfermedad.jButtonidEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"idEnfermedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEnfermedad.jButtonid_empresaEnfermedadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEnfermedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEnfermedad.jButtonid_empresaEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEnfermedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEnfermedad.jButtonid_tipo_enfermedadEnfermedadUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_enfermedadEnfermedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEnfermedad.jButtonid_tipo_enfermedadEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_enfermedadEnfermedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEnfermedad.jButtonnombreEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"nombreEnfermedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEnfermedad.jButtondescripcionEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEnfermedadBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTipoEnfermedadEnfermedad.addActionListener(new ButtonActionListener(this,"FK_IdTipoEnfermedadEnfermedad"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEnfermedad!=null) {
				this.jInternalFrameReporteDinamicoEnfermedad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEnfermedad"));
				this.jInternalFrameReporteDinamicoEnfermedad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEnfermedad"));
				this.jInternalFrameReporteDinamicoEnfermedad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEnfermedad"));
			}
			
			//this.jButtonCerrarReporteDinamicoEnfermedad.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEnfermedad"));				
			//this.jButtonGenerarReporteDinamicoEnfermedad.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEnfermedad"));
			//this.jButtonGenerarExcelReporteDinamicoEnfermedad.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEnfermedad"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEnfermedad!=null) {
				this.jInternalFrameImportacionEnfermedad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEnfermedad"));
				this.jInternalFrameImportacionEnfermedad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEnfermedad"));
				this.jInternalFrameImportacionEnfermedad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEnfermedad"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEnfermedad.addActionListener (new ButtonActionListener(this,"AbrirOrderByEnfermedad"));
			
			this.jButtonAbrirOrderByToolBarEnfermedad.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEnfermedad"));			
			
			if(this.jInternalFrameOrderByEnfermedad!=null) {
				this.jInternalFrameOrderByEnfermedad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEnfermedad"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEnfermedad.jTabbedPaneRelacionesEnfermedad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEnfermedad"));
		
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
            		closingInternalFrameEnfermedad();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEnfermedad.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEnfermedad = (JInternalFrameBase)event.getSource();
	            	
	            EnfermedadBeanSwingJInternalFrame jInternalFrameParent=(EnfermedadBeanSwingJInternalFrame)jInternalFrameDetalleFormEnfermedad.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEnfermedadActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEnfermedad.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEnfermedadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEnfermedad.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEnfermedad.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEnfermedadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEnfermedadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEnfermedadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEnfermedad";
		inputMap = this.jButtonNuevoEnfermedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEnfermedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEnfermedadActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEnfermedadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEnfermedadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEnfermedadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEnfermedad";
		inputMap = this.jButtonNuevoRelacionesEnfermedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEnfermedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEnfermedadActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEnfermedad";
		inputMap = this.jButtonModificarEnfermedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEnfermedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEnfermedadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEnfermedad";
		inputMap = this.jButtonActualizarEnfermedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEnfermedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEnfermedadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEnfermedad";
		inputMap = this.jButtonEliminarEnfermedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEnfermedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEnfermedadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEnfermedad";
		inputMap = this.jButtonCancelarEnfermedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEnfermedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEnfermedadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEnfermedad";
		inputMap = this.jButtonCerrarEnfermedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEnfermedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEnfermedadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEnfermedad.jButtonGuardarCambiosEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEnfermedad";
		inputMap = this.jInternalFrameDetalleFormEnfermedad.jButtonGuardarCambiosEnfermedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEnfermedad.jButtonGuardarCambiosEnfermedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEnfermedadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEnfermedad.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEnfermedadItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEnfermedad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEnfermedadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEnfermedad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEnfermedadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEnfermedad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEnfermedadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEnfermedad.jButtonidEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"idEnfermedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEnfermedad.jButtonid_empresaEnfermedadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEnfermedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEnfermedad.jButtonid_empresaEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEnfermedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEnfermedad.jButtonid_tipo_enfermedadEnfermedadUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_enfermedadEnfermedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEnfermedad.jButtonid_tipo_enfermedadEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_enfermedadEnfermedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEnfermedad.jButtonnombreEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"nombreEnfermedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEnfermedad.jButtondescripcionEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEnfermedadBusqueda"));
		
		
		this.jButtonFK_IdTipoEnfermedadEnfermedad.addActionListener(new ButtonActionListener(this,"FK_IdTipoEnfermedadEnfermedad"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEnfermedadActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEnfermedad.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEnfermedad(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Enfermedad enfermedadAux:this.enfermedadLogic.getEnfermedads()) {
					enfermedadAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Enfermedad enfermedadAux:enfermedads) {
					enfermedadAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEnfermedadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEnfermedad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Enfermedad enfermedadAux:this.enfermedadLogic.getEnfermedads()) {
						enfermedadAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Enfermedad enfermedadAux:enfermedads) {
						enfermedadAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Enfermedad enfermedadAux:this.enfermedadLogic.getEnfermedads()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Enfermedad enfermedadAux:enfermedads) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEnfermedad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEnfermedad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEnfermedad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEnfermedad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEnfermedadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEnfermedad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEnfermedad.getSelectedRows();
			
			Enfermedad enfermedadLocal=new Enfermedad();
			
			//this.seleccionarTodosEnfermedad(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					enfermedadLocal =(Enfermedad) this.enfermedadLogic.getEnfermedads().toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					enfermedadLocal =(Enfermedad) this.enfermedads.toArray()[this.jTableDatosEnfermedad.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				enfermedadLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Enfermedad enfermedadAux:this.enfermedadLogic.getEnfermedads()) {
						enfermedadAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Enfermedad enfermedadAux:enfermedads) {
						enfermedadAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEnfermedad(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEnfermedad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEnfermedad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEnfermedad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEnfermedadItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEnfermedadParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEnfermedadActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEnfermedad(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEnfermedad.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Enfermedad enfermedadAux:this.enfermedadLogic.getEnfermedads()) {
				
						if(sTipoSeleccionar.equals(EnfermedadConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							enfermedadAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EnfermedadConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							enfermedadAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Enfermedad enfermedadAux:enfermedads) {
					
						if(sTipoSeleccionar.equals(EnfermedadConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							enfermedadAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EnfermedadConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							enfermedadAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEnfermedad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEnfermedadActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEnfermedad(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEnfermedad=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEnfermedad.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEnfermedad.jComboBoxTiposAccionesFormularioEnfermedad.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEnfermedad) {				
					conSplash=true;//false;										
					
					//this.startProcessEnfermedad(conSplash);
				
					this.generarReporteEnfermedadsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEnfermedad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEnfermedad.jComboBoxTiposAccionesFormularioEnfermedad.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEnfermedadsSeleccionados();
				//this.jComboBoxTiposAccionesEnfermedad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEnfermedadsSeleccionados(false);
				//this.jComboBoxTiposAccionesEnfermedad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEnfermedadsSeleccionados(true);
				//this.jComboBoxTiposAccionesEnfermedad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEnfermedad();
				
				this.exportarEnfermedadsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEnfermedad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEnfermedad.jComboBoxTiposAccionesFormularioEnfermedad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEnfermedads();
				//this.importarEnfermedads();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEnfermedad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEnfermedad.jComboBoxTiposAccionesFormularioEnfermedad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEnfermedad();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEnfermedadsSeleccionados();
				//this.jComboBoxTiposAccionesEnfermedad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Enfermedad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEnfermedad();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEnfermedad)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEnfermedad(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Enfermedad",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEnfermedad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEnfermedad.jComboBoxTiposAccionesFormularioEnfermedad.setSelectedIndex(0);					
				}	
			} 			
			else if(EnfermedadBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEnfermedad) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEnfermedad(conSplash);
					
						//this.actualizarParametrosGeneralEnfermedad();
						
						this.generarReporteProcesoAccionEnfermedadsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEnfermedad.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEnfermedad.jComboBoxTiposAccionesFormularioEnfermedad.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EnfermedadBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO EnfermedadES SELECCIONADOS?", "MANTENIMIENTO DE Enfermedad", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEnfermedad();
				
						this.actualizarParametrosGeneralEnfermedad();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.enfermedadReturnGeneral=enfermedadLogic.procesarAccionEnfermedadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.enfermedadLogic.getEnfermedads(),this.enfermedadParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEnfermedadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEnfermedad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEnfermedad.jComboBoxTiposAccionesFormularioEnfermedad.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEnfermedad();
					
					EnfermedadBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEnfermedadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEnfermedad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEnfermedad.jComboBoxTiposAccionesFormularioEnfermedad.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEnfermedad(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEnfermedadActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEnfermedad();
			
			if(this.jInternalFrameDetalleFormEnfermedad==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Enfermedad> enfermedadsSeleccionados=new ArrayList<Enfermedad>();		
			Enfermedad enfermedad=new Enfermedad();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEnfermedad(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEnfermedad.getSelectedItem();
			
			
			
			
			enfermedadsSeleccionados=this.getEnfermedadsSeleccionados(true);
			//this.sTipoAccion;
			
			if(enfermedadsSeleccionados.size()==1) {
				for(Enfermedad enfermedadAux:enfermedadsSeleccionados) {
					enfermedad=enfermedadAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Empleado Enfer")) {
					jButtonEmpleadoEnferActionPerformed(null,rowIndex,true,false,enfermedad);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEnfermedad();
			
      		//this.finishProcessEnfermedad(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEnfermedadReturnGeneral() throws Exception {
		if(this.enfermedadReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.enfermedadReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.enfermedadReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.enfermedadReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.enfermedadReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.enfermedadReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEnfermedad(false);
		}
		
		if(this.enfermedadReturnGeneral.getConRetornoLista() || this.enfermedadReturnGeneral.getConRetornoObjeto()) {
			if(this.enfermedadReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.enfermedadLogic.setEnfermedads(this.enfermedadReturnGeneral.getEnfermedads());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.enfermedadReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.enfermedadLogic.setEnfermedad(this.enfermedadReturnGeneral.getEnfermedad());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEnfermedad(false);
		}
	}
	
	public void actualizarParametrosGeneralEnfermedad() throws Exception {
		
		
	}
	
	public ArrayList<Enfermedad> getEnfermedadsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Enfermedad> enfermedadsSeleccionados=new ArrayList<Enfermedad>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEnfermedad) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Enfermedad enfermedadAux:enfermedadLogic.getEnfermedads()) {
					if(enfermedadAux.getIsSelected()) {
						enfermedadsSeleccionados.add(enfermedadAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Enfermedad enfermedadAux:this.enfermedads) {
					if(enfermedadAux.getIsSelected()) {
						enfermedadsSeleccionados.add(enfermedadAux);				
					}
				}
			}
			
			if(enfermedadsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						enfermedadsSeleccionados.addAll(this.enfermedadLogic.getEnfermedads());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						enfermedadsSeleccionados.addAll(this.enfermedads);				
					}
				}
			}
		} else {
			enfermedadsSeleccionados.add(this.enfermedad);
		}
		
		return enfermedadsSeleccionados;
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
	
	public void generarReporteEnfermedadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEnfermedadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEnfermedadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEnfermedadsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEnfermedadsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEnfermedadsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Enfermedad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEnfermedadsSeleccionados() throws Exception {
		ArrayList<Enfermedad> enfermedadsSeleccionados=new ArrayList<Enfermedad>();		
		
		enfermedadsSeleccionados=this.getEnfermedadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEnfermedads("Todos",enfermedadsSeleccionados);
		
	}	
	
	public void generarReporteNormalEnfermedadsSeleccionados() throws Exception {
		ArrayList<Enfermedad> enfermedadsSeleccionados=new ArrayList<Enfermedad>();		
		
		enfermedadsSeleccionados=this.getEnfermedadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEnfermedads("Todos",enfermedadsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEnfermedadsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Enfermedad> enfermedadsSeleccionados=new ArrayList<Enfermedad>();
		
		enfermedadsSeleccionados=this.getEnfermedadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEnfermedads("Todos",enfermedadsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEnfermedadsSeleccionados() throws Exception {
		ArrayList<Enfermedad> enfermedadsSeleccionados=new ArrayList<Enfermedad>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEnfermedad();
		
		
		enfermedadsSeleccionados=this.getEnfermedadsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEnfermedad();
		
		
		//this.generarReporteEnfermedads("Todos",enfermedadsSeleccionados ,enfermedadImplementable,enfermedadImplementableHome);
	}
	
	public void mostrarImportacionEnfermedads() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEnfermedad();
		
		this.abrirFrameImportacionEnfermedad();		
		
			
		//this.generarReporteEnfermedads("Todos",enfermedadsSeleccionados ,enfermedadImplementable,enfermedadImplementableHome);
	}
	
	public void importarEnfermedads() throws Exception {		
	
	}
	
	public void exportarEnfermedadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEnfermedadsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEnfermedadsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEnfermedadsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Enfermedad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEnfermedadsSeleccionados() throws Exception {
		ArrayList<Enfermedad> enfermedadsSeleccionados=new ArrayList<Enfermedad>();		
		
		enfermedadsSeleccionados=this.getEnfermedadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"enfermedad."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEnfermedad(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Enfermedad enfermedadAux:enfermedadsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEnfermedad(enfermedadAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//enfermedadAux.setsDetalleGeneralEntityReporte(enfermedadAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.enfermedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Enfermedad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEnfermedad(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EnfermedadConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EnfermedadConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EnfermedadConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EnfermedadConstantesFunciones.LABEL_IDTIPOENFERMEDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EnfermedadConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EnfermedadConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEnfermedad(Enfermedad enfermedad,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=enfermedad.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=enfermedad.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=enfermedad.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=enfermedad.gettipoenfermedad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=enfermedad.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=enfermedad.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEnfermedadsSeleccionados() throws Exception {
		ArrayList<Enfermedad> enfermedadsSeleccionados=new ArrayList<Enfermedad>();		
		
		enfermedadsSeleccionados=this.getEnfermedadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"enfermedad.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Enfermedads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEnfermedad(row);				
				iRow++;
			}				
			
			for(Enfermedad enfermedadAux:enfermedadsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEnfermedad(enfermedadAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.enfermedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Enfermedad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEnfermedadsSeleccionados() throws Exception {
		ArrayList<Enfermedad> enfermedadsSeleccionados=new ArrayList<Enfermedad>();		
		
		enfermedadsSeleccionados=this.getEnfermedadsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"enfermedad.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("enfermedads");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("enfermedad");
			//elementRoot.appendChild(element);
		
			for(Enfermedad enfermedadAux:enfermedadsSeleccionados) {
				element = document.createElement("enfermedad");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEnfermedad(enfermedadAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.enfermedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Enfermedad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEnfermedad(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EnfermedadConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EnfermedadConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EnfermedadConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EnfermedadConstantesFunciones.LABEL_IDTIPOENFERMEDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(EnfermedadConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(EnfermedadConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEnfermedad(Enfermedad enfermedad,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(enfermedad.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(enfermedad.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(enfermedad.gettipoenfermedad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(enfermedad.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(enfermedad.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlEnfermedad(Enfermedad enfermedad,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EnfermedadConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(enfermedad.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EnfermedadConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(enfermedad.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EnfermedadConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(enfermedad.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtipoenfermedad_descripcion = document.createElement(EnfermedadConstantesFunciones.IDTIPOENFERMEDAD);
		elementtipoenfermedad_descripcion.appendChild(document.createTextNode(enfermedad.gettipoenfermedad_descripcion()));
		element.appendChild(elementtipoenfermedad_descripcion);

		Element elementnombre = document.createElement(EnfermedadConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(enfermedad.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(EnfermedadConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(enfermedad.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoEnfermedadsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Enfermedad> enfermedadsSeleccionados=new ArrayList<Enfermedad>();
		
		enfermedadsSeleccionados=this.getEnfermedadsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEnfermedad(enfermedadsSeleccionados);
		
		this.generarReporteEnfermedads("Todos",enfermedadsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEnfermedad(ArrayList<Enfermedad> enfermedadsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Enfermedad enfermedadAux:enfermedadsSeleccionados) {
				enfermedadAux.setsDetalleGeneralEntityReporte(enfermedadAux.toString());
			
				if(sTipoSeleccionar.equals(EnfermedadConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					enfermedadAux.setsDescripcionGeneralEntityReporte1(enfermedadAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EnfermedadConstantesFunciones.LABEL_IDTIPOENFERMEDAD)) {
					existe=true;
					enfermedadAux.setsDescripcionGeneralEntityReporte1(enfermedadAux.gettipoenfermedad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EnfermedadConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					enfermedadAux.setsDescripcionGeneralEntityReporte1(enfermedadAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(EnfermedadConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					enfermedadAux.setsDescripcionGeneralEntityReporte1(enfermedadAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEnfermedad(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEnfermedad=true;
				this.isVisibilidadCeldaNuevoRelacionesEnfermedad=true;
				this.isVisibilidadCeldaGuardarCambiosEnfermedad=true;
			}
			
			this.isVisibilidadCeldaModificarEnfermedad=false;
			this.isVisibilidadCeldaActualizarEnfermedad=false;
			this.isVisibilidadCeldaEliminarEnfermedad=false;
			this.isVisibilidadCeldaCancelarEnfermedad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEnfermedad=true;
				} else {
					this.isVisibilidadCeldaGuardarEnfermedad=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEnfermedad=false;
			this.isVisibilidadCeldaNuevoRelacionesEnfermedad=false;
			this.isVisibilidadCeldaGuardarCambiosEnfermedad=false;
			this.isVisibilidadCeldaModificarEnfermedad=false;
			this.isVisibilidadCeldaActualizarEnfermedad=true;
			this.isVisibilidadCeldaEliminarEnfermedad=false;
			this.isVisibilidadCeldaCancelarEnfermedad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEnfermedad=true;
				} else {
					this.isVisibilidadCeldaGuardarEnfermedad=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEnfermedad=false;
			this.isVisibilidadCeldaNuevoRelacionesEnfermedad=false;
			this.isVisibilidadCeldaGuardarCambiosEnfermedad=false;
			this.isVisibilidadCeldaModificarEnfermedad=false;
			this.isVisibilidadCeldaActualizarEnfermedad=true;
			this.isVisibilidadCeldaEliminarEnfermedad=true;
			this.isVisibilidadCeldaCancelarEnfermedad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEnfermedad=true;
				} else {
					this.isVisibilidadCeldaGuardarEnfermedad=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEnfermedad=false;
			this.isVisibilidadCeldaNuevoRelacionesEnfermedad=false;
			this.isVisibilidadCeldaGuardarCambiosEnfermedad=false;
			this.isVisibilidadCeldaModificarEnfermedad=false;
			this.isVisibilidadCeldaActualizarEnfermedad=true;
			this.isVisibilidadCeldaEliminarEnfermedad=false;
			this.isVisibilidadCeldaCancelarEnfermedad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEnfermedad=false;
				} else {
					this.isVisibilidadCeldaGuardarEnfermedad=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEnfermedad=true;
			this.isVisibilidadCeldaNuevoRelacionesEnfermedad=true;
			this.isVisibilidadCeldaGuardarCambiosEnfermedad=true;
			this.isVisibilidadCeldaModificarEnfermedad=false;
			this.isVisibilidadCeldaActualizarEnfermedad=false;
			this.isVisibilidadCeldaEliminarEnfermedad=false;
			this.isVisibilidadCeldaCancelarEnfermedad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEnfermedad=true;
				} else {
					this.isVisibilidadCeldaGuardarEnfermedad=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEnfermedad=false;
			this.isVisibilidadCeldaNuevoRelacionesEnfermedad=false;
			this.isVisibilidadCeldaGuardarCambiosEnfermedad=false;
			this.isVisibilidadCeldaActualizarEnfermedad=false;
			this.isVisibilidadCeldaEliminarEnfermedad=false;
			this.isVisibilidadCeldaCancelarEnfermedad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEnfermedad=false;
				} else {
					this.isVisibilidadCeldaGuardarEnfermedad=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEnfermedad=false;
			this.isVisibilidadCeldaNuevoRelacionesEnfermedad=false;
			this.isVisibilidadCeldaGuardarCambiosEnfermedad=false;
			this.isVisibilidadCeldaModificarEnfermedad=true;
			this.isVisibilidadCeldaActualizarEnfermedad=false;
			this.isVisibilidadCeldaEliminarEnfermedad=false;
			this.isVisibilidadCeldaCancelarEnfermedad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEnfermedad=false;
				} else {
					this.isVisibilidadCeldaGuardarEnfermedad=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EnfermedadJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEnfermedad=true;
			this.isVisibilidadCeldaNuevoRelacionesEnfermedad=true;
			this.isVisibilidadCeldaGuardarCambiosEnfermedad=true;
		} else {
			this.actualizarEstadoPanelsEnfermedad(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEnfermedad=false;
			//this.isVisibilidadCeldaVerFormEnfermedad=false;
			this.isVisibilidadCeldaDuplicarEnfermedad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!enfermedadSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEnfermedad=false;
		} else {
			this.isVisibilidadCeldaNuevoEnfermedad=false;
			this.isVisibilidadCeldaGuardarCambiosEnfermedad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(enfermedadSessionBean.getEsGuardarRelacionado()) {
			if(!enfermedadSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEnfermedad=false;												
			}
			
			this.jButtonCerrarEnfermedad.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEnfermedad=false;
		}
		
		if(!this.permiteMantenimiento(this.enfermedad)) {
			this.isVisibilidadCeldaActualizarEnfermedad=false;
			this.isVisibilidadCeldaEliminarEnfermedad=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEnfermedad() {
		this.isVisibilidadCeldaNuevoEnfermedad=false;
		this.isVisibilidadCeldaGuardarCambiosEnfermedad=false;
	}
	
	public void actualizarEstadoPanelsEnfermedad(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEnfermedad!=null) {
				this.jScrollPanelDatosEdicionEnfermedad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEnfermedad!=null) {
				this.jTabbedPaneBusquedasEnfermedad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEnfermedad!=null) {
				this.jScrollPanelDatosEnfermedad.setVisible(true);
			}
			
			if(this.jPanelPaginacionEnfermedad!=null) {
				this.jPanelPaginacionEnfermedad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEnfermedad!=null) {
				this.jPanelParametrosReportesEnfermedad.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEnfermedad!=null) {
				this.jScrollPanelDatosEdicionEnfermedad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEnfermedad!=null) {
				this.jTabbedPaneBusquedasEnfermedad.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEnfermedad!=null) {
				this.jScrollPanelDatosEnfermedad.setVisible(false);
			}
			
			if(this.jPanelPaginacionEnfermedad!=null) {
				this.jPanelPaginacionEnfermedad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEnfermedad!=null) {
				this.jPanelParametrosReportesEnfermedad.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEnfermedad!=null) {
				this.jScrollPanelDatosEdicionEnfermedad.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEnfermedad!=null) {
				this.jTabbedPaneBusquedasEnfermedad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEnfermedad!=null) {
				this.jScrollPanelDatosEnfermedad.setVisible(false);
			}
			
			if(this.jPanelPaginacionEnfermedad!=null) {
				this.jPanelPaginacionEnfermedad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEnfermedad!=null) {
				this.jPanelParametrosReportesEnfermedad.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEnfermedad!=null) {
				this.jScrollPanelDatosEdicionEnfermedad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEnfermedad!=null) {
				this.jTabbedPaneBusquedasEnfermedad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEnfermedad!=null) {
				this.jScrollPanelDatosEnfermedad.setVisible(false);
			}
			
			if(this.jPanelPaginacionEnfermedad!=null) {
				this.jPanelPaginacionEnfermedad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEnfermedad!=null) {
				this.jPanelParametrosReportesEnfermedad.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEnfermedad!=null) {
				this.jScrollPanelDatosEdicionEnfermedad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEnfermedad!=null) {
				this.jTabbedPaneBusquedasEnfermedad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEnfermedad!=null) {
				this.jScrollPanelDatosEnfermedad.setVisible(true);
			}
			
			if(this.jPanelPaginacionEnfermedad!=null) {
				this.jPanelPaginacionEnfermedad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEnfermedad!=null) {
				this.jPanelParametrosReportesEnfermedad.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEnfermedad!=null) {
				this.jScrollPanelDatosEdicionEnfermedad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEnfermedad!=null) {
				this.jTabbedPaneBusquedasEnfermedad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEnfermedad!=null) {
				this.jScrollPanelDatosEnfermedad.setVisible(true);
			}
			
			if(this.jPanelPaginacionEnfermedad!=null) {
				this.jPanelPaginacionEnfermedad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEnfermedad!=null) {
				this.jPanelParametrosReportesEnfermedad.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEnfermedad!=null) {
				this.jScrollPanelDatosEdicionEnfermedad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEnfermedad!=null) {
				this.jTabbedPaneBusquedasEnfermedad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEnfermedad!=null) {
				this.jScrollPanelDatosEnfermedad.setVisible(true);
			}
			
			if(this.jPanelPaginacionEnfermedad!=null) {
				this.jPanelPaginacionEnfermedad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEnfermedad!=null) {
				this.jPanelParametrosReportesEnfermedad.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.enfermedadSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEnfermedad!=null) {
					this.jTabbedPaneBusquedasEnfermedad.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEnfermedad!=null) {
				this.jPanelParametrosReportesEnfermedad.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.enfermedadSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEnfermedad!=null) {
				this.jTabbedPaneBusquedasEnfermedad.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEnfermedad!=null) {
				this.jPanelParametrosReportesEnfermedad.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdTipoEnfermedad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoEnfermedad) {this.jTabbedPaneBusquedasEnfermedad.remove(jPanelFK_IdTipoEnfermedadEnfermedad);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoEnfermedad(Boolean isParaTipoEnfermedad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoEnfermedadNegation=!isParaTipoEnfermedad;

			this.isVisibilidadFK_IdTipoEnfermedad=isParaTipoEnfermedad;
			if(!this.isVisibilidadFK_IdTipoEnfermedad) {this.jTabbedPaneBusquedasEnfermedad.remove(jPanelFK_IdTipoEnfermedadEnfermedad);}
		}
		
	}
	
	

	public String registrarSesionEnfermedadParaEmpleadoEnferes() throws Exception {
		Boolean isPaginaPopupEmpleadoEnfer=false;

		try {

			if(this.enfermedadSessionBean==null) {
				this.enfermedadSessionBean=new EnfermedadSessionBean();
			}

			if(this.jInternalFrameDetalleFormEnfermedad.empleadoenferSessionBean==null) {
				this.jInternalFrameDetalleFormEnfermedad.empleadoenferSessionBean=new EmpleadoEnferSessionBean();
			}

			this.jInternalFrameDetalleFormEnfermedad.empleadoenferSessionBean.setsPathNavegacionActual(enfermedadSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEnfermedad.empleadoenferSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEmpleadoEnfer=this.jInternalFrameDetalleFormEnfermedad.empleadoenferSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEnfermedad.empleadoenferSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleadoEnfer(true);
			this.jInternalFrameDetalleFormEnfermedad.empleadoenferSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoEnfer(EnfermedadConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEnfermedad.empleadoenferSessionBean.setisBusquedaDesdeForeignKeySesionEnfermedad(true);
			this.jInternalFrameDetalleFormEnfermedad.empleadoenferSessionBean.setlidEnfermedadActual(this.idEnfermedadActual);

			enfermedadSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEnfermedad(true);
			enfermedadSessionBean.setlIdEnfermedadActualForeignKey(this.idEnfermedadActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EnfermedadSessionBean enfermedadSessionBean=new EnfermedadSessionBean();
		
		if(this.enfermedadSessionBean==null) {
			this.enfermedadSessionBean=new EnfermedadSessionBean();
		}
		
		this.enfermedadSessionBean.setsUltimaBusquedaEnfermedad(this.getsAccionBusqueda());
		this.enfermedadSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.enfermedadSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			enfermedadSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoEnfermedad")) {
			enfermedadSessionBean.setid_tipo_enfermedad(this.getid_tipo_enfermedadFK_IdTipoEnfermedad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EnfermedadSessionBean enfermedadSessionBean=new EnfermedadSessionBean();
		
		if(this.enfermedadSessionBean==null) {
			this.enfermedadSessionBean=new EnfermedadSessionBean();
		}
		
		if(this.enfermedadSessionBean.getsUltimaBusquedaEnfermedad()!=null&&!this.enfermedadSessionBean.getsUltimaBusquedaEnfermedad().equals("")) {
			this.setsAccionBusqueda(enfermedadSessionBean.getsUltimaBusquedaEnfermedad());
			this.setiNumeroPaginacion(enfermedadSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(enfermedadSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(enfermedadSessionBean.getid_empresa());
				enfermedadSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoEnfermedad")) {
				this.setid_tipo_enfermedadFK_IdTipoEnfermedad(enfermedadSessionBean.getid_tipo_enfermedad());
				enfermedadSessionBean.setid_tipo_enfermedad(-1L);
			}
		}
		
		this.enfermedadSessionBean.setsUltimaBusquedaEnfermedad("");
		this.enfermedadSessionBean.setiNumeroPaginacion(EnfermedadConstantesFunciones.INUMEROPAGINACION);
		this.enfermedadSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEnfermedad(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEnfermedad() {
		this.updateBorderResaltarBusquedasFormularioEnfermedad();
		this.updateVisibilidadBusquedasFormularioEnfermedad();
		this.updateHabilitarBusquedasFormularioEnfermedad();
	}
	
	public void updateBorderResaltarBusquedasFormularioEnfermedad() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEnfermedad.getComponents().length>0) {
	

		if(this.enfermedadConstantesFunciones.resaltarFK_IdTipoEnfermedadEnfermedad!=null) {
			index= this.jTabbedPaneBusquedasEnfermedad.indexOfComponent(this.jPanelFK_IdTipoEnfermedadEnfermedad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEnfermedad.getComponent(index);
				jPanel.setBorder(this.enfermedadConstantesFunciones.resaltarFK_IdTipoEnfermedadEnfermedad);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEnfermedad() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEnfermedad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEnfermedad.indexOfComponent(this.jPanelFK_IdTipoEnfermedadEnfermedad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEnfermedad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.enfermedadConstantesFunciones.mostrarFK_IdTipoEnfermedadEnfermedad);
			if(!this.enfermedadConstantesFunciones.mostrarFK_IdTipoEnfermedadEnfermedad && index>-1) {
				this.jTabbedPaneBusquedasEnfermedad.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEnfermedad() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEnfermedad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEnfermedad.indexOfComponent(this.jPanelFK_IdTipoEnfermedadEnfermedad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEnfermedad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.enfermedadConstantesFunciones.activarFK_IdTipoEnfermedadEnfermedad);
				this.jTabbedPaneBusquedasEnfermedad.setEnabledAt(index,this.enfermedadConstantesFunciones.activarFK_IdTipoEnfermedadEnfermedad);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEnfermedad(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTipoEnfermedad")) {
			index= this.jTabbedPaneBusquedasEnfermedad.indexOfComponent(this.jPanelFK_IdTipoEnfermedadEnfermedad);

			this.jTabbedPaneBusquedasEnfermedad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEnfermedad.getComponent(index);

			this.enfermedadConstantesFunciones.setResaltarFK_IdTipoEnfermedadEnfermedad(resaltar);

			jPanel.setBorder(this.enfermedadConstantesFunciones.resaltarFK_IdTipoEnfermedadEnfermedad);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEnfermedad.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEnfermedad() throws Exception {

		if(this.jInternalFrameDetalleFormEnfermedad==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEnfermedad();
		this.updateVisibilidadResaltarControlesFormularioEnfermedad();
		this.updateHabilitarResaltarControlesFormularioEnfermedad();
		
	}
	
	public void updateBorderResaltarControlesFormularioEnfermedad() throws Exception {
		if(this.jInternalFrameDetalleFormEnfermedad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.enfermedadConstantesFunciones.resaltaridEnfermedad!=null && this.jInternalFrameDetalleFormEnfermedad!=null) {this.jInternalFrameDetalleFormEnfermedad.jLabelidEnfermedad.setBorder(this.enfermedadConstantesFunciones.resaltaridEnfermedad);}
		if(this.enfermedadConstantesFunciones.resaltarid_empresaEnfermedad!=null && this.jInternalFrameDetalleFormEnfermedad!=null) {this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_empresaEnfermedad.setBorder(this.enfermedadConstantesFunciones.resaltarid_empresaEnfermedad);}
		if(this.enfermedadConstantesFunciones.resaltarid_tipo_enfermedadEnfermedad!=null && this.jInternalFrameDetalleFormEnfermedad!=null) {this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_tipo_enfermedadEnfermedad.setBorder(this.enfermedadConstantesFunciones.resaltarid_tipo_enfermedadEnfermedad);}
		if(this.enfermedadConstantesFunciones.resaltarnombreEnfermedad!=null && this.jInternalFrameDetalleFormEnfermedad!=null) {this.jInternalFrameDetalleFormEnfermedad.jTextAreanombreEnfermedad.setBorder(this.enfermedadConstantesFunciones.resaltarnombreEnfermedad);}
		if(this.enfermedadConstantesFunciones.resaltardescripcionEnfermedad!=null && this.jInternalFrameDetalleFormEnfermedad!=null) {this.jInternalFrameDetalleFormEnfermedad.jTextAreadescripcionEnfermedad.setBorder(this.enfermedadConstantesFunciones.resaltardescripcionEnfermedad);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEnfermedad() throws Exception {		
		if(this.jInternalFrameDetalleFormEnfermedad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) {
	
		//this.jInternalFrameDetalleFormEnfermedad.jLabelidEnfermedad.setVisible(this.enfermedadConstantesFunciones.mostraridEnfermedad);
		this.jInternalFrameDetalleFormEnfermedad.jPanelidEnfermedad.setVisible(this.enfermedadConstantesFunciones.mostraridEnfermedad);
		//this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_empresaEnfermedad.setVisible(this.enfermedadConstantesFunciones.mostrarid_empresaEnfermedad);
		this.jInternalFrameDetalleFormEnfermedad.jPanelid_empresaEnfermedad.setVisible(this.enfermedadConstantesFunciones.mostrarid_empresaEnfermedad);
		//this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_tipo_enfermedadEnfermedad.setVisible(this.enfermedadConstantesFunciones.mostrarid_tipo_enfermedadEnfermedad);
		this.jInternalFrameDetalleFormEnfermedad.jPanelid_tipo_enfermedadEnfermedad.setVisible(this.enfermedadConstantesFunciones.mostrarid_tipo_enfermedadEnfermedad);
		//this.jInternalFrameDetalleFormEnfermedad.jTextAreanombreEnfermedad.setVisible(this.enfermedadConstantesFunciones.mostrarnombreEnfermedad);
		this.jInternalFrameDetalleFormEnfermedad.jPanelnombreEnfermedad.setVisible(this.enfermedadConstantesFunciones.mostrarnombreEnfermedad);
		//this.jInternalFrameDetalleFormEnfermedad.jTextAreadescripcionEnfermedad.setVisible(this.enfermedadConstantesFunciones.mostrardescripcionEnfermedad);
		this.jInternalFrameDetalleFormEnfermedad.jPaneldescripcionEnfermedad.setVisible(this.enfermedadConstantesFunciones.mostrardescripcionEnfermedad);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEnfermedad() throws Exception {
		if(this.jInternalFrameDetalleFormEnfermedad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEnfermedad!=null) {
	
		this.jInternalFrameDetalleFormEnfermedad.jLabelidEnfermedad.setEnabled(this.enfermedadConstantesFunciones.activaridEnfermedad);
		this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_empresaEnfermedad.setEnabled(this.enfermedadConstantesFunciones.activarid_empresaEnfermedad);
		this.jInternalFrameDetalleFormEnfermedad.jComboBoxid_tipo_enfermedadEnfermedad.setEnabled(this.enfermedadConstantesFunciones.activarid_tipo_enfermedadEnfermedad);
		this.jInternalFrameDetalleFormEnfermedad.jTextAreanombreEnfermedad.setEnabled(this.enfermedadConstantesFunciones.activarnombreEnfermedad);
		this.jInternalFrameDetalleFormEnfermedad.jTextAreadescripcionEnfermedad.setEnabled(this.enfermedadConstantesFunciones.activardescripcionEnfermedad);
		}
	}
	
		
}