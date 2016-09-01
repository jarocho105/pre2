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

import com.bydan.erp.nomina.util.TipoEnfermedadConstantesFunciones;
import com.bydan.erp.nomina.util.TipoEnfermedadParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoEnfermedadParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoEnfermedadBean;
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
public class TipoEnfermedadBeanSwingJInternalFrame extends TipoEnfermedadJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoEnfermedadBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoEnfermedad> tipoenfermedadValidator = new ClassValidator<TipoEnfermedad>(TipoEnfermedad.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoEnfermedad tipoenfermedad;	
	public TipoEnfermedad tipoenfermedadAux;
	public TipoEnfermedad tipoenfermedadAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoEnfermedad tipoenfermedadTotales;
	public Long idTipoEnfermedadActual;
	public Long iIdNuevoTipoEnfermedad=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosEnfermedad=false;

	public Boolean getIsTienePermisosEnfermedad() {
		return isTienePermisosEnfermedad;
	}

	public void setIsTienePermisosEnfermedad(Boolean isTienePermisosEnfermedad) {
		this.isTienePermisosEnfermedad= isTienePermisosEnfermedad;
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
	
	public Boolean isPermisoTodoTipoEnfermedad;
	public Boolean isPermisoNuevoTipoEnfermedad;
	public Boolean isPermisoActualizarTipoEnfermedad;
	public Boolean isPermisoActualizarOriginalTipoEnfermedad;
	public Boolean isPermisoEliminarTipoEnfermedad;
	public Boolean isPermisoGuardarCambiosTipoEnfermedad;
	public Boolean isPermisoConsultaTipoEnfermedad;
	public Boolean isPermisoBusquedaTipoEnfermedad;
	public Boolean isPermisoReporteTipoEnfermedad;
	public Boolean isPermisoPaginacionMedioTipoEnfermedad;
	public Boolean isPermisoPaginacionAltoTipoEnfermedad;
	public Boolean isPermisoPaginacionTodoTipoEnfermedad;
	public Boolean isPermisoCopiarTipoEnfermedad;
	public Boolean isPermisoVerFormTipoEnfermedad;
	public Boolean isPermisoDuplicarTipoEnfermedad;
	public Boolean isPermisoOrdenTipoEnfermedad;
	
	
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
	
	public TipoEnfermedadParameterReturnGeneral tipoenfermedadReturnGeneral;
	public TipoEnfermedadParameterReturnGeneral tipoenfermedadParameterGeneral;
	
	

	public EnfermedadLogic enfermedadLogic=null;

	public EnfermedadLogic getEnfermedadLogic() {
		return enfermedadLogic;
	}

	public void setEnfermedadLogic(EnfermedadLogic enfermedadLogic) {
		this.enfermedadLogic = enfermedadLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoEnfermedad=false;
	public Boolean esParaAccionDesdeFormularioTipoEnfermedad=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoEnfermedadSessionBeanAdditional tipoenfermedadSessionBeanAdditional=null;
	
	public TipoEnfermedadSessionBeanAdditional getTipoEnfermedadSessionBeanAdditional() {
		return this.tipoenfermedadSessionBeanAdditional;
	}
	
	public void setTipoEnfermedadSessionBeanAdditional(TipoEnfermedadSessionBeanAdditional tipoenfermedadSessionBeanAdditional) {
		try {
			this.tipoenfermedadSessionBeanAdditional=tipoenfermedadSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoEnfermedadBeanSwingJInternalFrameAdditional tipoenfermedadBeanSwingJInternalFrameAdditional=null;
	//public class TipoEnfermedadBeanSwingJInternalFrame
	
	public TipoEnfermedadBeanSwingJInternalFrameAdditional getTipoEnfermedadBeanSwingJInternalFrameAdditional() {
		return this.tipoenfermedadBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoEnfermedadBeanSwingJInternalFrameAdditional(TipoEnfermedadBeanSwingJInternalFrameAdditional tipoenfermedadBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoenfermedadBeanSwingJInternalFrameAdditional=tipoenfermedadBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoEnfermedadLogic tipoenfermedadLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoEnfermedad tipoenfermedadBean;
	public TipoEnfermedadConstantesFunciones tipoenfermedadConstantesFunciones;
	//public TipoEnfermedadParameterReturnGeneral tipoenfermedadReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoEnfermedad> tipoenfermedads;	
	//public List<TipoEnfermedad> tipoenfermedadsEliminados;
	//public List<TipoEnfermedad> tipoenfermedadsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoEnfermedad=false;
	public Boolean isVisibilidadCeldaDuplicarTipoEnfermedad=true;
	public Boolean isVisibilidadCeldaCopiarTipoEnfermedad=true;
	public Boolean isVisibilidadCeldaVerFormTipoEnfermedad=true;
	public Boolean isVisibilidadCeldaOrdenTipoEnfermedad=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoEnfermedad=false;
	public Boolean isVisibilidadCeldaModificarTipoEnfermedad=false;
	public Boolean isVisibilidadCeldaActualizarTipoEnfermedad=false;
	public Boolean isVisibilidadCeldaEliminarTipoEnfermedad=false;
	public Boolean isVisibilidadCeldaCancelarTipoEnfermedad=false;
	public Boolean isVisibilidadCeldaGuardarTipoEnfermedad=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoEnfermedad=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoEnfermedad() {
		return this.iIdNuevoTipoEnfermedad;
	}

	public void setiIdNuevoTipoEnfermedad(Long iIdNuevoTipoEnfermedad) {
		this.iIdNuevoTipoEnfermedad = iIdNuevoTipoEnfermedad;
	}
	
	public Long getidTipoEnfermedadActual() {
		return this.idTipoEnfermedadActual;
	}

	public void setidTipoEnfermedadActual(Long idTipoEnfermedadActual) {
		this.idTipoEnfermedadActual = idTipoEnfermedadActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoEnfermedad gettipoenfermedad() {
		return this.tipoenfermedad;
	}

	public void settipoenfermedad(TipoEnfermedad tipoenfermedad) {
		this.tipoenfermedad = tipoenfermedad;
	}
	
	public TipoEnfermedad gettipoenfermedadAux() {
		return this.tipoenfermedadAux;
	}

	public void settipoenfermedadAux(TipoEnfermedad tipoenfermedadAux) {
		this.tipoenfermedadAux = tipoenfermedadAux;
	}				
	
	public TipoEnfermedad gettipoenfermedadAnterior() {
		return this.tipoenfermedadAnterior;
	}

	public void settipoenfermedadAnterior(TipoEnfermedad tipoenfermedadAnterior) {
		this.tipoenfermedadAnterior = tipoenfermedadAnterior;
	}	
	
	public TipoEnfermedad gettipoenfermedadTotales() {
		return this.tipoenfermedadTotales;
	}

	public void settipoenfermedadTotales(TipoEnfermedad tipoenfermedadTotales) {
		this.tipoenfermedadTotales = tipoenfermedadTotales;
	}	
	
	public TipoEnfermedad gettipoenfermedadBean() {
		return this.tipoenfermedadBean;
	}

	public void settipoenfermedadBean(TipoEnfermedad tipoenfermedadBean) {
		this.tipoenfermedadBean = tipoenfermedadBean;
	}	
	
	public TipoEnfermedadParameterReturnGeneral gettipoenfermedadReturnGeneral() {
		return this.tipoenfermedadReturnGeneral;
	}

	public void settipoenfermedadReturnGeneral(TipoEnfermedadParameterReturnGeneral tipoenfermedadReturnGeneral) {
		this.tipoenfermedadReturnGeneral = tipoenfermedadReturnGeneral;
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
	
	
	public TipoEnfermedadLogic getTipoEnfermedadLogic()	{		
		return tipoenfermedadLogic;
	}

	public void setTipoEnfermedadLogic(TipoEnfermedadLogic tipoenfermedadLogic) {
		this.tipoenfermedadLogic = tipoenfermedadLogic;
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
	
	public Boolean getIsEsNuevoTipoEnfermedad() {
		return isEsNuevoTipoEnfermedad;
	}

	public void setIsEsNuevoTipoEnfermedad(Boolean isEsNuevoTipoEnfermedad) {
		this.isEsNuevoTipoEnfermedad = isEsNuevoTipoEnfermedad;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoEnfermedad() {
		return esParaAccionDesdeFormularioTipoEnfermedad;
	}
	
	public void setEsParaAccionDesdeFormularioTipoEnfermedad(Boolean esParaAccionDesdeFormularioTipoEnfermedad) {
		this.esParaAccionDesdeFormularioTipoEnfermedad = esParaAccionDesdeFormularioTipoEnfermedad;
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

			if(this.tipoenfermedadSessionBean==null) {
				this.tipoenfermedadSessionBean=new TipoEnfermedadSessionBean();
			}

			if(!this.tipoenfermedadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoenfermedadSessionBean.getlidEmpresaActual());
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

					if(this.tipoenfermedad!=null) {
						this.tipoenfermedad.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
						this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxid_empresaTipoEnfermedad.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoEnfermedad.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
						if(this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxid_empresaTipoEnfermedad.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxid_empresaTipoEnfermedad.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoEnfermedadGenerico)throws Exception
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
				jComboBoxid_empresaTipoEnfermedadGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoEnfermedadGenerico!=null && jComboBoxid_empresaTipoEnfermedadGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoEnfermedadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoEnfermedad tipoenfermedad,JComboBox jComboBoxid_empresaTipoEnfermedadGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoEnfermedadGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxid_empresaTipoEnfermedad.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoEnfermedadGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoenfermedad.setid_empresa(empresaAux.getId());
				tipoenfermedad.setempresa_descripcion(TipoEnfermedadConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoenfermedad.setEmpresa(empresaAux);			}
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

					if(!TipoEnfermedadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { 
							this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxid_empresaTipoEnfermedad.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxid_empresaTipoEnfermedad.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { 
					}

					if(!TipoEnfermedadJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
							this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxid_empresaTipoEnfermedad.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
							this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxid_empresaTipoEnfermedad.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoEnfermedad() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoEnfermedadConstantesFunciones.refrescarForeignKeysDescripcionesTipoEnfermedad(this.tipoenfermedadLogic.getTipoEnfermedads());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoEnfermedadConstantesFunciones.refrescarForeignKeysDescripcionesTipoEnfermedad(this.tipoenfermedads);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoenfermedadLogic.setTipoEnfermedads(this.tipoenfermedads);
			tipoenfermedadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoEnfermedadParameterReturnGeneral getTipoEnfermedadParameterGeneral() {
		return this.tipoenfermedadParameterGeneral;
	}
	
	public void setTipoEnfermedadParameterGeneral(TipoEnfermedadParameterReturnGeneral tipoenfermedadParameterGeneral) {
		this.tipoenfermedadParameterGeneral = tipoenfermedadParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoEnfermedad() {
		return isPermisoTodoTipoEnfermedad;
	}

	public void setIsPermisoTodoTipoEnfermedad(Boolean isPermisoTodoTipoEnfermedad) {
		this.isPermisoTodoTipoEnfermedad = isPermisoTodoTipoEnfermedad;
	}

	public Boolean getIsPermisoNuevoTipoEnfermedad() {
		return isPermisoNuevoTipoEnfermedad;
	}

	public void setIsPermisoNuevoTipoEnfermedad(Boolean isPermisoNuevoTipoEnfermedad) {
		this.isPermisoNuevoTipoEnfermedad = isPermisoNuevoTipoEnfermedad;
	}

	public Boolean getIsPermisoActualizarTipoEnfermedad() {
		return isPermisoActualizarTipoEnfermedad;
	}

	public void setIsPermisoActualizarTipoEnfermedad(Boolean isPermisoActualizarTipoEnfermedad) {
		this.isPermisoActualizarTipoEnfermedad = isPermisoActualizarTipoEnfermedad;
	}

	public Boolean getIsPermisoEliminarTipoEnfermedad() {
		return isPermisoEliminarTipoEnfermedad;
	}

	public void setIsPermisoEliminarTipoEnfermedad(Boolean isPermisoEliminarTipoEnfermedad) {
		this.isPermisoEliminarTipoEnfermedad = isPermisoEliminarTipoEnfermedad;
	}

	public Boolean getIsPermisoGuardarCambiosTipoEnfermedad() {
		return isPermisoGuardarCambiosTipoEnfermedad;
	}

	public void setIsPermisoGuardarCambiosTipoEnfermedad(Boolean isPermisoGuardarCambiosTipoEnfermedad) {
		this.isPermisoGuardarCambiosTipoEnfermedad = isPermisoGuardarCambiosTipoEnfermedad;
	}
	
	public Boolean getIsPermisoConsultaTipoEnfermedad() {
		return isPermisoConsultaTipoEnfermedad;
	}

	public void setIsPermisoConsultaTipoEnfermedad(Boolean isPermisoConsultaTipoEnfermedad) {
		this.isPermisoConsultaTipoEnfermedad = isPermisoConsultaTipoEnfermedad;
	}

	public Boolean getIsPermisoBusquedaTipoEnfermedad() {
		return isPermisoBusquedaTipoEnfermedad;
	}

	public void setIsPermisoBusquedaTipoEnfermedad(Boolean isPermisoBusquedaTipoEnfermedad) {
		this.isPermisoBusquedaTipoEnfermedad = isPermisoBusquedaTipoEnfermedad;
	}

	public Boolean getIsPermisoReporteTipoEnfermedad() {
		return isPermisoReporteTipoEnfermedad;
	}

	public void setIsPermisoReporteTipoEnfermedad(Boolean isPermisoReporteTipoEnfermedad) {
		this.isPermisoReporteTipoEnfermedad = isPermisoReporteTipoEnfermedad;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoEnfermedad() {
		return isPermisoPaginacionMedioTipoEnfermedad;
	}

	public void setIsPermisoPaginacionMedioTipoEnfermedad(Boolean isPermisoPaginacionMedioTipoEnfermedad) {
		this.isPermisoPaginacionMedioTipoEnfermedad = isPermisoPaginacionMedioTipoEnfermedad;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoEnfermedad() {
		return isPermisoPaginacionTodoTipoEnfermedad;
	}

	public void setIsPermisoPaginacionTodoTipoEnfermedad(Boolean isPermisoPaginacionTodoTipoEnfermedad) {
		this.isPermisoPaginacionTodoTipoEnfermedad = isPermisoPaginacionTodoTipoEnfermedad;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoEnfermedad() {
		return isPermisoPaginacionAltoTipoEnfermedad;
	}

	public void setIsPermisoPaginacionAltoTipoEnfermedad(Boolean isPermisoPaginacionAltoTipoEnfermedad) {
		this.isPermisoPaginacionAltoTipoEnfermedad = isPermisoPaginacionAltoTipoEnfermedad;
	}
	
	public Boolean getIsPermisoCopiarTipoEnfermedad() {
		return isPermisoCopiarTipoEnfermedad;
	}

	public void setIsPermisoCopiarTipoEnfermedad(Boolean isPermisoCopiarTipoEnfermedad) {
		this.isPermisoCopiarTipoEnfermedad = isPermisoCopiarTipoEnfermedad;
	}
	
	public Boolean getIsPermisoVerFormTipoEnfermedad() {
		return isPermisoVerFormTipoEnfermedad;
	}

	public void setIsPermisoVerFormTipoEnfermedad(Boolean isPermisoVerFormTipoEnfermedad) {
		this.isPermisoVerFormTipoEnfermedad = isPermisoVerFormTipoEnfermedad;
	}
	
	public Boolean getIsPermisoDuplicarTipoEnfermedad() {
		return isPermisoDuplicarTipoEnfermedad;
	}

	public void setIsPermisoDuplicarTipoEnfermedad(Boolean isPermisoDuplicarTipoEnfermedad) {
		this.isPermisoDuplicarTipoEnfermedad = isPermisoDuplicarTipoEnfermedad;
	}
	
	public Boolean getIsPermisoOrdenTipoEnfermedad() {
		return isPermisoOrdenTipoEnfermedad;
	}

	public void setIsPermisoOrdenTipoEnfermedad(Boolean isPermisoOrdenTipoEnfermedad) {
		this.isPermisoOrdenTipoEnfermedad = isPermisoOrdenTipoEnfermedad;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoEnfermedad() {
		return isVisibilidadCeldaNuevoTipoEnfermedad;
	}

	public void setIsVisibilidadCeldaNuevoTipoEnfermedad(Boolean isVisibilidadCeldaNuevoTipoEnfermedad) {
		this.isVisibilidadCeldaNuevoTipoEnfermedad = isVisibilidadCeldaNuevoTipoEnfermedad;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoEnfermedad() {
		return isVisibilidadCeldaDuplicarTipoEnfermedad;
	}

	public void setIsVisibilidadCeldaDuplicarTipoEnfermedad(Boolean isVisibilidadCeldaDuplicarTipoEnfermedad) {
		this.isVisibilidadCeldaDuplicarTipoEnfermedad = isVisibilidadCeldaDuplicarTipoEnfermedad;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoEnfermedad() {
		return isVisibilidadCeldaCopiarTipoEnfermedad;
	}

	public void setIsVisibilidadCeldaCopiarTipoEnfermedad(Boolean isVisibilidadCeldaCopiarTipoEnfermedad) {
		this.isVisibilidadCeldaCopiarTipoEnfermedad = isVisibilidadCeldaCopiarTipoEnfermedad;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoEnfermedad() {
		return isVisibilidadCeldaVerFormTipoEnfermedad;
	}

	public void setIsVisibilidadCeldaVerFormTipoEnfermedad(Boolean isVisibilidadCeldaVerFormTipoEnfermedad) {
		this.isVisibilidadCeldaVerFormTipoEnfermedad = isVisibilidadCeldaVerFormTipoEnfermedad;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoEnfermedad() {
		return isVisibilidadCeldaOrdenTipoEnfermedad;
	}

	public void setIsVisibilidadCeldaOrdenTipoEnfermedad(Boolean isVisibilidadCeldaOrdenTipoEnfermedad) {
		this.isVisibilidadCeldaOrdenTipoEnfermedad = isVisibilidadCeldaOrdenTipoEnfermedad;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoEnfermedad() {
		return isVisibilidadCeldaNuevoRelacionesTipoEnfermedad;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoEnfermedad(Boolean isVisibilidadCeldaNuevoRelacionesTipoEnfermedad) {
		this.isVisibilidadCeldaNuevoRelacionesTipoEnfermedad = isVisibilidadCeldaNuevoRelacionesTipoEnfermedad;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoEnfermedad() {
		return isVisibilidadCeldaModificarTipoEnfermedad;
	}

	public void setIsVisibilidadCeldaModificarTipoEnfermedad(Boolean isVisibilidadCeldaModificarTipoEnfermedad) {
		this.isVisibilidadCeldaModificarTipoEnfermedad = isVisibilidadCeldaModificarTipoEnfermedad;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoEnfermedad() {
		return isVisibilidadCeldaActualizarTipoEnfermedad;
	}

	public void setIsVisibilidadCeldaActualizarTipoEnfermedad(Boolean isVisibilidadCeldaActualizarTipoEnfermedad) {
		this.isVisibilidadCeldaActualizarTipoEnfermedad = isVisibilidadCeldaActualizarTipoEnfermedad;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoEnfermedad() {
		return isVisibilidadCeldaEliminarTipoEnfermedad;
	}

	public void setIsVisibilidadCeldaEliminarTipoEnfermedad(Boolean isVisibilidadCeldaEliminarTipoEnfermedad) {
		this.isVisibilidadCeldaEliminarTipoEnfermedad = isVisibilidadCeldaEliminarTipoEnfermedad;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoEnfermedad() {
		return isVisibilidadCeldaCancelarTipoEnfermedad;
	}

	public void setIsVisibilidadCeldaCancelarTipoEnfermedad(Boolean isVisibilidadCeldaCancelarTipoEnfermedad) {
		this.isVisibilidadCeldaCancelarTipoEnfermedad = isVisibilidadCeldaCancelarTipoEnfermedad;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoEnfermedad() {
		return isVisibilidadCeldaGuardarTipoEnfermedad;
	}

	public void setIsVisibilidadCeldaGuardarTipoEnfermedad(Boolean isVisibilidadCeldaGuardarTipoEnfermedad) {
		this.isVisibilidadCeldaGuardarTipoEnfermedad = isVisibilidadCeldaGuardarTipoEnfermedad;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoEnfermedad() {
		return isVisibilidadCeldaGuardarCambiosTipoEnfermedad;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoEnfermedad(Boolean isVisibilidadCeldaGuardarCambiosTipoEnfermedad) {
		this.isVisibilidadCeldaGuardarCambiosTipoEnfermedad = isVisibilidadCeldaGuardarCambiosTipoEnfermedad;
	}
		
	public TipoEnfermedadSessionBean gettipoenfermedadSessionBean() {
		return this.tipoenfermedadSessionBean;
	}
	
	public void settipoenfermedadSessionBean(TipoEnfermedadSessionBean tipoenfermedadSessionBean) {
		this.tipoenfermedadSessionBean=tipoenfermedadSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoEnfermedad(TipoEnfermedad tipoenfermedad)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoenfermedad,null);
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
	
	public void bugActualizarReferenciaActual(TipoEnfermedad tipoenfermedad,TipoEnfermedad tipoenfermedadAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoEnfermedad(tipoenfermedad);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoenfermedadAux.setId(tipoenfermedad.getId());
		tipoenfermedadAux.setVersionRow(tipoenfermedad.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoEnfermedad();
		
			int intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoEnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoEnfermedad(this.tipoenfermedad,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEnfermedad(this.tipoenfermedad);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoenfermedadValidator.getInvalidValues(this.tipoenfermedad);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoenfermedadLogic.setDatosCliente(datosCliente);
			tipoenfermedadLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoenfermedadAux=new  TipoEnfermedad();
				
				tipoenfermedadAux.setIsNew(true);
				tipoenfermedadAux.setIsChanged(true);
				
				tipoenfermedadAux.setTipoEnfermedadOriginal(this.tipoenfermedad);
				
				tipoenfermedadAux.setId(this.tipoenfermedad.getId());	
				tipoenfermedadAux.setVersionRow(this.tipoenfermedad.getVersionRow());	
				tipoenfermedadAux.setid_empresa(this.tipoenfermedad.getid_empresa());	
				tipoenfermedadAux.setcodigo(this.tipoenfermedad.getcodigo());	
				tipoenfermedadAux.setnombre(this.tipoenfermedad.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoenfermedadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoenfermedadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoenfermedadAux,tipoenfermedadLogic.getTipoEnfermedads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoenfermedadAux,tipoenfermedads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoenfermedadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoenfermedadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoenfermedadLogic.saveTipoEnfermedads();//WithConnection
						//tipoenfermedadLogic.getSetVersionRowTipoEnfermedads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoenfermedad,tipoenfermedadAux);
					
					this.refrescarForeignKeysDescripcionesTipoEnfermedad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoenfermedadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadLogic.getEnfermedads().addAll(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedads.addAll(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoenfermedadLogic.saveTipoEnfermedadRelaciones(tipoenfermedadAux,this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadLogic.getEnfermedads());//WithConnection
								//tipoenfermedadLogic.getSetVersionRowTipoEnfermedads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoenfermedad,tipoenfermedadAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadLogic.setEnfermedads(new ArrayList<Enfermedad>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedads= new ArrayList<Enfermedad>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoenfermedadAux.setEnfermedads(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadLogic.getEnfermedads());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoenfermedadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoenfermedadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoenfermedadAux,tipoenfermedadLogic.getTipoEnfermedads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoenfermedadAux,tipoenfermedads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoenfermedad,tipoenfermedadAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoenfermedadAux=new  TipoEnfermedad();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoenfermedadSessionBean.getEsGuardarRelacionado() && this.tipoenfermedad.getId()>=0)) {
						
					tipoenfermedadAux.setIsNew(false);
				}
				
				tipoenfermedadAux.setIsDeleted(false);
			
				tipoenfermedadAux.setId(this.tipoenfermedad.getId());	
				tipoenfermedadAux.setVersionRow(this.tipoenfermedad.getVersionRow());	
				tipoenfermedadAux.setid_empresa(this.tipoenfermedad.getid_empresa());	
				tipoenfermedadAux.setcodigo(this.tipoenfermedad.getcodigo());	
				tipoenfermedadAux.setnombre(this.tipoenfermedad.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoenfermedadAux,tipoenfermedadLogic.getTipoEnfermedads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoenfermedadAux,tipoenfermedads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoenfermedadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoenfermedadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoenfermedadLogic.saveTipoEnfermedads();//WithConnection
						//tipoenfermedadLogic.getSetVersionRowTipoEnfermedads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoenfermedad,tipoenfermedadAux);
					
					this.refrescarForeignKeysDescripcionesTipoEnfermedad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoenfermedadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadLogic.getEnfermedads().addAll(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedads.addAll(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoenfermedadLogic.saveTipoEnfermedadRelaciones(tipoenfermedadAux,this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadLogic.getEnfermedads());//WithConnection
								//tipoenfermedadLogic.getSetVersionRowTipoEnfermedads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoenfermedad,tipoenfermedadAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadLogic.setEnfermedads(new ArrayList<Enfermedad>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedads= new ArrayList<Enfermedad>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoenfermedadAux.setEnfermedads(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadLogic.getEnfermedads());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoenfermedadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoenfermedadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoenfermedadAux,tipoenfermedadLogic.getTipoEnfermedads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoenfermedadAux,tipoenfermedads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoenfermedad,tipoenfermedadAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoenfermedadAux=new  TipoEnfermedad();
				
				tipoenfermedadAux.setIsNew(false);
				tipoenfermedadAux.setIsChanged(false);
				
				tipoenfermedadAux.setIsDeleted(true);
				
				tipoenfermedadAux.setId(this.tipoenfermedad.getId());	
				tipoenfermedadAux.setVersionRow(this.tipoenfermedad.getVersionRow());	
				tipoenfermedadAux.setid_empresa(this.tipoenfermedad.getid_empresa());	
				tipoenfermedadAux.setcodigo(this.tipoenfermedad.getcodigo());	
				tipoenfermedadAux.setnombre(this.tipoenfermedad.getnombre());	
				
				if(this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoenfermedadAux.getId()>=0) {	
						this.tipoenfermedadsEliminados.add(tipoenfermedadAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoenfermedadAux,tipoenfermedadLogic.getTipoEnfermedads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoenfermedadAux,tipoenfermedads);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoenfermedadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoenfermedadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoenfermedadLogic.saveTipoEnfermedads();//WithConnection
						//tipoenfermedadLogic.getSetVersionRowTipoEnfermedads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoenfermedadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadLogic.getEnfermedads().addAll(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedads.addAll(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jInternalFrameDetalleFormEnfermedad.empleadoenferBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoenfermedadLogic.saveTipoEnfermedadRelaciones(tipoenfermedadAux,this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadLogic.getEnfermedads());//WithConnection
								//tipoenfermedadLogic.getSetVersionRowTipoEnfermedads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadLogic.setEnfermedads(new ArrayList<Enfermedad>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedads= new ArrayList<Enfermedad>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoenfermedadAux.setEnfermedads(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadLogic.getEnfermedads());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoenfermedadSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoenfermedadSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoenfermedadAux,tipoenfermedadLogic.getTipoEnfermedads());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoenfermedadAux,tipoenfermedads);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.getTipoEnfermedads().addAll(this.tipoenfermedadsEliminados);
					
					tipoenfermedadLogic.saveTipoEnfermedads();//WithConnection
					//tipoenfermedadLogic.getSetVersionRowTipoEnfermedads();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoEnfermedad();
				
				this.tipoenfermedadsEliminados= new ArrayList<TipoEnfermedad>();		
			}
			
			if(this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Enfermedad GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Enfermedad",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoenfermedad=tipoenfermedadAux;
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
      		//this.finishProcessTipoEnfermedad();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoEnfermedad tipoenfermedadLocal) throws Exception {
		
		if(this.tipoenfermedadSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoenfermedadLocal.setEnfermedads(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadLogic.getEnfermedads());
			
			} else {
			
				tipoenfermedadLocal.setEnfermedads(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedads);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoEnfermedad tipoenfermedadLocal) throws Exception {	
		if(this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoenfermedadLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoEnfermedadActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoenfermedadValidator.getInvalidValues(this.tipoenfermedad);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoEnfermedad tipoenfermedad,List<TipoEnfermedad> tipoenfermedads) throws Exception {
		try	{		
			TipoEnfermedadConstantesFunciones.actualizarLista(tipoenfermedad,tipoenfermedads,this.tipoenfermedadSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoEnfermedad tipoenfermedad,List<TipoEnfermedad> tipoenfermedads) throws Exception {
		try	{			
			TipoEnfermedadConstantesFunciones.actualizarSelectedLista(tipoenfermedad,tipoenfermedads);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoEnfermedad> tipoenfermedadsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoenfermedadsLocal=this.tipoenfermedadLogic.getTipoEnfermedads();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoenfermedadsLocal=this.tipoenfermedads;
			}
			//ARCHITECTURE
		
			for(TipoEnfermedad tipoenfermedadLocal:tipoenfermedadsLocal) {
				if(this.permiteMantenimiento(tipoenfermedadLocal) && tipoenfermedadLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoEnfermedadConstantesFunciones.getTipoEnfermedadLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoEnfermedadConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEnfermedad.jLabelid_empresaTipoEnfermedad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoEnfermedadConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEnfermedad.jLabelcodigoTipoEnfermedad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoEnfermedadConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEnfermedad.jLabelnombreTipoEnfermedad,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoEnfermedad.jLabelid_empresaTipoEnfermedad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoEnfermedad.jLabelcodigoTipoEnfermedad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoEnfermedad.jLabelnombreTipoEnfermedad,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Enfermedad")) {
			if(this.tipoenfermedad==null) {
				this.tipoenfermedad= new TipoEnfermedad();
			}

			if(this.tipoenfermedadSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoEnfermedad
				this.setVariablesFormularioToObjetoActualTipoEnfermedad(this.tipoenfermedad,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEnfermedad(this.tipoenfermedad);

				this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.getenfermedad().setTipoEnfermedad(this.tipoenfermedad);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoEnfermedad--;	
		
		
		this.tipoenfermedadAux=new TipoEnfermedad();
		
		this.tipoenfermedadAux.setId(this.iIdNuevoTipoEnfermedad);
		this.tipoenfermedadAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoenfermedadLogic.getTipoEnfermedads().add(this.tipoenfermedadAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoenfermedads.add(this.tipoenfermedadAux);
		}
		//ARCHITECTURE
		
		this.tipoenfermedad=this.tipoenfermedadAux;
		
		if(TipoEnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoEnfermedad(this.tipoenfermedad);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoEnfermedad(this.tipoenfermedad);
		}
				
		//this.setDefaultControlesTipoEnfermedad();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoEnfermedad();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoEnfermedad();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEnfermedad();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoEnfermedad(this.tipoenfermedadBean,this.tipoenfermedad,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoEnfermedad(this.tipoenfermedad);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoEnfermedadConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoenfermedadSessionBean.getConGuardarRelaciones()) {
			classes=TipoEnfermedadConstantesFunciones.getClassesRelationshipsOfTipoEnfermedad(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoenfermedadReturnGeneral=tipoenfermedadLogic.procesarEventosTipoEnfermedadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoenfermedadLogic.getTipoEnfermedads(),this.tipoenfermedad,this.tipoenfermedadParameterGeneral,this.isEsNuevoTipoEnfermedad,classes);//this.tipoenfermedadLogic.getTipoEnfermedad()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoEnfermedad(this.tipoenfermedadReturnGeneral,this.tipoenfermedadBean,false);
		
		if(this.tipoenfermedadReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoEnfermedad(this.tipoenfermedadReturnGeneral.getTipoEnfermedad());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoEnfermedad(this.tipoenfermedadReturnGeneral.getTipoEnfermedad());
		}
		
		if(this.tipoenfermedadReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoEnfermedad(this.tipoenfermedadReturnGeneral.getTipoEnfermedad(),classes);//this.tipoenfermedadBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoEnfermedad(this.tipoenfermedad,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoEnfermedad();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoEnfermedad();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoEnfermedadBeanSwingJInternalFrameAdditional.RecargarFormTipoEnfermedad(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoEnfermedad(false);
						
			if(tipoenfermedadSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadSessionBean.getEsGuardarRelacionado() && EnfermedadJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEnfermedadActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoEnfermedadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEnfermedad();
			}
			
			this.actualizarVisualTableDatosTipoEnfermedad();
			
			this.jTableDatosTipoEnfermedad.setRowSelectionInterval(this.getIndiceNuevoTipoEnfermedad(), this.getIndiceNuevoTipoEnfermedad());
			
			this.seleccionarFilaTablaTipoEnfermedadActual();
						
			this.actualizarEstadoCeldasBotonesTipoEnfermedad("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoEnfermedad(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoEnfermedad.jTextFieldcodigoTipoEnfermedad.setEnabled(isHabilitar && this.tipoenfermedadConstantesFunciones.activarcodigoTipoEnfermedad);
		this.jInternalFrameDetalleFormTipoEnfermedad.jTextAreanombreTipoEnfermedad.setEnabled(isHabilitar && this.tipoenfermedadConstantesFunciones.activarnombreTipoEnfermedad);	
		//
		this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxid_empresaTipoEnfermedad.setEnabled(isHabilitar && this.tipoenfermedadConstantesFunciones.activarid_empresaTipoEnfermedad);
	};
	
	public void setDefaultControlesTipoEnfermedad() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoEnfermedad(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoenfermedadSessionBean.setConGuardarRelaciones(true);			
			this.tipoenfermedadSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoEnfermedad.jTabbedPaneRelacionesTipoEnfermedad.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoenfermedadSessionBean.setConGuardarRelaciones(false);			
			this.tipoenfermedadSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoEnfermedad.jTabbedPaneRelacionesTipoEnfermedad.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoEnfermedad() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEnfermedad tipoenfermedadAux:this.tipoenfermedadLogic.getTipoEnfermedads()) {
				if(tipoenfermedadAux.getId().equals(this.iIdNuevoTipoEnfermedad)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEnfermedad tipoenfermedadAux:this.tipoenfermedads) {
				if(tipoenfermedadAux.getId().equals(this.iIdNuevoTipoEnfermedad)) {
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
	
	public int getIndiceActualTipoEnfermedad(TipoEnfermedad tipoenfermedad,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEnfermedad tipoenfermedadAux:this.tipoenfermedadLogic.getTipoEnfermedads()) {
				if(tipoenfermedadAux.getId().equals(tipoenfermedad.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEnfermedad tipoenfermedadAux:this.tipoenfermedads) {
				if(tipoenfermedadAux.getId().equals(tipoenfermedad.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoEnfermedad(TipoEnfermedad tipoenfermedadOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEnfermedad tipoenfermedadAux:this.tipoenfermedadLogic.getTipoEnfermedads()) {
				if(tipoenfermedadAux.getTipoEnfermedadOriginal().getId().equals(tipoenfermedadOriginal.getId())) {
					existe=true;
					tipoenfermedadOriginal.setId(tipoenfermedadAux.getId());
					tipoenfermedadOriginal.setVersionRow(tipoenfermedadAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEnfermedad tipoenfermedadAux:this.tipoenfermedads) {
				if(tipoenfermedadAux.getTipoEnfermedadOriginal().getId().equals(tipoenfermedadOriginal.getId())) {
					existe=true;
					tipoenfermedadOriginal.setId(tipoenfermedadAux.getId());
					tipoenfermedadOriginal.setVersionRow(tipoenfermedadAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoEnfermedad(Boolean esParaCancelar) throws Exception {
		tipoenfermedadsAux=new ArrayList<TipoEnfermedad>();
		tipoenfermedadAux=new TipoEnfermedad();
		
		if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoEnfermedad tipoenfermedadAux:this.tipoenfermedadLogic.getTipoEnfermedads()) {
					if(tipoenfermedadAux.getId()<0) {
						tipoenfermedadsAux.add(tipoenfermedadAux);
					}		
				}
				this.iIdNuevoTipoEnfermedad=0L;
				this.tipoenfermedadLogic.getTipoEnfermedads().removeAll(tipoenfermedadsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEnfermedad tipoenfermedadAux:this.tipoenfermedads) {
					if(tipoenfermedadAux.getId()<0) {
						tipoenfermedadsAux.add(tipoenfermedadAux);
					}		
				}
				this.iIdNuevoTipoEnfermedad=0L;
				this.tipoenfermedads.removeAll(tipoenfermedadsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoEnfermedad 
					&& this.tipoenfermedadLogic.getTipoEnfermedads().size()>0
					) {
					tipoenfermedadAux=this.tipoenfermedadLogic.getTipoEnfermedads().get(this.tipoenfermedadLogic.getTipoEnfermedads().size() - 1);
				
					if(tipoenfermedadAux.getId()<0) {
						this.tipoenfermedadLogic.getTipoEnfermedads().remove(tipoenfermedadAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoEnfermedad && this.tipoenfermedads.size()>0) {
					tipoenfermedadAux=this.tipoenfermedads.get(this.tipoenfermedads.size() - 1);
				
					if(tipoenfermedadAux.getId()<0) {
						this.tipoenfermedads.remove(tipoenfermedadAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoEnfermedad(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoenfermedad.getId()<0) {
				this.tipoenfermedadLogic.getTipoEnfermedads().remove(this.tipoenfermedad);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoenfermedad.getId()<0) {
				this.tipoenfermedads.remove(this.tipoenfermedad);
			}
		}			
	}
	
	public void setEstadosInicialesTipoEnfermedad(List<TipoEnfermedad> tipoenfermedadsAux) throws Exception {
		TipoEnfermedadConstantesFunciones.setEstadosInicialesTipoEnfermedad(tipoenfermedadsAux);
	}
	
	public void setEstadosInicialesTipoEnfermedad(TipoEnfermedad tipoenfermedadAux) throws Exception {
		TipoEnfermedadConstantesFunciones.setEstadosInicialesTipoEnfermedad(tipoenfermedadAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoEnfermedadActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoEnfermedad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoEnfermedadActual()) {
				if(!this.isEsNuevoTipoEnfermedad) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoEnfermedad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoEnfermedad=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoEnfermedadActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Enfermedad ?", "MANTENIMIENTO DE Tipo Enfermedad", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoEnfermedad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoEnfermedad tipoenfermedad) throws Exception {
		TipoEnfermedadConstantesFunciones.seleccionarAsignar(this.tipoenfermedad,tipoenfermedad);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoEnfermedad=this.isPermisoActualizarOriginalTipoEnfermedad;
			
			
			this.seleccionarAsignar(tipoenfermedad);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoEnfermedadConstantesFunciones.quitarEspaciosTipoEnfermedad(this.tipoenfermedad,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoEnfermedad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoenfermedadSessionBean.setsFuncionBusquedaRapida(this.tipoenfermedadSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoEnfermedad) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoEnfermedad(esParaCancelar);				
				this.cancelarNuevoTipoEnfermedad(esParaCancelar);								
			}
			
			this.tipoenfermedad=new TipoEnfermedad();
			
			this.inicializarTipoEnfermedad();
			
			this.actualizarEstadoCeldasBotonesTipoEnfermedad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoEnfermedad() throws Exception {
		try {
			TipoEnfermedadConstantesFunciones.inicializarTipoEnfermedad(this.tipoenfermedad);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoenfermedadLogic.getTipoEnfermedads().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoEnfermedads(String sAccionBusqueda,List<TipoEnfermedad> tipoenfermedadsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoEnfermedad"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoEnfermedadMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoEnfermedadMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoEnfermedad"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Enfermedades");		
		parameters.put("busquedapor", TipoEnfermedadConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Enfermedad.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoEnfermedadLogic tipoenfermedadLogicAuxiliar=new TipoEnfermedadLogic();
					tipoenfermedadLogicAuxiliar.setDatosCliente(tipoenfermedadLogic.getDatosCliente());				
					tipoenfermedadLogicAuxiliar.setTipoEnfermedads(tipoenfermedadsParaReportes);
					
					tipoenfermedadLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoEnfermedadWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoenfermedadsParaReportes=tipoenfermedadLogicAuxiliar.getTipoEnfermedads();
					
					//tipoenfermedadLogic.getNewConnexionToDeep();
					
					//for (TipoEnfermedad tipoenfermedad:tipoenfermedadsParaReportes) {
					//	tipoenfermedadLogic.deepLoad(tipoenfermedad, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoenfermedadLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoenfermedadLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileEnfermedad = AuxiliarReportes.class.getResourceAsStream("EnfermedadDetalleRelacionesDesign.jasper");
			parameters.put("subreport_enfermedad", reportFileEnfermedad);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoEnfermedad=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoEnfermedadConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoEnfermedadConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoEnfermedad=new JRBeanArrayDataSource(TipoEnfermedadJInternalFrame.TraerTipoEnfermedadBeans(tipoenfermedadsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoEnfermedad);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoEnfermedadConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoEnfermedadConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoEnfermedadBean.TraerTipoEnfermedadBeans(tipoenfermedadsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoEnfermedads(sAccionBusqueda,sTipoArchivoReporte,tipoenfermedadsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoEnfermedads(sAccionBusqueda,sTipoArchivoReporte,tipoenfermedadsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoEnfermedadActionPerformed(null);
					//this.generarExcelReporteTipoEnfermedads(sAccionBusqueda,sTipoArchivoReporte,tipoenfermedadsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoEnfermedads(sAccionBusqueda,sTipoArchivoReporte,tipoenfermedadsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoEnfermedads(sAccionBusqueda,sTipoArchivoReporte,tipoenfermedadsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoEnfermedads(sAccionBusqueda,sTipoArchivoReporte,tipoenfermedadsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoEnfermedads(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEnfermedad> tipoenfermedadsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoenfermedad";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEnfermedads");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoEnfermedad("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoEnfermedad tipoenfermedad : tipoenfermedadsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoEnfermedadConstantesFunciones.generarExcelReporteDataTipoEnfermedad("NORMAL",row,workbook,tipoenfermedad,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Enfermedad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoEnfermedad(String sTipo,Row row,Workbook workbook) {
		
		TipoEnfermedadConstantesFunciones.generarExcelReporteHeaderTipoEnfermedad(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoEnfermedads(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEnfermedad> tipoenfermedadsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoenfermedad_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEnfermedads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoEnfermedad tipoenfermedad : tipoenfermedadsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoEnfermedadConstantesFunciones.getTipoEnfermedadDescripcion(tipoenfermedad));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoEnfermedadConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoEnfermedadConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoenfermedad.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoEnfermedadConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoEnfermedadConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoenfermedad.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoEnfermedadConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoEnfermedadConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoenfermedad.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Enfermedad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoEnfermedads(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEnfermedad> tipoenfermedadsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoEnfermedad> tipoenfermedadsRespaldo=null;
		
		classes=TipoEnfermedadConstantesFunciones.getClassesRelationshipsOfTipoEnfermedad(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoenfermedadLogic.setDatosCliente(this.datosCliente);
		this.tipoenfermedadLogic.setDatosDeep(this.datosDeep);
		this.tipoenfermedadLogic.setIsConDeep(true);
		
		tipoenfermedadsRespaldo=this.tipoenfermedadLogic.getTipoEnfermedads();
		
		this.tipoenfermedadLogic.setTipoEnfermedads(tipoenfermedadsParaReportes);	
		this.tipoenfermedadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoenfermedadsParaReportes=this.tipoenfermedadLogic.getTipoEnfermedads();
		this.tipoenfermedadLogic.setTipoEnfermedads(tipoenfermedadsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoenfermedad_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEnfermedads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoEnfermedad("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoEnfermedad tipoenfermedad : tipoenfermedadsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoEnfermedad("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoEnfermedadConstantesFunciones.generarExcelReporteDataTipoEnfermedad("NORMAL",row,workbook,tipoenfermedad,cellStyleDataAux);
		
			
			


				//Enfermedad
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EnfermedadConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoenfermedad.getEnfermedads()!=null && tipoenfermedad.getEnfermedads().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EnfermedadConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EnfermedadConstantesFunciones.generarExcelReporteHeaderEnfermedad("RELACIONADO",row,workbook);
				}

				if(tipoenfermedad.getEnfermedads()!=null) {
					i2=0;
					for(Enfermedad enfermedad : tipoenfermedad.getEnfermedads()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EnfermedadConstantesFunciones.generarExcelReporteDataEnfermedad("RELACIONADO",row,workbook,enfermedad,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoEnfermedadConstantesFunciones.getTipoEnfermedadDescripcion(tipoenfermedad));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Enfermedad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEnfermedad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEnfermedad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEnfermedad.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEnfermedad.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoEnfermedad() throws Exception {		
		this.startProcessTipoEnfermedad(true);
	}
	
	public void startProcessTipoEnfermedad(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoEnfermedad ,this.jPanelParametrosReportesTipoEnfermedad, this.jScrollPanelDatosTipoEnfermedad,this.jPanelPaginacionTipoEnfermedad, this.jScrollPanelDatosEdicionTipoEnfermedad, this.jPanelAccionesTipoEnfermedad,this.jPanelAccionesFormularioTipoEnfermedad,this.jmenuBarTipoEnfermedad,this.jmenuBarDetalleTipoEnfermedad,this.jTtoolBarTipoEnfermedad,this.jTtoolBarDetalleTipoEnfermedad);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoEnfermedad=this.jTabbedPaneBusquedasTipoEnfermedad; 
		
		final JPanel jPanelParametrosReportesTipoEnfermedad=this.jPanelParametrosReportesTipoEnfermedad;
		//final JScrollPane jScrollPanelDatosTipoEnfermedad=this.jScrollPanelDatosTipoEnfermedad;
		final JTable jTableDatosTipoEnfermedad=this.jTableDatosTipoEnfermedad;		
		final JPanel jPanelPaginacionTipoEnfermedad=this.jPanelPaginacionTipoEnfermedad;
		//final JScrollPane jScrollPanelDatosEdicionTipoEnfermedad=this.jScrollPanelDatosEdicionTipoEnfermedad;
		final JPanel jPanelAccionesTipoEnfermedad=this.jPanelAccionesTipoEnfermedad;
		
		JPanel jPanelCamposAuxiliarTipoEnfermedad=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoEnfermedad=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
			jPanelCamposAuxiliarTipoEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.jPanelCamposTipoEnfermedad;
			jPanelAccionesFormularioAuxiliarTipoEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.jPanelAccionesFormularioTipoEnfermedad;
		}
		
		final JPanel jPanelCamposTipoEnfermedad=jPanelCamposAuxiliarTipoEnfermedad;
		final JPanel jPanelAccionesFormularioTipoEnfermedad=jPanelAccionesFormularioAuxiliarTipoEnfermedad;
		
		
		final JMenuBar jmenuBarTipoEnfermedad=this.jmenuBarTipoEnfermedad;
		final JToolBar jTtoolBarTipoEnfermedad=this.jTtoolBarTipoEnfermedad;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoEnfermedad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoEnfermedad=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
			jmenuBarDetalleAuxiliarTipoEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.jmenuBarDetalleTipoEnfermedad;
			jTtoolBarDetalleAuxiliarTipoEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.jTtoolBarDetalleTipoEnfermedad;
		}
		
		final JMenuBar jmenuBarDetalleTipoEnfermedad=jmenuBarDetalleAuxiliarTipoEnfermedad;
		final JToolBar jTtoolBarDetalleTipoEnfermedad=jTtoolBarDetalleAuxiliarTipoEnfermedad;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoEnfermedad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoEnfermedad;
			processRunnable.jTableDatos=jTableDatosTipoEnfermedad;
			processRunnable.jPanelCampos=jPanelCamposTipoEnfermedad;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoEnfermedad;
			processRunnable.jPanelAcciones=jPanelAccionesTipoEnfermedad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoEnfermedad;
			
			
			processRunnable.jmenuBar=jmenuBarTipoEnfermedad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoEnfermedad;
			processRunnable.jTtoolBar=jTtoolBarTipoEnfermedad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoEnfermedad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoEnfermedad ,jPanelParametrosReportesTipoEnfermedad,jTableDatosTipoEnfermedad, /*jScrollPanelDatosTipoEnfermedad,*/jPanelCamposTipoEnfermedad,jPanelPaginacionTipoEnfermedad, /*jScrollPanelDatosEdicionTipoEnfermedad,*/ jPanelAccionesTipoEnfermedad,jPanelAccionesFormularioTipoEnfermedad,jmenuBarTipoEnfermedad,jmenuBarDetalleTipoEnfermedad,jTtoolBarTipoEnfermedad,jTtoolBarDetalleTipoEnfermedad);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoEnfermedad ,jPanelParametrosReportesTipoEnfermedad, jScrollPanelDatosTipoEnfermedad,jPanelPaginacionTipoEnfermedad, jScrollPanelDatosEdicionTipoEnfermedad, jPanelAccionesTipoEnfermedad,jPanelAccionesFormularioTipoEnfermedad,jmenuBarTipoEnfermedad,jmenuBarDetalleTipoEnfermedad,jTtoolBarTipoEnfermedad,jTtoolBarDetalleTipoEnfermedad);
						
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
	
	public void finishProcessTipoEnfermedad() {// throws Exception 
		this.finishProcessTipoEnfermedad(true);
	}
	
	public void finishProcessTipoEnfermedad(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoEnfermedad ,this.jPanelParametrosReportesTipoEnfermedad, this.jScrollPanelDatosTipoEnfermedad,this.jPanelPaginacionTipoEnfermedad, this.jScrollPanelDatosEdicionTipoEnfermedad, this.jPanelAccionesTipoEnfermedad,this.jPanelAccionesFormularioTipoEnfermedad,this.jmenuBarTipoEnfermedad,this.jmenuBarDetalleTipoEnfermedad,this.jTtoolBarTipoEnfermedad,this.jTtoolBarDetalleTipoEnfermedad);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoEnfermedad=this.jTabbedPaneBusquedasTipoEnfermedad; 
		
		final JPanel jPanelParametrosReportesTipoEnfermedad=this.jPanelParametrosReportesTipoEnfermedad;
		//final JScrollPane jScrollPanelDatosTipoEnfermedad=this.jScrollPanelDatosTipoEnfermedad;
		final JTable jTableDatosTipoEnfermedad=this.jTableDatosTipoEnfermedad;		
		final JPanel jPanelPaginacionTipoEnfermedad=this.jPanelPaginacionTipoEnfermedad;
		//final JScrollPane jScrollPanelDatosEdicionTipoEnfermedad=this.jScrollPanelDatosEdicionTipoEnfermedad;
		final JPanel jPanelAccionesTipoEnfermedad=this.jPanelAccionesTipoEnfermedad;
		
		JPanel jPanelCamposAuxiliarTipoEnfermedad=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoEnfermedad=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
			jPanelCamposAuxiliarTipoEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.jPanelCamposTipoEnfermedad;
			jPanelAccionesFormularioAuxiliarTipoEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.jPanelAccionesFormularioTipoEnfermedad;
		}
		
		final JPanel jPanelCamposTipoEnfermedad=jPanelCamposAuxiliarTipoEnfermedad;
		final JPanel jPanelAccionesFormularioTipoEnfermedad=jPanelAccionesFormularioAuxiliarTipoEnfermedad;
		
		
		final JMenuBar jmenuBarTipoEnfermedad=this.jmenuBarTipoEnfermedad;		
		final JToolBar jTtoolBarTipoEnfermedad=this.jTtoolBarTipoEnfermedad;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoEnfermedad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoEnfermedad=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
			jmenuBarDetalleAuxiliarTipoEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.jmenuBarDetalleTipoEnfermedad;
			jTtoolBarDetalleAuxiliarTipoEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.jTtoolBarDetalleTipoEnfermedad;		
		}
		
		final JMenuBar jmenuBarDetalleTipoEnfermedad=jmenuBarDetalleAuxiliarTipoEnfermedad;
		final JToolBar jTtoolBarDetalleTipoEnfermedad=jTtoolBarDetalleAuxiliarTipoEnfermedad;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoEnfermedad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoEnfermedad;
			processRunnable.jTableDatos=jTableDatosTipoEnfermedad;
			processRunnable.jPanelCampos=jPanelCamposTipoEnfermedad;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoEnfermedad;
			processRunnable.jPanelAcciones=jPanelAccionesTipoEnfermedad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoEnfermedad;
			
			
			processRunnable.jmenuBar=jmenuBarTipoEnfermedad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoEnfermedad;
			processRunnable.jTtoolBar=jTtoolBarTipoEnfermedad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoEnfermedad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoEnfermedad ,jPanelParametrosReportesTipoEnfermedad, jTableDatosTipoEnfermedad,/*jScrollPanelDatosTipoEnfermedad,*/jPanelCamposTipoEnfermedad,jPanelPaginacionTipoEnfermedad, /*jScrollPanelDatosEdicionTipoEnfermedad,*/ jPanelAccionesTipoEnfermedad,jPanelAccionesFormularioTipoEnfermedad,jmenuBarTipoEnfermedad,jmenuBarDetalleTipoEnfermedad,jTtoolBarTipoEnfermedad,jTtoolBarDetalleTipoEnfermedad));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoEnfermedad(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoEnfermedad(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoEnfermedad(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoEnfermedad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoEnfermedad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoEnfermedad,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoEnfermedad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoEnfermedad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoEnfermedad,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoenfermedadConstantesFunciones.getsFinalQueryTipoEnfermedad();
		String  finalQueryPaginacionTodos=this.tipoenfermedadConstantesFunciones.getsFinalQueryTipoEnfermedad();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoEnfermedadConstantesFunciones.getArrayColumnasGlobalesNoTipoEnfermedad(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoEnfermedadConstantesFunciones.getArrayColumnasGlobalesTipoEnfermedad(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoEnfermedadConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoenfermedadsEliminados= new ArrayList<TipoEnfermedad>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoEnfermedad();
		
				///*TipoEnfermedadSessionBean*/this.tipoenfermedadSessionBean=new TipoEnfermedadSessionBean();
			
			if(this.tipoenfermedadSessionBean==null) {
				this.tipoenfermedadSessionBean=new TipoEnfermedadSessionBean();
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
					this.iNumeroPaginacion=TipoEnfermedadConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoEnfermedadConstantesFunciones.getClassesForeignKeysOfTipoEnfermedad(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoenfermedad."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoenfermedadsAux= new ArrayList<TipoEnfermedad>();
			
				
			tipoenfermedadLogic.setDatosCliente(this.datosCliente);
			tipoenfermedadLogic.setDatosDeep(this.datosDeep);
			tipoenfermedadLogic.setIsConDeep(true);
			
			
			tipoenfermedadLogic.getTipoEnfermedadDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoenfermedadLogic.getTodosTipoEnfermedads(finalQueryGlobal,pagination);
					
					//tipoenfermedadLogic.getTodosTipoEnfermedadsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoenfermedadLogic.getTipoEnfermedads()==null|| tipoenfermedadLogic.getTipoEnfermedads().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoenfermedadsAux= new ArrayList<TipoEnfermedad>();
							tipoenfermedadsAux.addAll(tipoenfermedadLogic.getTipoEnfermedads());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoenfermedadsAux= new ArrayList<TipoEnfermedad>();
							tipoenfermedadsAux.addAll(tipoenfermedads);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoenfermedadLogic.getTodosTipoEnfermedads(finalQueryGlobal+"",this.pagination);												
							
							//tipoenfermedadLogic.getTodosTipoEnfermedadsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoEnfermedads("Todos",tipoenfermedadLogic.getTipoEnfermedads() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoenfermedadLogic.setTipoEnfermedads(new ArrayList<TipoEnfermedad>());					
							tipoenfermedadLogic.getTipoEnfermedads().addAll(tipoenfermedadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoenfermedads=new ArrayList<TipoEnfermedad>();
							tipoenfermedads.addAll(tipoenfermedadsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoEnfermedad=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoEnfermedad=this.idActual;
				
				} else if(this.idTipoEnfermedadActual!=null && this.idTipoEnfermedadActual!=0L) {
					idTipoEnfermedad=idTipoEnfermedadActual;
				}
				
					
				this.sDetalleReporte=TipoEnfermedadConstantesFunciones.getDetalleIndicePorId(idTipoEnfermedad);
				
				this.tipoenfermedads=new ArrayList<TipoEnfermedad>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoenfermedadLogic.getEntity(idTipoEnfermedad);
					
					//tipoenfermedadLogic.getEntityWithConnection(idTipoEnfermedad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoenfermedadLogic.setTipoEnfermedads(new ArrayList<TipoEnfermedad>());
					tipoenfermedadLogic.getTipoEnfermedads().add(tipoenfermedadLogic.getTipoEnfermedad());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoenfermedads=new ArrayList<TipoEnfermedad>();
					this.tipoenfermedads.add(tipoenfermedad);
				}
				
				if(tipoenfermedadLogic.getTipoEnfermedad()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoEnfermedadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoenfermedadLogic.getTipoEnfermedadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoEnfermedadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoEnfermedadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoenfermedadLogic.getTipoEnfermedads()==null||tipoenfermedadLogic.getTipoEnfermedads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoenfermedads==null|| tipoenfermedads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoenfermedadsAux=new ArrayList<TipoEnfermedad>();
						tipoenfermedadsAux.addAll(tipoenfermedadLogic.getTipoEnfermedads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoenfermedadsAux=new ArrayList<TipoEnfermedad>();
							tipoenfermedadsAux.addAll(tipoenfermedads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoenfermedadLogic.getTipoEnfermedadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoEnfermedadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoEnfermedadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoEnfermedads("FK_IdEmpresa",tipoenfermedadLogic.getTipoEnfermedads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoEnfermedads("FK_IdEmpresa",tipoenfermedads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoenfermedadLogic.setTipoEnfermedads(new ArrayList<TipoEnfermedad>());
						tipoenfermedadLogic.getTipoEnfermedads().addAll(tipoenfermedadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoenfermedads=new ArrayList<TipoEnfermedad>();
							tipoenfermedads.addAll(tipoenfermedadsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoEnfermedad();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoEnfermedad();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoenfermedadLogic.getTipoEnfermedads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoenfermedads.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoenfermedadLogic.getTipoEnfermedads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoenfermedads.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoEnfermedad tipoenfermedad) {
		Boolean permite=true;
		
		if(this.tipoenfermedad.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoEnfermedadConstantesFunciones.getOrderByListaTipoEnfermedad();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoEnfermedadConstantesFunciones.getOrderByListaTipoEnfermedad();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEnfermedad tipoenfermedad:tipoenfermedadLogic.getTipoEnfermedads()) {
				if(tipoenfermedad.getsType().equals(Constantes2.S_TOTALES)) {
					tipoenfermedadTotales=tipoenfermedad;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEnfermedad tipoenfermedad:this.tipoenfermedads) {
				if(tipoenfermedad.getsType().equals(Constantes2.S_TOTALES)) {
					tipoenfermedadTotales=tipoenfermedad;
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
			this.tipoenfermedadAux=new TipoEnfermedad();
			this.tipoenfermedadAux.setsType(Constantes2.S_TOTALES);
			this.tipoenfermedadAux.setIsNew(false);
			this.tipoenfermedadAux.setIsChanged(false);
			this.tipoenfermedadAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoEnfermedadConstantesFunciones.TotalizarValoresFilaTipoEnfermedad(this.tipoenfermedadLogic.getTipoEnfermedads(),this.tipoenfermedadAux);
				
				this.tipoenfermedadLogic.getTipoEnfermedads().add(this.tipoenfermedadAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoEnfermedadConstantesFunciones.TotalizarValoresFilaTipoEnfermedad(this.tipoenfermedads,this.tipoenfermedadAux);
				
				this.tipoenfermedads.add(this.tipoenfermedadAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoenfermedadTotales=new TipoEnfermedad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoenfermedadLogic.getTipoEnfermedads().remove(tipoenfermedadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoenfermedads.remove(tipoenfermedadTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoenfermedadTotales=new TipoEnfermedad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEnfermedad tipoenfermedad:tipoenfermedadLogic.getTipoEnfermedads()) {
				if(tipoenfermedad.getsType().equals(Constantes2.S_TOTALES)) {
					tipoenfermedadTotales=tipoenfermedad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoEnfermedadConstantesFunciones.TotalizarValoresFilaTipoEnfermedad(this.tipoenfermedadLogic.getTipoEnfermedads(),tipoenfermedadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEnfermedad tipoenfermedad:this.tipoenfermedads) {
				if(tipoenfermedad.getsType().equals(Constantes2.S_TOTALES)) {
					tipoenfermedadTotales=tipoenfermedad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoEnfermedadConstantesFunciones.TotalizarValoresFilaTipoEnfermedad(this.tipoenfermedads,tipoenfermedadTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoEnfermedadsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoEnfermedadsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoenfermedadLogic.getTipoEnfermedadsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoEnfermedad() {
		this.isPermisoTodoTipoEnfermedad=false;
		this.isPermisoNuevoTipoEnfermedad=false;
		this.isPermisoActualizarTipoEnfermedad=false;
		this.isPermisoActualizarOriginalTipoEnfermedad=false;
		this.isPermisoEliminarTipoEnfermedad=false;
		this.isPermisoGuardarCambiosTipoEnfermedad=false;
		this.isPermisoConsultaTipoEnfermedad=false;
		this.isPermisoBusquedaTipoEnfermedad=false;
		this.isPermisoReporteTipoEnfermedad=false;		
		this.isPermisoOrdenTipoEnfermedad=false;		
		this.isPermisoPaginacionMedioTipoEnfermedad=false;		
		this.isPermisoPaginacionAltoTipoEnfermedad=false;
		this.isPermisoPaginacionTodoTipoEnfermedad=false;
		this.isPermisoCopiarTipoEnfermedad=false;		
		this.isPermisoVerFormTipoEnfermedad=false;		
		this.isPermisoDuplicarTipoEnfermedad=false;		
		this.isPermisoOrdenTipoEnfermedad=false;		
	}
	
	public void setPermisosUsuarioTipoEnfermedad(Boolean isPermiso) {
		this.isPermisoTodoTipoEnfermedad=isPermiso;
		this.isPermisoNuevoTipoEnfermedad=isPermiso;
		this.isPermisoActualizarTipoEnfermedad=isPermiso;
		this.isPermisoActualizarOriginalTipoEnfermedad=isPermiso;
		this.isPermisoEliminarTipoEnfermedad=isPermiso;
		this.isPermisoGuardarCambiosTipoEnfermedad=isPermiso;
		this.isPermisoConsultaTipoEnfermedad=isPermiso;
		this.isPermisoBusquedaTipoEnfermedad=isPermiso;
		this.isPermisoReporteTipoEnfermedad=isPermiso;
		this.isPermisoOrdenTipoEnfermedad=isPermiso;		
		this.isPermisoPaginacionMedioTipoEnfermedad=isPermiso;		
		this.isPermisoPaginacionAltoTipoEnfermedad=isPermiso;		
		this.isPermisoPaginacionTodoTipoEnfermedad=isPermiso;		
		this.isPermisoCopiarTipoEnfermedad=isPermiso;		
		this.isPermisoVerFormTipoEnfermedad=isPermiso;		
		this.isPermisoDuplicarTipoEnfermedad=isPermiso;
		this.isPermisoOrdenTipoEnfermedad=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoEnfermedad(Boolean isPermiso) {
		//this.isPermisoTodoTipoEnfermedad=isPermiso;
		this.isPermisoNuevoTipoEnfermedad=isPermiso;
		this.isPermisoActualizarTipoEnfermedad=isPermiso;
		this.isPermisoActualizarOriginalTipoEnfermedad=isPermiso;
		this.isPermisoEliminarTipoEnfermedad=isPermiso;
		this.isPermisoGuardarCambiosTipoEnfermedad=isPermiso;
		//this.isPermisoConsultaTipoEnfermedad=isPermiso;
		//this.isPermisoBusquedaTipoEnfermedad=isPermiso;
		//this.isPermisoReporteTipoEnfermedad=isPermiso;
		//this.isPermisoOrdenTipoEnfermedad=isPermiso;		
		//this.isPermisoPaginacionMedioTipoEnfermedad=isPermiso;		
		//this.isPermisoPaginacionAltoTipoEnfermedad=isPermiso;		
		//this.isPermisoPaginacionTodoTipoEnfermedad=isPermiso;		
		//this.isPermisoCopiarTipoEnfermedad=isPermiso;		
		//this.isPermisoDuplicarTipoEnfermedad=isPermiso;
		//this.isPermisoOrdenTipoEnfermedad=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoEnfermedadClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(EnfermedadConstantesFunciones.SNOMBREOPCION);
		
		if(TipoEnfermedadJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosEnfermedad=false;
		this.isTienePermisosEnfermedad=this.verificarGetPermisosUsuarioOpcionTipoEnfermedadClaseRelacionada(this.opcionsRelacionadas,EnfermedadConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoEnfermedad(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoEnfermedadClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosEnfermedad=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoEnfermedadClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoEnfermedadClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoEnfermedadClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosEnfermedad && this.jInternalFrameDetalleFormTipoEnfermedad!=null && this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoEnfermedad.jTabbedPaneRelacionesTipoEnfermedad.remove(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoEnfermedad() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoEnfermedadJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoEnfermedadConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoEnfermedad=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoEnfermedad=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoEnfermedad=this.isPermisoActualizarTipoEnfermedad;
			this.isPermisoEliminarTipoEnfermedad=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoEnfermedad=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoEnfermedad=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoEnfermedad=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoEnfermedad=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoEnfermedad=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoEnfermedad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoEnfermedad=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoEnfermedad=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoEnfermedad=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoEnfermedad=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoEnfermedad=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoEnfermedad=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoEnfermedad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoEnfermedad.setToolTipText(this.jTableDatosTipoEnfermedad.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoEnfermedad(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoEnfermedad(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoEnfermedadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoEnfermedadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoEnfermedad() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosEnfermedad && this.tipoenfermedadConstantesFunciones.mostrarEnfermedadTipoEnfermedad && !TipoEnfermedadConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Enfermedad");
			reporte.setsDescripcion("Enfermedad");
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
	public void inicializarCombosForeignKeyTipoEnfermedadListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoEnfermedadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoEnfermedadJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoEnfermedadListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoEnfermedadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoEnfermedadParameterReturnGeneral tipoenfermedadReturnGeneral=new TipoEnfermedadParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoenfermedadConstantesFunciones.cargarid_empresaTipoEnfermedad)
					 || (this.esRecargarFks && this.tipoenfermedadConstantesFunciones.cargarid_empresaTipoEnfermedad)) {

					if(!this.tipoenfermedadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoenfermedadSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoenfermedadReturnGeneral=tipoenfermedadLogic.cargarCombosLoteForeignKeyTipoEnfermedad(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoenfermedadReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoEnfermedad()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoenfermedadSessionBean==null) {
				this.tipoenfermedadSessionBean=new TipoEnfermedadSessionBean();
			}

			if(!this.tipoenfermedadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoEnfermedad()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoEnfermedad(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoEnfermedad()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEnfermedad();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoEnfermedad(TipoEnfermedad tipoenfermedad)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoEnfermedad(TipoEnfermedad tipoenfermedad,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoEnfermedad()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEnfermedad()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoEnfermedad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoEnfermedad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoEnfermedad()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoEnfermedad()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoEnfermedad(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoEnfermedad()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxid_empresaTipoEnfermedad!=null && this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxid_empresaTipoEnfermedad.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxid_empresaTipoEnfermedad.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoEnfermedadBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoEnfermedadBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoEnfermedadBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoenfermedadSessionBean=new TipoEnfermedadSessionBean(); 
		this.tipoenfermedadConstantesFunciones=new TipoEnfermedadConstantesFunciones(); 
		this.tipoenfermedadBean=new TipoEnfermedad();//(this.tipoenfermedadConstantesFunciones); 		
		this.tipoenfermedadReturnGeneral=new TipoEnfermedadParameterReturnGeneral(); 
		
		this.tipoenfermedadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoenfermedadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoEnfermedadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoEnfermedadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoEnfermedadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoEnfermedad(true);
			
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
			
			this.tipoenfermedadConstantesFunciones=new TipoEnfermedadConstantesFunciones(); 
			this.tipoenfermedadBean=new TipoEnfermedad();//this.tipoenfermedadConstantesFunciones); 			
			this.tipoenfermedadReturnGeneral=new TipoEnfermedadParameterReturnGeneral(); 
		
			TipoEnfermedadBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Enfermedad Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoenfermedad=new TipoEnfermedad();
			this.tipoenfermedads = new ArrayList<TipoEnfermedad>();
			this.tipoenfermedadsAux = new ArrayList<TipoEnfermedad>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic=new TipoEnfermedadLogic();
				this.tipoenfermedadLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoenfermedadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoenfermedadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoEnfermedad);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoEnfermedad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoEnfermedad);	
					}
					
					if(this.jInternalFrameImportacionTipoEnfermedad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoEnfermedad);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoEnfermedad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoEnfermedad);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoEnfermedad);
				this.jInternalFrameDetalleFormTipoEnfermedad.setVisible(false);
				this.jInternalFrameDetalleFormTipoEnfermedad.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoEnfermedad!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoEnfermedad);
					this.jInternalFrameReporteDinamicoTipoEnfermedad.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoEnfermedad.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoEnfermedad!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoEnfermedad);
					this.jInternalFrameImportacionTipoEnfermedad.setVisible(false);
					this.jInternalFrameImportacionTipoEnfermedad.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoEnfermedad!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoEnfermedad);
					this.jInternalFrameOrderByTipoEnfermedad.setVisible(false);
					this.jInternalFrameOrderByTipoEnfermedad.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoEnfermedadActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoEnfermedadConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoenfermedadReturnGeneral=new TipoEnfermedadParameterReturnGeneral();
			
			this.tipoenfermedadParameterGeneral=new TipoEnfermedadParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoenfermedadLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoEnfermedadJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(EnfermedadConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoEnfermedadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoenfermedadSessionBean.getEsGuardarRelacionado(),this.tipoenfermedadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoEnfermedadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoenfermedadSessionBean.getEsGuardarRelacionado(),this.tipoenfermedadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoEnfermedad=false;
			this.isVisibilidadCeldaDuplicarTipoEnfermedad=true;
			this.isVisibilidadCeldaCopiarTipoEnfermedad=true;
			this.isVisibilidadCeldaVerFormTipoEnfermedad=true;
			this.isVisibilidadCeldaOrdenTipoEnfermedad=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEnfermedad=false;
			this.isVisibilidadCeldaModificarTipoEnfermedad=false;
			this.isVisibilidadCeldaActualizarTipoEnfermedad=false;
			this.isVisibilidadCeldaEliminarTipoEnfermedad=false;
			this.isVisibilidadCeldaCancelarTipoEnfermedad=false;
			this.isVisibilidadCeldaGuardarTipoEnfermedad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEnfermedad=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoEnfermedad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoEnfermedad();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoEnfermedad(false);
			
			this.setPermisosUsuarioTipoEnfermedad();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoenfermedadSessionBean.getEsGuardarRelacionado() && this.tipoenfermedadSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoEnfermedadClasesRelacionadas();
			}
			
			if(this.tipoenfermedadSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoEnfermedadClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoEnfermedadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoEnfermedad();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoEnfermedad();
			}
			
			if(!this.isPermisoBusquedaTipoEnfermedad) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoEnfermedad.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoEnfermedad,this.isPermisoPaginacionMedioTipoEnfermedad,this.isPermisoPaginacionTodoTipoEnfermedad);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoEnfermedadConstantesFunciones.getTiposSeleccionarTipoEnfermedad());
				
				this.tiposColumnasSelect=TipoEnfermedadConstantesFunciones.getTiposSeleccionarTipoEnfermedad(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoEnfermedad();				
				//this.tiposRelacionesSelect=TipoEnfermedadConstantesFunciones.getTiposRelacionesTipoEnfermedad(true);
				
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
			//if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoEnfermedad();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoEnfermedad(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoEnfermedad(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEnfermedad() ;
			
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
			
			
			this.enfermedadLogic=new EnfermedadLogic(); 
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
				tipoenfermedadImplementable= (TipoEnfermedadImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoEnfermedadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoenfermedadImplementableHome= (TipoEnfermedadImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoEnfermedadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoenfermedads= new ArrayList<TipoEnfermedad>();
			this.tipoenfermedadsEliminados= new ArrayList<TipoEnfermedad>();
						
			this.isEsNuevoTipoEnfermedad=false;
			this.esParaAccionDesdeFormularioTipoEnfermedad=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoEnfermedad(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoEnfermedad();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoEnfermedadBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoEnfermedadConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoEnfermedad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoEnfermedad(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoEnfermedad();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoEnfermedad();
			}
			
			TipoEnfermedadBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoEnfermedad.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoEnfermedad.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoEnfermedad.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoEnfermedad(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoEnfermedad: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoEnfermedad() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(EnfermedadConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EnfermedadConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoEnfermedad")) {
				iIndex=this.jInternalFrameDetalleFormTipoEnfermedad.jTabbedPaneRelacionesTipoEnfermedad.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoEnfermedad.jTabbedPaneRelacionesTipoEnfermedad.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();	
				
				

				if(sTitle.equals("Enfermedades")) {
					if(!EnfermedadJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoEnfermedad();

						this.cargarParteTabPanelRelacionadaEnfermedad(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoEnfermedad();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaEnfermedad(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoEnfermedad.cargarSessionConBeanSwingJInternalFrameEnfermedad(false,true,iIndex);
		this.jButtonEnfermedadActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEnfermedad();

		//this.jTabbedPaneRelacionesTipoEnfermedad.updateUI();
		//this.jTabbedPaneRelacionesTipoEnfermedad.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoEnfermedad.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Enfermedad")) {
				int row=this.jTableDatosTipoEnfermedad.getSelectedRow();
				jButtonEnfermedadActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Enfermedad")) {

					if(this.isTienePermisosEnfermedad && this.tipoenfermedadConstantesFunciones.mostrarEnfermedadTipoEnfermedad && !TipoEnfermedadConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Enfermedades"+"("+EnfermedadConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Enfermedades");

						if(tipoenfermedadConstantesFunciones.resaltarEnfermedadTipoEnfermedad!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoenfermedadConstantesFunciones.resaltarEnfermedadTipoEnfermedad);
						}

						jmenuItem.setEnabled(this.tipoenfermedadConstantesFunciones.activarEnfermedadTipoEnfermedad);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Enfermedad"));

						

						this.jInternalFrameDetalleFormTipoEnfermedad.jmenuDetalleTipoEnfermedad.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoEnfermedad(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoEnfermedad(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoEnfermedad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoEnfermedadListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoEnfermedad();
		
		this.cargarCombosFrameForeignKeyTipoEnfermedad();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoEnfermedad();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoEnfermedad();
		}
	}
	
	
	
	public void jButtonNuevoTipoEnfermedadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoenfermedadSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoEnfermedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
			
			
			if(jTableDatosTipoEnfermedad.getRowCount()>=1) {
				jTableDatosTipoEnfermedad.removeRowSelectionInterval(0, jTableDatosTipoEnfermedad.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoEnfermedad=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoEnfermedad(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoEnfermedad(true);			
			//this.tipoenfermedad=new TipoEnfermedad();
			//this.tipoenfermedad.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEnfermedad(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEnfermedad() ;
			
			if(TipoEnfermedadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEnfermedad(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoenfermedad);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoenfermedad);				
			
			TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
			
			if(this.tipoenfermedadSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoEnfermedad: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoEnfermedadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoEnfermedad> tipoenfermedadsSeleccionados=new ArrayList<TipoEnfermedad>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoEnfermedad.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoEnfermedad.getSelectedRows().length;			
			}
			
			tipoenfermedadsSeleccionados=this.getTipoEnfermedadsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoEnfermedad--;			
				//TipoEnfermedad tipoenfermedadAux= new TipoEnfermedad();			
				//tipoenfermedadAux.setId(this.iIdNuevoTipoEnfermedad);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoEnfermedad tipoenfermedadOrigen=new TipoEnfermedad();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoEnfermedad tipoenfermedadOrigen : tipoenfermedadsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoenfermedadOrigen =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoenfermedadOrigen =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoEnfermedad();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoenfermedad.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoEnfermedad(tipoenfermedadOrigen,this.tipoenfermedad,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEnfermedad(this.tipoenfermedad);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoenfermedadLogic.getTipoEnfermedads().add(this.tipoenfermedadAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoenfermedads.add(this.tipoenfermedadAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoEnfermedad(false);
				
				this.jTableDatosTipoEnfermedad.setRowSelectionInterval(this.getIndiceNuevoTipoEnfermedad(), this.getIndiceNuevoTipoEnfermedad());
				
				int iLastRow =  this.jTableDatosTipoEnfermedad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoEnfermedad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoEnfermedad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEnfermedad(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoEnfermedad> tipoenfermedadsSeleccionados=new ArrayList<TipoEnfermedad>();									
		
			TipoEnfermedad tipoenfermedadOrigen=new TipoEnfermedad();
			TipoEnfermedad tipoenfermedadDestino=new TipoEnfermedad();
				
			tipoenfermedadsSeleccionados=this.getTipoEnfermedadsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoEnfermedad.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoenfermedadsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoEnfermedad.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoenfermedadOrigen =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoenfermedadOrigen =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoenfermedadDestino =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoenfermedadDestino =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoenfermedadOrigen =tipoenfermedadsSeleccionados.get(0);
				tipoenfermedadDestino =tipoenfermedadsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoEnfermedad(tipoenfermedadOrigen,tipoenfermedadDestino,true,false);
				
				tipoenfermedadDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoenfermedadDestino,tipoenfermedadLogic.getTipoEnfermedads());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoenfermedadDestino,tipoenfermedads);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoEnfermedad(false);
				
				//this.jTableDatosTipoEnfermedad.setRowSelectionInterval(this.getIndiceNuevoTipoEnfermedad(), this.getIndiceNuevoTipoEnfermedad());
				
				int iLastRow =  this.jTableDatosTipoEnfermedad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoEnfermedad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoEnfermedad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEnfermedad(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoEnfermedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoEnfermedad.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoEnfermedad.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoEnfermedad.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoEnfermedad.setVisible(!isVisible);
			this.jPanelPaginacionTipoEnfermedad.setVisible(!isVisible);
			this.jPanelAccionesTipoEnfermedad.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoEnfermedad();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoEnfermedad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoEnfermedad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoEnfermedad();
			
			this.abrirFrameOrderByTipoEnfermedad();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoEnfermedad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoEnfermedad(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoEnfermedad);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoEnfermedad.isMaximum()) {
					this.jInternalFrameDetalleFormTipoEnfermedad.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoEnfermedad.setSize(this.jInternalFrameDetalleFormTipoEnfermedad.iWidthFormulario,this.jInternalFrameDetalleFormTipoEnfermedad.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoEnfermedad.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoEnfermedad.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoEnfermedad.isMaximum()) {
						this.jInternalFrameDetalleFormTipoEnfermedad.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoEnfermedad.jContentPaneDetalleTipoEnfermedad.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoEnfermedad.jTabbedPaneRelacionesTipoEnfermedad.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoEnfermedad.jContentPaneDetalleTipoEnfermedad.getWidth(),TipoEnfermedadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoEnfermedad.jTabbedPaneRelacionesTipoEnfermedad.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoEnfermedad.jContentPaneDetalleTipoEnfermedad.getWidth(),TipoEnfermedadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoEnfermedad.jTabbedPaneRelacionesTipoEnfermedad.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoEnfermedad.jContentPaneDetalleTipoEnfermedad.getWidth(),TipoEnfermedadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(EnfermedadJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEnfermedad();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoEnfermedad.setVisible(true);
	        this.jInternalFrameDetalleFormTipoEnfermedad.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoEnfermedad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoEnfermedad==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoEnfermedad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEnfermedad,false,this);
				} else {
					this.jInternalFrameOrderByTipoEnfermedad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEnfermedad,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoEnfermedad);
				this.jInternalFrameOrderByTipoEnfermedad.setVisible(false);
				this.jInternalFrameOrderByTipoEnfermedad.setSelected(false);
				
				this.jInternalFrameOrderByTipoEnfermedad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoEnfermedad"));
				
				this.inicializarActualizarBindingTablaOrderByTipoEnfermedad();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoEnfermedad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoEnfermedad==null) {
				
				this.jInternalFrameImportacionTipoEnfermedad=new ImportacionJInternalFrame(TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoEnfermedad);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoEnfermedad);
				this.jInternalFrameImportacionTipoEnfermedad.setVisible(false);
				this.jInternalFrameImportacionTipoEnfermedad.setSelected(false);


				this.jInternalFrameImportacionTipoEnfermedad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoEnfermedad"));
				this.jInternalFrameImportacionTipoEnfermedad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoEnfermedad"));
				this.jInternalFrameImportacionTipoEnfermedad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoEnfermedad"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoEnfermedad() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoEnfermedad==null) {
				this.jInternalFrameReporteDinamicoTipoEnfermedad=new ReporteDinamicoJInternalFrame(TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoEnfermedad);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoEnfermedad);
				this.jInternalFrameReporteDinamicoTipoEnfermedad.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoEnfermedad.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoEnfermedad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEnfermedad"));
				this.jInternalFrameReporteDinamicoTipoEnfermedad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEnfermedad"));
				this.jInternalFrameReporteDinamicoTipoEnfermedad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEnfermedad"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEnfermedad();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaEnfermedad() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jScrollPanelDatosEnfermedad.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoEnfermedad.jContentPaneDetalleTipoEnfermedad.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jScrollPanelDatosEnfermedad.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jScrollPanelDatosEnfermedad.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.jScrollPanelDatosEnfermedad.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoEnfermedad() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoEnfermedad);
			
	       	this.jInternalFrameDetalleFormTipoEnfermedad.setVisible(false);
	        this.jInternalFrameDetalleFormTipoEnfermedad.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoEnfermedad.dispose();
			//this.jInternalFrameDetalleFormTipoEnfermedad=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoEnfermedad() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoEnfermedad.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoEnfermedad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoEnfermedad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoEnfermedad.setVisible(true);
	        this.jInternalFrameImportacionTipoEnfermedad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoEnfermedad() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoEnfermedad.setVisible(true);
	        this.jInternalFrameOrderByTipoEnfermedad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoEnfermedad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoEnfermedad.setVisible(false);
	        this.jInternalFrameOrderByTipoEnfermedad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoEnfermedad() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoEnfermedad.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoEnfermedad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoEnfermedad() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoEnfermedad.setVisible(false);
	        this.jInternalFrameImportacionTipoEnfermedad.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoEnfermedad(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoEnfermedad(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoEnfermedad(true);
			//this.isEsNuevoTipoEnfermedad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoEnfermedad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEnfermedad(false) ;
			
			if(tipoenfermedadSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadSessionBean.getEsGuardarRelacionado() && EnfermedadJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEnfermedadActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoEnfermedadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEnfermedad(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEnfermedad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoEnfermedadActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoEnfermedad(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoEnfermedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoEnfermedad(true);
			//this.isEsNuevoTipoEnfermedad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoenfermedad.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoEnfermedad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoEnfermedad(false) ;
			
			if(TipoEnfermedadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEnfermedad(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEnfermedad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoEnfermedad(false);
			
			//if(!this.isEsNuevoTipoEnfermedad) {								
				int intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoEnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoEnfermedad(this.tipoenfermedad,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEnfermedad(this.tipoenfermedad);
				
			}
			
			if(this.permiteMantenimiento(this.tipoenfermedad)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoEnfermedad=true;
					this.inicializarActualizarBindingTablaTipoEnfermedad(false);
					this.isEsNuevoTipoEnfermedad=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoEnfermedad=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoEnfermedad=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoEnfermedad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEnfermedad(false);
				
				this.habilitarDeshabilitarControlesTipoEnfermedad(false);
			
												
				
				if(TipoEnfermedadJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoEnfermedad();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoEnfermedadActionPerformed(evt,tipoenfermedadSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoEnfermedad(this.tipoenfermedad,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoEnfermedad.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoenfermedadSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoenfermedad.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoEnfermedad.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEnfermedad.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				this.tipoenfermedad.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				this.tipoenfermedad.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoenfermedad)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoEnfermedadModel) this.jTableDatosTipoEnfermedad.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoEnfermedad=true;
				this.inicializarActualizarBindingTablaTipoEnfermedad(false);
				this.isEsNuevoTipoEnfermedad=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoEnfermedad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEnfermedad(false);
				
				this.habilitarDeshabilitarControlesTipoEnfermedad(false);
				
				
				
				if(TipoEnfermedadJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoEnfermedad();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoEnfermedad.getRowCount()>=1) {
				jTableDatosTipoEnfermedad.removeRowSelectionInterval(0, jTableDatosTipoEnfermedad.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoEnfermedad(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoEnfermedad(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEnfermedad(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEnfermedad(false) ;
			
			this.isEsNuevoTipoEnfermedad=false;
			
			if(TipoEnfermedadJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoEnfermedad();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoEnfermedad(false);
				
				//SI ES MANUAL
				if(TipoEnfermedadJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoEnfermedad();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoEnfermedad--;			
			//TipoEnfermedad tipoenfermedadAux= new TipoEnfermedad();			
			//tipoenfermedadAux.setId(this.iIdNuevoTipoEnfermedad);
			
			if(this.jInternalFrameDetalleFormTipoEnfermedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoEnfermedad();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoEnfermedad(this.tipoenfermedad);
			
			this.tipoenfermedad.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoenfermedadLogic.getTipoEnfermedads().add(this.tipoenfermedadAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoenfermedads.add(this.tipoenfermedadAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoEnfermedad(false);
			
			this.jTableDatosTipoEnfermedad.setRowSelectionInterval(this.getIndiceNuevoTipoEnfermedad(), this.getIndiceNuevoTipoEnfermedad());
			
			int iLastRow =  this.jTableDatosTipoEnfermedad.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoEnfermedad.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoEnfermedad.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoEnfermedad(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoEnfermedad(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEnfermedad(false);
			
			//SI ES MANUAL
			if(TipoEnfermedadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEnfermedad();
			}
			
			//this.abrirFrameTreeTipoEnfermedad();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo EnfermedadES ?", "MANTENIMIENTO DE Tipo Enfermedad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoEnfermedad.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoEnfermedad();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoenfermedadReturnGeneral=tipoenfermedadLogic.procesarImportacionTipoEnfermedadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoenfermedadParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoEnfermedadReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoEnfermedad.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoEnfermedad.setFileImportacion(this.jInternalFrameImportacionTipoEnfermedad.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoEnfermedad.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoEnfermedad.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoEnfermedad.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoEnfermedad.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoEnfermedad> tipoenfermedadsSeleccionados=new ArrayList<TipoEnfermedad>();		

		tipoenfermedadsSeleccionados=this.getTipoEnfermedadsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEnfermedad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEnfermedad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoEnfermedadBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoEnfermedadBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoEnfermedads("Todos",tipoenfermedadsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Enfermedad",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEnfermedad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEnfermedad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoEnfermedadConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoEnfermedadConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoEnfermedadConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoEnfermedad.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoEnfermedad.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoEnfermedad.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoEnfermedadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoEnfermedadConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoEnfermedadConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoEnfermedad.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoEnfermedadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoEnfermedadConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoEnfermedadConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoEnfermedad.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEnfermedad.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoEnfermedadConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoEnfermedadConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoEnfermedadConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoEnfermedad> tipoenfermedadsSeleccionados=new ArrayList<TipoEnfermedad>();		
		
		tipoenfermedadsSeleccionados=this.getTipoEnfermedadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoenfermedad";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoEnfermedads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoEnfermedad.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEnfermedad.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoEnfermedadConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoEnfermedadConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoEnfermedad tipoenfermedad:tipoenfermedadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoenfermedad.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoEnfermedadConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoEnfermedadConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoEnfermedad tipoenfermedad:tipoenfermedadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoenfermedad.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoEnfermedadConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoEnfermedadConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoEnfermedad tipoenfermedad:tipoenfermedadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoenfermedad.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoEnfermedad(row);				
			//	iRow++;
			//}				
			
			//for(TipoEnfermedad tipoenfermedadAux:tipoenfermedadsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoEnfermedad(tipoenfermedadAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Enfermedad",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoenfermedadLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEnfermedad(false);
			
			//SI ES MANUAL
			if(TipoEnfermedadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEnfermedad();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEnfermedad(false);
			
			//SI ES MANUAL
			if(TipoEnfermedadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoEnfermedad();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEnfermedad(false);
			
			//SI ES MANUAL
			if(TipoEnfermedadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoEnfermedad();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoEnfermedad() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoEnfermedad.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoEnfermedad.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoEnfermedad.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoEnfermedad.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoEnfermedad.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoEnfermedad.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoEnfermedad.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoEnfermedad(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoEnfermedad(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoEnfermedad(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoEnfermedad(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoEnfermedad(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoEnfermedad(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEnfermedad(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoEnfermedad(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoEnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoEnfermedadJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoEnfermedad() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoEnfermedad();
		
		this.inicializarActualizarBindingBotonesManualTipoEnfermedad(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoEnfermedad();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEnfermedad() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEnfermedad(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEnfermedad(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoEnfermedad.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoEnfermedad.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoEnfermedad.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoEnfermedad.jCheckBoxPostAccionNuevoTipoEnfermedad.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoEnfermedad.jCheckBoxPostAccionSinCerrarTipoEnfermedad.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoEnfermedad.jCheckBoxPostAccionSinMensajeTipoEnfermedad.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoEnfermedad.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoEnfermedad.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoEnfermedad.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
				this.jInternalFrameDetalleFormTipoEnfermedad.jCheckBoxPostAccionNuevoTipoEnfermedad.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoEnfermedad.jCheckBoxPostAccionSinCerrarTipoEnfermedad.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoEnfermedad.jCheckBoxPostAccionSinMensajeTipoEnfermedad.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoEnfermedad.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoEnfermedad.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxTiposAccionesFormularioTipoEnfermedad.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoEnfermedad.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoEnfermedad!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEnfermedad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoEnfermedad.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoEnfermedad.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoEnfermedad.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoEnfermedad.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoEnfermedad!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEnfermedad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoEnfermedad.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoEnfermedad.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoEnfermedad(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoEnfermedadJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEnfermedad(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoEnfermedad() throws Exception {
		try	{
			if(TipoEnfermedadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoEnfermedad();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoEnfermedad() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxTiposAccionesFormularioTipoEnfermedad.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxTiposAccionesFormularioTipoEnfermedad.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoEnfermedad() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoEnfermedad.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoEnfermedad.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoEnfermedad.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoEnfermedad.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoEnfermedad.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoEnfermedad.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoEnfermedad.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoEnfermedad.addItem(reporte);
			}
			
			
			if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoEnfermedad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoEnfermedad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoEnfermedad.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoEnfermedad.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoEnfermedad.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoEnfermedad.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxTiposAccionesFormularioTipoEnfermedad.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxTiposAccionesFormularioTipoEnfermedad.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoEnfermedad.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoEnfermedad.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoEnfermedad.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEnfermedad();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEnfermedad() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoEnfermedad!=null) {
				this.jInternalFrameReporteDinamicoTipoEnfermedad.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoEnfermedad.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoEnfermedad!=null) {
				this.jInternalFrameReporteDinamicoTipoEnfermedad.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoEnfermedad.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoEnfermedad!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoEnfermedad.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoEnfermedad.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoEnfermedad.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoEnfermedad.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoEnfermedad.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoEnfermedad.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoEnfermedad()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoEnfermedad(Boolean esInicializar) throws Exception {				
		if(TipoEnfermedadJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoEnfermedad();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoEnfermedad() throws Exception {
		this.inicializarActualizarBindingTablaTipoEnfermedad(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoEnfermedad() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoEnfermedad.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoEnfermedad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEnfermedad.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoEnfermedadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoEnfermedad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEnfermedad.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoEnfermedadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoEnfermedadOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEnfermedadOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoEnfermedadPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoEnfermedad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEnfermedad.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoEnfermedadPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoEnfermedad.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoEnfermedad(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoenfermedadLogic.getTipoEnfermedads().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoenfermedads.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoEnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoEnfermedad.setModel(new TipoEnfermedadModel(this.tipoenfermedadLogic.getTipoEnfermedads(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoEnfermedad.setModel(new TipoEnfermedadModel(this.tipoenfermedads,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoEnfermedad!=null && this.jInternalFrameOrderByTipoEnfermedad.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoEnfermedad();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoEnfermedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEnfermedad,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoEnfermedadPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO,tipoenfermedadConstantesFunciones.resaltarSeleccionarTipoEnfermedad,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO,tipoenfermedadConstantesFunciones.resaltarSeleccionarTipoEnfermedad,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoEnfermedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEnfermedad,TipoEnfermedadConstantesFunciones.LABEL_ID));

		if(this.tipoenfermedadConstantesFunciones.mostraridTipoEnfermedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEnfermedadConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoenfermedadConstantesFunciones.resaltaridTipoEnfermedad,this.tipoenfermedadConstantesFunciones.activaridTipoEnfermedad,this,true,"idTipoEnfermedad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoenfermedadConstantesFunciones.resaltaridTipoEnfermedad,this.tipoenfermedadConstantesFunciones.activaridTipoEnfermedad,this,true,"idTipoEnfermedad","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoEnfermedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEnfermedad,TipoEnfermedadConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoenfermedadConstantesFunciones.mostrarid_empresaTipoEnfermedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEnfermedadConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoenfermedadConstantesFunciones.resaltarid_empresaTipoEnfermedad,this,this.tipoenfermedadConstantesFunciones.activarid_empresaTipoEnfermedad));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoenfermedadConstantesFunciones.resaltarid_empresaTipoEnfermedad,this,this.tipoenfermedadConstantesFunciones.activarid_empresaTipoEnfermedad,false,"id_empresaTipoEnfermedad","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoEnfermedadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoEnfermedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEnfermedad,TipoEnfermedadConstantesFunciones.LABEL_CODIGO));

		if(this.tipoenfermedadConstantesFunciones.mostrarcodigoTipoEnfermedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEnfermedadConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoenfermedadConstantesFunciones.resaltarcodigoTipoEnfermedad,this.tipoenfermedadConstantesFunciones.activarcodigoTipoEnfermedad,this,true,"codigoTipoEnfermedad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoenfermedadConstantesFunciones.resaltarcodigoTipoEnfermedad,this.tipoenfermedadConstantesFunciones.activarcodigoTipoEnfermedad,this,true,"codigoTipoEnfermedad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoEnfermedadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoEnfermedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEnfermedad,TipoEnfermedadConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoenfermedadConstantesFunciones.mostrarnombreTipoEnfermedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEnfermedadConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoenfermedadConstantesFunciones.resaltarnombreTipoEnfermedad,this.tipoenfermedadConstantesFunciones.activarnombreTipoEnfermedad,this,true,"nombreTipoEnfermedad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoenfermedadConstantesFunciones.resaltarnombreTipoEnfermedad,this.tipoenfermedadConstantesFunciones.activarnombreTipoEnfermedad,this,true,"nombreTipoEnfermedad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoEnfermedadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosEnfermedad && this.tipoenfermedadConstantesFunciones.mostrarEnfermedadTipoEnfermedad && !TipoEnfermedadConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Enfermedades");
				tableColumn.setHeaderValue("Enfermedades");
				tableColumn.setCellRenderer(new EnfermedadTableCell(tipoenfermedadConstantesFunciones.resaltarEnfermedadTipoEnfermedad,this,this.tipoenfermedadConstantesFunciones.activarEnfermedadTipoEnfermedad));
				tableColumn.setCellEditor(new EnfermedadTableCell(tipoenfermedadConstantesFunciones.resaltarEnfermedadTipoEnfermedad,this,this.tipoenfermedadConstantesFunciones.activarEnfermedadTipoEnfermedad));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoEnfermedad.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoenfermedadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoenfermedadSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoEnfermedad.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoenfermedadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoenfermedadSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoEnfermedad.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoEnfermedad && this.isPermisoGuardarCambiosTipoEnfermedad) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoenfermedadSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoenfermedadSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoEnfermedad.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoenfermedadSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoEnfermedad.addColumn(tableColumn);
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
			
			this.jTableDatosTipoEnfermedad.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoEnfermedad && this.isPermisoGuardarCambiosTipoEnfermedad) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoenfermedadSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoEnfermedad && this.isPermisoGuardarCambiosTipoEnfermedad) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoEnfermedad.moveColumn(this.jTableDatosTipoEnfermedad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoEnfermedad.moveColumn(this.jTableDatosTipoEnfermedad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoenfermedadSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoEnfermedad.moveColumn(this.jTableDatosTipoEnfermedad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoEnfermedad.moveColumn(this.jTableDatosTipoEnfermedad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoEnfermedad.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoEnfermedad.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoEnfermedad,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoEnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoEnfermedad.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoEnfermedad.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoEnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoEnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoEnfermedad.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoEnfermedad.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoEnfermedad.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoenfermedadLogic.getTipoEnfermedads().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoenfermedads.size()-1;
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
		//this.jTableDatosTipoEnfermedad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoEnfermedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoEnfermedad();
			
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
				
				//this.isEsNuevoTipoEnfermedad=false;
					
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
			
				if(this.tipoenfermedadSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoEnfermedad==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoEnfermedad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoEnfermedad.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoenfermedad.getsType().equals("DUPLICADO")
				   || this.tipoenfermedad.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoEnfermedad=true;
				
				} else {
					this.isEsNuevoTipoEnfermedad=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoenfermedad.getId()>=0 && !this.tipoenfermedad.getIsNew()) {						
						this.isEsNuevoTipoEnfermedad=false;
						
					} else {
						this.isEsNuevoTipoEnfermedad=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoEnfermedad(esRelaciones);						
				
				this.seleccionarTipoEnfermedad(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoenfermedad.getId()<0) {
					this.isEsNuevoTipoEnfermedad=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoEnfermedad(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoEnfermedad(evt,rowIndex);
				}	
				
				if(this.tipoenfermedadSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoEnfermedad: " + this.dDif); 
					}
				}								
				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoEnfermedad(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoenfermedad)) {
					if(this.tipoenfermedad.getId()>0) {
						this.tipoenfermedad.setIsDeleted(true);
						
						this.tipoenfermedadsEliminados.add(this.tipoenfermedad);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoenfermedadLogic.getTipoEnfermedads().remove(this.tipoenfermedad);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoenfermedads.remove(this.tipoenfermedad);				
					}
					
					
					((TipoEnfermedadModel) this.jTableDatosTipoEnfermedad.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEnfermedad(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoEnfermedad(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoEnfermedad) {
			
			if(this.jInternalFrameDetalleFormTipoEnfermedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoEnfermedad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoEnfermedad.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoEnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoEnfermedad(this.tipoenfermedad);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoenfermedadConstantesFunciones.cargarid_empresaTipoEnfermedad || this.tipoenfermedadConstantesFunciones.event_dependid_empresaTipoEnfermedad) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoenfermedad.getid_empresa());
									//this.inicializarActualizarBindingTipoEnfermedad(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoenfermedad.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoenfermedad.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoenfermedad.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoEnfermedad("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoEnfermedad(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEnfermedad() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoEnfermedad(TipoEnfermedad tipoenfermedad) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoEnfermedad(tipoenfermedad,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoEnfermedad(TipoEnfermedad tipoenfermedad,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoEnfermedad(tipoenfermedad);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoEnfermedad(tipoenfermedad,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoEnfermedad(tipoenfermedad);
	}
	
	public void setVariablesObjetoActualToFormularioTipoEnfermedad(TipoEnfermedad tipoenfermedad) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoEnfermedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoEnfermedad.jLabelidTipoEnfermedad.setText(tipoenfermedad.getId().toString());
			this.jInternalFrameDetalleFormTipoEnfermedad.jTextFieldcodigoTipoEnfermedad.setText(tipoenfermedad.getcodigo());
			this.jInternalFrameDetalleFormTipoEnfermedad.jTextAreanombreTipoEnfermedad.setText(tipoenfermedad.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoEnfermedad tipoenfermedadLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoenfermedadLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoEnfermedad tipoenfermedadLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoenfermedadLocal=this.tipoenfermedad;
			} else {
				tipoenfermedadLocal=this.tipoenfermedadAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoenfermedadLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoEnfermedad(tipoenfermedadLocal,true);
					
					if(tipoenfermedadSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoenfermedadLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoenfermedadLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoEnfermedad(TipoEnfermedad tipoenfermedad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoEnfermedad(tipoenfermedad,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoEnfermedad(tipoenfermedad);
	}
	
	public void setVariablesFormularioToObjetoActualTipoEnfermedad(TipoEnfermedad tipoenfermedad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoEnfermedad(tipoenfermedad,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoEnfermedad(TipoEnfermedad tipoenfermedad,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoEnfermedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoEnfermedad.jLabelidTipoEnfermedad.getText()==null || this.jInternalFrameDetalleFormTipoEnfermedad.jLabelidTipoEnfermedad.getText()=="" || this.jInternalFrameDetalleFormTipoEnfermedad.jLabelidTipoEnfermedad.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoEnfermedad.jLabelidTipoEnfermedad.setText("0");
			}

			if(conColumnasBase) {tipoenfermedad.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoEnfermedad.jLabelidTipoEnfermedad.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoEnfermedadConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEnfermedad.jLabelIdTipoEnfermedad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoenfermedad.setcodigo(this.jInternalFrameDetalleFormTipoEnfermedad.jTextFieldcodigoTipoEnfermedad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoEnfermedadConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEnfermedad.jLabelcodigoTipoEnfermedad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoenfermedad.setnombre(this.jInternalFrameDetalleFormTipoEnfermedad.jTextAreanombreTipoEnfermedad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoEnfermedadConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEnfermedad.jLabelnombreTipoEnfermedad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoEnfermedad(TipoEnfermedad tipoenfermedadBean,TipoEnfermedad tipoenfermedad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoEnfermedad(TipoEnfermedad tipoenfermedadOrigen,TipoEnfermedad tipoenfermedad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoenfermedadOrigen.getId()!=null && !tipoenfermedadOrigen.getId().equals(0L))) {tipoenfermedad.setId(tipoenfermedadOrigen.getId());}}
			if(conDefault || (!conDefault && tipoenfermedadOrigen.getcodigo()!=null && !tipoenfermedadOrigen.getcodigo().equals(""))) {tipoenfermedad.setcodigo(tipoenfermedadOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoenfermedadOrigen.getnombre()!=null && !tipoenfermedadOrigen.getnombre().equals(""))) {tipoenfermedad.setnombre(tipoenfermedadOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoEnfermedad(TipoEnfermedad tipoenfermedad) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoEnfermedad.jLabelidTipoEnfermedad.setText(tipoenfermedad.getId().toString());
			this.jInternalFrameDetalleFormTipoEnfermedad.jTextFieldcodigoTipoEnfermedad.setText(tipoenfermedad.getcodigo());
			this.jInternalFrameDetalleFormTipoEnfermedad.jTextAreanombreTipoEnfermedad.setText(tipoenfermedad.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoEnfermedad(TipoEnfermedadBean tipoenfermedadBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoEnfermedad.jLabelidTipoEnfermedad.setText(tipoenfermedadBean.getId().toString());
			this.jInternalFrameDetalleFormTipoEnfermedad.jTextFieldcodigoTipoEnfermedad.setText(tipoenfermedadBean.getcodigo());
			this.jInternalFrameDetalleFormTipoEnfermedad.jTextAreanombreTipoEnfermedad.setText(tipoenfermedadBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoEnfermedad(TipoEnfermedadParameterReturnGeneral tipoenfermedadReturnGeneral,TipoEnfermedadBean tipoenfermedadBean,Boolean conDefault) throws Exception { 
		try {
			TipoEnfermedad tipoenfermedadLocal=new TipoEnfermedad();
			
			tipoenfermedadLocal=tipoenfermedadReturnGeneral.getTipoEnfermedad();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoenfermedadLocal.getId()!=null && !tipoenfermedadLocal.getId().equals(0L))) {tipoenfermedadBean.setId(tipoenfermedadLocal.getId());}}
			if(conDefault || (!conDefault && tipoenfermedadLocal.getcodigo()!=null && !tipoenfermedadLocal.getcodigo().equals(""))) {tipoenfermedadBean.setcodigo(tipoenfermedadLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoenfermedadLocal.getnombre()!=null && !tipoenfermedadLocal.getnombre().equals(""))) {tipoenfermedadBean.setnombre(tipoenfermedadLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoEnfermedadGenerico(Long idTipoEnfermedadSeleccionado,JComboBox jComboBoxTipoEnfermedad,List<TipoEnfermedad> tipoenfermedadsLocal)throws Exception {
		try {
			TipoEnfermedad  tipoenfermedadTemp=null;

			for(TipoEnfermedad tipoenfermedadAux:tipoenfermedadsLocal) {
				if(tipoenfermedadAux.getId()!=null && tipoenfermedadAux.getId().equals(idTipoEnfermedadSeleccionado)) {
					tipoenfermedadTemp=tipoenfermedadAux;
					break;
				}
			}

			jComboBoxTipoEnfermedad.setSelectedItem(tipoenfermedadTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoEnfermedadGenerico(JComboBox jComboBoxTipoEnfermedad,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoEnfermedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoEnfermedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoEnfermedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoEnfermedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoEnfermedad.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoEnfermedad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoEnfermedad.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoEnfermedad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoEnfermedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoEnfermedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Enfermedad")) {
			jButtonEnfermedadActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoenfermedad=(TipoEnfermedad) tipoenfermedadLogic.getTipoEnfermedads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoenfermedad =(TipoEnfermedad) tipoenfermedads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoenfermedad.getIsNew() && !tipoenfermedad.getIsChanged() && !tipoenfermedad.getIsDeleted()) {
				sDescripcion=tipoenfermedad.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoenfermedad.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoEnfermedad tipoenfermedadRow=new TipoEnfermedad();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoenfermedadRow=(TipoEnfermedad) tipoenfermedadLogic.getTipoEnfermedads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoenfermedadRow=(TipoEnfermedad) tipoenfermedads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonEnfermedadActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoEnfermedad tipoenfermedad) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoEnfermedad==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoenfermedad = (TipoEnfermedad)this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoenfermedad = (TipoEnfermedad)this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoenfermedad!=null) {
						this.tipoenfermedad = tipoenfermedad;
					} else {
						this.tipoenfermedad = new TipoEnfermedad();
					}
				}

				if(this.isTienePermisosEnfermedad && this.permiteMantenimiento(this.tipoenfermedad)) {
					EnfermedadBeanSwingJInternalFrame enfermedadBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFramePopup=new EnfermedadBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						enfermedadBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFramePopup;
					} else {
						enfermedadBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame;
					}

					List<TipoEnfermedad> tipoenfermedads=new ArrayList<TipoEnfermedad>();
					tipoenfermedads.add(this.tipoenfermedad);
					if(!esRelacionado) {
						//enfermedadBeanSwingJInternalFrame.enfermedadSessionBean.setConGuardarRelaciones(false);
						//enfermedadBeanSwingJInternalFrame.enfermedadSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					enfermedadBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoEnfermedad.cargarEnfermedadBeanSwingJInternalFrame(tipoenfermedads,this.tipoenfermedad,enfermedadBeanSwingJInternalFrame,/*conInicializar,*/enfermedadBeanSwingJInternalFrame.enfermedadSessionBean.getConGuardarRelaciones(),enfermedadBeanSwingJInternalFrame.enfermedadSessionBean.getEsGuardarRelacionado());
					enfermedadBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						enfermedadBeanSwingJInternalFrame.actualizarEstadoPanelsEnfermedad("no_relacionado");

						enfermedadBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EnfermedadConstantesFunciones.ITAMANIOFILATABLA + (EnfermedadConstantesFunciones.ITAMANIOFILATABLA/2));

						enfermedadBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoEnfermedad=(TitledBorder)this.jScrollPanelDatosTipoEnfermedad.getBorder();
						TitledBorder titledBorderEnfermedad=(TitledBorder)enfermedadBeanSwingJInternalFrame.jScrollPanelDatosEnfermedad.getBorder();

						titledBorderEnfermedad.setTitle(titledBorderTipoEnfermedad.getTitle() + " -> Enfermedad");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,enfermedadBeanSwingJInternalFrame);
						}

						enfermedadBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(enfermedadBeanSwingJInternalFrame);

						enfermedadBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoenfermedadSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Enfermedad",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoEnfermedad(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoEnfermedad.setVisible((this.isVisibilidadCeldaNuevoTipoEnfermedad && this.isPermisoNuevoTipoEnfermedad));			
			this.jButtonDuplicarTipoEnfermedad.setVisible((this.isVisibilidadCeldaDuplicarTipoEnfermedad && this.isPermisoDuplicarTipoEnfermedad));			
			this.jButtonCopiarTipoEnfermedad.setVisible((this.isVisibilidadCeldaCopiarTipoEnfermedad && this.isPermisoCopiarTipoEnfermedad));
			this.jButtonVerFormTipoEnfermedad.setVisible((this.isVisibilidadCeldaVerFormTipoEnfermedad && this.isPermisoVerFormTipoEnfermedad));
			
			this.jButtonAbrirOrderByTipoEnfermedad.setVisible((this.isVisibilidadCeldaOrdenTipoEnfermedad && this.isPermisoOrdenTipoEnfermedad));			
			
			this.jButtonNuevoRelacionesTipoEnfermedad.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEnfermedad && this.isPermisoNuevoTipoEnfermedad));			
			this.jButtonNuevoGuardarCambiosTipoEnfermedad.setVisible((this.isVisibilidadCeldaNuevoTipoEnfermedad && this.isPermisoNuevoTipoEnfermedad && this.isPermisoGuardarCambiosTipoEnfermedad));
			
			if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonModificarTipoEnfermedad.setVisible((this.isVisibilidadCeldaModificarTipoEnfermedad && this.isPermisoActualizarTipoEnfermedad));	
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonActualizarTipoEnfermedad.setVisible((this.isVisibilidadCeldaActualizarTipoEnfermedad && this.isPermisoActualizarTipoEnfermedad));	
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonEliminarTipoEnfermedad.setVisible((this.isVisibilidadCeldaEliminarTipoEnfermedad && this.isPermisoEliminarTipoEnfermedad));
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonCancelarTipoEnfermedad.setVisible(this.isVisibilidadCeldaCancelarTipoEnfermedad);							
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonGuardarCambiosTipoEnfermedad.setVisible((this.isVisibilidadCeldaGuardarTipoEnfermedad && this.isPermisoGuardarCambiosTipoEnfermedad));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoEnfermedad.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEnfermedad && this.isPermisoGuardarCambiosTipoEnfermedad));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoEnfermedad.setVisible((this.isVisibilidadCeldaNuevoTipoEnfermedad && this.isPermisoNuevoTipoEnfermedad));						
			this.jButtonDuplicarToolBarTipoEnfermedad.setVisible((this.isVisibilidadCeldaDuplicarTipoEnfermedad && this.isPermisoDuplicarTipoEnfermedad));						
			this.jButtonCopiarToolBarTipoEnfermedad.setVisible((this.isVisibilidadCeldaCopiarTipoEnfermedad && this.isPermisoCopiarTipoEnfermedad));			
			this.jButtonVerFormToolBarTipoEnfermedad.setVisible((this.isVisibilidadCeldaVerFormTipoEnfermedad && this.isPermisoVerFormTipoEnfermedad));			
			this.jButtonAbrirOrderByToolBarTipoEnfermedad.setVisible((this.isVisibilidadCeldaOrdenTipoEnfermedad && this.isPermisoOrdenTipoEnfermedad));
			this.jButtonNuevoRelacionesToolBarTipoEnfermedad.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEnfermedad && this.isPermisoNuevoTipoEnfermedad));			
			this.jButtonNuevoGuardarCambiosToolBarTipoEnfermedad.setVisible((this.isVisibilidadCeldaNuevoTipoEnfermedad && this.isPermisoNuevoTipoEnfermedad && this.isPermisoGuardarCambiosTipoEnfermedad));			
			
			if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonModificarToolBarTipoEnfermedad.setVisible((this.isVisibilidadCeldaModificarTipoEnfermedad && this.isPermisoActualizarTipoEnfermedad));	
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonActualizarToolBarTipoEnfermedad.setVisible((this.isVisibilidadCeldaActualizarTipoEnfermedad  && this.isPermisoActualizarTipoEnfermedad));	
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonEliminarToolBarTipoEnfermedad.setVisible((this.isVisibilidadCeldaEliminarTipoEnfermedad && this.isPermisoEliminarTipoEnfermedad));
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonCancelarToolBarTipoEnfermedad.setVisible(this.isVisibilidadCeldaCancelarTipoEnfermedad);				
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonGuardarCambiosToolBarTipoEnfermedad.setVisible((this.isVisibilidadCeldaGuardarTipoEnfermedad && this.isPermisoGuardarCambiosTipoEnfermedad));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoEnfermedad.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEnfermedad && this.isPermisoGuardarCambiosTipoEnfermedad));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoEnfermedad.setVisible((this.isVisibilidadCeldaNuevoTipoEnfermedad && this.isPermisoNuevoTipoEnfermedad));			
			this.jMenuItemDuplicarTipoEnfermedad.setVisible((this.isVisibilidadCeldaDuplicarTipoEnfermedad && this.isPermisoDuplicarTipoEnfermedad));			
			this.jMenuItemCopiarTipoEnfermedad.setVisible((this.isVisibilidadCeldaCopiarTipoEnfermedad && this.isPermisoCopiarTipoEnfermedad));			
			this.jMenuItemVerFormTipoEnfermedad.setVisible((this.isVisibilidadCeldaVerFormTipoEnfermedad && this.isPermisoVerFormTipoEnfermedad));			
			this.jMenuItemAbrirOrderByTipoEnfermedad.setVisible((this.isVisibilidadCeldaOrdenTipoEnfermedad && this.isPermisoOrdenTipoEnfermedad));			
			//this.jMenuItemMostrarOcultarTipoEnfermedad.setVisible((this.isVisibilidadCeldaOrdenTipoEnfermedad && this.isPermisoOrdenTipoEnfermedad));
			this.jMenuItemDetalleAbrirOrderByTipoEnfermedad.setVisible((this.isVisibilidadCeldaOrdenTipoEnfermedad && this.isPermisoOrdenTipoEnfermedad));			
			//this.jMenuItemDetalleMostrarOcultarTipoEnfermedad.setVisible((this.isVisibilidadCeldaOrdenTipoEnfermedad && this.isPermisoOrdenTipoEnfermedad));			
			this.jMenuItemNuevoRelacionesTipoEnfermedad.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEnfermedad && this.isPermisoNuevoTipoEnfermedad));			
			this.jMenuItemNuevoGuardarCambiosTipoEnfermedad.setVisible((this.isVisibilidadCeldaNuevoTipoEnfermedad && this.isPermisoNuevoTipoEnfermedad && this.isPermisoGuardarCambiosTipoEnfermedad));									
			
			if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
			this.jInternalFrameDetalleFormTipoEnfermedad.jMenuItemModificarTipoEnfermedad.setVisible((this.isVisibilidadCeldaModificarTipoEnfermedad && this.isPermisoActualizarTipoEnfermedad));	
			this.jInternalFrameDetalleFormTipoEnfermedad.jMenuItemActualizarTipoEnfermedad.setVisible((this.isVisibilidadCeldaActualizarTipoEnfermedad && this.isPermisoActualizarTipoEnfermedad));	
			this.jInternalFrameDetalleFormTipoEnfermedad.jMenuItemEliminarTipoEnfermedad.setVisible((this.isVisibilidadCeldaEliminarTipoEnfermedad && this.isPermisoEliminarTipoEnfermedad));
			this.jInternalFrameDetalleFormTipoEnfermedad.jMenuItemCancelarTipoEnfermedad.setVisible(this.isVisibilidadCeldaCancelarTipoEnfermedad);				
			}
			
			this.jMenuItemGuardarCambiosTipoEnfermedad.setVisible((this.isVisibilidadCeldaGuardarTipoEnfermedad && this.isPermisoGuardarCambiosTipoEnfermedad));						
			this.jMenuItemGuardarCambiosTablaTipoEnfermedad.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEnfermedad && this.isPermisoGuardarCambiosTipoEnfermedad));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoEnfermedad=this.jButtonNuevoTipoEnfermedad.isVisible();
			this.isVisibilidadCeldaDuplicarTipoEnfermedad=this.jButtonDuplicarTipoEnfermedad.isVisible();
			this.isVisibilidadCeldaCopiarTipoEnfermedad=this.jButtonCopiarTipoEnfermedad.isVisible();
			this.isVisibilidadCeldaVerFormTipoEnfermedad=this.jButtonVerFormTipoEnfermedad.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoEnfermedad=this.jButtonAbrirOrderByTipoEnfermedad.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoEnfermedad=this.jButtonNuevoRelacionesTipoEnfermedad.isVisible();
			this.isVisibilidadCeldaModificarTipoEnfermedad=this.jButtonModificarTipoEnfermedad.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
			this.isVisibilidadCeldaActualizarTipoEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.jButtonActualizarTipoEnfermedad.isVisible();
			this.isVisibilidadCeldaEliminarTipoEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.jButtonEliminarTipoEnfermedad.isVisible();
			this.isVisibilidadCeldaCancelarTipoEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.jButtonCancelarTipoEnfermedad.isVisible();
			this.isVisibilidadCeldaGuardarTipoEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.jButtonGuardarCambiosTipoEnfermedad.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoEnfermedad=this.jButtonGuardarCambiosTablaTipoEnfermedad.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoEnfermedad=this.jButtonNuevoToolBarTipoEnfermedad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoEnfermedad=this.jButtonNuevoRelacionesToolBarTipoEnfermedad.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
			this.isVisibilidadCeldaModificarTipoEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.jButtonModificarToolBarTipoEnfermedad.isVisible();
			this.isVisibilidadCeldaActualizarTipoEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.jButtonActualizarToolBarTipoEnfermedad.isVisible();
			this.isVisibilidadCeldaEliminarTipoEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.jButtonEliminarToolBarTipoEnfermedad.isVisible();
			this.isVisibilidadCeldaCancelarTipoEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.jButtonCancelarToolBarTipoEnfermedad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoEnfermedad=this.jButtonGuardarCambiosToolBarTipoEnfermedad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoEnfermedad=this.jButtonGuardarCambiosTablaToolBarTipoEnfermedad.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoEnfermedad=this.jMenuItemNuevoTipoEnfermedad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoEnfermedad=this.jMenuItemNuevoRelacionesTipoEnfermedad.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
			this.isVisibilidadCeldaModificarTipoEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.jMenuItemModificarTipoEnfermedad.isVisible();
			this.isVisibilidadCeldaActualizarTipoEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.jMenuItemActualizarTipoEnfermedad.isVisible();
			this.isVisibilidadCeldaEliminarTipoEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.jMenuItemEliminarTipoEnfermedad.isVisible();
			this.isVisibilidadCeldaCancelarTipoEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.jMenuItemCancelarTipoEnfermedad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoEnfermedad=this.jMenuItemGuardarCambiosTipoEnfermedad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoEnfermedad=this.jMenuItemGuardarCambiosTablaTipoEnfermedad.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoEnfermedad(Boolean esInicializar) {
		if(TipoEnfermedadJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoenfermedadSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoEnfermedad();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoEnfermedad(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoEnfermedad() {
		this.jButtonNuevoTipoEnfermedad.setVisible(this.isPermisoNuevoTipoEnfermedad);			
		this.jButtonDuplicarTipoEnfermedad.setVisible(this.isPermisoDuplicarTipoEnfermedad);			
		this.jButtonCopiarTipoEnfermedad.setVisible(this.isPermisoCopiarTipoEnfermedad);			
		this.jButtonVerFormTipoEnfermedad.setVisible(this.isPermisoVerFormTipoEnfermedad);			
		
		this.jButtonAbrirOrderByTipoEnfermedad.setVisible(this.isPermisoOrdenTipoEnfermedad);					
		
		this.jButtonNuevoRelacionesTipoEnfermedad.setVisible(this.isPermisoNuevoTipoEnfermedad);			
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonModificarTipoEnfermedad.setVisible(this.isPermisoActualizarTipoEnfermedad);	
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonActualizarTipoEnfermedad.setVisible(this.isPermisoActualizarTipoEnfermedad);	
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonEliminarTipoEnfermedad.setVisible(this.isPermisoEliminarTipoEnfermedad);
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonCancelarTipoEnfermedad.setVisible(this.isVisibilidadCeldaCancelarTipoEnfermedad);						
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonGuardarCambiosTipoEnfermedad.setVisible(this.isPermisoGuardarCambiosTipoEnfermedad);							
		}
		
		this.jButtonGuardarCambiosTablaTipoEnfermedad.setVisible(this.isPermisoActualizarTipoEnfermedad);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoEnfermedad() {
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonModificarTipoEnfermedad.setVisible(this.isPermisoActualizarTipoEnfermedad);	
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonActualizarTipoEnfermedad.setVisible(this.isPermisoActualizarTipoEnfermedad);	
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonEliminarTipoEnfermedad.setVisible(this.isPermisoEliminarTipoEnfermedad);
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonCancelarTipoEnfermedad.setVisible(this.isVisibilidadCeldaCancelarTipoEnfermedad);							
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonGuardarCambiosTipoEnfermedad.setVisible((this.isVisibilidadCeldaGuardarTipoEnfermedad && this.isPermisoGuardarCambiosTipoEnfermedad));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoEnfermedad() {
		if(TipoEnfermedadJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoEnfermedad();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoEnfermedad() {
	}
	
	public void jTableDatosTipoEnfermedadListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoEnfermedad(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoEnfermedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEnfermedad(this.gettipoenfermedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEnfermedad(this.tipoenfermedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoenfermedad==null) {
						this.tipoenfermedad = new TipoEnfermedad();
					}

					this.setVariablesFormularioToObjetoActualTipoEnfermedad(this.tipoenfermedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEnfermedad(this.tipoenfermedad);
				}

				if(this.tipoenfermedad.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoenfermedad.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEnfermedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoEnfermedadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoEnfermedad(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoEnfermedad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoEnfermedad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoEnfermedad(this.gettipoenfermedad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEnfermedad(this.tipoenfermedad);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoenfermedadLogic.getConnexion());

				if(this.tipoenfermedad.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoenfermedad.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoEnfermedad=(TitledBorder)this.jScrollPanelDatosTipoEnfermedad.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoEnfermedad.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoEnfermedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEnfermedad(this.gettipoenfermedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEnfermedad(this.tipoenfermedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoenfermedad==null) {
						this.tipoenfermedad = new TipoEnfermedad();
					}

					this.setVariablesFormularioToObjetoActualTipoEnfermedad(this.tipoenfermedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEnfermedad(this.tipoenfermedad);
				}

				if(this.tipoenfermedad.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoenfermedad.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEnfermedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoEnfermedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEnfermedad(this.gettipoenfermedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEnfermedad(this.tipoenfermedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoenfermedad==null) {
						this.tipoenfermedad = new TipoEnfermedad();
					}

					this.setVariablesFormularioToObjetoActualTipoEnfermedad(this.tipoenfermedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEnfermedad(this.tipoenfermedad);
				}

				if(this.tipoenfermedad.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoenfermedad.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEnfermedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoEnfermedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEnfermedad(this.gettipoenfermedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEnfermedad(this.tipoenfermedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoenfermedad==null) {
						this.tipoenfermedad = new TipoEnfermedad();
					}

					this.setVariablesFormularioToObjetoActualTipoEnfermedad(this.tipoenfermedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEnfermedad(this.tipoenfermedad);
				}

				if(this.tipoenfermedad.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoenfermedad.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEnfermedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoEnfermedadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoEnfermedad(false,false);

			this.getTipoEnfermedadsFK_IdEmpresa();

			this.inicializarActualizarBindingTipoEnfermedad(false);

			//if(TipoEnfermedadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoEnfermedad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoenfermedadLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoEnfermedad() {
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
		

		if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
			this.jInternalFrameDetalleFormTipoEnfermedad.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoEnfermedad.dispose();
			this.jInternalFrameDetalleFormTipoEnfermedad=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoEnfermedad!=null) {
			this.jInternalFrameReporteDinamicoTipoEnfermedad.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoEnfermedad.dispose();
			this.jInternalFrameReporteDinamicoTipoEnfermedad=null;
		}
		
		if(this.jInternalFrameImportacionTipoEnfermedad!=null) {
			this.jInternalFrameImportacionTipoEnfermedad.setVisible(false);	    			
			this.jInternalFrameImportacionTipoEnfermedad.dispose();
			this.jInternalFrameImportacionTipoEnfermedad=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoEnfermedad();
			
			TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoEnfermedad")) {
				jButtonNuevoTipoEnfermedadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoEnfermedad")) {
				jButtonDuplicarTipoEnfermedadActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoEnfermedad")) {
				jButtonCopiarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoEnfermedad")) {
				jButtonVerFormTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoEnfermedad")) {
				jButtonNuevoTipoEnfermedadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoEnfermedad")) {
				jButtonDuplicarTipoEnfermedadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoEnfermedad")) {
				jButtonNuevoTipoEnfermedadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoEnfermedad")) {
				jButtonDuplicarTipoEnfermedadActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoEnfermedad")) {
				jButtonNuevoTipoEnfermedadActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoEnfermedad")) {
				jButtonNuevoTipoEnfermedadActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoEnfermedad")) {
				jButtonNuevoTipoEnfermedadActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoEnfermedad")) {
				jButtonModificarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoEnfermedad")) {
				jButtonModificarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoEnfermedad")) {
				jButtonModificarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoEnfermedad")) {
				jButtonActualizarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoEnfermedad")) {
				jButtonActualizarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoEnfermedad")) {
				jButtonActualizarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoEnfermedad")) {
				jButtonEliminarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoEnfermedad")) {
				jButtonEliminarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoEnfermedad")) {
				jButtonEliminarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoEnfermedad")) {
				jButtonCancelarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoEnfermedad")) {
				jButtonCancelarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoEnfermedad")) {
				jButtonCancelarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoEnfermedad")) {
				jButtonCerrarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoEnfermedad")) {
				jButtonCerrarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoEnfermedad")) {
				jButtonCerrarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoEnfermedad")) {
				jButtonMostrarOcultarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoEnfermedad")) {
				jButtonCancelarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoEnfermedad")) {
				jButtonGuardarCambiosTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoEnfermedad")) {
				jButtonGuardarCambiosTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoEnfermedad")) {
				jButtonCopiarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoEnfermedad")) {
				jButtonVerFormTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoEnfermedad")) {
				jButtonGuardarCambiosTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoEnfermedad")) {
				jButtonCopiarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoEnfermedad")) {
				jButtonVerFormTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoEnfermedad")) {
				jButtonGuardarCambiosTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoEnfermedad")) {
				jButtonGuardarCambiosTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoEnfermedad")) {
				jButtonGuardarCambiosTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoEnfermedad")) {
				jButtonRecargarInformacionTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoEnfermedad")) {
				jButtonRecargarInformacionTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoEnfermedad")) {
				jButtonRecargarInformacionTipoEnfermedadActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoEnfermedad")) {
				jButtonAnterioresTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoEnfermedad")) {
				jButtonAnterioresTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoEnfermedad")) {
				jButtonAnterioresTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoEnfermedad")) {
				jButtonSiguientesTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoEnfermedad")) {
				jButtonSiguientesTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoEnfermedad")) {
				jButtonSiguientesTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoEnfermedad") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoEnfermedad")) {
				jButtonAbrirOrderByTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoEnfermedad") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoEnfermedad")) {
				jButtonMostrarOcultarTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoEnfermedad")) {
				jButtonNuevoGuardarCambiosTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoEnfermedad")) {
				jButtonNuevoGuardarCambiosTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoEnfermedad")) {
				jButtonNuevoGuardarCambiosTipoEnfermedadActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoEnfermedad")) {
				jButtonCerrarReporteDinamicoTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoEnfermedad")) {
				jButtonGenerarReporteDinamicoTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoEnfermedad")) {
				
				jButtonGenerarExcelReporteDinamicoTipoEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoEnfermedad")) {
				jButtonCerrarImportacionTipoEnfermedadActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoEnfermedad")) {
				
				jButtonGenerarImportacionTipoEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoEnfermedad")) {
				
				jButtonAbrirImportacionTipoEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoEnfermedad")) {
				jComboBoxTiposAccionesTipoEnfermedadActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoEnfermedad")) {
				jComboBoxTiposRelacionesTipoEnfermedadActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoEnfermedad")) {
				jComboBoxTiposAccionesTipoEnfermedadActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoEnfermedad")) {
				
				jComboBoxTiposSeleccionarTipoEnfermedadActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoEnfermedad")) {
				jTextFieldValorCampoGeneralTipoEnfermedadActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoEnfermedad")) {
				jButtonAbrirOrderByTipoEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoEnfermedad")) {
				jButtonAbrirOrderByTipoEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoEnfermedad")) {
				jButtonCerrarOrderByTipoEnfermedadActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoEnfermedadBusqueda")) {
				this.jButtonidTipoEnfermedadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoEnfermedadUpdate")) {
				this.jButtonid_empresaTipoEnfermedadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoEnfermedadBusqueda")) {
				this.jButtonid_empresaTipoEnfermedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoEnfermedadBusqueda")) {
				this.jButtoncodigoTipoEnfermedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoEnfermedadBusqueda")) {
				this.jButtonnombreTipoEnfermedadBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoEnfermedad();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEnfermedadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoenfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoenfermedad);
				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
				
				


				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEnfermedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEnfermedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoEnfermedad tipoenfermedadLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoenfermedadLocal=this.tipoenfermedad;
			} else {
				tipoenfermedadLocal=this.tipoenfermedadAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoenfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoenfermedad);
				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
							
				
				


				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEnfermedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEnfermedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEnfermedadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadAnterior =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoenfermedadAnterior =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
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
			
			TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
			
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
			
			


			
			TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEnfermedadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoenfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoenfermedad);
				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
								
						
				


				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEnfermedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEnfermedad.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoenfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoenfermedad);
				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
								
				
				


				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEnfermedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEnfermedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEnfermedadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadAnterior =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoenfermedadAnterior =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoenfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoenfermedad);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEnfermedadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadAnterior =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoenfermedadAnterior =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEnfermedadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoenfermedad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoenfermedad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoenfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoenfermedad);
				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
							
				
				


				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEnfermedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEnfermedad.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEnfermedadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoenfermedadAnterior =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoenfermedadAnterior =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
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
			
			TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
			
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
			
			


			
			TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEnfermedadActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoenfermedad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoenfermedad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoenfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoenfermedad);
				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
								
				
				


				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEnfermedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEnfermedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEnfermedadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadAnterior =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoenfermedadAnterior =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEnfermedadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoenfermedad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoenfermedad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEnfermedadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoenfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoenfermedad);
				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoEnfermedad")) {
					jCheckBoxSeleccionarTodosTipoEnfermedadItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoEnfermedad")) {
					jCheckBoxSeleccionadosTipoEnfermedadItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoEnfermedad")) {
					
				}
				
				


				
				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEnfermedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEnfermedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoenfermedad);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoenfermedad);
				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
												
				
				


				
				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEnfermedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEnfermedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEnfermedadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoenfermedadAnterior =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoenfermedadAnterior =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEnfermedadActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoenfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoenfermedad);
				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
				
				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
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
			
			TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
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
			
			


			
			TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEnfermedadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoenfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoenfermedad);
				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEnfermedad.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEnfermedad.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoenfermedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoenfermedad);
				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
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
				
				


				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEnfermedad.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEnfermedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEnfermedadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoenfermedadAnterior =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoenfermedadAnterior =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoEnfermedad")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoEnfermedadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoEnfermedad.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoenfermedad =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoenfermedad);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoEnfermedad")) {
				
				}
				
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoEnfermedad")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoEnfermedad.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoEnfermedad")) {
			
			}
			
			TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoEnfermedad();
			
			TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
			
			if(sTipo.equals("NuevoTipoEnfermedad")) {
				jButtonNuevoTipoEnfermedadActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoEnfermedad")) {
				jButtonDuplicarTipoEnfermedadActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoEnfermedad")) {
				jButtonCopiarTipoEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoEnfermedad")) {
				jButtonVerFormTipoEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoEnfermedad")) {
				jButtonNuevoTipoEnfermedadActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoEnfermedad")) {
				jButtonModificarTipoEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoEnfermedad")) {
				jButtonActualizarTipoEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoEnfermedad")) {
				jButtonEliminarTipoEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoEnfermedad")) {
				jButtonGuardarCambiosTipoEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoEnfermedad")) {
				jButtonCancelarTipoEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoEnfermedad")) {
				jButtonCerrarTipoEnfermedadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoEnfermedad")) {
				jButtonGuardarCambiosTipoEnfermedadActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoEnfermedad")) {
				jButtonNuevoGuardarCambiosTipoEnfermedadActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoEnfermedad")) {
				jButtonAbrirOrderByTipoEnfermedadActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoEnfermedad")) {
				jButtonRecargarInformacionTipoEnfermedadActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoEnfermedad")) {
				jButtonAnterioresTipoEnfermedadActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoEnfermedad")) {
				jButtonSiguientesTipoEnfermedadActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoEnfermedadBusqueda")) {
				this.jButtonidTipoEnfermedadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoEnfermedadUpdate")) {
				this.jButtonid_empresaTipoEnfermedadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoEnfermedadBusqueda")) {
				this.jButtonid_empresaTipoEnfermedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoEnfermedadBusqueda")) {
				this.jButtoncodigoTipoEnfermedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoEnfermedadBusqueda")) {
				this.jButtonnombreTipoEnfermedadBusquedaActionPerformed(evt);
			}
			
			TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoEnfermedad();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoEnfermedad")) {
				closingInternalFrameTipoEnfermedad();
				
			} else if(sTipo.equals("jButtonCancelarTipoEnfermedad")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoEnfermedad = (JInternalFrameBase)evt.getSource();
	            	
	            TipoEnfermedadBeanSwingJInternalFrame jInternalFrameParent=(TipoEnfermedadBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoEnfermedad.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoEnfermedadActionPerformed(null);
			}
			
			TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoenfermedad,new Object(),this.tipoenfermedadParameterGeneral,this.tipoenfermedadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoEnfermedad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoEnfermedad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoEnfermedad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoenfermedad)) {
			if(!esControlTabla) {
				if(TipoEnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoEnfermedad(this.tipoenfermedad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEnfermedad(this.tipoenfermedad);			
				}
				
				if(this.tipoenfermedadSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoEnfermedad(this.tipoenfermedad,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoenfermedadReturnGeneral=tipoenfermedadLogic.procesarEventosTipoEnfermedadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoenfermedadLogic.getTipoEnfermedads(),this.tipoenfermedad,this.tipoenfermedadParameterGeneral,this.isEsNuevoTipoEnfermedad,classes);//this.tipoenfermedadLogic.getTipoEnfermedad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoEnfermedad(this.tipoenfermedadReturnGeneral,this.tipoenfermedadBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoenfermedadSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoEnfermedad(classes,this.tipoenfermedadReturnGeneral,this.tipoenfermedadBean,false);
					}
						
					if(this.tipoenfermedadReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoEnfermedad(this.tipoenfermedadReturnGeneral.getTipoEnfermedad());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoEnfermedad(this.tipoenfermedadReturnGeneral.getTipoEnfermedad());	
					}
						
					if(this.tipoenfermedadReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoEnfermedad(this.tipoenfermedadReturnGeneral.getTipoEnfermedad(),classes);//this.tipoenfermedadBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoEnfermedad(this.tipoenfermedad,classes);//this.tipoenfermedadBean);									
				}
			
				if(TipoEnfermedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoEnfermedad(this.tipoenfermedad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEnfermedad(this.tipoenfermedad);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoenfermedadAnterior!=null) {
						this.tipoenfermedad=this.tipoenfermedadAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoenfermedadReturnGeneral=tipoenfermedadLogic.procesarEventosTipoEnfermedadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoenfermedadLogic.getTipoEnfermedads(),this.tipoenfermedad,this.tipoenfermedadParameterGeneral,this.isEsNuevoTipoEnfermedad,classes);//this.tipoenfermedadLogic.getTipoEnfermedad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoenfermedadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoenfermedadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoenfermedadReturnGeneral.getTipoEnfermedad(),tipoenfermedadLogic.getTipoEnfermedads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoenfermedadReturnGeneral.getTipoEnfermedad(),this.tipoenfermedads);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoEnfermedad.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoEnfermedad.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoEnfermedad();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoEnfermedad() throws Exception {
		
		TipoEnfermedadModel tipoenfermedadModel=(TipoEnfermedadModel)this.jTableDatosTipoEnfermedad.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoenfermedadModel.tipoenfermedads=this.tipoenfermedadLogic.getTipoEnfermedads();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoenfermedadModel.tipoenfermedads=this.tipoenfermedads;
		}
		
		
		((TipoEnfermedadModel) this.jTableDatosTipoEnfermedad.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoEnfermedad() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoenfermedadAnterior(),this.tipoenfermedadLogic.getTipoEnfermedads());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoenfermedadAnterior(),this.tipoenfermedads);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoEnfermedad();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoEnfermedad(TipoEnfermedad tipoenfermedad,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Enfermedad.class)) {
					this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadLogic.setEnfermedads(tipoenfermedad.getEnfermedads());
					this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.inicializarActualizarBindingTablaEnfermedad(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
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
										
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoenfermedad,new Object(),generalEntityParameterGeneral,this.tipoenfermedadReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoenfermedadSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoEnfermedadConstantesFunciones.getClassesRelationshipsOfTipoEnfermedad(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoEnfermedadConstantesFunciones.getClassesRelationshipsFromStringsOfTipoEnfermedad(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoEnfermedad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoEnfermedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoenfermedad,new Object(),generalEntityParameterGeneral,this.tipoenfermedadReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoEnfermedad(TipoEnfermedadBean tipoenfermedadBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Enfermedad.class)) {
					this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadLogic.setEnfermedads(tipoenfermedad.getEnfermedads());
					this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.inicializarActualizarBindingTablaEnfermedad(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoEnfermedad(ArrayList<Classe> classes,TipoEnfermedadReturnGeneral tipoenfermedadReturnGeneral,TipoEnfermedadBean tipoenfermedadBean,Boolean conDefault) throws Exception {
		
			this.tipoenfermedadBean.setEnfermedads(tipoenfermedadReturnGeneral.getTipoEnfermedad().getEnfermedads());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoEnfermedad(TipoEnfermedad tipoenfermedad,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Enfermedad.class)) {
					tipoenfermedad.setEnfermedads(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadBeanSwingJInternalFrame.enfermedadLogic.getEnfermedads());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoenfermedad)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoEnfermedad = new TipoEnfermedadDetalleFormJInternalFrame(jDesktopPane,this.tipoenfermedadSessionBean.getConGuardarRelaciones(),this.tipoenfermedadSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoEnfermedad);
		this.jInternalFrameDetalleFormTipoEnfermedad.setVisible(false);
		this.jInternalFrameDetalleFormTipoEnfermedad.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoEnfermedad.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoEnfermedad.tipoenfermedadLogic=this.tipoenfermedadLogic;
		
		this.cargarCombosFrameForeignKeyTipoEnfermedad("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoEnfermedad();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoEnfermedad();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoEnfermedad("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoEnfermedad();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoEnfermedad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoEnfermedad"));
		
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonModificarTipoEnfermedad.addActionListener(new ButtonActionListener(this,"ModificarTipoEnfermedad"));

		
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonModificarToolBarTipoEnfermedad.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoEnfermedad"));
					
		this.jInternalFrameDetalleFormTipoEnfermedad.jMenuItemModificarTipoEnfermedad.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoEnfermedad"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonActualizarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"ActualizarTipoEnfermedad"));
		
		
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonActualizarToolBarTipoEnfermedad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoEnfermedad"));
						
		this.jInternalFrameDetalleFormTipoEnfermedad.jMenuItemActualizarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoEnfermedad"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonEliminarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"EliminarTipoEnfermedad"));
		
		
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonEliminarToolBarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoEnfermedad"));
								
		this.jInternalFrameDetalleFormTipoEnfermedad.jMenuItemEliminarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoEnfermedad"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonCancelarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"CancelarTipoEnfermedad"));
		
		
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonCancelarToolBarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoEnfermedad"));
					
		this.jInternalFrameDetalleFormTipoEnfermedad.jMenuItemCancelarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoEnfermedad"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoEnfermedad.jMenuItemDetalleCerrarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoEnfermedad"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonGuardarCambiosToolBarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEnfermedad"));
		
		
		
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonGuardarCambiosToolBarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEnfermedad"));
		
		
		
		this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxTiposAccionesFormularioTipoEnfermedad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoEnfermedad"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonidTipoEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEnfermedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonid_empresaTipoEnfermedadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoEnfermedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonid_empresaTipoEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoEnfermedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtoncodigoTipoEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoEnfermedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonnombreTipoEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEnfermedadBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoEnfermedad.jTabbedPaneRelacionesTipoEnfermedad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoEnfermedad"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoEnfermedad"));
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEnfermedad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoEnfermedad"));
		}
		
		this.jTableDatosTipoEnfermedad.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoEnfermedad"));
		
		this.jTableDatosTipoEnfermedad.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoEnfermedad"));
		
		this.jButtonNuevoTipoEnfermedad.addActionListener(new ButtonActionListener(this,"NuevoTipoEnfermedad"));
		
		this.jButtonDuplicarTipoEnfermedad.addActionListener(new ButtonActionListener(this,"DuplicarTipoEnfermedad"));
		
		this.jButtonCopiarTipoEnfermedad.addActionListener(new ButtonActionListener(this,"CopiarTipoEnfermedad"));
		
		this.jButtonVerFormTipoEnfermedad.addActionListener(new ButtonActionListener(this,"VerFormTipoEnfermedad"));
		
		
		this.jButtonNuevoToolBarTipoEnfermedad.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoEnfermedad"));
			
		this.jButtonDuplicarToolBarTipoEnfermedad.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoEnfermedad"));
			
		this.jMenuItemNuevoTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoEnfermedad"));
			
		this.jMenuItemDuplicarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoEnfermedad"));		
		
		
		this.jButtonNuevoRelacionesTipoEnfermedad.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoEnfermedad"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoEnfermedad.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoEnfermedad"));
			
		this.jMenuItemNuevoRelacionesTipoEnfermedad.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoEnfermedad"));		
		
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonModificarTipoEnfermedad.addActionListener(new ButtonActionListener(this,"ModificarTipoEnfermedad"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonModificarToolBarTipoEnfermedad.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoEnfermedad"));
			
			this.jInternalFrameDetalleFormTipoEnfermedad.jMenuItemModificarTipoEnfermedad.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoEnfermedad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonActualizarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"ActualizarTipoEnfermedad"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonActualizarToolBarTipoEnfermedad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoEnfermedad"));
				
			this.jInternalFrameDetalleFormTipoEnfermedad.jMenuItemActualizarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoEnfermedad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonEliminarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"EliminarTipoEnfermedad"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonEliminarToolBarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoEnfermedad"));
						
			this.jInternalFrameDetalleFormTipoEnfermedad.jMenuItemEliminarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoEnfermedad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonCancelarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"CancelarTipoEnfermedad"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonCancelarToolBarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoEnfermedad"));
			
			this.jInternalFrameDetalleFormTipoEnfermedad.jMenuItemCancelarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoEnfermedad"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoEnfermedad"));		
		
		
		this.jButtonCerrarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"CerrarTipoEnfermedad"));
		
		
		this.jButtonCerrarToolBarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoEnfermedad"));
			
		this.jMenuItemCerrarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoEnfermedad"));
			
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEnfermedad.jMenuItemDetalleCerrarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoEnfermedad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonGuardarCambiosTipoEnfermedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoEnfermedad"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEnfermedad.jButtonGuardarCambiosToolBarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEnfermedad"));
		}
		
		this.jButtonCopiarToolBarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoEnfermedad"));
			
		this.jButtonVerFormToolBarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoEnfermedad"));
		
		this.jMenuItemGuardarCambiosTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoEnfermedad"));
			
		this.jMenuItemCopiarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoEnfermedad"));		
		
		this.jMenuItemVerFormTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoEnfermedad"));		
		
		
		this.jButtonGuardarCambiosTablaTipoEnfermedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoEnfermedad"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoEnfermedad"));
			
		this.jMenuItemGuardarCambiosTablaTipoEnfermedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoEnfermedad"));		
		
		
		
		this.jButtonRecargarInformacionTipoEnfermedad.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoEnfermedad"));
					
		this.jButtonRecargarInformacionToolBarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoEnfermedad"));
		
		this.jMenuItemRecargarInformacionTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoEnfermedad"));		
		
		
		
		this.jButtonAnterioresTipoEnfermedad.addActionListener (new ButtonActionListener(this,"AnterioresTipoEnfermedad"));
		
		
		this.jButtonAnterioresToolBarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoEnfermedad"));
		
		this.jMenuItemAnterioresTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoEnfermedad"));		
		
		
		this.jButtonSiguientesTipoEnfermedad.addActionListener (new ButtonActionListener(this,"SiguientesTipoEnfermedad"));
		
		
		this.jButtonSiguientesToolBarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoEnfermedad"));
			
		this.jMenuItemSiguientesTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoEnfermedad"));
			
		this.jMenuItemAbrirOrderByTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoEnfermedad"));
			
		this.jMenuItemMostrarOcultarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoEnfermedad"));
			
		this.jMenuItemDetalleAbrirOrderByTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoEnfermedad"));
			
		this.jMenuItemDetalleMostarOcultarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoEnfermedad"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoEnfermedad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoEnfermedad"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoEnfermedad"));
			
		this.jMenuItemNuevoGuardarCambiosTipoEnfermedad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoEnfermedad"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoEnfermedad.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoEnfermedad"));

		this.jCheckBoxSeleccionadosTipoEnfermedad.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoEnfermedad"));
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxTiposAccionesFormularioTipoEnfermedad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoEnfermedad"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoEnfermedad.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoEnfermedad"));
			
		this.jComboBoxTiposAccionesTipoEnfermedad.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoEnfermedad"));
					
		this.jComboBoxTiposSeleccionarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoEnfermedad"));
			
		this.jTextFieldValorCampoGeneralTipoEnfermedad.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoEnfermedad"));		
		
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonidTipoEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEnfermedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonid_empresaTipoEnfermedadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoEnfermedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonid_empresaTipoEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoEnfermedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtoncodigoTipoEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoEnfermedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonnombreTipoEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEnfermedadBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoEnfermedad!=null) {
				this.jInternalFrameReporteDinamicoTipoEnfermedad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEnfermedad"));
				this.jInternalFrameReporteDinamicoTipoEnfermedad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEnfermedad"));
				this.jInternalFrameReporteDinamicoTipoEnfermedad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEnfermedad"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoEnfermedad.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEnfermedad"));				
			//this.jButtonGenerarReporteDinamicoTipoEnfermedad.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEnfermedad"));
			//this.jButtonGenerarExcelReporteDinamicoTipoEnfermedad.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEnfermedad"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoEnfermedad!=null) {
				this.jInternalFrameImportacionTipoEnfermedad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoEnfermedad"));
				this.jInternalFrameImportacionTipoEnfermedad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoEnfermedad"));
				this.jInternalFrameImportacionTipoEnfermedad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoEnfermedad"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoEnfermedad.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoEnfermedad"));
			
			this.jButtonAbrirOrderByToolBarTipoEnfermedad.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoEnfermedad"));			
			
			if(this.jInternalFrameOrderByTipoEnfermedad!=null) {
				this.jInternalFrameOrderByTipoEnfermedad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoEnfermedad"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEnfermedad.jTabbedPaneRelacionesTipoEnfermedad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoEnfermedad"));
		
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
            		closingInternalFrameTipoEnfermedad();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoEnfermedad.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoEnfermedad = (JInternalFrameBase)event.getSource();
	            	
	            TipoEnfermedadBeanSwingJInternalFrame jInternalFrameParent=(TipoEnfermedadBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoEnfermedad.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoEnfermedadActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoEnfermedad.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoEnfermedadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoEnfermedad.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoEnfermedad.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEnfermedadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEnfermedadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEnfermedadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoEnfermedad";
		inputMap = this.jButtonNuevoTipoEnfermedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoEnfermedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoEnfermedadActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEnfermedadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEnfermedadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEnfermedadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoEnfermedad";
		inputMap = this.jButtonNuevoRelacionesTipoEnfermedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoEnfermedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoEnfermedadActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoEnfermedad";
		inputMap = this.jButtonModificarTipoEnfermedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoEnfermedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoEnfermedadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoEnfermedad";
		inputMap = this.jButtonActualizarTipoEnfermedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoEnfermedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoEnfermedadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoEnfermedad";
		inputMap = this.jButtonEliminarTipoEnfermedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoEnfermedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoEnfermedadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoEnfermedad";
		inputMap = this.jButtonCancelarTipoEnfermedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoEnfermedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoEnfermedadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoEnfermedad";
		inputMap = this.jButtonCerrarTipoEnfermedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoEnfermedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoEnfermedadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonGuardarCambiosTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoEnfermedad";
		inputMap = this.jInternalFrameDetalleFormTipoEnfermedad.jButtonGuardarCambiosTipoEnfermedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonGuardarCambiosTipoEnfermedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoEnfermedadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoEnfermedad.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoEnfermedadItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoEnfermedad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoEnfermedadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoEnfermedad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoEnfermedadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoEnfermedad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoEnfermedadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonidTipoEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEnfermedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonid_empresaTipoEnfermedadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoEnfermedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonid_empresaTipoEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoEnfermedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtoncodigoTipoEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoEnfermedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEnfermedad.jButtonnombreTipoEnfermedadBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEnfermedadBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoEnfermedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoEnfermedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoEnfermedadActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoEnfermedad.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoEnfermedad(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoEnfermedad tipoenfermedadAux:this.tipoenfermedadLogic.getTipoEnfermedads()) {
					tipoenfermedadAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEnfermedad tipoenfermedadAux:tipoenfermedads) {
					tipoenfermedadAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoEnfermedadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoEnfermedad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoEnfermedad tipoenfermedadAux:this.tipoenfermedadLogic.getTipoEnfermedads()) {
						tipoenfermedadAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEnfermedad tipoenfermedadAux:tipoenfermedads) {
						tipoenfermedadAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoEnfermedad tipoenfermedadAux:this.tipoenfermedadLogic.getTipoEnfermedads()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEnfermedad tipoenfermedadAux:tipoenfermedads) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoEnfermedad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoEnfermedad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoEnfermedad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoEnfermedad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoEnfermedadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoEnfermedad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoEnfermedad.getSelectedRows();
			
			TipoEnfermedad tipoenfermedadLocal=new TipoEnfermedad();
			
			//this.seleccionarTodosTipoEnfermedad(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoenfermedadLocal =(TipoEnfermedad) this.tipoenfermedadLogic.getTipoEnfermedads().toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoenfermedadLocal =(TipoEnfermedad) this.tipoenfermedads.toArray()[this.jTableDatosTipoEnfermedad.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoenfermedadLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoEnfermedad tipoenfermedadAux:this.tipoenfermedadLogic.getTipoEnfermedads()) {
						tipoenfermedadAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEnfermedad tipoenfermedadAux:tipoenfermedads) {
						tipoenfermedadAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoEnfermedad(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoEnfermedad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoEnfermedad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoEnfermedad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoEnfermedadItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoEnfermedadParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoEnfermedadActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoEnfermedad(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoEnfermedad.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoEnfermedad tipoenfermedadAux:this.tipoenfermedadLogic.getTipoEnfermedads()) {
				
						if(sTipoSeleccionar.equals(TipoEnfermedadConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoenfermedadAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoEnfermedadConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoenfermedadAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEnfermedad tipoenfermedadAux:tipoenfermedads) {
					
						if(sTipoSeleccionar.equals(TipoEnfermedadConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoenfermedadAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoEnfermedadConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoenfermedadAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoEnfermedad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoEnfermedadActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoEnfermedad(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoEnfermedad=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoEnfermedad.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxTiposAccionesFormularioTipoEnfermedad.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoEnfermedad) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoEnfermedad(conSplash);
				
					this.generarReporteTipoEnfermedadsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEnfermedad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxTiposAccionesFormularioTipoEnfermedad.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoEnfermedadsSeleccionados();
				//this.jComboBoxTiposAccionesTipoEnfermedad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoEnfermedadsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoEnfermedad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoEnfermedadsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoEnfermedad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoEnfermedad();
				
				this.exportarTipoEnfermedadsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEnfermedad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxTiposAccionesFormularioTipoEnfermedad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoEnfermedads();
				//this.importarTipoEnfermedads();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEnfermedad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxTiposAccionesFormularioTipoEnfermedad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoEnfermedad();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoEnfermedadsSeleccionados();
				//this.jComboBoxTiposAccionesTipoEnfermedad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Enfermedad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoEnfermedad();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoEnfermedad)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoEnfermedad(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Enfermedad",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEnfermedad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxTiposAccionesFormularioTipoEnfermedad.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoEnfermedadBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoEnfermedad) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoEnfermedad(conSplash);
					
						//this.actualizarParametrosGeneralTipoEnfermedad();
						
						this.generarReporteProcesoAccionTipoEnfermedadsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoEnfermedad.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxTiposAccionesFormularioTipoEnfermedad.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoEnfermedadBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo EnfermedadES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Enfermedad", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoEnfermedad();
				
						this.actualizarParametrosGeneralTipoEnfermedad();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoenfermedadReturnGeneral=tipoenfermedadLogic.procesarAccionTipoEnfermedadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoenfermedadLogic.getTipoEnfermedads(),this.tipoenfermedadParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoEnfermedadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoEnfermedad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxTiposAccionesFormularioTipoEnfermedad.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoEnfermedad();
					
					TipoEnfermedadBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoEnfermedadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoEnfermedad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxTiposAccionesFormularioTipoEnfermedad.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoEnfermedad(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoEnfermedadActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoEnfermedad();
			
			if(this.jInternalFrameDetalleFormTipoEnfermedad==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoEnfermedad> tipoenfermedadsSeleccionados=new ArrayList<TipoEnfermedad>();		
			TipoEnfermedad tipoenfermedad=new TipoEnfermedad();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoEnfermedad(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoEnfermedad.getSelectedItem();
			
			
			
			
			tipoenfermedadsSeleccionados=this.getTipoEnfermedadsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoenfermedadsSeleccionados.size()==1) {
				for(TipoEnfermedad tipoenfermedadAux:tipoenfermedadsSeleccionados) {
					tipoenfermedad=tipoenfermedadAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Enfermedad")) {
					jButtonEnfermedadActionPerformed(null,rowIndex,true,false,tipoenfermedad);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoEnfermedad();
			
      		//this.finishProcessTipoEnfermedad(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoEnfermedadReturnGeneral() throws Exception {
		if(this.tipoenfermedadReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoenfermedadReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoenfermedadReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoenfermedadReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoenfermedadReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoenfermedadReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoEnfermedad(false);
		}
		
		if(this.tipoenfermedadReturnGeneral.getConRetornoLista() || this.tipoenfermedadReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoenfermedadReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoenfermedadLogic.setTipoEnfermedads(this.tipoenfermedadReturnGeneral.getTipoEnfermedads());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoenfermedadReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoenfermedadLogic.setTipoEnfermedad(this.tipoenfermedadReturnGeneral.getTipoEnfermedad());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoEnfermedad(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoEnfermedad() throws Exception {
		
		
	}
	
	public ArrayList<TipoEnfermedad> getTipoEnfermedadsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoEnfermedad> tipoenfermedadsSeleccionados=new ArrayList<TipoEnfermedad>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoEnfermedad) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoEnfermedad tipoenfermedadAux:tipoenfermedadLogic.getTipoEnfermedads()) {
					if(tipoenfermedadAux.getIsSelected()) {
						tipoenfermedadsSeleccionados.add(tipoenfermedadAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEnfermedad tipoenfermedadAux:this.tipoenfermedads) {
					if(tipoenfermedadAux.getIsSelected()) {
						tipoenfermedadsSeleccionados.add(tipoenfermedadAux);				
					}
				}
			}
			
			if(tipoenfermedadsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoenfermedadsSeleccionados.addAll(this.tipoenfermedadLogic.getTipoEnfermedads());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoenfermedadsSeleccionados.addAll(this.tipoenfermedads);				
					}
				}
			}
		} else {
			tipoenfermedadsSeleccionados.add(this.tipoenfermedad);
		}
		
		return tipoenfermedadsSeleccionados;
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
	
	public void generarReporteTipoEnfermedadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoEnfermedadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoEnfermedadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoEnfermedadsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoEnfermedadsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoEnfermedadsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Enfermedad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoEnfermedadsSeleccionados() throws Exception {
		ArrayList<TipoEnfermedad> tipoenfermedadsSeleccionados=new ArrayList<TipoEnfermedad>();		
		
		tipoenfermedadsSeleccionados=this.getTipoEnfermedadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoEnfermedads("Todos",tipoenfermedadsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoEnfermedadsSeleccionados() throws Exception {
		ArrayList<TipoEnfermedad> tipoenfermedadsSeleccionados=new ArrayList<TipoEnfermedad>();		
		
		tipoenfermedadsSeleccionados=this.getTipoEnfermedadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoEnfermedads("Todos",tipoenfermedadsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoEnfermedadsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoEnfermedad> tipoenfermedadsSeleccionados=new ArrayList<TipoEnfermedad>();
		
		tipoenfermedadsSeleccionados=this.getTipoEnfermedadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoEnfermedads("Todos",tipoenfermedadsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoEnfermedadsSeleccionados() throws Exception {
		ArrayList<TipoEnfermedad> tipoenfermedadsSeleccionados=new ArrayList<TipoEnfermedad>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoEnfermedad();
		
		
		tipoenfermedadsSeleccionados=this.getTipoEnfermedadsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoEnfermedad();
		
		
		//this.generarReporteTipoEnfermedads("Todos",tipoenfermedadsSeleccionados ,tipoenfermedadImplementable,tipoenfermedadImplementableHome);
	}
	
	public void mostrarImportacionTipoEnfermedads() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoEnfermedad();
		
		this.abrirFrameImportacionTipoEnfermedad();		
		
			
		//this.generarReporteTipoEnfermedads("Todos",tipoenfermedadsSeleccionados ,tipoenfermedadImplementable,tipoenfermedadImplementableHome);
	}
	
	public void importarTipoEnfermedads() throws Exception {		
	
	}
	
	public void exportarTipoEnfermedadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoEnfermedadsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoEnfermedadsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoEnfermedadsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Enfermedad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoEnfermedadsSeleccionados() throws Exception {
		ArrayList<TipoEnfermedad> tipoenfermedadsSeleccionados=new ArrayList<TipoEnfermedad>();		
		
		tipoenfermedadsSeleccionados=this.getTipoEnfermedadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoenfermedad."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoEnfermedad(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoEnfermedad tipoenfermedadAux:tipoenfermedadsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoEnfermedad(tipoenfermedadAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoenfermedadAux.setsDetalleGeneralEntityReporte(tipoenfermedadAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Enfermedad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoEnfermedad(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoEnfermedadConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEnfermedadConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEnfermedadConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEnfermedadConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEnfermedadConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoEnfermedad(TipoEnfermedad tipoenfermedad,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoenfermedad.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoenfermedad.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoenfermedad.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoenfermedad.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoenfermedad.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoEnfermedadsSeleccionados() throws Exception {
		ArrayList<TipoEnfermedad> tipoenfermedadsSeleccionados=new ArrayList<TipoEnfermedad>();		
		
		tipoenfermedadsSeleccionados=this.getTipoEnfermedadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoenfermedad.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoEnfermedads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoEnfermedad(row);				
				iRow++;
			}				
			
			for(TipoEnfermedad tipoenfermedadAux:tipoenfermedadsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoEnfermedad(tipoenfermedadAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Enfermedad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoEnfermedadsSeleccionados() throws Exception {
		ArrayList<TipoEnfermedad> tipoenfermedadsSeleccionados=new ArrayList<TipoEnfermedad>();		
		
		tipoenfermedadsSeleccionados=this.getTipoEnfermedadsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoenfermedad.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoenfermedads");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoenfermedad");
			//elementRoot.appendChild(element);
		
			for(TipoEnfermedad tipoenfermedadAux:tipoenfermedadsSeleccionados) {
				element = document.createElement("tipoenfermedad");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoEnfermedad(tipoenfermedadAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Enfermedad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoEnfermedad(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEnfermedadConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEnfermedadConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoEnfermedadConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEnfermedadConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEnfermedadConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoEnfermedad(TipoEnfermedad tipoenfermedad,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoenfermedad.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoenfermedad.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoenfermedad.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoenfermedad.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoEnfermedad(TipoEnfermedad tipoenfermedad,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoEnfermedadConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoenfermedad.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoEnfermedadConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoenfermedad.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoEnfermedadConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoenfermedad.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoEnfermedadConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoenfermedad.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoEnfermedadConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoenfermedad.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoEnfermedadsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoEnfermedad> tipoenfermedadsSeleccionados=new ArrayList<TipoEnfermedad>();
		
		tipoenfermedadsSeleccionados=this.getTipoEnfermedadsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoEnfermedad(tipoenfermedadsSeleccionados);
		
		this.generarReporteTipoEnfermedads("Todos",tipoenfermedadsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoEnfermedad(ArrayList<TipoEnfermedad> tipoenfermedadsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoEnfermedad tipoenfermedadAux:tipoenfermedadsSeleccionados) {
				tipoenfermedadAux.setsDetalleGeneralEntityReporte(tipoenfermedadAux.toString());
			
				if(sTipoSeleccionar.equals(TipoEnfermedadConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoenfermedadAux.setsDescripcionGeneralEntityReporte1(tipoenfermedadAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoEnfermedadConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoenfermedadAux.setsDescripcionGeneralEntityReporte1(tipoenfermedadAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoEnfermedadConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoenfermedadAux.setsDescripcionGeneralEntityReporte1(tipoenfermedadAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEnfermedadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoEnfermedad(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoEnfermedad=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoEnfermedad=true;
				this.isVisibilidadCeldaGuardarCambiosTipoEnfermedad=true;
			}
			
			this.isVisibilidadCeldaModificarTipoEnfermedad=false;
			this.isVisibilidadCeldaActualizarTipoEnfermedad=false;
			this.isVisibilidadCeldaEliminarTipoEnfermedad=false;
			this.isVisibilidadCeldaCancelarTipoEnfermedad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEnfermedad=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEnfermedad=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoEnfermedad=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEnfermedad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEnfermedad=false;
			this.isVisibilidadCeldaModificarTipoEnfermedad=false;
			this.isVisibilidadCeldaActualizarTipoEnfermedad=true;
			this.isVisibilidadCeldaEliminarTipoEnfermedad=false;
			this.isVisibilidadCeldaCancelarTipoEnfermedad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEnfermedad=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEnfermedad=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoEnfermedad=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEnfermedad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEnfermedad=false;
			this.isVisibilidadCeldaModificarTipoEnfermedad=false;
			this.isVisibilidadCeldaActualizarTipoEnfermedad=true;
			this.isVisibilidadCeldaEliminarTipoEnfermedad=true;
			this.isVisibilidadCeldaCancelarTipoEnfermedad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEnfermedad=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEnfermedad=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoEnfermedad=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEnfermedad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEnfermedad=false;
			this.isVisibilidadCeldaModificarTipoEnfermedad=false;
			this.isVisibilidadCeldaActualizarTipoEnfermedad=true;
			this.isVisibilidadCeldaEliminarTipoEnfermedad=false;
			this.isVisibilidadCeldaCancelarTipoEnfermedad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEnfermedad=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEnfermedad=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoEnfermedad=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEnfermedad=true;
			this.isVisibilidadCeldaGuardarCambiosTipoEnfermedad=true;
			this.isVisibilidadCeldaModificarTipoEnfermedad=false;
			this.isVisibilidadCeldaActualizarTipoEnfermedad=false;
			this.isVisibilidadCeldaEliminarTipoEnfermedad=false;
			this.isVisibilidadCeldaCancelarTipoEnfermedad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEnfermedad=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEnfermedad=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoEnfermedad=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEnfermedad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEnfermedad=false;
			this.isVisibilidadCeldaActualizarTipoEnfermedad=false;
			this.isVisibilidadCeldaEliminarTipoEnfermedad=false;
			this.isVisibilidadCeldaCancelarTipoEnfermedad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEnfermedad=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEnfermedad=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoEnfermedad=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEnfermedad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEnfermedad=false;
			this.isVisibilidadCeldaModificarTipoEnfermedad=true;
			this.isVisibilidadCeldaActualizarTipoEnfermedad=false;
			this.isVisibilidadCeldaEliminarTipoEnfermedad=false;
			this.isVisibilidadCeldaCancelarTipoEnfermedad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEnfermedad=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEnfermedad=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoEnfermedadJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoEnfermedad=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEnfermedad=true;
			this.isVisibilidadCeldaGuardarCambiosTipoEnfermedad=true;
		} else {
			this.actualizarEstadoPanelsTipoEnfermedad(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoEnfermedad=false;
			//this.isVisibilidadCeldaVerFormTipoEnfermedad=false;
			this.isVisibilidadCeldaDuplicarTipoEnfermedad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoenfermedadSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoEnfermedad=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoEnfermedad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEnfermedad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
			if(!tipoenfermedadSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoEnfermedad=false;												
			}
			
			this.jButtonCerrarTipoEnfermedad.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoEnfermedad=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoenfermedad)) {
			this.isVisibilidadCeldaActualizarTipoEnfermedad=false;
			this.isVisibilidadCeldaEliminarTipoEnfermedad=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoEnfermedad() {
		this.isVisibilidadCeldaNuevoTipoEnfermedad=false;
		this.isVisibilidadCeldaGuardarCambiosTipoEnfermedad=false;
	}
	
	public void actualizarEstadoPanelsTipoEnfermedad(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoEnfermedad!=null) {
				this.jScrollPanelDatosEdicionTipoEnfermedad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEnfermedad!=null) {
				this.jTabbedPaneBusquedasTipoEnfermedad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEnfermedad!=null) {
				this.jScrollPanelDatosTipoEnfermedad.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEnfermedad!=null) {
				this.jPanelPaginacionTipoEnfermedad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEnfermedad!=null) {
				this.jPanelParametrosReportesTipoEnfermedad.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoEnfermedad!=null) {
				this.jScrollPanelDatosEdicionTipoEnfermedad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEnfermedad!=null) {
				this.jTabbedPaneBusquedasTipoEnfermedad.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoEnfermedad!=null) {
				this.jScrollPanelDatosTipoEnfermedad.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEnfermedad!=null) {
				this.jPanelPaginacionTipoEnfermedad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEnfermedad!=null) {
				this.jPanelParametrosReportesTipoEnfermedad.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoEnfermedad!=null) {
				this.jScrollPanelDatosEdicionTipoEnfermedad.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEnfermedad!=null) {
				this.jTabbedPaneBusquedasTipoEnfermedad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoEnfermedad!=null) {
				this.jScrollPanelDatosTipoEnfermedad.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEnfermedad!=null) {
				this.jPanelPaginacionTipoEnfermedad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEnfermedad!=null) {
				this.jPanelParametrosReportesTipoEnfermedad.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoEnfermedad!=null) {
				this.jScrollPanelDatosEdicionTipoEnfermedad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEnfermedad!=null) {
				this.jTabbedPaneBusquedasTipoEnfermedad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoEnfermedad!=null) {
				this.jScrollPanelDatosTipoEnfermedad.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEnfermedad!=null) {
				this.jPanelPaginacionTipoEnfermedad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEnfermedad!=null) {
				this.jPanelParametrosReportesTipoEnfermedad.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoEnfermedad!=null) {
				this.jScrollPanelDatosEdicionTipoEnfermedad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEnfermedad!=null) {
				this.jTabbedPaneBusquedasTipoEnfermedad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEnfermedad!=null) {
				this.jScrollPanelDatosTipoEnfermedad.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEnfermedad!=null) {
				this.jPanelPaginacionTipoEnfermedad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEnfermedad!=null) {
				this.jPanelParametrosReportesTipoEnfermedad.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoEnfermedad!=null) {
				this.jScrollPanelDatosEdicionTipoEnfermedad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEnfermedad!=null) {
				this.jTabbedPaneBusquedasTipoEnfermedad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEnfermedad!=null) {
				this.jScrollPanelDatosTipoEnfermedad.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEnfermedad!=null) {
				this.jPanelPaginacionTipoEnfermedad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEnfermedad!=null) {
				this.jPanelParametrosReportesTipoEnfermedad.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoEnfermedad!=null) {
				this.jScrollPanelDatosEdicionTipoEnfermedad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEnfermedad!=null) {
				this.jTabbedPaneBusquedasTipoEnfermedad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEnfermedad!=null) {
				this.jScrollPanelDatosTipoEnfermedad.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEnfermedad!=null) {
				this.jPanelPaginacionTipoEnfermedad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEnfermedad!=null) {
				this.jPanelParametrosReportesTipoEnfermedad.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoEnfermedad!=null) {
					this.jTabbedPaneBusquedasTipoEnfermedad.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoEnfermedad!=null) {
				this.jPanelParametrosReportesTipoEnfermedad.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEnfermedad!=null) {
				this.jTabbedPaneBusquedasTipoEnfermedad.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoEnfermedad!=null) {
				this.jPanelParametrosReportesTipoEnfermedad.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoEnfermedadParaEnfermedades() throws Exception {
		Boolean isPaginaPopupEnfermedad=false;

		try {

			if(this.tipoenfermedadSessionBean==null) {
				this.tipoenfermedadSessionBean=new TipoEnfermedadSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadSessionBean==null) {
				this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadSessionBean=new EnfermedadSessionBean();
			}

			this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadSessionBean.setsPathNavegacionActual(tipoenfermedadSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EnfermedadConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEnfermedad=this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEnfermedad(true);
			this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEnfermedad(TipoEnfermedadConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadSessionBean.setisBusquedaDesdeForeignKeySesionTipoEnfermedad(true);
			this.jInternalFrameDetalleFormTipoEnfermedad.enfermedadSessionBean.setlidTipoEnfermedadActual(this.idTipoEnfermedadActual);

			tipoenfermedadSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoEnfermedad(true);
			tipoenfermedadSessionBean.setlIdTipoEnfermedadActualForeignKey(this.idTipoEnfermedadActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoEnfermedadSessionBean tipoenfermedadSessionBean=new TipoEnfermedadSessionBean();
		
		if(this.tipoenfermedadSessionBean==null) {
			this.tipoenfermedadSessionBean=new TipoEnfermedadSessionBean();
		}
		
		this.tipoenfermedadSessionBean.setsUltimaBusquedaTipoEnfermedad(this.getsAccionBusqueda());
		this.tipoenfermedadSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoenfermedadSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoenfermedadSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoEnfermedadSessionBean tipoenfermedadSessionBean=new TipoEnfermedadSessionBean();
		
		if(this.tipoenfermedadSessionBean==null) {
			this.tipoenfermedadSessionBean=new TipoEnfermedadSessionBean();
		}
		
		if(this.tipoenfermedadSessionBean.getsUltimaBusquedaTipoEnfermedad()!=null&&!this.tipoenfermedadSessionBean.getsUltimaBusquedaTipoEnfermedad().equals("")) {
			this.setsAccionBusqueda(tipoenfermedadSessionBean.getsUltimaBusquedaTipoEnfermedad());
			this.setiNumeroPaginacion(tipoenfermedadSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoenfermedadSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoenfermedadSessionBean.getid_empresa());
				tipoenfermedadSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoenfermedadSessionBean.setsUltimaBusquedaTipoEnfermedad("");
		this.tipoenfermedadSessionBean.setiNumeroPaginacion(TipoEnfermedadConstantesFunciones.INUMEROPAGINACION);
		this.tipoenfermedadSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoEnfermedad(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoEnfermedad() {
		this.updateBorderResaltarBusquedasFormularioTipoEnfermedad();
		this.updateVisibilidadBusquedasFormularioTipoEnfermedad();
		this.updateHabilitarBusquedasFormularioTipoEnfermedad();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoEnfermedad() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoEnfermedad.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoEnfermedad() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoEnfermedad.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoEnfermedad() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoEnfermedad.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoEnfermedad(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoEnfermedad.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoEnfermedad() throws Exception {

		if(this.jInternalFrameDetalleFormTipoEnfermedad==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoEnfermedad();
		this.updateVisibilidadResaltarControlesFormularioTipoEnfermedad();
		this.updateHabilitarResaltarControlesFormularioTipoEnfermedad();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoEnfermedad() throws Exception {
		if(this.jInternalFrameDetalleFormTipoEnfermedad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoenfermedadConstantesFunciones.resaltaridTipoEnfermedad!=null && this.jInternalFrameDetalleFormTipoEnfermedad!=null) {this.jInternalFrameDetalleFormTipoEnfermedad.jLabelidTipoEnfermedad.setBorder(this.tipoenfermedadConstantesFunciones.resaltaridTipoEnfermedad);}
		if(this.tipoenfermedadConstantesFunciones.resaltarid_empresaTipoEnfermedad!=null && this.jInternalFrameDetalleFormTipoEnfermedad!=null) {this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxid_empresaTipoEnfermedad.setBorder(this.tipoenfermedadConstantesFunciones.resaltarid_empresaTipoEnfermedad);}
		if(this.tipoenfermedadConstantesFunciones.resaltarcodigoTipoEnfermedad!=null && this.jInternalFrameDetalleFormTipoEnfermedad!=null) {this.jInternalFrameDetalleFormTipoEnfermedad.jTextFieldcodigoTipoEnfermedad.setBorder(this.tipoenfermedadConstantesFunciones.resaltarcodigoTipoEnfermedad);}
		if(this.tipoenfermedadConstantesFunciones.resaltarnombreTipoEnfermedad!=null && this.jInternalFrameDetalleFormTipoEnfermedad!=null) {this.jInternalFrameDetalleFormTipoEnfermedad.jTextAreanombreTipoEnfermedad.setBorder(this.tipoenfermedadConstantesFunciones.resaltarnombreTipoEnfermedad);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoEnfermedad() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoEnfermedad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
	
		//this.jInternalFrameDetalleFormTipoEnfermedad.jLabelidTipoEnfermedad.setVisible(this.tipoenfermedadConstantesFunciones.mostraridTipoEnfermedad);
		this.jInternalFrameDetalleFormTipoEnfermedad.jPanelidTipoEnfermedad.setVisible(this.tipoenfermedadConstantesFunciones.mostraridTipoEnfermedad);
		//this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxid_empresaTipoEnfermedad.setVisible(this.tipoenfermedadConstantesFunciones.mostrarid_empresaTipoEnfermedad);
		this.jInternalFrameDetalleFormTipoEnfermedad.jPanelid_empresaTipoEnfermedad.setVisible(this.tipoenfermedadConstantesFunciones.mostrarid_empresaTipoEnfermedad);
		//this.jInternalFrameDetalleFormTipoEnfermedad.jTextFieldcodigoTipoEnfermedad.setVisible(this.tipoenfermedadConstantesFunciones.mostrarcodigoTipoEnfermedad);
		this.jInternalFrameDetalleFormTipoEnfermedad.jPanelcodigoTipoEnfermedad.setVisible(this.tipoenfermedadConstantesFunciones.mostrarcodigoTipoEnfermedad);
		//this.jInternalFrameDetalleFormTipoEnfermedad.jTextAreanombreTipoEnfermedad.setVisible(this.tipoenfermedadConstantesFunciones.mostrarnombreTipoEnfermedad);
		this.jInternalFrameDetalleFormTipoEnfermedad.jPanelnombreTipoEnfermedad.setVisible(this.tipoenfermedadConstantesFunciones.mostrarnombreTipoEnfermedad);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoEnfermedad() throws Exception {
		if(this.jInternalFrameDetalleFormTipoEnfermedad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoEnfermedad!=null) {
	
		this.jInternalFrameDetalleFormTipoEnfermedad.jLabelidTipoEnfermedad.setEnabled(this.tipoenfermedadConstantesFunciones.activaridTipoEnfermedad);
		this.jInternalFrameDetalleFormTipoEnfermedad.jComboBoxid_empresaTipoEnfermedad.setEnabled(this.tipoenfermedadConstantesFunciones.activarid_empresaTipoEnfermedad);
		this.jInternalFrameDetalleFormTipoEnfermedad.jTextFieldcodigoTipoEnfermedad.setEnabled(this.tipoenfermedadConstantesFunciones.activarcodigoTipoEnfermedad);
		this.jInternalFrameDetalleFormTipoEnfermedad.jTextAreanombreTipoEnfermedad.setEnabled(this.tipoenfermedadConstantesFunciones.activarnombreTipoEnfermedad);
		}
	}
	
		
}