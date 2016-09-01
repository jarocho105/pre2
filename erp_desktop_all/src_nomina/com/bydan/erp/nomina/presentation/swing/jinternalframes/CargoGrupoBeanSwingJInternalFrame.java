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

import com.bydan.erp.nomina.util.CargoGrupoConstantesFunciones;
import com.bydan.erp.nomina.util.CargoGrupoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.CargoGrupoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.CargoGrupoBean;
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
import com.bydan.erp.tesoreria.business.logic.*;
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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CargoGrupoBeanSwingJInternalFrame extends CargoGrupoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CargoGrupoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CargoGrupo> cargogrupoValidator = new ClassValidator<CargoGrupo>(CargoGrupo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CargoGrupo cargogrupo;	
	public CargoGrupo cargogrupoAux;
	public CargoGrupo cargogrupoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CargoGrupo cargogrupoTotales;
	public Long idCargoGrupoActual;
	public Long iIdNuevoCargoGrupo=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosCargo=false;

	public Boolean getIsTienePermisosCargo() {
		return isTienePermisosCargo;
	}

	public void setIsTienePermisosCargo(Boolean isTienePermisosCargo) {
		this.isTienePermisosCargo= isTienePermisosCargo;
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
	
	public Boolean isPermisoTodoCargoGrupo;
	public Boolean isPermisoNuevoCargoGrupo;
	public Boolean isPermisoActualizarCargoGrupo;
	public Boolean isPermisoActualizarOriginalCargoGrupo;
	public Boolean isPermisoEliminarCargoGrupo;
	public Boolean isPermisoGuardarCambiosCargoGrupo;
	public Boolean isPermisoConsultaCargoGrupo;
	public Boolean isPermisoBusquedaCargoGrupo;
	public Boolean isPermisoReporteCargoGrupo;
	public Boolean isPermisoPaginacionMedioCargoGrupo;
	public Boolean isPermisoPaginacionAltoCargoGrupo;
	public Boolean isPermisoPaginacionTodoCargoGrupo;
	public Boolean isPermisoCopiarCargoGrupo;
	public Boolean isPermisoVerFormCargoGrupo;
	public Boolean isPermisoDuplicarCargoGrupo;
	public Boolean isPermisoOrdenCargoGrupo;
	
	
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
	
	public CargoGrupoParameterReturnGeneral cargogrupoReturnGeneral;
	public CargoGrupoParameterReturnGeneral cargogrupoParameterGeneral;
	
	

	public CargoLogic cargoLogic=null;

	public CargoLogic getCargoLogic() {
		return cargoLogic;
	}

	public void setCargoLogic(CargoLogic cargoLogic) {
		this.cargoLogic = cargoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCargoGrupo=false;
	public Boolean esParaAccionDesdeFormularioCargoGrupo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CargoGrupoSessionBeanAdditional cargogrupoSessionBeanAdditional=null;
	
	public CargoGrupoSessionBeanAdditional getCargoGrupoSessionBeanAdditional() {
		return this.cargogrupoSessionBeanAdditional;
	}
	
	public void setCargoGrupoSessionBeanAdditional(CargoGrupoSessionBeanAdditional cargogrupoSessionBeanAdditional) {
		try {
			this.cargogrupoSessionBeanAdditional=cargogrupoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CargoGrupoBeanSwingJInternalFrameAdditional cargogrupoBeanSwingJInternalFrameAdditional=null;
	//public class CargoGrupoBeanSwingJInternalFrame
	
	public CargoGrupoBeanSwingJInternalFrameAdditional getCargoGrupoBeanSwingJInternalFrameAdditional() {
		return this.cargogrupoBeanSwingJInternalFrameAdditional;
	}
	
	public void setCargoGrupoBeanSwingJInternalFrameAdditional(CargoGrupoBeanSwingJInternalFrameAdditional cargogrupoBeanSwingJInternalFrameAdditional) {
		try {
			this.cargogrupoBeanSwingJInternalFrameAdditional=cargogrupoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CargoGrupoLogic cargogrupoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CargoGrupo cargogrupoBean;
	public CargoGrupoConstantesFunciones cargogrupoConstantesFunciones;
	//public CargoGrupoParameterReturnGeneral cargogrupoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<CargoGrupo> cargogrupos;	
	//public List<CargoGrupo> cargogruposEliminados;
	//public List<CargoGrupo> cargogruposAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCargoGrupo=false;
	public Boolean isVisibilidadCeldaDuplicarCargoGrupo=true;
	public Boolean isVisibilidadCeldaCopiarCargoGrupo=true;
	public Boolean isVisibilidadCeldaVerFormCargoGrupo=true;
	public Boolean isVisibilidadCeldaOrdenCargoGrupo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCargoGrupo=false;
	public Boolean isVisibilidadCeldaModificarCargoGrupo=false;
	public Boolean isVisibilidadCeldaActualizarCargoGrupo=false;
	public Boolean isVisibilidadCeldaEliminarCargoGrupo=false;
	public Boolean isVisibilidadCeldaCancelarCargoGrupo=false;
	public Boolean isVisibilidadCeldaGuardarCargoGrupo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCargoGrupo=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoCargoGrupo() {
		return this.iIdNuevoCargoGrupo;
	}

	public void setiIdNuevoCargoGrupo(Long iIdNuevoCargoGrupo) {
		this.iIdNuevoCargoGrupo = iIdNuevoCargoGrupo;
	}
	
	public Long getidCargoGrupoActual() {
		return this.idCargoGrupoActual;
	}

	public void setidCargoGrupoActual(Long idCargoGrupoActual) {
		this.idCargoGrupoActual = idCargoGrupoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CargoGrupo getcargogrupo() {
		return this.cargogrupo;
	}

	public void setcargogrupo(CargoGrupo cargogrupo) {
		this.cargogrupo = cargogrupo;
	}
	
	public CargoGrupo getcargogrupoAux() {
		return this.cargogrupoAux;
	}

	public void setcargogrupoAux(CargoGrupo cargogrupoAux) {
		this.cargogrupoAux = cargogrupoAux;
	}				
	
	public CargoGrupo getcargogrupoAnterior() {
		return this.cargogrupoAnterior;
	}

	public void setcargogrupoAnterior(CargoGrupo cargogrupoAnterior) {
		this.cargogrupoAnterior = cargogrupoAnterior;
	}	
	
	public CargoGrupo getcargogrupoTotales() {
		return this.cargogrupoTotales;
	}

	public void setcargogrupoTotales(CargoGrupo cargogrupoTotales) {
		this.cargogrupoTotales = cargogrupoTotales;
	}	
	
	public CargoGrupo getcargogrupoBean() {
		return this.cargogrupoBean;
	}

	public void setcargogrupoBean(CargoGrupo cargogrupoBean) {
		this.cargogrupoBean = cargogrupoBean;
	}	
	
	public CargoGrupoParameterReturnGeneral getcargogrupoReturnGeneral() {
		return this.cargogrupoReturnGeneral;
	}

	public void setcargogrupoReturnGeneral(CargoGrupoParameterReturnGeneral cargogrupoReturnGeneral) {
		this.cargogrupoReturnGeneral = cargogrupoReturnGeneral;
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
	
	
	public CargoGrupoLogic getCargoGrupoLogic()	{		
		return cargogrupoLogic;
	}

	public void setCargoGrupoLogic(CargoGrupoLogic cargogrupoLogic) {
		this.cargogrupoLogic = cargogrupoLogic;
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
	
	public Boolean getIsEsNuevoCargoGrupo() {
		return isEsNuevoCargoGrupo;
	}

	public void setIsEsNuevoCargoGrupo(Boolean isEsNuevoCargoGrupo) {
		this.isEsNuevoCargoGrupo = isEsNuevoCargoGrupo;
	}

	public Boolean getEsParaAccionDesdeFormularioCargoGrupo() {
		return esParaAccionDesdeFormularioCargoGrupo;
	}
	
	public void setEsParaAccionDesdeFormularioCargoGrupo(Boolean esParaAccionDesdeFormularioCargoGrupo) {
		this.esParaAccionDesdeFormularioCargoGrupo = esParaAccionDesdeFormularioCargoGrupo;
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

			if(this.cargogrupoSessionBean==null) {
				this.cargogrupoSessionBean=new CargoGrupoSessionBean();
			}

			if(!this.cargogrupoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cargogrupoSessionBean.getlidEmpresaActual());
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

					if(this.cargogrupo!=null) {
						this.cargogrupo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
						this.jInternalFrameDetalleFormCargoGrupo.jComboBoxid_empresaCargoGrupo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCargoGrupo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
						if(this.jInternalFrameDetalleFormCargoGrupo.jComboBoxid_empresaCargoGrupo.getItemCount()>0) {
							this.jInternalFrameDetalleFormCargoGrupo.jComboBoxid_empresaCargoGrupo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCargoGrupoGenerico)throws Exception
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
				jComboBoxid_empresaCargoGrupoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCargoGrupoGenerico!=null && jComboBoxid_empresaCargoGrupoGenerico.getItemCount()>0) {
					jComboBoxid_empresaCargoGrupoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CargoGrupo cargogrupo,JComboBox jComboBoxid_empresaCargoGrupoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCargoGrupoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCargoGrupo.jComboBoxid_empresaCargoGrupo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCargoGrupoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cargogrupo.setid_empresa(empresaAux.getId());
				cargogrupo.setempresa_descripcion(CargoGrupoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cargogrupo.setEmpresa(empresaAux);			}
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

					if(!CargoGrupoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCargoGrupo!=null) { 
							this.jInternalFrameDetalleFormCargoGrupo.jComboBoxid_empresaCargoGrupo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCargoGrupo.jComboBoxid_empresaCargoGrupo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCargoGrupo!=null) { 
					}

					if(!CargoGrupoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
							this.jInternalFrameDetalleFormCargoGrupo.jComboBoxid_empresaCargoGrupo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
							this.jInternalFrameDetalleFormCargoGrupo.jComboBoxid_empresaCargoGrupo.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesCargoGrupo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CargoGrupoConstantesFunciones.refrescarForeignKeysDescripcionesCargoGrupo(this.cargogrupoLogic.getCargoGrupos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CargoGrupoConstantesFunciones.refrescarForeignKeysDescripcionesCargoGrupo(this.cargogrupos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cargogrupoLogic.setCargoGrupos(this.cargogrupos);
			cargogrupoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CargoGrupoParameterReturnGeneral getCargoGrupoParameterGeneral() {
		return this.cargogrupoParameterGeneral;
	}
	
	public void setCargoGrupoParameterGeneral(CargoGrupoParameterReturnGeneral cargogrupoParameterGeneral) {
		this.cargogrupoParameterGeneral = cargogrupoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCargoGrupo() {
		return isPermisoTodoCargoGrupo;
	}

	public void setIsPermisoTodoCargoGrupo(Boolean isPermisoTodoCargoGrupo) {
		this.isPermisoTodoCargoGrupo = isPermisoTodoCargoGrupo;
	}

	public Boolean getIsPermisoNuevoCargoGrupo() {
		return isPermisoNuevoCargoGrupo;
	}

	public void setIsPermisoNuevoCargoGrupo(Boolean isPermisoNuevoCargoGrupo) {
		this.isPermisoNuevoCargoGrupo = isPermisoNuevoCargoGrupo;
	}

	public Boolean getIsPermisoActualizarCargoGrupo() {
		return isPermisoActualizarCargoGrupo;
	}

	public void setIsPermisoActualizarCargoGrupo(Boolean isPermisoActualizarCargoGrupo) {
		this.isPermisoActualizarCargoGrupo = isPermisoActualizarCargoGrupo;
	}

	public Boolean getIsPermisoEliminarCargoGrupo() {
		return isPermisoEliminarCargoGrupo;
	}

	public void setIsPermisoEliminarCargoGrupo(Boolean isPermisoEliminarCargoGrupo) {
		this.isPermisoEliminarCargoGrupo = isPermisoEliminarCargoGrupo;
	}

	public Boolean getIsPermisoGuardarCambiosCargoGrupo() {
		return isPermisoGuardarCambiosCargoGrupo;
	}

	public void setIsPermisoGuardarCambiosCargoGrupo(Boolean isPermisoGuardarCambiosCargoGrupo) {
		this.isPermisoGuardarCambiosCargoGrupo = isPermisoGuardarCambiosCargoGrupo;
	}
	
	public Boolean getIsPermisoConsultaCargoGrupo() {
		return isPermisoConsultaCargoGrupo;
	}

	public void setIsPermisoConsultaCargoGrupo(Boolean isPermisoConsultaCargoGrupo) {
		this.isPermisoConsultaCargoGrupo = isPermisoConsultaCargoGrupo;
	}

	public Boolean getIsPermisoBusquedaCargoGrupo() {
		return isPermisoBusquedaCargoGrupo;
	}

	public void setIsPermisoBusquedaCargoGrupo(Boolean isPermisoBusquedaCargoGrupo) {
		this.isPermisoBusquedaCargoGrupo = isPermisoBusquedaCargoGrupo;
	}

	public Boolean getIsPermisoReporteCargoGrupo() {
		return isPermisoReporteCargoGrupo;
	}

	public void setIsPermisoReporteCargoGrupo(Boolean isPermisoReporteCargoGrupo) {
		this.isPermisoReporteCargoGrupo = isPermisoReporteCargoGrupo;
	}
	
	public Boolean getIsPermisoPaginacionMedioCargoGrupo() {
		return isPermisoPaginacionMedioCargoGrupo;
	}

	public void setIsPermisoPaginacionMedioCargoGrupo(Boolean isPermisoPaginacionMedioCargoGrupo) {
		this.isPermisoPaginacionMedioCargoGrupo = isPermisoPaginacionMedioCargoGrupo;
	}
	
	public Boolean getIsPermisoPaginacionTodoCargoGrupo() {
		return isPermisoPaginacionTodoCargoGrupo;
	}

	public void setIsPermisoPaginacionTodoCargoGrupo(Boolean isPermisoPaginacionTodoCargoGrupo) {
		this.isPermisoPaginacionTodoCargoGrupo = isPermisoPaginacionTodoCargoGrupo;
	}
	
	public Boolean getIsPermisoPaginacionAltoCargoGrupo() {
		return isPermisoPaginacionAltoCargoGrupo;
	}

	public void setIsPermisoPaginacionAltoCargoGrupo(Boolean isPermisoPaginacionAltoCargoGrupo) {
		this.isPermisoPaginacionAltoCargoGrupo = isPermisoPaginacionAltoCargoGrupo;
	}
	
	public Boolean getIsPermisoCopiarCargoGrupo() {
		return isPermisoCopiarCargoGrupo;
	}

	public void setIsPermisoCopiarCargoGrupo(Boolean isPermisoCopiarCargoGrupo) {
		this.isPermisoCopiarCargoGrupo = isPermisoCopiarCargoGrupo;
	}
	
	public Boolean getIsPermisoVerFormCargoGrupo() {
		return isPermisoVerFormCargoGrupo;
	}

	public void setIsPermisoVerFormCargoGrupo(Boolean isPermisoVerFormCargoGrupo) {
		this.isPermisoVerFormCargoGrupo = isPermisoVerFormCargoGrupo;
	}
	
	public Boolean getIsPermisoDuplicarCargoGrupo() {
		return isPermisoDuplicarCargoGrupo;
	}

	public void setIsPermisoDuplicarCargoGrupo(Boolean isPermisoDuplicarCargoGrupo) {
		this.isPermisoDuplicarCargoGrupo = isPermisoDuplicarCargoGrupo;
	}
	
	public Boolean getIsPermisoOrdenCargoGrupo() {
		return isPermisoOrdenCargoGrupo;
	}

	public void setIsPermisoOrdenCargoGrupo(Boolean isPermisoOrdenCargoGrupo) {
		this.isPermisoOrdenCargoGrupo = isPermisoOrdenCargoGrupo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCargoGrupo() {
		return isVisibilidadCeldaNuevoCargoGrupo;
	}

	public void setIsVisibilidadCeldaNuevoCargoGrupo(Boolean isVisibilidadCeldaNuevoCargoGrupo) {
		this.isVisibilidadCeldaNuevoCargoGrupo = isVisibilidadCeldaNuevoCargoGrupo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCargoGrupo() {
		return isVisibilidadCeldaDuplicarCargoGrupo;
	}

	public void setIsVisibilidadCeldaDuplicarCargoGrupo(Boolean isVisibilidadCeldaDuplicarCargoGrupo) {
		this.isVisibilidadCeldaDuplicarCargoGrupo = isVisibilidadCeldaDuplicarCargoGrupo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCargoGrupo() {
		return isVisibilidadCeldaCopiarCargoGrupo;
	}

	public void setIsVisibilidadCeldaCopiarCargoGrupo(Boolean isVisibilidadCeldaCopiarCargoGrupo) {
		this.isVisibilidadCeldaCopiarCargoGrupo = isVisibilidadCeldaCopiarCargoGrupo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCargoGrupo() {
		return isVisibilidadCeldaVerFormCargoGrupo;
	}

	public void setIsVisibilidadCeldaVerFormCargoGrupo(Boolean isVisibilidadCeldaVerFormCargoGrupo) {
		this.isVisibilidadCeldaVerFormCargoGrupo = isVisibilidadCeldaVerFormCargoGrupo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCargoGrupo() {
		return isVisibilidadCeldaOrdenCargoGrupo;
	}

	public void setIsVisibilidadCeldaOrdenCargoGrupo(Boolean isVisibilidadCeldaOrdenCargoGrupo) {
		this.isVisibilidadCeldaOrdenCargoGrupo = isVisibilidadCeldaOrdenCargoGrupo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCargoGrupo() {
		return isVisibilidadCeldaNuevoRelacionesCargoGrupo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCargoGrupo(Boolean isVisibilidadCeldaNuevoRelacionesCargoGrupo) {
		this.isVisibilidadCeldaNuevoRelacionesCargoGrupo = isVisibilidadCeldaNuevoRelacionesCargoGrupo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCargoGrupo() {
		return isVisibilidadCeldaModificarCargoGrupo;
	}

	public void setIsVisibilidadCeldaModificarCargoGrupo(Boolean isVisibilidadCeldaModificarCargoGrupo) {
		this.isVisibilidadCeldaModificarCargoGrupo = isVisibilidadCeldaModificarCargoGrupo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCargoGrupo() {
		return isVisibilidadCeldaActualizarCargoGrupo;
	}

	public void setIsVisibilidadCeldaActualizarCargoGrupo(Boolean isVisibilidadCeldaActualizarCargoGrupo) {
		this.isVisibilidadCeldaActualizarCargoGrupo = isVisibilidadCeldaActualizarCargoGrupo;
	}

	public Boolean getIsVisibilidadCeldaEliminarCargoGrupo() {
		return isVisibilidadCeldaEliminarCargoGrupo;
	}

	public void setIsVisibilidadCeldaEliminarCargoGrupo(Boolean isVisibilidadCeldaEliminarCargoGrupo) {
		this.isVisibilidadCeldaEliminarCargoGrupo = isVisibilidadCeldaEliminarCargoGrupo;
	}

	public Boolean getIsVisibilidadCeldaCancelarCargoGrupo() {
		return isVisibilidadCeldaCancelarCargoGrupo;
	}

	public void setIsVisibilidadCeldaCancelarCargoGrupo(Boolean isVisibilidadCeldaCancelarCargoGrupo) {
		this.isVisibilidadCeldaCancelarCargoGrupo = isVisibilidadCeldaCancelarCargoGrupo;
	}

	public Boolean getIsVisibilidadCeldaGuardarCargoGrupo() {
		return isVisibilidadCeldaGuardarCargoGrupo;
	}

	public void setIsVisibilidadCeldaGuardarCargoGrupo(Boolean isVisibilidadCeldaGuardarCargoGrupo) {
		this.isVisibilidadCeldaGuardarCargoGrupo = isVisibilidadCeldaGuardarCargoGrupo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCargoGrupo() {
		return isVisibilidadCeldaGuardarCambiosCargoGrupo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCargoGrupo(Boolean isVisibilidadCeldaGuardarCambiosCargoGrupo) {
		this.isVisibilidadCeldaGuardarCambiosCargoGrupo = isVisibilidadCeldaGuardarCambiosCargoGrupo;
	}
		
	public CargoGrupoSessionBean getcargogrupoSessionBean() {
		return this.cargogrupoSessionBean;
	}
	
	public void setcargogrupoSessionBean(CargoGrupoSessionBean cargogrupoSessionBean) {
		this.cargogrupoSessionBean=cargogrupoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCargoGrupo(CargoGrupo cargogrupo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cargogrupo,null);
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
	
	public void bugActualizarReferenciaActual(CargoGrupo cargogrupo,CargoGrupo cargogrupoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCargoGrupo(cargogrupo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cargogrupoAux.setId(cargogrupo.getId());
		cargogrupoAux.setVersionRow(cargogrupo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCargoGrupo();
		
			int intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupo =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cargogrupo =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CargoGrupoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCargoGrupo(this.cargogrupo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCargoGrupo(this.cargogrupo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cargogrupoValidator.getInvalidValues(this.cargogrupo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cargogrupoLogic.setDatosCliente(datosCliente);
			cargogrupoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cargogrupoAux=new  CargoGrupo();
				
				cargogrupoAux.setIsNew(true);
				cargogrupoAux.setIsChanged(true);
				
				cargogrupoAux.setCargoGrupoOriginal(this.cargogrupo);
				
				cargogrupoAux.setId(this.cargogrupo.getId());	
				cargogrupoAux.setVersionRow(this.cargogrupo.getVersionRow());	
				cargogrupoAux.setid_empresa(this.cargogrupo.getid_empresa());	
				cargogrupoAux.setcodigo(this.cargogrupo.getcodigo());	
				cargogrupoAux.setnombre(this.cargogrupo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cargogrupoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cargogrupoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cargogrupoAux,cargogrupoLogic.getCargoGrupos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cargogrupoAux,cargogrupos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cargogrupoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cargogrupoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargogrupoLogic.saveCargoGrupos();//WithConnection
						//cargogrupoLogic.getSetVersionRowCargoGrupos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cargogrupo,cargogrupoAux);
					
					this.refrescarForeignKeysDescripcionesCargoGrupo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cargogrupoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos().addAll(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargos.addAll(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cargogrupoLogic.saveCargoGrupoRelaciones(cargogrupoAux,this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());//WithConnection
								//cargogrupoLogic.getSetVersionRowCargoGrupos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cargogrupo,cargogrupoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargoLogic.setCargos(new ArrayList<Cargo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargos= new ArrayList<Cargo>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.quitarFilaTotales();}
							cargogrupoAux.setCargos(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cargogrupoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cargogrupoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cargogrupoAux,cargogrupoLogic.getCargoGrupos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cargogrupoAux,cargogrupos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cargogrupo,cargogrupoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cargogrupoAux=new  CargoGrupo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cargogrupoSessionBean.getEsGuardarRelacionado() 
					|| (this.cargogrupoSessionBean.getEsGuardarRelacionado() && this.cargogrupo.getId()>=0)) {
						
					cargogrupoAux.setIsNew(false);
				}
				
				cargogrupoAux.setIsDeleted(false);
			
				cargogrupoAux.setId(this.cargogrupo.getId());	
				cargogrupoAux.setVersionRow(this.cargogrupo.getVersionRow());	
				cargogrupoAux.setid_empresa(this.cargogrupo.getid_empresa());	
				cargogrupoAux.setcodigo(this.cargogrupo.getcodigo());	
				cargogrupoAux.setnombre(this.cargogrupo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cargogrupoAux,cargogrupoLogic.getCargoGrupos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cargogrupoAux,cargogrupos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cargogrupoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cargogrupoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargogrupoLogic.saveCargoGrupos();//WithConnection
						//cargogrupoLogic.getSetVersionRowCargoGrupos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cargogrupo,cargogrupoAux);
					
					this.refrescarForeignKeysDescripcionesCargoGrupo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cargogrupoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos().addAll(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargos.addAll(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cargogrupoLogic.saveCargoGrupoRelaciones(cargogrupoAux,this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());//WithConnection
								//cargogrupoLogic.getSetVersionRowCargoGrupos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cargogrupo,cargogrupoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargoLogic.setCargos(new ArrayList<Cargo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargos= new ArrayList<Cargo>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.quitarFilaTotales();}
							cargogrupoAux.setCargos(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cargogrupoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cargogrupoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cargogrupoAux,cargogrupoLogic.getCargoGrupos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cargogrupoAux,cargogrupos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cargogrupo,cargogrupoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cargogrupoAux=new  CargoGrupo();
				
				cargogrupoAux.setIsNew(false);
				cargogrupoAux.setIsChanged(false);
				
				cargogrupoAux.setIsDeleted(true);
				
				cargogrupoAux.setId(this.cargogrupo.getId());	
				cargogrupoAux.setVersionRow(this.cargogrupo.getVersionRow());	
				cargogrupoAux.setid_empresa(this.cargogrupo.getid_empresa());	
				cargogrupoAux.setcodigo(this.cargogrupo.getcodigo());	
				cargogrupoAux.setnombre(this.cargogrupo.getnombre());	
				
				if(this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cargogrupoAux.getId()>=0) {	
						this.cargogruposEliminados.add(cargogrupoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cargogrupoAux,cargogrupoLogic.getCargoGrupos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cargogrupoAux,cargogrupos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cargogrupoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cargogrupoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargogrupoLogic.saveCargoGrupos();//WithConnection
						//cargogrupoLogic.getSetVersionRowCargoGrupos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cargogrupoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos().addAll(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargos.addAll(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cargogrupoLogic.saveCargoGrupoRelaciones(cargogrupoAux,this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());//WithConnection
								//cargogrupoLogic.getSetVersionRowCargoGrupos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargoLogic.setCargos(new ArrayList<Cargo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargos= new ArrayList<Cargo>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.quitarFilaTotales();}
							cargogrupoAux.setCargos(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.cargogrupoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cargogrupoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cargogrupoAux,cargogrupoLogic.getCargoGrupos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cargogrupoAux,cargogrupos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.getCargoGrupos().addAll(this.cargogruposEliminados);
					
					cargogrupoLogic.saveCargoGrupos();//WithConnection
					//cargogrupoLogic.getSetVersionRowCargoGrupos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCargoGrupo();
				
				this.cargogruposEliminados= new ArrayList<CargoGrupo>();		
			}
			
			if(this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargogrupoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cargo Grupo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cargo Grupo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cargogrupo=cargogrupoAux;
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
      		//this.finishProcessCargoGrupo();
      	}
		
	}	
	
	public void actualizarRelaciones(CargoGrupo cargogrupoLocal) throws Exception {
		
		if(this.cargogrupoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				cargogrupoLocal.setCargos(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());
			
			} else {
			
				cargogrupoLocal.setCargos(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CargoGrupo cargogrupoLocal) throws Exception {	
		if(this.cargogrupoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cargogrupoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCargoGrupoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cargogrupo =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cargogrupo =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cargogrupoValidator.getInvalidValues(this.cargogrupo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CargoGrupo cargogrupo,List<CargoGrupo> cargogrupos) throws Exception {
		try	{		
			CargoGrupoConstantesFunciones.actualizarLista(cargogrupo,cargogrupos,this.cargogrupoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CargoGrupo cargogrupo,List<CargoGrupo> cargogrupos) throws Exception {
		try	{			
			CargoGrupoConstantesFunciones.actualizarSelectedLista(cargogrupo,cargogrupos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CargoGrupo> cargogruposLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cargogruposLocal=this.cargogrupoLogic.getCargoGrupos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cargogruposLocal=this.cargogrupos;
			}
			//ARCHITECTURE
		
			for(CargoGrupo cargogrupoLocal:cargogruposLocal) {
				if(this.permiteMantenimiento(cargogrupoLocal) && cargogrupoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CargoGrupoConstantesFunciones.getCargoGrupoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CargoGrupoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargoGrupo.jLabelid_empresaCargoGrupo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargoGrupoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargoGrupo.jLabelcodigoCargoGrupo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargoGrupoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargoGrupo.jLabelnombreCargoGrupo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargoGrupo.jLabelid_empresaCargoGrupo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargoGrupo.jLabelcodigoCargoGrupo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargoGrupo.jLabelnombreCargoGrupo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Cargo")) {
			if(this.cargogrupo==null) {
				this.cargogrupo= new CargoGrupo();
			}

			if(this.cargogrupoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCargoGrupo
				this.setVariablesFormularioToObjetoActualCargoGrupo(this.cargogrupo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCargoGrupo(this.cargogrupo);

				this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.getcargo().setCargoGrupo(this.cargogrupo);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoCargoGrupo--;	
		
		
		this.cargogrupoAux=new CargoGrupo();
		
		this.cargogrupoAux.setId(this.iIdNuevoCargoGrupo);
		this.cargogrupoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cargogrupoLogic.getCargoGrupos().add(this.cargogrupoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cargogrupos.add(this.cargogrupoAux);
		}
		//ARCHITECTURE
		
		this.cargogrupo=this.cargogrupoAux;
		
		if(CargoGrupoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCargoGrupo(this.cargogrupo);
			this.setVariablesObjetoActualToFormularioForeignKeyCargoGrupo(this.cargogrupo);
		}
				
		//this.setDefaultControlesCargoGrupo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCargoGrupo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCargoGrupo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCargoGrupo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCargoGrupo(this.cargogrupoBean,this.cargogrupo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCargoGrupo(this.cargogrupo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CargoGrupoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cargogrupoSessionBean.getConGuardarRelaciones()) {
			classes=CargoGrupoConstantesFunciones.getClassesRelationshipsOfCargoGrupo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cargogrupoReturnGeneral=cargogrupoLogic.procesarEventosCargoGruposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cargogrupoLogic.getCargoGrupos(),this.cargogrupo,this.cargogrupoParameterGeneral,this.isEsNuevoCargoGrupo,classes);//this.cargogrupoLogic.getCargoGrupo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCargoGrupo(this.cargogrupoReturnGeneral,this.cargogrupoBean,false);
		
		if(this.cargogrupoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCargoGrupo(this.cargogrupoReturnGeneral.getCargoGrupo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCargoGrupo(this.cargogrupoReturnGeneral.getCargoGrupo());
		}
		
		if(this.cargogrupoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCargoGrupo(this.cargogrupoReturnGeneral.getCargoGrupo(),classes);//this.cargogrupoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCargoGrupo(this.cargogrupo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCargoGrupo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCargoGrupo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CargoGrupoBeanSwingJInternalFrameAdditional.RecargarFormCargoGrupo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCargoGrupo(false);
						
			if(cargogrupoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargoSessionBean.getEsGuardarRelacionado() && CargoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCargoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(CargoGrupoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCargoGrupo();
			}
			
			this.actualizarVisualTableDatosCargoGrupo();
			
			this.jTableDatosCargoGrupo.setRowSelectionInterval(this.getIndiceNuevoCargoGrupo(), this.getIndiceNuevoCargoGrupo());
			
			this.seleccionarFilaTablaCargoGrupoActual();
						
			this.actualizarEstadoCeldasBotonesCargoGrupo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCargoGrupo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCargoGrupo.jTextFieldcodigoCargoGrupo.setEnabled(isHabilitar && this.cargogrupoConstantesFunciones.activarcodigoCargoGrupo);
		this.jInternalFrameDetalleFormCargoGrupo.jTextAreanombreCargoGrupo.setEnabled(isHabilitar && this.cargogrupoConstantesFunciones.activarnombreCargoGrupo);	
		//
		this.jInternalFrameDetalleFormCargoGrupo.jComboBoxid_empresaCargoGrupo.setEnabled(isHabilitar && this.cargogrupoConstantesFunciones.activarid_empresaCargoGrupo);
	};
	
	public void setDefaultControlesCargoGrupo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCargoGrupo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cargogrupoSessionBean.setConGuardarRelaciones(true);			
			this.cargogrupoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCargoGrupo.jTabbedPaneRelacionesCargoGrupo.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.cargogrupoSessionBean.setConGuardarRelaciones(false);			
			this.cargogrupoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCargoGrupo.jTabbedPaneRelacionesCargoGrupo.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoCargoGrupo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CargoGrupo cargogrupoAux:this.cargogrupoLogic.getCargoGrupos()) {
				if(cargogrupoAux.getId().equals(this.iIdNuevoCargoGrupo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CargoGrupo cargogrupoAux:this.cargogrupos) {
				if(cargogrupoAux.getId().equals(this.iIdNuevoCargoGrupo)) {
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
	
	public int getIndiceActualCargoGrupo(CargoGrupo cargogrupo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CargoGrupo cargogrupoAux:this.cargogrupoLogic.getCargoGrupos()) {
				if(cargogrupoAux.getId().equals(cargogrupo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CargoGrupo cargogrupoAux:this.cargogrupos) {
				if(cargogrupoAux.getId().equals(cargogrupo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCargoGrupo(CargoGrupo cargogrupoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CargoGrupo cargogrupoAux:this.cargogrupoLogic.getCargoGrupos()) {
				if(cargogrupoAux.getCargoGrupoOriginal().getId().equals(cargogrupoOriginal.getId())) {
					existe=true;
					cargogrupoOriginal.setId(cargogrupoAux.getId());
					cargogrupoOriginal.setVersionRow(cargogrupoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CargoGrupo cargogrupoAux:this.cargogrupos) {
				if(cargogrupoAux.getCargoGrupoOriginal().getId().equals(cargogrupoOriginal.getId())) {
					existe=true;
					cargogrupoOriginal.setId(cargogrupoAux.getId());
					cargogrupoOriginal.setVersionRow(cargogrupoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCargoGrupo(Boolean esParaCancelar) throws Exception {
		cargogruposAux=new ArrayList<CargoGrupo>();
		cargogrupoAux=new CargoGrupo();
		
		if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CargoGrupo cargogrupoAux:this.cargogrupoLogic.getCargoGrupos()) {
					if(cargogrupoAux.getId()<0) {
						cargogruposAux.add(cargogrupoAux);
					}		
				}
				this.iIdNuevoCargoGrupo=0L;
				this.cargogrupoLogic.getCargoGrupos().removeAll(cargogruposAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CargoGrupo cargogrupoAux:this.cargogrupos) {
					if(cargogrupoAux.getId()<0) {
						cargogruposAux.add(cargogrupoAux);
					}		
				}
				this.iIdNuevoCargoGrupo=0L;
				this.cargogrupos.removeAll(cargogruposAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCargoGrupo 
					&& this.cargogrupoLogic.getCargoGrupos().size()>0
					) {
					cargogrupoAux=this.cargogrupoLogic.getCargoGrupos().get(this.cargogrupoLogic.getCargoGrupos().size() - 1);
				
					if(cargogrupoAux.getId()<0) {
						this.cargogrupoLogic.getCargoGrupos().remove(cargogrupoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCargoGrupo && this.cargogrupos.size()>0) {
					cargogrupoAux=this.cargogrupos.get(this.cargogrupos.size() - 1);
				
					if(cargogrupoAux.getId()<0) {
						this.cargogrupos.remove(cargogrupoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCargoGrupo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cargogrupo.getId()<0) {
				this.cargogrupoLogic.getCargoGrupos().remove(this.cargogrupo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cargogrupo.getId()<0) {
				this.cargogrupos.remove(this.cargogrupo);
			}
		}			
	}
	
	public void setEstadosInicialesCargoGrupo(List<CargoGrupo> cargogruposAux) throws Exception {
		CargoGrupoConstantesFunciones.setEstadosInicialesCargoGrupo(cargogruposAux);
	}
	
	public void setEstadosInicialesCargoGrupo(CargoGrupo cargogrupoAux) throws Exception {
		CargoGrupoConstantesFunciones.setEstadosInicialesCargoGrupo(cargogrupoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCargoGrupoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCargoGrupo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCargoGrupoActual()) {
				if(!this.isEsNuevoCargoGrupo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCargoGrupo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCargoGrupo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCargoGrupoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cargo Grupo ?", "MANTENIMIENTO DE Cargo Grupo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCargoGrupo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CargoGrupo cargogrupo) throws Exception {
		CargoGrupoConstantesFunciones.seleccionarAsignar(this.cargogrupo,cargogrupo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCargoGrupo=this.isPermisoActualizarOriginalCargoGrupo;
			
			
			this.seleccionarAsignar(cargogrupo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CargoGrupoConstantesFunciones.quitarEspaciosCargoGrupo(this.cargogrupo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCargoGrupo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cargogrupoSessionBean.setsFuncionBusquedaRapida(this.cargogrupoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCargoGrupo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCargoGrupo(esParaCancelar);				
				this.cancelarNuevoCargoGrupo(esParaCancelar);								
			}
			
			this.cargogrupo=new CargoGrupo();
			
			this.inicializarCargoGrupo();
			
			this.actualizarEstadoCeldasBotonesCargoGrupo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCargoGrupo() throws Exception {
		try {
			CargoGrupoConstantesFunciones.inicializarCargoGrupo(this.cargogrupo);
			
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
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cargogrupoLogic.getCargoGrupos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCargoGrupos(String sAccionBusqueda,List<CargoGrupo> cargogruposParaReportes) throws Exception {
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
					sPathReporteFinal="CargoGrupo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CargoGrupoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CargoGrupoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CargoGrupo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cargo Grupos");		
		parameters.put("busquedapor", CargoGrupoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Cargo.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					CargoGrupoLogic cargogrupoLogicAuxiliar=new CargoGrupoLogic();
					cargogrupoLogicAuxiliar.setDatosCliente(cargogrupoLogic.getDatosCliente());				
					cargogrupoLogicAuxiliar.setCargoGrupos(cargogruposParaReportes);
					
					cargogrupoLogicAuxiliar.cargarRelacionesLoteForeignKeyCargoGrupoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					cargogruposParaReportes=cargogrupoLogicAuxiliar.getCargoGrupos();
					
					//cargogrupoLogic.getNewConnexionToDeep();
					
					//for (CargoGrupo cargogrupo:cargogruposParaReportes) {
					//	cargogrupoLogic.deepLoad(cargogrupo, false, DeepLoadType.INCLUDE, classes);
					//}						
					//cargogrupoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//cargogrupoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCargo = AuxiliarReportes.class.getResourceAsStream("CargoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cargo", reportFileCargo);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCargoGrupo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CargoGrupoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CargoGrupoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCargoGrupo=new JRBeanArrayDataSource(CargoGrupoJInternalFrame.TraerCargoGrupoBeans(cargogruposParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCargoGrupo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CargoGrupoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CargoGrupoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CargoGrupoBean.TraerCargoGrupoBeans(cargogruposParaReportes).toArray()));
							
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
				this.generarExcelReporteCargoGrupos(sAccionBusqueda,sTipoArchivoReporte,cargogruposParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCargoGrupos(sAccionBusqueda,sTipoArchivoReporte,cargogruposParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCargoGrupoActionPerformed(null);
					//this.generarExcelReporteCargoGrupos(sAccionBusqueda,sTipoArchivoReporte,cargogruposParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCargoGrupos(sAccionBusqueda,sTipoArchivoReporte,cargogruposParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCargoGrupos(sAccionBusqueda,sTipoArchivoReporte,cargogruposParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCargoGrupos(sAccionBusqueda,sTipoArchivoReporte,cargogruposParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCargoGrupos(String sAccionBusqueda,String sTipoArchivoReporte,List<CargoGrupo> cargogruposParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargogrupo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CargoGrupos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCargoGrupo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CargoGrupo cargogrupo : cargogruposParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CargoGrupoConstantesFunciones.generarExcelReporteDataCargoGrupo("NORMAL",row,workbook,cargogrupo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargogrupoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo Grupo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCargoGrupo(String sTipo,Row row,Workbook workbook) {
		
		CargoGrupoConstantesFunciones.generarExcelReporteHeaderCargoGrupo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCargoGrupos(String sAccionBusqueda,String sTipoArchivoReporte,List<CargoGrupo> cargogruposParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargogrupo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CargoGrupos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CargoGrupo cargogrupo : cargogruposParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CargoGrupoConstantesFunciones.getCargoGrupoDescripcion(cargogrupo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoGrupoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoGrupoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargogrupo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoGrupoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoGrupoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargogrupo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoGrupoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoGrupoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargogrupo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargogrupoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo Grupo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCargoGrupos(String sAccionBusqueda,String sTipoArchivoReporte,List<CargoGrupo> cargogruposParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CargoGrupo> cargogruposRespaldo=null;
		
		classes=CargoGrupoConstantesFunciones.getClassesRelationshipsOfCargoGrupo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cargogrupoLogic.setDatosCliente(this.datosCliente);
		this.cargogrupoLogic.setDatosDeep(this.datosDeep);
		this.cargogrupoLogic.setIsConDeep(true);
		
		cargogruposRespaldo=this.cargogrupoLogic.getCargoGrupos();
		
		this.cargogrupoLogic.setCargoGrupos(cargogruposParaReportes);	
		this.cargogrupoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cargogruposParaReportes=this.cargogrupoLogic.getCargoGrupos();
		this.cargogrupoLogic.setCargoGrupos(cargogruposRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargogrupo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CargoGrupos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCargoGrupo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CargoGrupo cargogrupo : cargogruposParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCargoGrupo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CargoGrupoConstantesFunciones.generarExcelReporteDataCargoGrupo("NORMAL",row,workbook,cargogrupo,cellStyleDataAux);
		
			
			


				//Cargo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CargoConstantesFunciones.SCLASSWEBTITULO))) {

				if(cargogrupo.getCargos()!=null && cargogrupo.getCargos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CargoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CargoConstantesFunciones.generarExcelReporteHeaderCargo("RELACIONADO",row,workbook);
				}

				if(cargogrupo.getCargos()!=null) {
					i2=0;
					for(Cargo cargo : cargogrupo.getCargos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CargoConstantesFunciones.generarExcelReporteDataCargo("RELACIONADO",row,workbook,cargo,cellStyleDataAuxHijo);
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
		cell.setCellValue(CargoGrupoConstantesFunciones.getCargoGrupoDescripcion(cargogrupo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargogrupoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo Grupo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCargoGrupo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCargoGrupo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCargoGrupo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCargoGrupo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCargoGrupo() throws Exception {		
		this.startProcessCargoGrupo(true);
	}
	
	public void startProcessCargoGrupo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCargoGrupo ,this.jPanelParametrosReportesCargoGrupo, this.jScrollPanelDatosCargoGrupo,this.jPanelPaginacionCargoGrupo, this.jScrollPanelDatosEdicionCargoGrupo, this.jPanelAccionesCargoGrupo,this.jPanelAccionesFormularioCargoGrupo,this.jmenuBarCargoGrupo,this.jmenuBarDetalleCargoGrupo,this.jTtoolBarCargoGrupo,this.jTtoolBarDetalleCargoGrupo);		
		
		final JTabbedPane jTabbedPaneBusquedasCargoGrupo=this.jTabbedPaneBusquedasCargoGrupo; 
		
		final JPanel jPanelParametrosReportesCargoGrupo=this.jPanelParametrosReportesCargoGrupo;
		//final JScrollPane jScrollPanelDatosCargoGrupo=this.jScrollPanelDatosCargoGrupo;
		final JTable jTableDatosCargoGrupo=this.jTableDatosCargoGrupo;		
		final JPanel jPanelPaginacionCargoGrupo=this.jPanelPaginacionCargoGrupo;
		//final JScrollPane jScrollPanelDatosEdicionCargoGrupo=this.jScrollPanelDatosEdicionCargoGrupo;
		final JPanel jPanelAccionesCargoGrupo=this.jPanelAccionesCargoGrupo;
		
		JPanel jPanelCamposAuxiliarCargoGrupo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCargoGrupo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
			jPanelCamposAuxiliarCargoGrupo=this.jInternalFrameDetalleFormCargoGrupo.jPanelCamposCargoGrupo;
			jPanelAccionesFormularioAuxiliarCargoGrupo=this.jInternalFrameDetalleFormCargoGrupo.jPanelAccionesFormularioCargoGrupo;
		}
		
		final JPanel jPanelCamposCargoGrupo=jPanelCamposAuxiliarCargoGrupo;
		final JPanel jPanelAccionesFormularioCargoGrupo=jPanelAccionesFormularioAuxiliarCargoGrupo;
		
		
		final JMenuBar jmenuBarCargoGrupo=this.jmenuBarCargoGrupo;
		final JToolBar jTtoolBarCargoGrupo=this.jTtoolBarCargoGrupo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCargoGrupo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCargoGrupo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
			jmenuBarDetalleAuxiliarCargoGrupo=this.jInternalFrameDetalleFormCargoGrupo.jmenuBarDetalleCargoGrupo;
			jTtoolBarDetalleAuxiliarCargoGrupo=this.jInternalFrameDetalleFormCargoGrupo.jTtoolBarDetalleCargoGrupo;
		}
		
		final JMenuBar jmenuBarDetalleCargoGrupo=jmenuBarDetalleAuxiliarCargoGrupo;
		final JToolBar jTtoolBarDetalleCargoGrupo=jTtoolBarDetalleAuxiliarCargoGrupo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCargoGrupo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCargoGrupo;
			processRunnable.jTableDatos=jTableDatosCargoGrupo;
			processRunnable.jPanelCampos=jPanelCamposCargoGrupo;
			processRunnable.jPanelPaginacion=jPanelPaginacionCargoGrupo;
			processRunnable.jPanelAcciones=jPanelAccionesCargoGrupo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCargoGrupo;
			
			
			processRunnable.jmenuBar=jmenuBarCargoGrupo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCargoGrupo;
			processRunnable.jTtoolBar=jTtoolBarCargoGrupo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCargoGrupo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCargoGrupo ,jPanelParametrosReportesCargoGrupo,jTableDatosCargoGrupo, /*jScrollPanelDatosCargoGrupo,*/jPanelCamposCargoGrupo,jPanelPaginacionCargoGrupo, /*jScrollPanelDatosEdicionCargoGrupo,*/ jPanelAccionesCargoGrupo,jPanelAccionesFormularioCargoGrupo,jmenuBarCargoGrupo,jmenuBarDetalleCargoGrupo,jTtoolBarCargoGrupo,jTtoolBarDetalleCargoGrupo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCargoGrupo ,jPanelParametrosReportesCargoGrupo, jScrollPanelDatosCargoGrupo,jPanelPaginacionCargoGrupo, jScrollPanelDatosEdicionCargoGrupo, jPanelAccionesCargoGrupo,jPanelAccionesFormularioCargoGrupo,jmenuBarCargoGrupo,jmenuBarDetalleCargoGrupo,jTtoolBarCargoGrupo,jTtoolBarDetalleCargoGrupo);
						
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
	
	public void finishProcessCargoGrupo() {// throws Exception 
		this.finishProcessCargoGrupo(true);
	}
	
	public void finishProcessCargoGrupo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCargoGrupo ,this.jPanelParametrosReportesCargoGrupo, this.jScrollPanelDatosCargoGrupo,this.jPanelPaginacionCargoGrupo, this.jScrollPanelDatosEdicionCargoGrupo, this.jPanelAccionesCargoGrupo,this.jPanelAccionesFormularioCargoGrupo,this.jmenuBarCargoGrupo,this.jmenuBarDetalleCargoGrupo,this.jTtoolBarCargoGrupo,this.jTtoolBarDetalleCargoGrupo);		
		
		final JTabbedPane jTabbedPaneBusquedasCargoGrupo=this.jTabbedPaneBusquedasCargoGrupo; 
		
		final JPanel jPanelParametrosReportesCargoGrupo=this.jPanelParametrosReportesCargoGrupo;
		//final JScrollPane jScrollPanelDatosCargoGrupo=this.jScrollPanelDatosCargoGrupo;
		final JTable jTableDatosCargoGrupo=this.jTableDatosCargoGrupo;		
		final JPanel jPanelPaginacionCargoGrupo=this.jPanelPaginacionCargoGrupo;
		//final JScrollPane jScrollPanelDatosEdicionCargoGrupo=this.jScrollPanelDatosEdicionCargoGrupo;
		final JPanel jPanelAccionesCargoGrupo=this.jPanelAccionesCargoGrupo;
		
		JPanel jPanelCamposAuxiliarCargoGrupo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCargoGrupo=new JPanel();
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
			jPanelCamposAuxiliarCargoGrupo=this.jInternalFrameDetalleFormCargoGrupo.jPanelCamposCargoGrupo;
			jPanelAccionesFormularioAuxiliarCargoGrupo=this.jInternalFrameDetalleFormCargoGrupo.jPanelAccionesFormularioCargoGrupo;
		}
		
		final JPanel jPanelCamposCargoGrupo=jPanelCamposAuxiliarCargoGrupo;
		final JPanel jPanelAccionesFormularioCargoGrupo=jPanelAccionesFormularioAuxiliarCargoGrupo;
		
		
		final JMenuBar jmenuBarCargoGrupo=this.jmenuBarCargoGrupo;		
		final JToolBar jTtoolBarCargoGrupo=this.jTtoolBarCargoGrupo;
				
		JMenuBar jmenuBarDetalleAuxiliarCargoGrupo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCargoGrupo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
			jmenuBarDetalleAuxiliarCargoGrupo=this.jInternalFrameDetalleFormCargoGrupo.jmenuBarDetalleCargoGrupo;
			jTtoolBarDetalleAuxiliarCargoGrupo=this.jInternalFrameDetalleFormCargoGrupo.jTtoolBarDetalleCargoGrupo;		
		}
		
		final JMenuBar jmenuBarDetalleCargoGrupo=jmenuBarDetalleAuxiliarCargoGrupo;
		final JToolBar jTtoolBarDetalleCargoGrupo=jTtoolBarDetalleAuxiliarCargoGrupo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCargoGrupo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCargoGrupo;
			processRunnable.jTableDatos=jTableDatosCargoGrupo;
			processRunnable.jPanelCampos=jPanelCamposCargoGrupo;
			processRunnable.jPanelPaginacion=jPanelPaginacionCargoGrupo;
			processRunnable.jPanelAcciones=jPanelAccionesCargoGrupo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCargoGrupo;
			
			
			processRunnable.jmenuBar=jmenuBarCargoGrupo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCargoGrupo;
			processRunnable.jTtoolBar=jTtoolBarCargoGrupo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCargoGrupo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCargoGrupo ,jPanelParametrosReportesCargoGrupo, jTableDatosCargoGrupo,/*jScrollPanelDatosCargoGrupo,*/jPanelCamposCargoGrupo,jPanelPaginacionCargoGrupo, /*jScrollPanelDatosEdicionCargoGrupo,*/ jPanelAccionesCargoGrupo,jPanelAccionesFormularioCargoGrupo,jmenuBarCargoGrupo,jmenuBarDetalleCargoGrupo,jTtoolBarCargoGrupo,jTtoolBarDetalleCargoGrupo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCargoGrupo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCargoGrupo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCargoGrupo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCargoGrupo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCargoGrupo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCargoGrupo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCargoGrupo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCargoGrupo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCargoGrupo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cargogrupoConstantesFunciones.getsFinalQueryCargoGrupo();
		String  finalQueryPaginacionTodos=this.cargogrupoConstantesFunciones.getsFinalQueryCargoGrupo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CargoGrupoConstantesFunciones.getArrayColumnasGlobalesNoCargoGrupo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CargoGrupoConstantesFunciones.getArrayColumnasGlobalesCargoGrupo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CargoGrupoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cargogruposEliminados= new ArrayList<CargoGrupo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCargoGrupo();
		
				///*CargoGrupoSessionBean*/this.cargogrupoSessionBean=new CargoGrupoSessionBean();
			
			if(this.cargogrupoSessionBean==null) {
				this.cargogrupoSessionBean=new CargoGrupoSessionBean();
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
					this.iNumeroPaginacion=CargoGrupoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CargoGrupoConstantesFunciones.getClassesForeignKeysOfCargoGrupo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cargogrupo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cargogruposAux= new ArrayList<CargoGrupo>();
			
				
			cargogrupoLogic.setDatosCliente(this.datosCliente);
			cargogrupoLogic.setDatosDeep(this.datosDeep);
			cargogrupoLogic.setIsConDeep(true);
			
			
			cargogrupoLogic.getCargoGrupoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cargogrupoLogic.getTodosCargoGrupos(finalQueryGlobal,pagination);
					
					//cargogrupoLogic.getTodosCargoGruposWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cargogrupoLogic.getCargoGrupos()==null|| cargogrupoLogic.getCargoGrupos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cargogruposAux= new ArrayList<CargoGrupo>();
							cargogruposAux.addAll(cargogrupoLogic.getCargoGrupos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargogruposAux= new ArrayList<CargoGrupo>();
							cargogruposAux.addAll(cargogrupos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cargogrupoLogic.getTodosCargoGrupos(finalQueryGlobal+"",this.pagination);												
							
							//cargogrupoLogic.getTodosCargoGruposWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCargoGrupos("Todos",cargogrupoLogic.getCargoGrupos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cargogrupoLogic.setCargoGrupos(new ArrayList<CargoGrupo>());					
							cargogrupoLogic.getCargoGrupos().addAll(cargogruposAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargogrupos=new ArrayList<CargoGrupo>();
							cargogrupos.addAll(cargogruposAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCargoGrupo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCargoGrupo=this.idActual;
				
				} else if(this.idCargoGrupoActual!=null && this.idCargoGrupoActual!=0L) {
					idCargoGrupo=idCargoGrupoActual;
				}
				
					
				this.sDetalleReporte=CargoGrupoConstantesFunciones.getDetalleIndicePorId(idCargoGrupo);
				
				this.cargogrupos=new ArrayList<CargoGrupo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cargogrupoLogic.getEntity(idCargoGrupo);
					
					//cargogrupoLogic.getEntityWithConnection(idCargoGrupo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargogrupoLogic.setCargoGrupos(new ArrayList<CargoGrupo>());
					cargogrupoLogic.getCargoGrupos().add(cargogrupoLogic.getCargoGrupo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargogrupos=new ArrayList<CargoGrupo>();
					this.cargogrupos.add(cargogrupo);
				}
				
				if(cargogrupoLogic.getCargoGrupo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CargoGrupoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cargogrupoLogic.getCargoGruposFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargoGrupoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargoGrupoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cargogrupoLogic.getCargoGrupos()==null||cargogrupoLogic.getCargoGrupos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cargogrupos==null|| cargogrupos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cargogruposAux=new ArrayList<CargoGrupo>();
						cargogruposAux.addAll(cargogrupoLogic.getCargoGrupos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargogruposAux=new ArrayList<CargoGrupo>();
							cargogruposAux.addAll(cargogrupos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cargogrupoLogic.getCargoGruposFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargoGrupoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargoGrupoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCargoGrupos("FK_IdEmpresa",cargogrupoLogic.getCargoGrupos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCargoGrupos("FK_IdEmpresa",cargogrupos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cargogrupoLogic.setCargoGrupos(new ArrayList<CargoGrupo>());
						cargogrupoLogic.getCargoGrupos().addAll(cargogruposAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargogrupos=new ArrayList<CargoGrupo>();
							cargogrupos.addAll(cargogruposAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCargoGrupo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCargoGrupo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cargogrupoLogic.getCargoGrupos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cargogrupos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cargogrupoLogic.getCargoGrupos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cargogrupos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CargoGrupo cargogrupo) {
		Boolean permite=true;
		
		if(this.cargogrupo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CargoGrupoConstantesFunciones.getOrderByListaCargoGrupo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CargoGrupoConstantesFunciones.getOrderByListaCargoGrupo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CargoGrupo cargogrupo:cargogrupoLogic.getCargoGrupos()) {
				if(cargogrupo.getsType().equals(Constantes2.S_TOTALES)) {
					cargogrupoTotales=cargogrupo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CargoGrupo cargogrupo:this.cargogrupos) {
				if(cargogrupo.getsType().equals(Constantes2.S_TOTALES)) {
					cargogrupoTotales=cargogrupo;
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
			this.cargogrupoAux=new CargoGrupo();
			this.cargogrupoAux.setsType(Constantes2.S_TOTALES);
			this.cargogrupoAux.setIsNew(false);
			this.cargogrupoAux.setIsChanged(false);
			this.cargogrupoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CargoGrupoConstantesFunciones.TotalizarValoresFilaCargoGrupo(this.cargogrupoLogic.getCargoGrupos(),this.cargogrupoAux);
				
				this.cargogrupoLogic.getCargoGrupos().add(this.cargogrupoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CargoGrupoConstantesFunciones.TotalizarValoresFilaCargoGrupo(this.cargogrupos,this.cargogrupoAux);
				
				this.cargogrupos.add(this.cargogrupoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cargogrupoTotales=new CargoGrupo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cargogrupoLogic.getCargoGrupos().remove(cargogrupoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cargogrupos.remove(cargogrupoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cargogrupoTotales=new CargoGrupo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CargoGrupo cargogrupo:cargogrupoLogic.getCargoGrupos()) {
				if(cargogrupo.getsType().equals(Constantes2.S_TOTALES)) {
					cargogrupoTotales=cargogrupo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CargoGrupoConstantesFunciones.TotalizarValoresFilaCargoGrupo(this.cargogrupoLogic.getCargoGrupos(),cargogrupoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CargoGrupo cargogrupo:this.cargogrupos) {
				if(cargogrupo.getsType().equals(Constantes2.S_TOTALES)) {
					cargogrupoTotales=cargogrupo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CargoGrupoConstantesFunciones.TotalizarValoresFilaCargoGrupo(this.cargogrupos,cargogrupoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCargoGruposFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCargoGruposFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargogrupoLogic.getCargoGruposFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosCargoGrupo() {
		this.isPermisoTodoCargoGrupo=false;
		this.isPermisoNuevoCargoGrupo=false;
		this.isPermisoActualizarCargoGrupo=false;
		this.isPermisoActualizarOriginalCargoGrupo=false;
		this.isPermisoEliminarCargoGrupo=false;
		this.isPermisoGuardarCambiosCargoGrupo=false;
		this.isPermisoConsultaCargoGrupo=false;
		this.isPermisoBusquedaCargoGrupo=false;
		this.isPermisoReporteCargoGrupo=false;		
		this.isPermisoOrdenCargoGrupo=false;		
		this.isPermisoPaginacionMedioCargoGrupo=false;		
		this.isPermisoPaginacionAltoCargoGrupo=false;
		this.isPermisoPaginacionTodoCargoGrupo=false;
		this.isPermisoCopiarCargoGrupo=false;		
		this.isPermisoVerFormCargoGrupo=false;		
		this.isPermisoDuplicarCargoGrupo=false;		
		this.isPermisoOrdenCargoGrupo=false;		
	}
	
	public void setPermisosUsuarioCargoGrupo(Boolean isPermiso) {
		this.isPermisoTodoCargoGrupo=isPermiso;
		this.isPermisoNuevoCargoGrupo=isPermiso;
		this.isPermisoActualizarCargoGrupo=isPermiso;
		this.isPermisoActualizarOriginalCargoGrupo=isPermiso;
		this.isPermisoEliminarCargoGrupo=isPermiso;
		this.isPermisoGuardarCambiosCargoGrupo=isPermiso;
		this.isPermisoConsultaCargoGrupo=isPermiso;
		this.isPermisoBusquedaCargoGrupo=isPermiso;
		this.isPermisoReporteCargoGrupo=isPermiso;
		this.isPermisoOrdenCargoGrupo=isPermiso;		
		this.isPermisoPaginacionMedioCargoGrupo=isPermiso;		
		this.isPermisoPaginacionAltoCargoGrupo=isPermiso;		
		this.isPermisoPaginacionTodoCargoGrupo=isPermiso;		
		this.isPermisoCopiarCargoGrupo=isPermiso;		
		this.isPermisoVerFormCargoGrupo=isPermiso;		
		this.isPermisoDuplicarCargoGrupo=isPermiso;
		this.isPermisoOrdenCargoGrupo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCargoGrupo(Boolean isPermiso) {
		//this.isPermisoTodoCargoGrupo=isPermiso;
		this.isPermisoNuevoCargoGrupo=isPermiso;
		this.isPermisoActualizarCargoGrupo=isPermiso;
		this.isPermisoActualizarOriginalCargoGrupo=isPermiso;
		this.isPermisoEliminarCargoGrupo=isPermiso;
		this.isPermisoGuardarCambiosCargoGrupo=isPermiso;
		//this.isPermisoConsultaCargoGrupo=isPermiso;
		//this.isPermisoBusquedaCargoGrupo=isPermiso;
		//this.isPermisoReporteCargoGrupo=isPermiso;
		//this.isPermisoOrdenCargoGrupo=isPermiso;		
		//this.isPermisoPaginacionMedioCargoGrupo=isPermiso;		
		//this.isPermisoPaginacionAltoCargoGrupo=isPermiso;		
		//this.isPermisoPaginacionTodoCargoGrupo=isPermiso;		
		//this.isPermisoCopiarCargoGrupo=isPermiso;		
		//this.isPermisoDuplicarCargoGrupo=isPermiso;
		//this.isPermisoOrdenCargoGrupo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCargoGrupoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(CargoConstantesFunciones.SNOMBREOPCION);
		
		if(CargoGrupoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCargo=false;
		this.isTienePermisosCargo=this.verificarGetPermisosUsuarioOpcionCargoGrupoClaseRelacionada(this.opcionsRelacionadas,CargoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebCargoGrupo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCargoGrupoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCargo=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioCargoGrupoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCargoGrupoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCargoGrupoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCargo && this.jInternalFrameDetalleFormCargoGrupo!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCargoGrupo.jTabbedPaneRelacionesCargoGrupo.remove(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioCargoGrupo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CargoGrupoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CargoGrupoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCargoGrupo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCargoGrupo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCargoGrupo=this.isPermisoActualizarCargoGrupo;
			this.isPermisoEliminarCargoGrupo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCargoGrupo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCargoGrupo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCargoGrupo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCargoGrupo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCargoGrupo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCargoGrupo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCargoGrupo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCargoGrupo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCargoGrupo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCargoGrupo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCargoGrupo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCargoGrupo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCargoGrupo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCargoGrupo.setToolTipText(this.jTableDatosCargoGrupo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCargoGrupo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCargoGrupo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CargoGrupoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CargoGrupoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCargoGrupo() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCargo && this.cargogrupoConstantesFunciones.mostrarCargoCargoGrupo && !CargoGrupoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cargo");
			reporte.setsDescripcion("Cargo");
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
	public void inicializarCombosForeignKeyCargoGrupoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCargoGrupoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CargoGrupoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCargoGrupoListas(false);
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
	
	public void cargarCombosLoteForeignKeyCargoGrupoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CargoGrupoParameterReturnGeneral cargogrupoReturnGeneral=new CargoGrupoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.cargogrupoConstantesFunciones.cargarid_empresaCargoGrupo)
					 || (this.esRecargarFks && this.cargogrupoConstantesFunciones.cargarid_empresaCargoGrupo)) {

					if(!this.cargogrupoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+cargogrupoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cargogrupoReturnGeneral=cargogrupoLogic.cargarCombosLoteForeignKeyCargoGrupo(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=cargogrupoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCargoGrupo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cargogrupoSessionBean==null) {
				this.cargogrupoSessionBean=new CargoGrupoSessionBean();
			}

			if(!this.cargogrupoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyCargoGrupo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCargoGrupo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCargoGrupo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCargoGrupo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCargoGrupo(CargoGrupo cargogrupo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCargoGrupo(CargoGrupo cargogrupo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCargoGrupo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCargoGrupo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCargoGrupo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCargoGrupo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCargoGrupo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCargoGrupo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCargoGrupo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCargoGrupo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCargoGrupo.jComboBoxid_empresaCargoGrupo!=null && this.jInternalFrameDetalleFormCargoGrupo.jComboBoxid_empresaCargoGrupo.getItemCount()>0) {
				this.jInternalFrameDetalleFormCargoGrupo.jComboBoxid_empresaCargoGrupo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public CargoGrupoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CargoGrupoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CargoGrupoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cargogrupoSessionBean=new CargoGrupoSessionBean(); 
		this.cargogrupoConstantesFunciones=new CargoGrupoConstantesFunciones(); 
		this.cargogrupoBean=new CargoGrupo();//(this.cargogrupoConstantesFunciones); 		
		this.cargogrupoReturnGeneral=new CargoGrupoParameterReturnGeneral(); 
		
		this.cargogrupoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cargogrupoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CargoGrupoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CargoGrupoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CargoGrupoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCargoGrupo(true);
			
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
			
			this.cargogrupoConstantesFunciones=new CargoGrupoConstantesFunciones(); 
			this.cargogrupoBean=new CargoGrupo();//this.cargogrupoConstantesFunciones); 			
			this.cargogrupoReturnGeneral=new CargoGrupoParameterReturnGeneral(); 
		
			CargoGrupoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cargo Grupo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.cargogrupo=new CargoGrupo();
			this.cargogrupos = new ArrayList<CargoGrupo>();
			this.cargogruposAux = new ArrayList<CargoGrupo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic=new CargoGrupoLogic();
				this.cargogrupoLogic.getNewConnexionToDeep("");
			}
			
			//this.cargogrupoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cargogrupoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCargoGrupo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCargoGrupo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCargoGrupo);	
					}
					
					if(this.jInternalFrameImportacionCargoGrupo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCargoGrupo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCargoGrupo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCargoGrupo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCargoGrupo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCargoGrupo);
				this.jInternalFrameDetalleFormCargoGrupo.setVisible(false);
				this.jInternalFrameDetalleFormCargoGrupo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCargoGrupo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCargoGrupo);
					this.jInternalFrameReporteDinamicoCargoGrupo.setVisible(false);
					this.jInternalFrameReporteDinamicoCargoGrupo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCargoGrupo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCargoGrupo);
					this.jInternalFrameImportacionCargoGrupo.setVisible(false);
					this.jInternalFrameImportacionCargoGrupo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCargoGrupo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCargoGrupo);
					this.jInternalFrameOrderByCargoGrupo.setVisible(false);
					this.jInternalFrameOrderByCargoGrupo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCargoGrupoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CargoGrupoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cargogrupoReturnGeneral=new CargoGrupoParameterReturnGeneral();
			
			this.cargogrupoParameterGeneral=new CargoGrupoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cargogrupoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CargoGrupoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(CargoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CargoGrupoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cargogrupoSessionBean.getEsGuardarRelacionado(),this.cargogrupoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CargoGrupoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cargogrupoSessionBean.getEsGuardarRelacionado(),this.cargogrupoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCargoGrupo=false;
			this.isVisibilidadCeldaDuplicarCargoGrupo=true;
			this.isVisibilidadCeldaCopiarCargoGrupo=true;
			this.isVisibilidadCeldaVerFormCargoGrupo=true;
			this.isVisibilidadCeldaOrdenCargoGrupo=true;
			this.isVisibilidadCeldaNuevoRelacionesCargoGrupo=false;
			this.isVisibilidadCeldaModificarCargoGrupo=false;
			this.isVisibilidadCeldaActualizarCargoGrupo=false;
			this.isVisibilidadCeldaEliminarCargoGrupo=false;
			this.isVisibilidadCeldaCancelarCargoGrupo=false;
			this.isVisibilidadCeldaGuardarCargoGrupo=false;
			this.isVisibilidadCeldaGuardarCambiosCargoGrupo=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCargoGrupo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCargoGrupo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCargoGrupo(false);
			
			this.setPermisosUsuarioCargoGrupo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cargogrupoSessionBean.getEsGuardarRelacionado() 
				|| (this.cargogrupoSessionBean.getEsGuardarRelacionado() && this.cargogrupoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCargoGrupoClasesRelacionadas();
			}
			
			if(this.cargogrupoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCargoGrupoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CargoGrupoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCargoGrupo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCargoGrupo();
			}
			
			if(!this.isPermisoBusquedaCargoGrupo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCargoGrupo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCargoGrupo,this.isPermisoPaginacionMedioCargoGrupo,this.isPermisoPaginacionTodoCargoGrupo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CargoGrupoConstantesFunciones.getTiposSeleccionarCargoGrupo());
				
				this.tiposColumnasSelect=CargoGrupoConstantesFunciones.getTiposSeleccionarCargoGrupo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectCargoGrupo();				
				//this.tiposRelacionesSelect=CargoGrupoConstantesFunciones.getTiposRelacionesCargoGrupo(true);
				
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
			//if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCargoGrupo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCargoGrupo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCargoGrupo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCargoGrupo() ;
			
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
			
			
			this.cargoLogic=new CargoLogic(); 
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
				cargogrupoImplementable= (CargoGrupoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CargoGrupoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cargogrupoImplementableHome= (CargoGrupoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CargoGrupoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cargogrupos= new ArrayList<CargoGrupo>();
			this.cargogruposEliminados= new ArrayList<CargoGrupo>();
						
			this.isEsNuevoCargoGrupo=false;
			this.esParaAccionDesdeFormularioCargoGrupo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCargoGrupo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCargoGrupo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CargoGrupoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CargoGrupoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCargoGrupo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCargoGrupo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCargoGrupo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCargoGrupo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCargoGrupo();
			}
			
			CargoGrupoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCargoGrupo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCargoGrupo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCargoGrupo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCargoGrupo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CargoGrupo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCargoGrupo() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(CargoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CargoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCargoGrupo")) {
				iIndex=this.jInternalFrameDetalleFormCargoGrupo.jTabbedPaneRelacionesCargoGrupo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCargoGrupo.jTabbedPaneRelacionesCargoGrupo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();	
				
				

				if(sTitle.equals("Cargos")) {
					if(!CargoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCargoGrupo();

						this.cargarParteTabPanelRelacionadaCargo(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCargoGrupo();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCargo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCargoGrupo.cargarSessionConBeanSwingJInternalFrameCargo(false,true,iIndex);
		this.jButtonCargoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCargo();

		//this.jTabbedPaneRelacionesCargoGrupo.updateUI();
		//this.jTabbedPaneRelacionesCargoGrupo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCargoGrupo.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Cargo")) {
				int row=this.jTableDatosCargoGrupo.getSelectedRow();
				jButtonCargoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cargo")) {

					if(this.isTienePermisosCargo && this.cargogrupoConstantesFunciones.mostrarCargoCargoGrupo && !CargoGrupoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cargos"+"("+CargoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cargos");

						if(cargogrupoConstantesFunciones.resaltarCargoCargoGrupo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(cargogrupoConstantesFunciones.resaltarCargoCargoGrupo);
						}

						jmenuItem.setEnabled(this.cargogrupoConstantesFunciones.activarCargoCargoGrupo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cargo"));

						

						this.jInternalFrameDetalleFormCargoGrupo.jmenuDetalleCargoGrupo.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyCargoGrupo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCargoGrupo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCargoGrupo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCargoGrupoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCargoGrupo();
		
		this.cargarCombosFrameForeignKeyCargoGrupo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCargoGrupo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCargoGrupo();
		}
	}
	
	
	
	public void jButtonNuevoCargoGrupoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cargogrupoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCargoGrupo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
			
			
			if(jTableDatosCargoGrupo.getRowCount()>=1) {
				jTableDatosCargoGrupo.removeRowSelectionInterval(0, jTableDatosCargoGrupo.getRowCount()-1);						
			}
			
			this.isEsNuevoCargoGrupo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCargoGrupo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCargoGrupo(true);			
			//this.cargogrupo=new CargoGrupo();
			//this.cargogrupo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCargoGrupo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCargoGrupo() ;
			
			if(CargoGrupoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCargoGrupo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cargogrupo);	
			this.actualizarInformacion("INFO_PADRE",false,this.cargogrupo);				
			
			CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
			
			if(this.cargogrupoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CargoGrupo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCargoGrupoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CargoGrupo> cargogruposSeleccionados=new ArrayList<CargoGrupo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCargoGrupo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCargoGrupo.getSelectedRows().length;			
			}
			
			cargogruposSeleccionados=this.getCargoGruposSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCargoGrupo--;			
				//CargoGrupo cargogrupoAux= new CargoGrupo();			
				//cargogrupoAux.setId(this.iIdNuevoCargoGrupo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CargoGrupo cargogrupoOrigen=new CargoGrupo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CargoGrupo cargogrupoOrigen : cargogruposSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cargogrupoOrigen =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargogrupoOrigen =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCargoGrupo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cargogrupo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCargoGrupo(cargogrupoOrigen,this.cargogrupo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCargoGrupo(this.cargogrupo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cargogrupoLogic.getCargoGrupos().add(this.cargogrupoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cargogrupos.add(this.cargogrupoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCargoGrupo(false);
				
				this.jTableDatosCargoGrupo.setRowSelectionInterval(this.getIndiceNuevoCargoGrupo(), this.getIndiceNuevoCargoGrupo());
				
				int iLastRow =  this.jTableDatosCargoGrupo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCargoGrupo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCargoGrupo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCargoGrupo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCargoGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CargoGrupo> cargogruposSeleccionados=new ArrayList<CargoGrupo>();									
		
			CargoGrupo cargogrupoOrigen=new CargoGrupo();
			CargoGrupo cargogrupoDestino=new CargoGrupo();
				
			cargogruposSeleccionados=this.getCargoGruposSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCargoGrupo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cargogruposSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCargoGrupo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargogrupoOrigen =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cargogrupoOrigen =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargogrupoDestino =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cargogrupoDestino =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cargogrupoOrigen =cargogruposSeleccionados.get(0);
				cargogrupoDestino =cargogruposSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCargoGrupo(cargogrupoOrigen,cargogrupoDestino,true,false);
				
				cargogrupoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cargogrupoDestino,cargogrupoLogic.getCargoGrupos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cargogrupoDestino,cargogrupos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCargoGrupo(false);
				
				//this.jTableDatosCargoGrupo.setRowSelectionInterval(this.getIndiceNuevoCargoGrupo(), this.getIndiceNuevoCargoGrupo());
				
				int iLastRow =  this.jTableDatosCargoGrupo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCargoGrupo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCargoGrupo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCargoGrupo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCargoGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCargoGrupo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCargoGrupo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCargoGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCargoGrupo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCargoGrupo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCargoGrupo.setVisible(!isVisible);
			this.jPanelPaginacionCargoGrupo.setVisible(!isVisible);
			this.jPanelAccionesCargoGrupo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCargoGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCargoGrupo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCargoGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCargoGrupo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCargoGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCargoGrupo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCargoGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCargoGrupo();
			
			this.abrirFrameOrderByCargoGrupo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCargoGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCargoGrupo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCargoGrupo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCargoGrupo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCargoGrupo.isMaximum()) {
					this.jInternalFrameDetalleFormCargoGrupo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCargoGrupo.setSize(this.jInternalFrameDetalleFormCargoGrupo.iWidthFormulario,this.jInternalFrameDetalleFormCargoGrupo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCargoGrupo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCargoGrupo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCargoGrupo.isMaximum()) {
						this.jInternalFrameDetalleFormCargoGrupo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCargoGrupo.jContentPaneDetalleCargoGrupo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCargoGrupo.jTabbedPaneRelacionesCargoGrupo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCargoGrupo.jContentPaneDetalleCargoGrupo.getWidth(),CargoGrupoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCargoGrupo.jTabbedPaneRelacionesCargoGrupo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCargoGrupo.jContentPaneDetalleCargoGrupo.getWidth(),CargoGrupoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCargoGrupo.jTabbedPaneRelacionesCargoGrupo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCargoGrupo.jContentPaneDetalleCargoGrupo.getWidth(),CargoGrupoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CargoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCargo();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCargoGrupo.setVisible(true);
	        this.jInternalFrameDetalleFormCargoGrupo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCargoGrupo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCargoGrupo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCargoGrupo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCargoGrupo,false,this);
				} else {
					this.jInternalFrameOrderByCargoGrupo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCargoGrupo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCargoGrupo);
				this.jInternalFrameOrderByCargoGrupo.setVisible(false);
				this.jInternalFrameOrderByCargoGrupo.setSelected(false);
				
				this.jInternalFrameOrderByCargoGrupo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCargoGrupo"));
				
				this.inicializarActualizarBindingTablaOrderByCargoGrupo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCargoGrupo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCargoGrupo==null) {
				
				this.jInternalFrameImportacionCargoGrupo=new ImportacionJInternalFrame(CargoGrupoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCargoGrupo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCargoGrupo);
				this.jInternalFrameImportacionCargoGrupo.setVisible(false);
				this.jInternalFrameImportacionCargoGrupo.setSelected(false);


				this.jInternalFrameImportacionCargoGrupo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCargoGrupo"));
				this.jInternalFrameImportacionCargoGrupo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCargoGrupo"));
				this.jInternalFrameImportacionCargoGrupo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCargoGrupo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCargoGrupo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCargoGrupo==null) {
				this.jInternalFrameReporteDinamicoCargoGrupo=new ReporteDinamicoJInternalFrame(CargoGrupoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCargoGrupo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCargoGrupo);
				this.jInternalFrameReporteDinamicoCargoGrupo.setVisible(false);
				this.jInternalFrameReporteDinamicoCargoGrupo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCargoGrupo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCargoGrupo"));
				this.jInternalFrameReporteDinamicoCargoGrupo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCargoGrupo"));
				this.jInternalFrameReporteDinamicoCargoGrupo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCargoGrupo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCargoGrupo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCargo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCargoGrupo.jContentPaneDetalleCargoGrupo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleCargoGrupo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCargoGrupo);
			
	       	this.jInternalFrameDetalleFormCargoGrupo.setVisible(false);
	        this.jInternalFrameDetalleFormCargoGrupo.setSelected(false);
			
			//this.jInternalFrameDetalleFormCargoGrupo.dispose();
			//this.jInternalFrameDetalleFormCargoGrupo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCargoGrupo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCargoGrupo.setVisible(true);
	        this.jInternalFrameReporteDinamicoCargoGrupo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCargoGrupo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCargoGrupo.setVisible(true);
	        this.jInternalFrameImportacionCargoGrupo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCargoGrupo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCargoGrupo.setVisible(true);
	        this.jInternalFrameOrderByCargoGrupo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCargoGrupo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCargoGrupo.setVisible(false);
	        this.jInternalFrameOrderByCargoGrupo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCargoGrupo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCargoGrupo.setVisible(false);
	        this.jInternalFrameReporteDinamicoCargoGrupo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCargoGrupo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCargoGrupo.setVisible(false);
	        this.jInternalFrameImportacionCargoGrupo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCargoGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCargoGrupo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCargoGrupo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCargoGrupo(true);
			//this.isEsNuevoCargoGrupo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupo =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cargogrupo =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCargoGrupo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCargoGrupo(false) ;
			
			if(cargogrupoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargoSessionBean.getEsGuardarRelacionado() && CargoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCargoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(CargoGrupoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCargoGrupo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCargoGrupo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCargoGrupoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupo =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargogrupo =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCargoGrupo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCargoGrupo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCargoGrupo(true);
			//this.isEsNuevoCargoGrupo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupo =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cargogrupo =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cargogrupo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCargoGrupo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCargoGrupo(false) ;
			
			if(CargoGrupoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCargoGrupo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCargoGrupo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarCargoGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCargoGrupo(false);
			
			//if(!this.isEsNuevoCargoGrupo) {								
				int intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupo =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargogrupo =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CargoGrupoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCargoGrupo(this.cargogrupo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargoGrupo(this.cargogrupo);
				
			}
			
			if(this.permiteMantenimiento(this.cargogrupo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCargoGrupo=true;
					this.inicializarActualizarBindingTablaCargoGrupo(false);
					this.isEsNuevoCargoGrupo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCargoGrupo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCargoGrupo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCargoGrupo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCargoGrupo(false);
				
				this.habilitarDeshabilitarControlesCargoGrupo(false);
			
												
				
				if(CargoGrupoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCargoGrupo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCargoGrupoActionPerformed(evt,cargogrupoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCargoGrupo(this.cargogrupo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCargoGrupo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cargogrupoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cargogrupo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CargoGrupo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoGrupo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCargoGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupo =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				this.cargogrupo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cargogrupo =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				this.cargogrupo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cargogrupo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CargoGrupoModel) this.jTableDatosCargoGrupo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCargoGrupo=true;
				this.inicializarActualizarBindingTablaCargoGrupo(false);
				this.isEsNuevoCargoGrupo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCargoGrupo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCargoGrupo(false);
				
				this.habilitarDeshabilitarControlesCargoGrupo(false);
				
				
				
				if(CargoGrupoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCargoGrupo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCargoGrupoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCargoGrupo.getRowCount()>=1) {
				jTableDatosCargoGrupo.removeRowSelectionInterval(0, jTableDatosCargoGrupo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCargoGrupo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCargoGrupo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCargoGrupo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCargoGrupo(false) ;
			
			this.isEsNuevoCargoGrupo=false;
			
			if(CargoGrupoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCargoGrupo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCargoGrupoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCargoGrupo(false);
				
				//SI ES MANUAL
				if(CargoGrupoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCargoGrupo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCargoGrupoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCargoGrupo--;			
			//CargoGrupo cargogrupoAux= new CargoGrupo();			
			//cargogrupoAux.setId(this.iIdNuevoCargoGrupo);
			
			if(this.jInternalFrameDetalleFormCargoGrupo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCargoGrupo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCargoGrupo(this.cargogrupo);
			
			this.cargogrupo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cargogrupoLogic.getCargoGrupos().add(this.cargogrupoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cargogrupos.add(this.cargogrupoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCargoGrupo(false);
			
			this.jTableDatosCargoGrupo.setRowSelectionInterval(this.getIndiceNuevoCargoGrupo(), this.getIndiceNuevoCargoGrupo());
			
			int iLastRow =  this.jTableDatosCargoGrupo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCargoGrupo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCargoGrupo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCargoGrupo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCargoGrupoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCargoGrupo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCargoGrupo(false);
			
			//SI ES MANUAL
			if(CargoGrupoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCargoGrupo();
			}
			
			//this.abrirFrameTreeCargoGrupo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCargoGrupoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Cargo GrupoS ?", "MANTENIMIENTO DE Cargo Grupo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCargoGrupo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCargoGrupo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cargogrupoReturnGeneral=cargogrupoLogic.procesarImportacionCargoGruposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cargogrupoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCargoGrupoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCargoGrupoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCargoGrupo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCargoGrupo.setFileImportacion(this.jInternalFrameImportacionCargoGrupo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCargoGrupo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCargoGrupo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCargoGrupo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCargoGrupo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCargoGrupoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CargoGrupo> cargogruposSeleccionados=new ArrayList<CargoGrupo>();		

		cargogruposSeleccionados=this.getCargoGruposSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCargoGrupo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCargoGrupo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CargoGrupoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CargoGrupoBaseDesign.jrxml";
			
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
			
			this.generarReporteCargoGrupos("Todos",cargogruposSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargogrupoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo Grupo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCargoGrupo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCargoGrupo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CargoGrupoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargoGrupoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargoGrupoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoCargoGrupo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCargoGrupo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCargoGrupo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CargoGrupoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CargoGrupoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CargoGrupoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCargoGrupo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CargoGrupoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CargoGrupoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CargoGrupoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCargoGrupo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCargoGrupo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CargoGrupoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CargoGrupoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CargoGrupoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoCargoGrupoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CargoGrupo> cargogruposSeleccionados=new ArrayList<CargoGrupo>();		
		
		cargogruposSeleccionados=this.getCargoGruposSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargogrupo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CargoGrupos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCargoGrupo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCargoGrupo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CargoGrupoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoGrupoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CargoGrupo cargogrupo:cargogruposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargogrupo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargoGrupoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoGrupoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CargoGrupo cargogrupo:cargogruposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargogrupo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargoGrupoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoGrupoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(CargoGrupo cargogrupo:cargogruposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargogrupo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelCargoGrupo(row);				
			//	iRow++;
			//}				
			
			//for(CargoGrupo cargogrupoAux:cargogruposSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCargoGrupo(cargogrupoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargogrupoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo Grupo",JOptionPane.INFORMATION_MESSAGE);
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
				this.cargogrupoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCargoGrupo(false);
			
			//SI ES MANUAL
			if(CargoGrupoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCargoGrupo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCargoGrupoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCargoGrupo(false);
			
			//SI ES MANUAL
			if(CargoGrupoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCargoGrupo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCargoGrupoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCargoGrupo(false);
			
			//SI ES MANUAL
			if(CargoGrupoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCargoGrupo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCargoGrupo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCargoGrupo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCargoGrupo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCargoGrupo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCargoGrupo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCargoGrupo.setMinimumSize(dimensionMinimum);
		this.jTableDatosCargoGrupo.setMaximumSize(dimensionMaximum);
		this.jTableDatosCargoGrupo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCargoGrupo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCargoGrupo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCargoGrupo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCargoGrupo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCargoGrupo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCargoGrupo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCargoGrupo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCargoGrupo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CargoGrupoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CargoGrupoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCargoGrupo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCargoGrupo();
		
		this.inicializarActualizarBindingBotonesManualCargoGrupo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCargoGrupo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCargoGrupo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCargoGrupo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCargoGrupo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCargoGrupo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCargoGrupo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCargoGrupo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCargoGrupo.jCheckBoxPostAccionNuevoCargoGrupo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCargoGrupo.jCheckBoxPostAccionSinCerrarCargoGrupo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCargoGrupo.jCheckBoxPostAccionSinMensajeCargoGrupo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCargoGrupo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCargoGrupo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCargoGrupo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
				this.jInternalFrameDetalleFormCargoGrupo.jCheckBoxPostAccionNuevoCargoGrupo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCargoGrupo.jCheckBoxPostAccionSinCerrarCargoGrupo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCargoGrupo.jCheckBoxPostAccionSinMensajeCargoGrupo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCargoGrupo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCargoGrupo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCargoGrupo.jComboBoxTiposAccionesFormularioCargoGrupo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCargoGrupo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCargoGrupo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCargoGrupo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCargoGrupo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCargoGrupo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCargoGrupo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCargoGrupo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCargoGrupo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCargoGrupo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCargoGrupo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCargoGrupo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCargoGrupo(Boolean esInicializar) throws Exception {
		try	{	
			if(CargoGrupoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCargoGrupo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCargoGrupo() throws Exception {
		try	{
			if(CargoGrupoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCargoGrupo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCargoGrupo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCargoGrupo.jComboBoxTiposAccionesFormularioCargoGrupo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCargoGrupo.jComboBoxTiposAccionesFormularioCargoGrupo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCargoGrupo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCargoGrupo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCargoGrupo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCargoGrupo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCargoGrupo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCargoGrupo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCargoGrupo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCargoGrupo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCargoGrupo.addItem(reporte);
			}
			
			
			if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCargoGrupo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCargoGrupo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCargoGrupo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCargoGrupo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCargoGrupo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCargoGrupo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCargoGrupo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCargoGrupo.jComboBoxTiposAccionesFormularioCargoGrupo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCargoGrupo.jComboBoxTiposAccionesFormularioCargoGrupo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCargoGrupo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCargoGrupo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCargoGrupo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCargoGrupo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCargoGrupo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCargoGrupo!=null) {
				this.jInternalFrameReporteDinamicoCargoGrupo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCargoGrupo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCargoGrupo!=null) {
				this.jInternalFrameReporteDinamicoCargoGrupo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCargoGrupo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCargoGrupo!=null) {
				
				if(this.jInternalFrameReporteDinamicoCargoGrupo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCargoGrupo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCargoGrupo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCargoGrupo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCargoGrupo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCargoGrupo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCargoGrupo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCargoGrupo(Boolean esInicializar) throws Exception {				
		if(CargoGrupoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCargoGrupo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCargoGrupo() throws Exception {
		this.inicializarActualizarBindingTablaCargoGrupo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCargoGrupo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCargoGrupo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCargoGrupo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCargoGrupo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CargoGrupoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCargoGrupo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCargoGrupo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CargoGrupoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCargoGrupoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargoGrupoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CargoGrupoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCargoGrupo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCargoGrupo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CargoGrupoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCargoGrupo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCargoGrupo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cargogrupoLogic.getCargoGrupos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cargogrupos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CargoGrupoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCargoGrupo.setModel(new CargoGrupoModel(this.cargogrupoLogic.getCargoGrupos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCargoGrupo.setModel(new CargoGrupoModel(this.cargogrupos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCargoGrupo!=null && this.jInternalFrameOrderByCargoGrupo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCargoGrupo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCargoGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargoGrupo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CargoGrupoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO,cargogrupoConstantesFunciones.resaltarSeleccionarCargoGrupo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO,cargogrupoConstantesFunciones.resaltarSeleccionarCargoGrupo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCargoGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargoGrupo,CargoGrupoConstantesFunciones.LABEL_ID));

		if(this.cargogrupoConstantesFunciones.mostraridCargoGrupo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoGrupoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cargogrupoConstantesFunciones.resaltaridCargoGrupo,this.cargogrupoConstantesFunciones.activaridCargoGrupo,this,true,"idCargoGrupo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargogrupoConstantesFunciones.resaltaridCargoGrupo,this.cargogrupoConstantesFunciones.activaridCargoGrupo,this,true,"idCargoGrupo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargoGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargoGrupo,CargoGrupoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.cargogrupoConstantesFunciones.mostrarid_empresaCargoGrupo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoGrupoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.cargogrupoConstantesFunciones.resaltarid_empresaCargoGrupo,this,this.cargogrupoConstantesFunciones.activarid_empresaCargoGrupo));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.cargogrupoConstantesFunciones.resaltarid_empresaCargoGrupo,this,this.cargogrupoConstantesFunciones.activarid_empresaCargoGrupo,false,"id_empresaCargoGrupo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargoGrupoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargoGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargoGrupo,CargoGrupoConstantesFunciones.LABEL_CODIGO));

		if(this.cargogrupoConstantesFunciones.mostrarcodigoCargoGrupo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoGrupoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cargogrupoConstantesFunciones.resaltarcodigoCargoGrupo,this.cargogrupoConstantesFunciones.activarcodigoCargoGrupo,this,true,"codigoCargoGrupo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargogrupoConstantesFunciones.resaltarcodigoCargoGrupo,this.cargogrupoConstantesFunciones.activarcodigoCargoGrupo,this,true,"codigoCargoGrupo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargoGrupoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargoGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargoGrupo,CargoGrupoConstantesFunciones.LABEL_NOMBRE));

		if(this.cargogrupoConstantesFunciones.mostrarnombreCargoGrupo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoGrupoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cargogrupoConstantesFunciones.resaltarnombreCargoGrupo,this.cargogrupoConstantesFunciones.activarnombreCargoGrupo,this,true,"nombreCargoGrupo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargogrupoConstantesFunciones.resaltarnombreCargoGrupo,this.cargogrupoConstantesFunciones.activarnombreCargoGrupo,this,true,"nombreCargoGrupo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargoGrupoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCargo && this.cargogrupoConstantesFunciones.mostrarCargoCargoGrupo && !CargoGrupoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cargos");
				tableColumn.setHeaderValue("Cargos");
				tableColumn.setCellRenderer(new CargoTableCell(cargogrupoConstantesFunciones.resaltarCargoCargoGrupo,this,this.cargogrupoConstantesFunciones.activarCargoCargoGrupo));
				tableColumn.setCellEditor(new CargoTableCell(cargogrupoConstantesFunciones.resaltarCargoCargoGrupo,this,this.cargogrupoConstantesFunciones.activarCargoCargoGrupo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCargoGrupo.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cargogrupoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cargogrupoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCargoGrupo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cargogrupoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cargogrupoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCargoGrupo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCargoGrupo && this.isPermisoGuardarCambiosCargoGrupo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cargogrupoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cargogrupoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCargoGrupo.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.cargogrupoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosCargoGrupo.addColumn(tableColumn);
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
			
			this.jTableDatosCargoGrupo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCargoGrupo && this.isPermisoGuardarCambiosCargoGrupo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.cargogrupoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCargoGrupo && this.isPermisoGuardarCambiosCargoGrupo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCargoGrupo.moveColumn(this.jTableDatosCargoGrupo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCargoGrupo.moveColumn(this.jTableDatosCargoGrupo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.cargogrupoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosCargoGrupo.moveColumn(this.jTableDatosCargoGrupo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCargoGrupo.moveColumn(this.jTableDatosCargoGrupo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCargoGrupo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCargoGrupo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCargoGrupo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CargoGrupoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCargoGrupo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCargoGrupo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CargoGrupoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CargoGrupoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCargoGrupo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCargoGrupo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCargoGrupo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cargogrupoLogic.getCargoGrupos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cargogrupos.size()-1;
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
		//this.jTableDatosCargoGrupo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCargoGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCargoGrupo();
			
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
				
				//this.isEsNuevoCargoGrupo=false;
					
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
			
				if(this.cargogrupoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCargoGrupo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCargoGrupo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCargoGrupo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupo =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargogrupo =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cargogrupo.getsType().equals("DUPLICADO")
				   || this.cargogrupo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCargoGrupo=true;
				
				} else {
					this.isEsNuevoCargoGrupo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
					if(this.cargogrupo.getId()>=0 && !this.cargogrupo.getIsNew()) {						
						this.isEsNuevoCargoGrupo=false;
						
					} else {
						this.isEsNuevoCargoGrupo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCargoGrupo(esRelaciones);						
				
				this.seleccionarCargoGrupo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cargogrupo.getId()<0) {
					this.isEsNuevoCargoGrupo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCargoGrupo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCargoGrupo(evt,rowIndex);
				}	
				
				if(this.cargogrupoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CargoGrupo: " + this.dDif); 
					}
				}								
				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCargoGrupo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cargogrupo)) {
					if(this.cargogrupo.getId()>0) {
						this.cargogrupo.setIsDeleted(true);
						
						this.cargogruposEliminados.add(this.cargogrupo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cargogrupoLogic.getCargoGrupos().remove(this.cargogrupo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cargogrupos.remove(this.cargogrupo);				
					}
					
					
					((CargoGrupoModel) this.jTableDatosCargoGrupo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCargoGrupo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCargoGrupo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCargoGrupo) {
			
			if(this.jInternalFrameDetalleFormCargoGrupo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCargoGrupo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCargoGrupo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupo =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargogrupo =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CargoGrupoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCargoGrupo(this.cargogrupo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.cargogrupoConstantesFunciones.cargarid_empresaCargoGrupo || this.cargogrupoConstantesFunciones.event_dependid_empresaCargoGrupo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.cargogrupo.getid_empresa());
									//this.inicializarActualizarBindingCargoGrupo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(cargogrupo.getEmpresa()!=null) {
							this.empresasForeignKey.add(cargogrupo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.cargogrupo.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCargoGrupo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCargoGrupo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCargoGrupo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCargoGrupo(CargoGrupo cargogrupo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCargoGrupo(cargogrupo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCargoGrupo(CargoGrupo cargogrupo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCargoGrupo(cargogrupo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCargoGrupo(cargogrupo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCargoGrupo(cargogrupo);
	}
	
	public void setVariablesObjetoActualToFormularioCargoGrupo(CargoGrupo cargogrupo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCargoGrupo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCargoGrupo.jLabelidCargoGrupo.setText(cargogrupo.getId().toString());
			this.jInternalFrameDetalleFormCargoGrupo.jTextFieldcodigoCargoGrupo.setText(cargogrupo.getcodigo());
			this.jInternalFrameDetalleFormCargoGrupo.jTextAreanombreCargoGrupo.setText(cargogrupo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CargoGrupo cargogrupoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cargogrupoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CargoGrupo cargogrupoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cargogrupoLocal=this.cargogrupo;
			} else {
				cargogrupoLocal=this.cargogrupoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cargogrupoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCargoGrupo(cargogrupoLocal,true);
					
					if(cargogrupoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cargogrupoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cargogrupoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCargoGrupo(CargoGrupo cargogrupo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCargoGrupo(cargogrupo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCargoGrupo(cargogrupo);
	}
	
	public void setVariablesFormularioToObjetoActualCargoGrupo(CargoGrupo cargogrupo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCargoGrupo(cargogrupo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCargoGrupo(CargoGrupo cargogrupo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCargoGrupo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCargoGrupo.jLabelidCargoGrupo.getText()==null || this.jInternalFrameDetalleFormCargoGrupo.jLabelidCargoGrupo.getText()=="" || this.jInternalFrameDetalleFormCargoGrupo.jLabelidCargoGrupo.getText()=="Id") {
				this.jInternalFrameDetalleFormCargoGrupo.jLabelidCargoGrupo.setText("0");
			}

			if(conColumnasBase) {cargogrupo.setId(Long.parseLong(this.jInternalFrameDetalleFormCargoGrupo.jLabelidCargoGrupo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargoGrupoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargoGrupo.jLabelIdCargoGrupo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargogrupo.setcodigo(this.jInternalFrameDetalleFormCargoGrupo.jTextFieldcodigoCargoGrupo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargoGrupoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargoGrupo.jLabelcodigoCargoGrupo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargogrupo.setnombre(this.jInternalFrameDetalleFormCargoGrupo.jTextAreanombreCargoGrupo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargoGrupoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargoGrupo.jLabelnombreCargoGrupo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCargoGrupo(CargoGrupo cargogrupoBean,CargoGrupo cargogrupo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCargoGrupo(CargoGrupo cargogrupoOrigen,CargoGrupo cargogrupo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cargogrupoOrigen.getId()!=null && !cargogrupoOrigen.getId().equals(0L))) {cargogrupo.setId(cargogrupoOrigen.getId());}}
			if(conDefault || (!conDefault && cargogrupoOrigen.getcodigo()!=null && !cargogrupoOrigen.getcodigo().equals(""))) {cargogrupo.setcodigo(cargogrupoOrigen.getcodigo());}
			if(conDefault || (!conDefault && cargogrupoOrigen.getnombre()!=null && !cargogrupoOrigen.getnombre().equals(""))) {cargogrupo.setnombre(cargogrupoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCargoGrupo(CargoGrupo cargogrupo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCargoGrupo.jLabelidCargoGrupo.setText(cargogrupo.getId().toString());
			this.jInternalFrameDetalleFormCargoGrupo.jTextFieldcodigoCargoGrupo.setText(cargogrupo.getcodigo());
			this.jInternalFrameDetalleFormCargoGrupo.jTextAreanombreCargoGrupo.setText(cargogrupo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCargoGrupo(CargoGrupoBean cargogrupoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCargoGrupo.jLabelidCargoGrupo.setText(cargogrupoBean.getId().toString());
			this.jInternalFrameDetalleFormCargoGrupo.jTextFieldcodigoCargoGrupo.setText(cargogrupoBean.getcodigo());
			this.jInternalFrameDetalleFormCargoGrupo.jTextAreanombreCargoGrupo.setText(cargogrupoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCargoGrupo(CargoGrupoParameterReturnGeneral cargogrupoReturnGeneral,CargoGrupoBean cargogrupoBean,Boolean conDefault) throws Exception { 
		try {
			CargoGrupo cargogrupoLocal=new CargoGrupo();
			
			cargogrupoLocal=cargogrupoReturnGeneral.getCargoGrupo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cargogrupoLocal.getId()!=null && !cargogrupoLocal.getId().equals(0L))) {cargogrupoBean.setId(cargogrupoLocal.getId());}}
			if(conDefault || (!conDefault && cargogrupoLocal.getcodigo()!=null && !cargogrupoLocal.getcodigo().equals(""))) {cargogrupoBean.setcodigo(cargogrupoLocal.getcodigo());}
			if(conDefault || (!conDefault && cargogrupoLocal.getnombre()!=null && !cargogrupoLocal.getnombre().equals(""))) {cargogrupoBean.setnombre(cargogrupoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCargoGrupoGenerico(Long idCargoGrupoSeleccionado,JComboBox jComboBoxCargoGrupo,List<CargoGrupo> cargogruposLocal)throws Exception {
		try {
			CargoGrupo  cargogrupoTemp=null;

			for(CargoGrupo cargogrupoAux:cargogruposLocal) {
				if(cargogrupoAux.getId()!=null && cargogrupoAux.getId().equals(idCargoGrupoSeleccionado)) {
					cargogrupoTemp=cargogrupoAux;
					break;
				}
			}

			jComboBoxCargoGrupo.setSelectedItem(cargogrupoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCargoGrupoGenerico(JComboBox jComboBoxCargoGrupo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCargoGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCargoGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCargoGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCargoGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCargoGrupo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCargoGrupo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCargoGrupo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCargoGrupo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCargoGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCargoGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Cargo")) {
			jButtonCargoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cargogrupo=(CargoGrupo) cargogrupoLogic.getCargoGrupos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cargogrupo =(CargoGrupo) cargogrupos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cargogrupo.getIsNew() && !cargogrupo.getIsChanged() && !cargogrupo.getIsDeleted()) {
				sDescripcion=cargogrupo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cargogrupo.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CargoGrupo cargogrupoRow=new CargoGrupo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cargogrupoRow=(CargoGrupo) cargogrupoLogic.getCargoGrupos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cargogrupoRow=(CargoGrupo) cargogrupos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonCargoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,CargoGrupo cargogrupo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCargoGrupo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargogrupo = (CargoGrupo)this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.cargogrupo = (CargoGrupo)this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(cargogrupo!=null) {
						this.cargogrupo = cargogrupo;
					} else {
						this.cargogrupo = new CargoGrupo();
					}
				}

				if(this.isTienePermisosCargo && this.permiteMantenimiento(this.cargogrupo)) {
					CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFramePopup=new CargoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cargoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFramePopup;
					} else {
						cargoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame;
					}

					List<CargoGrupo> cargogrupos=new ArrayList<CargoGrupo>();
					cargogrupos.add(this.cargogrupo);
					if(!esRelacionado) {
						//cargoBeanSwingJInternalFrame.cargoSessionBean.setConGuardarRelaciones(false);
						//cargoBeanSwingJInternalFrame.cargoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cargoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCargoGrupo.cargarCargoBeanSwingJInternalFrame(cargogrupos,this.cargogrupo,cargoBeanSwingJInternalFrame,/*conInicializar,*/cargoBeanSwingJInternalFrame.cargoSessionBean.getConGuardarRelaciones(),cargoBeanSwingJInternalFrame.cargoSessionBean.getEsGuardarRelacionado());
					cargoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cargoBeanSwingJInternalFrame.actualizarEstadoPanelsCargo("no_relacionado");

						cargoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CargoConstantesFunciones.ITAMANIOFILATABLA + (CargoConstantesFunciones.ITAMANIOFILATABLA/2));

						cargoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCargoGrupo=(TitledBorder)this.jScrollPanelDatosCargoGrupo.getBorder();
						TitledBorder titledBorderCargo=(TitledBorder)cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.getBorder();

						titledBorderCargo.setTitle(titledBorderCargoGrupo.getTitle() + " -> Cargo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cargoBeanSwingJInternalFrame);
						}

						cargoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cargoBeanSwingJInternalFrame);

						cargoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.cargogrupoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cargo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCargoGrupo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCargoGrupo.setVisible((this.isVisibilidadCeldaNuevoCargoGrupo && this.isPermisoNuevoCargoGrupo));			
			this.jButtonDuplicarCargoGrupo.setVisible((this.isVisibilidadCeldaDuplicarCargoGrupo && this.isPermisoDuplicarCargoGrupo));			
			this.jButtonCopiarCargoGrupo.setVisible((this.isVisibilidadCeldaCopiarCargoGrupo && this.isPermisoCopiarCargoGrupo));
			this.jButtonVerFormCargoGrupo.setVisible((this.isVisibilidadCeldaVerFormCargoGrupo && this.isPermisoVerFormCargoGrupo));
			
			this.jButtonAbrirOrderByCargoGrupo.setVisible((this.isVisibilidadCeldaOrdenCargoGrupo && this.isPermisoOrdenCargoGrupo));			
			
			this.jButtonNuevoRelacionesCargoGrupo.setVisible((this.isVisibilidadCeldaNuevoRelacionesCargoGrupo && this.isPermisoNuevoCargoGrupo));			
			this.jButtonNuevoGuardarCambiosCargoGrupo.setVisible((this.isVisibilidadCeldaNuevoCargoGrupo && this.isPermisoNuevoCargoGrupo && this.isPermisoGuardarCambiosCargoGrupo));
			
			if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
			this.jInternalFrameDetalleFormCargoGrupo.jButtonModificarCargoGrupo.setVisible((this.isVisibilidadCeldaModificarCargoGrupo && this.isPermisoActualizarCargoGrupo));	
			this.jInternalFrameDetalleFormCargoGrupo.jButtonActualizarCargoGrupo.setVisible((this.isVisibilidadCeldaActualizarCargoGrupo && this.isPermisoActualizarCargoGrupo));	
			this.jInternalFrameDetalleFormCargoGrupo.jButtonEliminarCargoGrupo.setVisible((this.isVisibilidadCeldaEliminarCargoGrupo && this.isPermisoEliminarCargoGrupo));
			this.jInternalFrameDetalleFormCargoGrupo.jButtonCancelarCargoGrupo.setVisible(this.isVisibilidadCeldaCancelarCargoGrupo);							
			this.jInternalFrameDetalleFormCargoGrupo.jButtonGuardarCambiosCargoGrupo.setVisible((this.isVisibilidadCeldaGuardarCargoGrupo && this.isPermisoGuardarCambiosCargoGrupo));			
			
			}
						
			this.jButtonGuardarCambiosTablaCargoGrupo.setVisible((this.isVisibilidadCeldaGuardarCambiosCargoGrupo && this.isPermisoGuardarCambiosCargoGrupo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCargoGrupo.setVisible((this.isVisibilidadCeldaNuevoCargoGrupo && this.isPermisoNuevoCargoGrupo));						
			this.jButtonDuplicarToolBarCargoGrupo.setVisible((this.isVisibilidadCeldaDuplicarCargoGrupo && this.isPermisoDuplicarCargoGrupo));						
			this.jButtonCopiarToolBarCargoGrupo.setVisible((this.isVisibilidadCeldaCopiarCargoGrupo && this.isPermisoCopiarCargoGrupo));			
			this.jButtonVerFormToolBarCargoGrupo.setVisible((this.isVisibilidadCeldaVerFormCargoGrupo && this.isPermisoVerFormCargoGrupo));			
			this.jButtonAbrirOrderByToolBarCargoGrupo.setVisible((this.isVisibilidadCeldaOrdenCargoGrupo && this.isPermisoOrdenCargoGrupo));
			this.jButtonNuevoRelacionesToolBarCargoGrupo.setVisible((this.isVisibilidadCeldaNuevoRelacionesCargoGrupo && this.isPermisoNuevoCargoGrupo));			
			this.jButtonNuevoGuardarCambiosToolBarCargoGrupo.setVisible((this.isVisibilidadCeldaNuevoCargoGrupo && this.isPermisoNuevoCargoGrupo && this.isPermisoGuardarCambiosCargoGrupo));			
			
			if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
			this.jInternalFrameDetalleFormCargoGrupo.jButtonModificarToolBarCargoGrupo.setVisible((this.isVisibilidadCeldaModificarCargoGrupo && this.isPermisoActualizarCargoGrupo));	
			this.jInternalFrameDetalleFormCargoGrupo.jButtonActualizarToolBarCargoGrupo.setVisible((this.isVisibilidadCeldaActualizarCargoGrupo  && this.isPermisoActualizarCargoGrupo));	
			this.jInternalFrameDetalleFormCargoGrupo.jButtonEliminarToolBarCargoGrupo.setVisible((this.isVisibilidadCeldaEliminarCargoGrupo && this.isPermisoEliminarCargoGrupo));
			this.jInternalFrameDetalleFormCargoGrupo.jButtonCancelarToolBarCargoGrupo.setVisible(this.isVisibilidadCeldaCancelarCargoGrupo);				
			this.jInternalFrameDetalleFormCargoGrupo.jButtonGuardarCambiosToolBarCargoGrupo.setVisible((this.isVisibilidadCeldaGuardarCargoGrupo && this.isPermisoGuardarCambiosCargoGrupo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCargoGrupo.setVisible((this.isVisibilidadCeldaGuardarCambiosCargoGrupo && this.isPermisoGuardarCambiosCargoGrupo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCargoGrupo.setVisible((this.isVisibilidadCeldaNuevoCargoGrupo && this.isPermisoNuevoCargoGrupo));			
			this.jMenuItemDuplicarCargoGrupo.setVisible((this.isVisibilidadCeldaDuplicarCargoGrupo && this.isPermisoDuplicarCargoGrupo));			
			this.jMenuItemCopiarCargoGrupo.setVisible((this.isVisibilidadCeldaCopiarCargoGrupo && this.isPermisoCopiarCargoGrupo));			
			this.jMenuItemVerFormCargoGrupo.setVisible((this.isVisibilidadCeldaVerFormCargoGrupo && this.isPermisoVerFormCargoGrupo));			
			this.jMenuItemAbrirOrderByCargoGrupo.setVisible((this.isVisibilidadCeldaOrdenCargoGrupo && this.isPermisoOrdenCargoGrupo));			
			//this.jMenuItemMostrarOcultarCargoGrupo.setVisible((this.isVisibilidadCeldaOrdenCargoGrupo && this.isPermisoOrdenCargoGrupo));
			this.jMenuItemDetalleAbrirOrderByCargoGrupo.setVisible((this.isVisibilidadCeldaOrdenCargoGrupo && this.isPermisoOrdenCargoGrupo));			
			//this.jMenuItemDetalleMostrarOcultarCargoGrupo.setVisible((this.isVisibilidadCeldaOrdenCargoGrupo && this.isPermisoOrdenCargoGrupo));			
			this.jMenuItemNuevoRelacionesCargoGrupo.setVisible((this.isVisibilidadCeldaNuevoRelacionesCargoGrupo && this.isPermisoNuevoCargoGrupo));			
			this.jMenuItemNuevoGuardarCambiosCargoGrupo.setVisible((this.isVisibilidadCeldaNuevoCargoGrupo && this.isPermisoNuevoCargoGrupo && this.isPermisoGuardarCambiosCargoGrupo));									
			
			if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
			this.jInternalFrameDetalleFormCargoGrupo.jMenuItemModificarCargoGrupo.setVisible((this.isVisibilidadCeldaModificarCargoGrupo && this.isPermisoActualizarCargoGrupo));	
			this.jInternalFrameDetalleFormCargoGrupo.jMenuItemActualizarCargoGrupo.setVisible((this.isVisibilidadCeldaActualizarCargoGrupo && this.isPermisoActualizarCargoGrupo));	
			this.jInternalFrameDetalleFormCargoGrupo.jMenuItemEliminarCargoGrupo.setVisible((this.isVisibilidadCeldaEliminarCargoGrupo && this.isPermisoEliminarCargoGrupo));
			this.jInternalFrameDetalleFormCargoGrupo.jMenuItemCancelarCargoGrupo.setVisible(this.isVisibilidadCeldaCancelarCargoGrupo);				
			}
			
			this.jMenuItemGuardarCambiosCargoGrupo.setVisible((this.isVisibilidadCeldaGuardarCargoGrupo && this.isPermisoGuardarCambiosCargoGrupo));						
			this.jMenuItemGuardarCambiosTablaCargoGrupo.setVisible((this.isVisibilidadCeldaGuardarCambiosCargoGrupo && this.isPermisoGuardarCambiosCargoGrupo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCargoGrupo=this.jButtonNuevoCargoGrupo.isVisible();
			this.isVisibilidadCeldaDuplicarCargoGrupo=this.jButtonDuplicarCargoGrupo.isVisible();
			this.isVisibilidadCeldaCopiarCargoGrupo=this.jButtonCopiarCargoGrupo.isVisible();
			this.isVisibilidadCeldaVerFormCargoGrupo=this.jButtonVerFormCargoGrupo.isVisible();
			
			this.isVisibilidadCeldaOrdenCargoGrupo=this.jButtonAbrirOrderByCargoGrupo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCargoGrupo=this.jButtonNuevoRelacionesCargoGrupo.isVisible();
			this.isVisibilidadCeldaModificarCargoGrupo=this.jButtonModificarCargoGrupo.isVisible();
			
			if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
			this.isVisibilidadCeldaActualizarCargoGrupo=this.jInternalFrameDetalleFormCargoGrupo.jButtonActualizarCargoGrupo.isVisible();
			this.isVisibilidadCeldaEliminarCargoGrupo=this.jInternalFrameDetalleFormCargoGrupo.jButtonEliminarCargoGrupo.isVisible();
			this.isVisibilidadCeldaCancelarCargoGrupo=this.jInternalFrameDetalleFormCargoGrupo.jButtonCancelarCargoGrupo.isVisible();
			this.isVisibilidadCeldaGuardarCargoGrupo=this.jInternalFrameDetalleFormCargoGrupo.jButtonGuardarCambiosCargoGrupo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCargoGrupo=this.jButtonGuardarCambiosTablaCargoGrupo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCargoGrupo=this.jButtonNuevoToolBarCargoGrupo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCargoGrupo=this.jButtonNuevoRelacionesToolBarCargoGrupo.isVisible();
			
			if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
			this.isVisibilidadCeldaModificarCargoGrupo=this.jInternalFrameDetalleFormCargoGrupo.jButtonModificarToolBarCargoGrupo.isVisible();
			this.isVisibilidadCeldaActualizarCargoGrupo=this.jInternalFrameDetalleFormCargoGrupo.jButtonActualizarToolBarCargoGrupo.isVisible();
			this.isVisibilidadCeldaEliminarCargoGrupo=this.jInternalFrameDetalleFormCargoGrupo.jButtonEliminarToolBarCargoGrupo.isVisible();
			this.isVisibilidadCeldaCancelarCargoGrupo=this.jInternalFrameDetalleFormCargoGrupo.jButtonCancelarToolBarCargoGrupo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCargoGrupo=this.jButtonGuardarCambiosToolBarCargoGrupo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCargoGrupo=this.jButtonGuardarCambiosTablaToolBarCargoGrupo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCargoGrupo=this.jMenuItemNuevoCargoGrupo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCargoGrupo=this.jMenuItemNuevoRelacionesCargoGrupo.isVisible();
			
			if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
			this.isVisibilidadCeldaModificarCargoGrupo=this.jInternalFrameDetalleFormCargoGrupo.jMenuItemModificarCargoGrupo.isVisible();
			this.isVisibilidadCeldaActualizarCargoGrupo=this.jInternalFrameDetalleFormCargoGrupo.jMenuItemActualizarCargoGrupo.isVisible();
			this.isVisibilidadCeldaEliminarCargoGrupo=this.jInternalFrameDetalleFormCargoGrupo.jMenuItemEliminarCargoGrupo.isVisible();
			this.isVisibilidadCeldaCancelarCargoGrupo=this.jInternalFrameDetalleFormCargoGrupo.jMenuItemCancelarCargoGrupo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCargoGrupo=this.jMenuItemGuardarCambiosCargoGrupo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCargoGrupo=this.jMenuItemGuardarCambiosTablaCargoGrupo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCargoGrupo(Boolean esInicializar) {
		if(CargoGrupoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cargogrupoSessionBean.getConGuardarRelaciones()) {
				//if(this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCargoGrupo();
			}
			
			this.inicializarActualizarBindingBotonesManualCargoGrupo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCargoGrupo() {
		this.jButtonNuevoCargoGrupo.setVisible(this.isPermisoNuevoCargoGrupo);			
		this.jButtonDuplicarCargoGrupo.setVisible(this.isPermisoDuplicarCargoGrupo);			
		this.jButtonCopiarCargoGrupo.setVisible(this.isPermisoCopiarCargoGrupo);			
		this.jButtonVerFormCargoGrupo.setVisible(this.isPermisoVerFormCargoGrupo);			
		
		this.jButtonAbrirOrderByCargoGrupo.setVisible(this.isPermisoOrdenCargoGrupo);					
		
		this.jButtonNuevoRelacionesCargoGrupo.setVisible(this.isPermisoNuevoCargoGrupo);			
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoGrupo.jButtonModificarCargoGrupo.setVisible(this.isPermisoActualizarCargoGrupo);	
			this.jInternalFrameDetalleFormCargoGrupo.jButtonActualizarCargoGrupo.setVisible(this.isPermisoActualizarCargoGrupo);	
			this.jInternalFrameDetalleFormCargoGrupo.jButtonEliminarCargoGrupo.setVisible(this.isPermisoEliminarCargoGrupo);
			this.jInternalFrameDetalleFormCargoGrupo.jButtonCancelarCargoGrupo.setVisible(this.isVisibilidadCeldaCancelarCargoGrupo);						
			this.jInternalFrameDetalleFormCargoGrupo.jButtonGuardarCambiosCargoGrupo.setVisible(this.isPermisoGuardarCambiosCargoGrupo);							
		}
		
		this.jButtonGuardarCambiosTablaCargoGrupo.setVisible(this.isPermisoActualizarCargoGrupo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCargoGrupo() {
		this.jInternalFrameDetalleFormCargoGrupo.jButtonModificarCargoGrupo.setVisible(this.isPermisoActualizarCargoGrupo);	
		this.jInternalFrameDetalleFormCargoGrupo.jButtonActualizarCargoGrupo.setVisible(this.isPermisoActualizarCargoGrupo);	
		this.jInternalFrameDetalleFormCargoGrupo.jButtonEliminarCargoGrupo.setVisible(this.isPermisoEliminarCargoGrupo);
		this.jInternalFrameDetalleFormCargoGrupo.jButtonCancelarCargoGrupo.setVisible(this.isVisibilidadCeldaCancelarCargoGrupo);							
		this.jInternalFrameDetalleFormCargoGrupo.jButtonGuardarCambiosCargoGrupo.setVisible((this.isVisibilidadCeldaGuardarCargoGrupo && this.isPermisoGuardarCambiosCargoGrupo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCargoGrupo() {
		if(CargoGrupoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCargoGrupo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCargoGrupo() {
	}
	
	public void jTableDatosCargoGrupoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCargoGrupo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCargoGrupoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargoGrupo(this.getcargogrupo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoGrupo(this.cargogrupo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargogrupo =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargogrupo =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargogrupo==null) {
						this.cargogrupo = new CargoGrupo();
					}

					this.setVariablesFormularioToObjetoActualCargoGrupo(this.cargogrupo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoGrupo(this.cargogrupo);
				}

				if(this.cargogrupo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cargogrupo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargoGrupo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCargoGrupoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCargoGrupo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCargoGrupo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCargoGrupo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupo =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargogrupo =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCargoGrupo(this.getcargogrupo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargoGrupo(this.cargogrupo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cargogrupoLogic.getConnexion());

				if(this.cargogrupo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cargogrupo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCargoGrupo=(TitledBorder)this.jScrollPanelDatosCargoGrupo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCargoGrupo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCargoGrupoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargoGrupo(this.getcargogrupo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoGrupo(this.cargogrupo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargogrupo =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargogrupo =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargogrupo==null) {
						this.cargogrupo = new CargoGrupo();
					}

					this.setVariablesFormularioToObjetoActualCargoGrupo(this.cargogrupo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoGrupo(this.cargogrupo);
				}

				if(this.cargogrupo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cargogrupo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargoGrupo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCargoGrupoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargoGrupo(this.getcargogrupo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoGrupo(this.cargogrupo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargogrupo =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargogrupo =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargogrupo==null) {
						this.cargogrupo = new CargoGrupo();
					}

					this.setVariablesFormularioToObjetoActualCargoGrupo(this.cargogrupo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoGrupo(this.cargogrupo);
				}

				if(this.cargogrupo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.cargogrupo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargoGrupo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCargoGrupoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargoGrupo(this.getcargogrupo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoGrupo(this.cargogrupo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargogrupo =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargogrupo =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargogrupo==null) {
						this.cargogrupo = new CargoGrupo();
					}

					this.setVariablesFormularioToObjetoActualCargoGrupo(this.cargogrupo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoGrupo(this.cargogrupo);
				}

				if(this.cargogrupo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.cargogrupo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargoGrupo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaCargoGrupoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCargoGrupo(false,false);

			this.getCargoGruposFK_IdEmpresa();

			this.inicializarActualizarBindingCargoGrupo(false);

			//if(CargoGrupoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCargoGrupo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargogrupoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCargoGrupo() {
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
		

		if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
			this.jInternalFrameDetalleFormCargoGrupo.setVisible(false);	    			
			this.jInternalFrameDetalleFormCargoGrupo.dispose();
			this.jInternalFrameDetalleFormCargoGrupo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCargoGrupo!=null) {
			this.jInternalFrameReporteDinamicoCargoGrupo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCargoGrupo.dispose();
			this.jInternalFrameReporteDinamicoCargoGrupo=null;
		}
		
		if(this.jInternalFrameImportacionCargoGrupo!=null) {
			this.jInternalFrameImportacionCargoGrupo.setVisible(false);	    			
			this.jInternalFrameImportacionCargoGrupo.dispose();
			this.jInternalFrameImportacionCargoGrupo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCargoGrupo();
			
			CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
			
			
			if(sTipo.equals("NuevoCargoGrupo")) {
				jButtonNuevoCargoGrupoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCargoGrupo")) {
				jButtonDuplicarCargoGrupoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCargoGrupo")) {
				jButtonCopiarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("VerFormCargoGrupo")) {
				jButtonVerFormCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCargoGrupo")) {
				jButtonNuevoCargoGrupoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCargoGrupo")) {
				jButtonDuplicarCargoGrupoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCargoGrupo")) {
				jButtonNuevoCargoGrupoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCargoGrupo")) {
				jButtonDuplicarCargoGrupoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCargoGrupo")) {
				jButtonNuevoCargoGrupoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCargoGrupo")) {
				jButtonNuevoCargoGrupoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCargoGrupo")) {
				jButtonNuevoCargoGrupoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCargoGrupo")) {
				jButtonModificarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCargoGrupo")) {
				jButtonModificarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCargoGrupo")) {
				jButtonModificarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCargoGrupo")) {
				jButtonActualizarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCargoGrupo")) {
				jButtonActualizarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCargoGrupo")) {
				jButtonActualizarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("EliminarCargoGrupo")) {
				jButtonEliminarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCargoGrupo")) {
				jButtonEliminarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCargoGrupo")) {
				jButtonEliminarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("CancelarCargoGrupo")) {
				jButtonCancelarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCargoGrupo")) {
				jButtonCancelarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCargoGrupo")) {
				jButtonCancelarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("CerrarCargoGrupo")) {
				jButtonCerrarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCargoGrupo")) {
				jButtonCerrarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCargoGrupo")) {
				jButtonCerrarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCargoGrupo")) {
				jButtonMostrarOcultarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCargoGrupo")) {
				jButtonCancelarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCargoGrupo")) {
				jButtonGuardarCambiosCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCargoGrupo")) {
				jButtonGuardarCambiosCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCargoGrupo")) {
				jButtonCopiarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCargoGrupo")) {
				jButtonVerFormCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCargoGrupo")) {
				jButtonGuardarCambiosCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCargoGrupo")) {
				jButtonCopiarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCargoGrupo")) {
				jButtonVerFormCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCargoGrupo")) {
				jButtonGuardarCambiosCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCargoGrupo")) {
				jButtonGuardarCambiosCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCargoGrupo")) {
				jButtonGuardarCambiosCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCargoGrupo")) {
				jButtonRecargarInformacionCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCargoGrupo")) {
				jButtonRecargarInformacionCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCargoGrupo")) {
				jButtonRecargarInformacionCargoGrupoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCargoGrupo")) {
				jButtonAnterioresCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCargoGrupo")) {
				jButtonAnterioresCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCargoGrupo")) {
				jButtonAnterioresCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCargoGrupo")) {
				jButtonSiguientesCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCargoGrupo")) {
				jButtonSiguientesCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCargoGrupo")) {
				jButtonSiguientesCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCargoGrupo") || sTipo.equals("MenuItemDetalleAbrirOrderByCargoGrupo")) {
				jButtonAbrirOrderByCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCargoGrupo") || sTipo.equals("MenuItemDetalleMostrarOcultarCargoGrupo")) {
				jButtonMostrarOcultarCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCargoGrupo")) {
				jButtonNuevoGuardarCambiosCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCargoGrupo")) {
				jButtonNuevoGuardarCambiosCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCargoGrupo")) {
				jButtonNuevoGuardarCambiosCargoGrupoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCargoGrupo")) {
				jButtonCerrarReporteDinamicoCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCargoGrupo")) {
				jButtonGenerarReporteDinamicoCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCargoGrupo")) {
				
				jButtonGenerarExcelReporteDinamicoCargoGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCargoGrupo")) {
				jButtonCerrarImportacionCargoGrupoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCargoGrupo")) {
				
				jButtonGenerarImportacionCargoGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCargoGrupo")) {
				
				jButtonAbrirImportacionCargoGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCargoGrupo")) {
				jComboBoxTiposAccionesCargoGrupoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCargoGrupo")) {
				jComboBoxTiposRelacionesCargoGrupoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCargoGrupo")) {
				jComboBoxTiposAccionesCargoGrupoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCargoGrupo")) {
				
				jComboBoxTiposSeleccionarCargoGrupoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCargoGrupo")) {
				jTextFieldValorCampoGeneralCargoGrupoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCargoGrupo")) {
				jButtonAbrirOrderByCargoGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCargoGrupo")) {
				jButtonAbrirOrderByCargoGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCargoGrupo")) {
				jButtonCerrarOrderByCargoGrupoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCargoGrupoBusqueda")) {
				this.jButtonidCargoGrupoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCargoGrupoUpdate")) {
				this.jButtonid_empresaCargoGrupoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCargoGrupoBusqueda")) {
				this.jButtonid_empresaCargoGrupoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCargoGrupoBusqueda")) {
				this.jButtoncodigoCargoGrupoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCargoGrupoBusqueda")) {
				this.jButtonnombreCargoGrupoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCargoGrupo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoGrupoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargogrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargogrupo);
				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
				
				


				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargoGrupo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoGrupo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CargoGrupo cargogrupoLocal=null;
			
			if(!this.getEsControlTabla()) {
				cargogrupoLocal=this.cargogrupo;
			} else {
				cargogrupoLocal=this.cargogrupoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargogrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargogrupo);
				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
							
				
				


				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargoGrupo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoGrupo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoGrupoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoAnterior =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargogrupoAnterior =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
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
			
			CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
			
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
			
			


			
			CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoGrupoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargogrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargogrupo);
				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
								
						
				


				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargoGrupo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoGrupo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargogrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargogrupo);
				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
								
				
				


				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargoGrupo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoGrupo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoGrupoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoAnterior =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargogrupoAnterior =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargogrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargogrupo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoGrupoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoAnterior =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargogrupoAnterior =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoGrupoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cargogrupo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cargogrupo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargogrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargogrupo);
				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
							
				
				


				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargoGrupo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoGrupo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoGrupoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargogrupoAnterior =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cargogrupoAnterior =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
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
			
			CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
			
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
			
			


			
			CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoGrupoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cargogrupo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cargogrupo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargogrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargogrupo);
				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
								
				
				


				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargoGrupo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoGrupo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoGrupoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoAnterior =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargogrupoAnterior =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoGrupoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cargogrupo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cargogrupo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoGrupoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargogrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargogrupo);
				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCargoGrupo")) {
					jCheckBoxSeleccionarTodosCargoGrupoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCargoGrupo")) {
					jCheckBoxSeleccionadosCargoGrupoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCargoGrupo")) {
					
				}
				
				


				
				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargoGrupo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoGrupo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cargogrupo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cargogrupo);
				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
												
				
				


				
				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargoGrupo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoGrupo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoGrupoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargogrupoAnterior =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cargogrupoAnterior =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoGrupoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargogrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargogrupo);
				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
				
				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
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
			
			CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
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
			
			


			
			CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoGrupoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargogrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargogrupo);
				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargoGrupo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoGrupo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargogrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargogrupo);
				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
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
				
				


				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargoGrupo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoGrupo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoGrupoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargogrupoAnterior =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargogrupoAnterior =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCargoGrupo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCargoGrupoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCargoGrupo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cargogrupo =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cargogrupo =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cargogrupo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCargoGrupo")) {
				
				}
				
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCargoGrupo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCargoGrupo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCargoGrupo")) {
			
			}
			
			CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCargoGrupo();
			
			CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
			
			if(sTipo.equals("NuevoCargoGrupo")) {
				jButtonNuevoCargoGrupoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCargoGrupo")) {
				jButtonDuplicarCargoGrupoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCargoGrupo")) {
				jButtonCopiarCargoGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCargoGrupo")) {
				jButtonVerFormCargoGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCargoGrupo")) {
				jButtonNuevoCargoGrupoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCargoGrupo")) {
				jButtonModificarCargoGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCargoGrupo")) {
				jButtonActualizarCargoGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCargoGrupo")) {
				jButtonEliminarCargoGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCargoGrupo")) {
				jButtonGuardarCambiosCargoGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCargoGrupo")) {
				jButtonCancelarCargoGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCargoGrupo")) {
				jButtonCerrarCargoGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCargoGrupo")) {
				jButtonGuardarCambiosCargoGrupoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCargoGrupo")) {
				jButtonNuevoGuardarCambiosCargoGrupoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCargoGrupo")) {
				jButtonAbrirOrderByCargoGrupoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCargoGrupo")) {
				jButtonRecargarInformacionCargoGrupoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCargoGrupo")) {
				jButtonAnterioresCargoGrupoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCargoGrupo")) {
				jButtonSiguientesCargoGrupoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCargoGrupoBusqueda")) {
				this.jButtonidCargoGrupoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCargoGrupoUpdate")) {
				this.jButtonid_empresaCargoGrupoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCargoGrupoBusqueda")) {
				this.jButtonid_empresaCargoGrupoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCargoGrupoBusqueda")) {
				this.jButtoncodigoCargoGrupoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCargoGrupoBusqueda")) {
				this.jButtonnombreCargoGrupoBusquedaActionPerformed(evt);
			}
			
			CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCargoGrupo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCargoGrupo")) {
				closingInternalFrameCargoGrupo();
				
			} else if(sTipo.equals("jButtonCancelarCargoGrupo")) {
				JInternalFrameBase jInternalFrameDetalleFormCargoGrupo = (JInternalFrameBase)evt.getSource();
	            	
	            CargoGrupoBeanSwingJInternalFrame jInternalFrameParent=(CargoGrupoBeanSwingJInternalFrame)jInternalFrameDetalleFormCargoGrupo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCargoGrupoActionPerformed(null);
			}
			
			CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cargogrupo,new Object(),this.cargogrupoParameterGeneral,this.cargogrupoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCargoGrupo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCargoGrupo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCargoGrupo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cargogrupo)) {
			if(!esControlTabla) {
				if(CargoGrupoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCargoGrupo(this.cargogrupo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoGrupo(this.cargogrupo);			
				}
				
				if(this.cargogrupoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCargoGrupo(this.cargogrupo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cargogrupoReturnGeneral=cargogrupoLogic.procesarEventosCargoGruposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cargogrupoLogic.getCargoGrupos(),this.cargogrupo,this.cargogrupoParameterGeneral,this.isEsNuevoCargoGrupo,classes);//this.cargogrupoLogic.getCargoGrupo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCargoGrupo(this.cargogrupoReturnGeneral,this.cargogrupoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cargogrupoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCargoGrupo(classes,this.cargogrupoReturnGeneral,this.cargogrupoBean,false);
					}
						
					if(this.cargogrupoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCargoGrupo(this.cargogrupoReturnGeneral.getCargoGrupo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCargoGrupo(this.cargogrupoReturnGeneral.getCargoGrupo());	
					}
						
					if(this.cargogrupoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCargoGrupo(this.cargogrupoReturnGeneral.getCargoGrupo(),classes);//this.cargogrupoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCargoGrupo(this.cargogrupo,classes);//this.cargogrupoBean);									
				}
			
				if(CargoGrupoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCargoGrupo(this.cargogrupo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoGrupo(this.cargogrupo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cargogrupoAnterior!=null) {
						this.cargogrupo=this.cargogrupoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cargogrupoReturnGeneral=cargogrupoLogic.procesarEventosCargoGruposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cargogrupoLogic.getCargoGrupos(),this.cargogrupo,this.cargogrupoParameterGeneral,this.isEsNuevoCargoGrupo,classes);//this.cargogrupoLogic.getCargoGrupo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cargogrupoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cargogrupoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cargogrupoReturnGeneral.getCargoGrupo(),cargogrupoLogic.getCargoGrupos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cargogrupoReturnGeneral.getCargoGrupo(),this.cargogrupos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCargoGrupo.repaint();
				
				//((AbstractTableModel) this.jTableDatosCargoGrupo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCargoGrupo();
			}
		}
	}
	
	public void actualizarVisualTableDatosCargoGrupo() throws Exception {
		
		CargoGrupoModel cargogrupoModel=(CargoGrupoModel)this.jTableDatosCargoGrupo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cargogrupoModel.cargogrupos=this.cargogrupoLogic.getCargoGrupos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cargogrupoModel.cargogrupos=this.cargogrupos;
		}
		
		
		((CargoGrupoModel) this.jTableDatosCargoGrupo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCargoGrupo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcargogrupoAnterior(),this.cargogrupoLogic.getCargoGrupos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcargogrupoAnterior(),this.cargogrupos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCargoGrupo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCargoGrupo(CargoGrupo cargogrupo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cargo.class)) {
					this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargoLogic.setCargos(cargogrupo.getCargos());
					this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
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
										
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cargogrupo,new Object(),generalEntityParameterGeneral,this.cargogrupoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cargogrupoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CargoGrupoConstantesFunciones.getClassesRelationshipsOfCargoGrupo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CargoGrupoConstantesFunciones.getClassesRelationshipsFromStringsOfCargoGrupo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCargoGrupo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CargoGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cargogrupo,new Object(),generalEntityParameterGeneral,this.cargogrupoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCargoGrupo(CargoGrupoBean cargogrupoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cargo.class)) {
					this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargoLogic.setCargos(cargogrupo.getCargos());
					this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCargoGrupo(ArrayList<Classe> classes,CargoGrupoReturnGeneral cargogrupoReturnGeneral,CargoGrupoBean cargogrupoBean,Boolean conDefault) throws Exception {
		
			this.cargogrupoBean.setCargos(cargogrupoReturnGeneral.getCargoGrupo().getCargos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCargoGrupo(CargoGrupo cargogrupo,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Cargo.class)) {
					cargogrupo.setCargos(this.jInternalFrameDetalleFormCargoGrupo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.cargogrupo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCargoGrupo = new CargoGrupoDetalleFormJInternalFrame(jDesktopPane,this.cargogrupoSessionBean.getConGuardarRelaciones(),this.cargogrupoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCargoGrupo);
		this.jInternalFrameDetalleFormCargoGrupo.setVisible(false);
		this.jInternalFrameDetalleFormCargoGrupo.setSelected(false);						
		
		this.jInternalFrameDetalleFormCargoGrupo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCargoGrupo.cargogrupoLogic=this.cargogrupoLogic;
		
		this.cargarCombosFrameForeignKeyCargoGrupo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCargoGrupo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCargoGrupo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCargoGrupo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCargoGrupo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCargoGrupo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCargoGrupo"));
		
		this.jInternalFrameDetalleFormCargoGrupo.jButtonModificarCargoGrupo.addActionListener(new ButtonActionListener(this,"ModificarCargoGrupo"));

		
		this.jInternalFrameDetalleFormCargoGrupo.jButtonModificarToolBarCargoGrupo.addActionListener(new ButtonActionListener(this,"ModificarToolBarCargoGrupo"));
					
		this.jInternalFrameDetalleFormCargoGrupo.jMenuItemModificarCargoGrupo.addActionListener(new ButtonActionListener(this,"MenuItemModificarCargoGrupo"));		
		
		
		
		this.jInternalFrameDetalleFormCargoGrupo.jButtonActualizarCargoGrupo.addActionListener (new ButtonActionListener(this,"ActualizarCargoGrupo"));
		
		
		this.jInternalFrameDetalleFormCargoGrupo.jButtonActualizarToolBarCargoGrupo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCargoGrupo"));
						
		this.jInternalFrameDetalleFormCargoGrupo.jMenuItemActualizarCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCargoGrupo"));		
		
		
		
		this.jInternalFrameDetalleFormCargoGrupo.jButtonEliminarCargoGrupo.addActionListener (new ButtonActionListener(this,"EliminarCargoGrupo"));
		
		
		this.jInternalFrameDetalleFormCargoGrupo.jButtonEliminarToolBarCargoGrupo.addActionListener (new ButtonActionListener(this,"EliminarToolBarCargoGrupo"));
								
		this.jInternalFrameDetalleFormCargoGrupo.jMenuItemEliminarCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCargoGrupo"));		
		
		
		
		this.jInternalFrameDetalleFormCargoGrupo.jButtonCancelarCargoGrupo.addActionListener (new ButtonActionListener(this,"CancelarCargoGrupo"));
		
		
		this.jInternalFrameDetalleFormCargoGrupo.jButtonCancelarToolBarCargoGrupo.addActionListener (new ButtonActionListener(this,"CancelarToolBarCargoGrupo"));
					
		this.jInternalFrameDetalleFormCargoGrupo.jMenuItemCancelarCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCargoGrupo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCargoGrupo.jMenuItemDetalleCerrarCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCargoGrupo"));		
		
		
		
		this.jInternalFrameDetalleFormCargoGrupo.jButtonGuardarCambiosToolBarCargoGrupo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCargoGrupo"));
		
		
		
		this.jInternalFrameDetalleFormCargoGrupo.jButtonGuardarCambiosToolBarCargoGrupo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCargoGrupo"));
		
		
		
		this.jInternalFrameDetalleFormCargoGrupo.jComboBoxTiposAccionesFormularioCargoGrupo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCargoGrupo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoGrupo.jButtonidCargoGrupoBusqueda.addActionListener(new ButtonActionListener(this,"idCargoGrupoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargoGrupo.jButtonid_empresaCargoGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCargoGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoGrupo.jButtonid_empresaCargoGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCargoGrupoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoGrupo.jButtoncodigoCargoGrupoBusqueda.addActionListener(new ButtonActionListener(this,"codigoCargoGrupoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoGrupo.jButtonnombreCargoGrupoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCargoGrupoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCargoGrupo.jTabbedPaneRelacionesCargoGrupo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCargoGrupo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCargoGrupo"));
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoGrupo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCargoGrupo"));
		}
		
		this.jTableDatosCargoGrupo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCargoGrupo"));
		
		this.jTableDatosCargoGrupo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCargoGrupo"));
		
		this.jButtonNuevoCargoGrupo.addActionListener(new ButtonActionListener(this,"NuevoCargoGrupo"));
		
		this.jButtonDuplicarCargoGrupo.addActionListener(new ButtonActionListener(this,"DuplicarCargoGrupo"));
		
		this.jButtonCopiarCargoGrupo.addActionListener(new ButtonActionListener(this,"CopiarCargoGrupo"));
		
		this.jButtonVerFormCargoGrupo.addActionListener(new ButtonActionListener(this,"VerFormCargoGrupo"));
		
		
		this.jButtonNuevoToolBarCargoGrupo.addActionListener(new ButtonActionListener(this,"NuevoToolBarCargoGrupo"));
			
		this.jButtonDuplicarToolBarCargoGrupo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCargoGrupo"));
			
		this.jMenuItemNuevoCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCargoGrupo"));
			
		this.jMenuItemDuplicarCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCargoGrupo"));		
		
		
		this.jButtonNuevoRelacionesCargoGrupo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCargoGrupo"));
		
		
		this.jButtonNuevoRelacionesToolBarCargoGrupo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCargoGrupo"));
			
		this.jMenuItemNuevoRelacionesCargoGrupo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCargoGrupo"));		
		
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoGrupo.jButtonModificarCargoGrupo.addActionListener(new ButtonActionListener(this,"ModificarCargoGrupo"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoGrupo.jButtonModificarToolBarCargoGrupo.addActionListener(new ButtonActionListener(this,"ModificarToolBarCargoGrupo"));
			
			this.jInternalFrameDetalleFormCargoGrupo.jMenuItemModificarCargoGrupo.addActionListener(new ButtonActionListener(this,"MenuItemModificarCargoGrupo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCargoGrupo.jButtonActualizarCargoGrupo.addActionListener (new ButtonActionListener(this,"ActualizarCargoGrupo"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoGrupo.jButtonActualizarToolBarCargoGrupo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCargoGrupo"));
				
			this.jInternalFrameDetalleFormCargoGrupo.jMenuItemActualizarCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCargoGrupo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoGrupo.jButtonEliminarCargoGrupo.addActionListener (new ButtonActionListener(this,"EliminarCargoGrupo"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoGrupo.jButtonEliminarToolBarCargoGrupo.addActionListener (new ButtonActionListener(this,"EliminarToolBarCargoGrupo"));
						
			this.jInternalFrameDetalleFormCargoGrupo.jMenuItemEliminarCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCargoGrupo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoGrupo.jButtonCancelarCargoGrupo.addActionListener (new ButtonActionListener(this,"CancelarCargoGrupo"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoGrupo.jButtonCancelarToolBarCargoGrupo.addActionListener (new ButtonActionListener(this,"CancelarToolBarCargoGrupo"));
			
			this.jInternalFrameDetalleFormCargoGrupo.jMenuItemCancelarCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCargoGrupo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCargoGrupo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCargoGrupo"));		
		
		
		this.jButtonCerrarCargoGrupo.addActionListener (new ButtonActionListener(this,"CerrarCargoGrupo"));
		
		
		this.jButtonCerrarToolBarCargoGrupo.addActionListener (new ButtonActionListener(this,"CerrarToolBarCargoGrupo"));
			
		this.jMenuItemCerrarCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCargoGrupo"));
			
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoGrupo.jMenuItemDetalleCerrarCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCargoGrupo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoGrupo.jButtonGuardarCambiosCargoGrupo.addActionListener (new ButtonActionListener(this,"GuardarCambiosCargoGrupo"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoGrupo.jButtonGuardarCambiosToolBarCargoGrupo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCargoGrupo"));
		}
		
		this.jButtonCopiarToolBarCargoGrupo.addActionListener (new ButtonActionListener(this,"CopiarToolBarCargoGrupo"));
			
		this.jButtonVerFormToolBarCargoGrupo.addActionListener (new ButtonActionListener(this,"VerFormToolBarCargoGrupo"));
		
		this.jMenuItemGuardarCambiosCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCargoGrupo"));
			
		this.jMenuItemCopiarCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCargoGrupo"));		
		
		this.jMenuItemVerFormCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCargoGrupo"));		
		
		
		this.jButtonGuardarCambiosTablaCargoGrupo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCargoGrupo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCargoGrupo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCargoGrupo"));
			
		this.jMenuItemGuardarCambiosTablaCargoGrupo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCargoGrupo"));		
		
		
		
		this.jButtonRecargarInformacionCargoGrupo.addActionListener (new ButtonActionListener(this,"RecargarInformacionCargoGrupo"));
					
		this.jButtonRecargarInformacionToolBarCargoGrupo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCargoGrupo"));
		
		this.jMenuItemRecargarInformacionCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCargoGrupo"));		
		
		
		
		this.jButtonAnterioresCargoGrupo.addActionListener (new ButtonActionListener(this,"AnterioresCargoGrupo"));
		
		
		this.jButtonAnterioresToolBarCargoGrupo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCargoGrupo"));
		
		this.jMenuItemAnterioresCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCargoGrupo"));		
		
		
		this.jButtonSiguientesCargoGrupo.addActionListener (new ButtonActionListener(this,"SiguientesCargoGrupo"));
		
		
		this.jButtonSiguientesToolBarCargoGrupo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCargoGrupo"));
			
		this.jMenuItemSiguientesCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCargoGrupo"));
			
		this.jMenuItemAbrirOrderByCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCargoGrupo"));
			
		this.jMenuItemMostrarOcultarCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCargoGrupo"));
			
		this.jMenuItemDetalleAbrirOrderByCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCargoGrupo"));
			
		this.jMenuItemDetalleMostarOcultarCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCargoGrupo"));		
		
		
		this.jButtonNuevoGuardarCambiosCargoGrupo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCargoGrupo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCargoGrupo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCargoGrupo"));
			
		this.jMenuItemNuevoGuardarCambiosCargoGrupo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCargoGrupo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCargoGrupo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCargoGrupo"));

		this.jCheckBoxSeleccionadosCargoGrupo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCargoGrupo"));
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoGrupo.jComboBoxTiposAccionesFormularioCargoGrupo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCargoGrupo"));
		}
		
		
		this.jComboBoxTiposRelacionesCargoGrupo.addActionListener (new ButtonActionListener(this,"TiposRelacionesCargoGrupo"));
			
		this.jComboBoxTiposAccionesCargoGrupo.addActionListener (new ButtonActionListener(this,"TiposAccionesCargoGrupo"));
					
		this.jComboBoxTiposSeleccionarCargoGrupo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCargoGrupo"));
			
		this.jTextFieldValorCampoGeneralCargoGrupo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCargoGrupo"));		
		
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoGrupo.jButtonidCargoGrupoBusqueda.addActionListener(new ButtonActionListener(this,"idCargoGrupoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargoGrupo.jButtonid_empresaCargoGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCargoGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoGrupo.jButtonid_empresaCargoGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCargoGrupoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoGrupo.jButtoncodigoCargoGrupoBusqueda.addActionListener(new ButtonActionListener(this,"codigoCargoGrupoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoGrupo.jButtonnombreCargoGrupoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCargoGrupoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCargoGrupo!=null) {
				this.jInternalFrameReporteDinamicoCargoGrupo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCargoGrupo"));
				this.jInternalFrameReporteDinamicoCargoGrupo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCargoGrupo"));
				this.jInternalFrameReporteDinamicoCargoGrupo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCargoGrupo"));
			}
			
			//this.jButtonCerrarReporteDinamicoCargoGrupo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCargoGrupo"));				
			//this.jButtonGenerarReporteDinamicoCargoGrupo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCargoGrupo"));
			//this.jButtonGenerarExcelReporteDinamicoCargoGrupo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCargoGrupo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCargoGrupo!=null) {
				this.jInternalFrameImportacionCargoGrupo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCargoGrupo"));
				this.jInternalFrameImportacionCargoGrupo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCargoGrupo"));
				this.jInternalFrameImportacionCargoGrupo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCargoGrupo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCargoGrupo.addActionListener (new ButtonActionListener(this,"AbrirOrderByCargoGrupo"));
			
			this.jButtonAbrirOrderByToolBarCargoGrupo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCargoGrupo"));			
			
			if(this.jInternalFrameOrderByCargoGrupo!=null) {
				this.jInternalFrameOrderByCargoGrupo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCargoGrupo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCargoGrupo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoGrupo.jTabbedPaneRelacionesCargoGrupo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCargoGrupo"));
		
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
            		closingInternalFrameCargoGrupo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCargoGrupo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCargoGrupo = (JInternalFrameBase)event.getSource();
	            	
	            CargoGrupoBeanSwingJInternalFrame jInternalFrameParent=(CargoGrupoBeanSwingJInternalFrame)jInternalFrameDetalleFormCargoGrupo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCargoGrupoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCargoGrupo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCargoGrupoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCargoGrupo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCargoGrupo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargoGrupoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargoGrupoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargoGrupoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCargoGrupo";
		inputMap = this.jButtonNuevoCargoGrupo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCargoGrupo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCargoGrupoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargoGrupoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargoGrupoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargoGrupoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCargoGrupo";
		inputMap = this.jButtonNuevoRelacionesCargoGrupo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCargoGrupo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCargoGrupoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCargoGrupo";
		inputMap = this.jButtonModificarCargoGrupo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCargoGrupo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCargoGrupoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCargoGrupo";
		inputMap = this.jButtonActualizarCargoGrupo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCargoGrupo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCargoGrupoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCargoGrupo";
		inputMap = this.jButtonEliminarCargoGrupo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCargoGrupo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCargoGrupoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCargoGrupo";
		inputMap = this.jButtonCancelarCargoGrupo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCargoGrupo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCargoGrupoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCargoGrupo";
		inputMap = this.jButtonCerrarCargoGrupo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCargoGrupo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCargoGrupoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCargoGrupo.jButtonGuardarCambiosCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCargoGrupo";
		inputMap = this.jInternalFrameDetalleFormCargoGrupo.jButtonGuardarCambiosCargoGrupo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCargoGrupo.jButtonGuardarCambiosCargoGrupo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCargoGrupoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCargoGrupo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCargoGrupoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCargoGrupo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCargoGrupoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCargoGrupo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCargoGrupoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCargoGrupo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCargoGrupoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoGrupo.jButtonidCargoGrupoBusqueda.addActionListener(new ButtonActionListener(this,"idCargoGrupoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargoGrupo.jButtonid_empresaCargoGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCargoGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoGrupo.jButtonid_empresaCargoGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCargoGrupoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoGrupo.jButtoncodigoCargoGrupoBusqueda.addActionListener(new ButtonActionListener(this,"codigoCargoGrupoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoGrupo.jButtonnombreCargoGrupoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCargoGrupoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCargoGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCargoGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCargoGrupoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCargoGrupo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCargoGrupo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CargoGrupo cargogrupoAux:this.cargogrupoLogic.getCargoGrupos()) {
					cargogrupoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CargoGrupo cargogrupoAux:cargogrupos) {
					cargogrupoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCargoGrupoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCargoGrupo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CargoGrupo cargogrupoAux:this.cargogrupoLogic.getCargoGrupos()) {
						cargogrupoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CargoGrupo cargogrupoAux:cargogrupos) {
						cargogrupoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CargoGrupo cargogrupoAux:this.cargogrupoLogic.getCargoGrupos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CargoGrupo cargogrupoAux:cargogrupos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCargoGrupo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCargoGrupo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCargoGrupo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCargoGrupo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCargoGrupoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCargoGrupo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCargoGrupo.getSelectedRows();
			
			CargoGrupo cargogrupoLocal=new CargoGrupo();
			
			//this.seleccionarTodosCargoGrupo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargogrupoLocal =(CargoGrupo) this.cargogrupoLogic.getCargoGrupos().toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cargogrupoLocal =(CargoGrupo) this.cargogrupos.toArray()[this.jTableDatosCargoGrupo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cargogrupoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CargoGrupo cargogrupoAux:this.cargogrupoLogic.getCargoGrupos()) {
						cargogrupoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CargoGrupo cargogrupoAux:cargogrupos) {
						cargogrupoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCargoGrupo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCargoGrupo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCargoGrupo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCargoGrupo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCargoGrupoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCargoGrupoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCargoGrupoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCargoGrupo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCargoGrupo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CargoGrupo cargogrupoAux:this.cargogrupoLogic.getCargoGrupos()) {
				
						if(sTipoSeleccionar.equals(CargoGrupoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cargogrupoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargoGrupoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cargogrupoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CargoGrupo cargogrupoAux:cargogrupos) {
					
						if(sTipoSeleccionar.equals(CargoGrupoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cargogrupoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargoGrupoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cargogrupoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCargoGrupo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCargoGrupoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCargoGrupo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCargoGrupo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCargoGrupo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCargoGrupo.jComboBoxTiposAccionesFormularioCargoGrupo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCargoGrupo) {				
					conSplash=true;//false;										
					
					//this.startProcessCargoGrupo(conSplash);
				
					this.generarReporteCargoGruposSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCargoGrupo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCargoGrupo.jComboBoxTiposAccionesFormularioCargoGrupo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCargoGruposSeleccionados();
				//this.jComboBoxTiposAccionesCargoGrupo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCargoGruposSeleccionados(false);
				//this.jComboBoxTiposAccionesCargoGrupo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCargoGruposSeleccionados(true);
				//this.jComboBoxTiposAccionesCargoGrupo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCargoGrupo();
				
				this.exportarCargoGruposSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCargoGrupo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCargoGrupo.jComboBoxTiposAccionesFormularioCargoGrupo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCargoGrupos();
				//this.importarCargoGrupos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCargoGrupo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCargoGrupo.jComboBoxTiposAccionesFormularioCargoGrupo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCargoGrupo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCargoGruposSeleccionados();
				//this.jComboBoxTiposAccionesCargoGrupo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cargo Grupo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCargoGrupo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCargoGrupo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCargoGrupo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cargo Grupo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCargoGrupo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCargoGrupo.jComboBoxTiposAccionesFormularioCargoGrupo.setSelectedIndex(0);					
				}	
			} 			
			else if(CargoGrupoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCargoGrupo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCargoGrupo(conSplash);
					
						//this.actualizarParametrosGeneralCargoGrupo();
						
						this.generarReporteProcesoAccionCargoGruposSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCargoGrupo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCargoGrupo.jComboBoxTiposAccionesFormularioCargoGrupo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CargoGrupoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cargo GrupoS SELECCIONADOS?", "MANTENIMIENTO DE Cargo Grupo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCargoGrupo();
				
						this.actualizarParametrosGeneralCargoGrupo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cargogrupoReturnGeneral=cargogrupoLogic.procesarAccionCargoGruposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cargogrupoLogic.getCargoGrupos(),this.cargogrupoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCargoGrupoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCargoGrupo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCargoGrupo.jComboBoxTiposAccionesFormularioCargoGrupo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCargoGrupo();
					
					CargoGrupoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCargoGrupoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCargoGrupo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCargoGrupo.jComboBoxTiposAccionesFormularioCargoGrupo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCargoGrupo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCargoGrupoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCargoGrupo();
			
			if(this.jInternalFrameDetalleFormCargoGrupo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CargoGrupo> cargogruposSeleccionados=new ArrayList<CargoGrupo>();		
			CargoGrupo cargogrupo=new CargoGrupo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCargoGrupo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCargoGrupo.getSelectedItem();
			
			
			
			
			cargogruposSeleccionados=this.getCargoGruposSeleccionados(true);
			//this.sTipoAccion;
			
			if(cargogruposSeleccionados.size()==1) {
				for(CargoGrupo cargogrupoAux:cargogruposSeleccionados) {
					cargogrupo=cargogrupoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cargo")) {
					jButtonCargoActionPerformed(null,rowIndex,true,false,cargogrupo);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCargoGrupo();
			
      		//this.finishProcessCargoGrupo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCargoGrupoReturnGeneral() throws Exception {
		if(this.cargogrupoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cargogrupoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cargogrupoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cargogrupoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cargogrupoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cargogrupoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCargoGrupo(false);
		}
		
		if(this.cargogrupoReturnGeneral.getConRetornoLista() || this.cargogrupoReturnGeneral.getConRetornoObjeto()) {
			if(this.cargogrupoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cargogrupoLogic.setCargoGrupos(this.cargogrupoReturnGeneral.getCargoGrupos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cargogrupoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cargogrupoLogic.setCargoGrupo(this.cargogrupoReturnGeneral.getCargoGrupo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCargoGrupo(false);
		}
	}
	
	public void actualizarParametrosGeneralCargoGrupo() throws Exception {
		
		
	}
	
	public ArrayList<CargoGrupo> getCargoGruposSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CargoGrupo> cargogruposSeleccionados=new ArrayList<CargoGrupo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCargoGrupo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CargoGrupo cargogrupoAux:cargogrupoLogic.getCargoGrupos()) {
					if(cargogrupoAux.getIsSelected()) {
						cargogruposSeleccionados.add(cargogrupoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CargoGrupo cargogrupoAux:this.cargogrupos) {
					if(cargogrupoAux.getIsSelected()) {
						cargogruposSeleccionados.add(cargogrupoAux);				
					}
				}
			}
			
			if(cargogruposSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cargogruposSeleccionados.addAll(this.cargogrupoLogic.getCargoGrupos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cargogruposSeleccionados.addAll(this.cargogrupos);				
					}
				}
			}
		} else {
			cargogruposSeleccionados.add(this.cargogrupo);
		}
		
		return cargogruposSeleccionados;
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
	
	public void generarReporteCargoGruposSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCargoGruposSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCargoGruposSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCargoGruposSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCargoGruposSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesCargoGruposSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cargo Grupo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCargoGruposSeleccionados() throws Exception {
		ArrayList<CargoGrupo> cargogruposSeleccionados=new ArrayList<CargoGrupo>();		
		
		cargogruposSeleccionados=this.getCargoGruposSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCargoGrupos("Todos",cargogruposSeleccionados);
		
	}	
	
	public void generarReporteNormalCargoGruposSeleccionados() throws Exception {
		ArrayList<CargoGrupo> cargogruposSeleccionados=new ArrayList<CargoGrupo>();		
		
		cargogruposSeleccionados=this.getCargoGruposSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCargoGrupos("Todos",cargogruposSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCargoGruposSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CargoGrupo> cargogruposSeleccionados=new ArrayList<CargoGrupo>();
		
		cargogruposSeleccionados=this.getCargoGruposSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCargoGrupos("Todos",cargogruposSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCargoGruposSeleccionados() throws Exception {
		ArrayList<CargoGrupo> cargogruposSeleccionados=new ArrayList<CargoGrupo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCargoGrupo();
		
		
		cargogruposSeleccionados=this.getCargoGruposSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCargoGrupo();
		
		
		//this.generarReporteCargoGrupos("Todos",cargogruposSeleccionados ,cargogrupoImplementable,cargogrupoImplementableHome);
	}
	
	public void mostrarImportacionCargoGrupos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCargoGrupo();
		
		this.abrirFrameImportacionCargoGrupo();		
		
			
		//this.generarReporteCargoGrupos("Todos",cargogruposSeleccionados ,cargogrupoImplementable,cargogrupoImplementableHome);
	}
	
	public void importarCargoGrupos() throws Exception {		
	
	}
	
	public void exportarCargoGruposSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCargoGruposSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCargoGruposSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCargoGruposSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cargo Grupo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCargoGruposSeleccionados() throws Exception {
		ArrayList<CargoGrupo> cargogruposSeleccionados=new ArrayList<CargoGrupo>();		
		
		cargogruposSeleccionados=this.getCargoGruposSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargogrupo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCargoGrupo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CargoGrupo cargogrupoAux:cargogruposSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCargoGrupo(cargogrupoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cargogrupoAux.setsDetalleGeneralEntityReporte(cargogrupoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargogrupoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo Grupo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCargoGrupo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CargoGrupoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoGrupoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoGrupoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoGrupoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoGrupoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCargoGrupo(CargoGrupo cargogrupo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cargogrupo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cargogrupo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargogrupo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargogrupo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargogrupo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCargoGruposSeleccionados() throws Exception {
		ArrayList<CargoGrupo> cargogruposSeleccionados=new ArrayList<CargoGrupo>();		
		
		cargogruposSeleccionados=this.getCargoGruposSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargogrupo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CargoGrupos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCargoGrupo(row);				
				iRow++;
			}				
			
			for(CargoGrupo cargogrupoAux:cargogruposSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCargoGrupo(cargogrupoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargogrupoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo Grupo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCargoGruposSeleccionados() throws Exception {
		ArrayList<CargoGrupo> cargogruposSeleccionados=new ArrayList<CargoGrupo>();		
		
		cargogruposSeleccionados=this.getCargoGruposSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargogrupo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cargogrupos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cargogrupo");
			//elementRoot.appendChild(element);
		
			for(CargoGrupo cargogrupoAux:cargogruposSeleccionados) {
				element = document.createElement("cargogrupo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCargoGrupo(cargogrupoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargogrupoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo Grupo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCargoGrupo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CargoGrupoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CargoGrupoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CargoGrupoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CargoGrupoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CargoGrupoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCargoGrupo(CargoGrupo cargogrupo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cargogrupo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cargogrupo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargogrupo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(cargogrupo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlCargoGrupo(CargoGrupo cargogrupo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CargoGrupoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cargogrupo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CargoGrupoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cargogrupo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CargoGrupoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cargogrupo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(CargoGrupoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(cargogrupo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(CargoGrupoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(cargogrupo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoCargoGruposSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CargoGrupo> cargogruposSeleccionados=new ArrayList<CargoGrupo>();
		
		cargogruposSeleccionados=this.getCargoGruposSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCargoGrupo(cargogruposSeleccionados);
		
		this.generarReporteCargoGrupos("Todos",cargogruposSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCargoGrupo(ArrayList<CargoGrupo> cargogruposSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CargoGrupo cargogrupoAux:cargogruposSeleccionados) {
				cargogrupoAux.setsDetalleGeneralEntityReporte(cargogrupoAux.toString());
			
				if(sTipoSeleccionar.equals(CargoGrupoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cargogrupoAux.setsDescripcionGeneralEntityReporte1(cargogrupoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CargoGrupoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					cargogrupoAux.setsDescripcionGeneralEntityReporte1(cargogrupoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CargoGrupoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					cargogrupoAux.setsDescripcionGeneralEntityReporte1(cargogrupoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCargoGrupo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCargoGrupo=true;
				this.isVisibilidadCeldaNuevoRelacionesCargoGrupo=true;
				this.isVisibilidadCeldaGuardarCambiosCargoGrupo=true;
			}
			
			this.isVisibilidadCeldaModificarCargoGrupo=false;
			this.isVisibilidadCeldaActualizarCargoGrupo=false;
			this.isVisibilidadCeldaEliminarCargoGrupo=false;
			this.isVisibilidadCeldaCancelarCargoGrupo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargoGrupo=true;
				} else {
					this.isVisibilidadCeldaGuardarCargoGrupo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCargoGrupo=false;
			this.isVisibilidadCeldaNuevoRelacionesCargoGrupo=false;
			this.isVisibilidadCeldaGuardarCambiosCargoGrupo=false;
			this.isVisibilidadCeldaModificarCargoGrupo=false;
			this.isVisibilidadCeldaActualizarCargoGrupo=true;
			this.isVisibilidadCeldaEliminarCargoGrupo=false;
			this.isVisibilidadCeldaCancelarCargoGrupo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargoGrupo=true;
				} else {
					this.isVisibilidadCeldaGuardarCargoGrupo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCargoGrupo=false;
			this.isVisibilidadCeldaNuevoRelacionesCargoGrupo=false;
			this.isVisibilidadCeldaGuardarCambiosCargoGrupo=false;
			this.isVisibilidadCeldaModificarCargoGrupo=false;
			this.isVisibilidadCeldaActualizarCargoGrupo=true;
			this.isVisibilidadCeldaEliminarCargoGrupo=true;
			this.isVisibilidadCeldaCancelarCargoGrupo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargoGrupo=true;
				} else {
					this.isVisibilidadCeldaGuardarCargoGrupo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCargoGrupo=false;
			this.isVisibilidadCeldaNuevoRelacionesCargoGrupo=false;
			this.isVisibilidadCeldaGuardarCambiosCargoGrupo=false;
			this.isVisibilidadCeldaModificarCargoGrupo=false;
			this.isVisibilidadCeldaActualizarCargoGrupo=true;
			this.isVisibilidadCeldaEliminarCargoGrupo=false;
			this.isVisibilidadCeldaCancelarCargoGrupo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargoGrupo=false;
				} else {
					this.isVisibilidadCeldaGuardarCargoGrupo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCargoGrupo=true;
			this.isVisibilidadCeldaNuevoRelacionesCargoGrupo=true;
			this.isVisibilidadCeldaGuardarCambiosCargoGrupo=true;
			this.isVisibilidadCeldaModificarCargoGrupo=false;
			this.isVisibilidadCeldaActualizarCargoGrupo=false;
			this.isVisibilidadCeldaEliminarCargoGrupo=false;
			this.isVisibilidadCeldaCancelarCargoGrupo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargoGrupo=true;
				} else {
					this.isVisibilidadCeldaGuardarCargoGrupo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCargoGrupo=false;
			this.isVisibilidadCeldaNuevoRelacionesCargoGrupo=false;
			this.isVisibilidadCeldaGuardarCambiosCargoGrupo=false;
			this.isVisibilidadCeldaActualizarCargoGrupo=false;
			this.isVisibilidadCeldaEliminarCargoGrupo=false;
			this.isVisibilidadCeldaCancelarCargoGrupo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargoGrupo=false;
				} else {
					this.isVisibilidadCeldaGuardarCargoGrupo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCargoGrupo=false;
			this.isVisibilidadCeldaNuevoRelacionesCargoGrupo=false;
			this.isVisibilidadCeldaGuardarCambiosCargoGrupo=false;
			this.isVisibilidadCeldaModificarCargoGrupo=true;
			this.isVisibilidadCeldaActualizarCargoGrupo=false;
			this.isVisibilidadCeldaEliminarCargoGrupo=false;
			this.isVisibilidadCeldaCancelarCargoGrupo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargoGrupo=false;
				} else {
					this.isVisibilidadCeldaGuardarCargoGrupo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CargoGrupoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCargoGrupo=true;
			this.isVisibilidadCeldaNuevoRelacionesCargoGrupo=true;
			this.isVisibilidadCeldaGuardarCambiosCargoGrupo=true;
		} else {
			this.actualizarEstadoPanelsCargoGrupo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCargoGrupo=false;
			//this.isVisibilidadCeldaVerFormCargoGrupo=false;
			this.isVisibilidadCeldaDuplicarCargoGrupo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cargogrupoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCargoGrupo=false;
		} else {
			this.isVisibilidadCeldaNuevoCargoGrupo=false;
			this.isVisibilidadCeldaGuardarCambiosCargoGrupo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cargogrupoSessionBean.getEsGuardarRelacionado()) {
			if(!cargogrupoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCargoGrupo=false;												
			}
			
			this.jButtonCerrarCargoGrupo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCargoGrupo=false;
		}
		
		if(!this.permiteMantenimiento(this.cargogrupo)) {
			this.isVisibilidadCeldaActualizarCargoGrupo=false;
			this.isVisibilidadCeldaEliminarCargoGrupo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCargoGrupo() {
		this.isVisibilidadCeldaNuevoCargoGrupo=false;
		this.isVisibilidadCeldaGuardarCambiosCargoGrupo=false;
	}
	
	public void actualizarEstadoPanelsCargoGrupo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCargoGrupo!=null) {
				this.jScrollPanelDatosEdicionCargoGrupo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargoGrupo!=null) {
				this.jTabbedPaneBusquedasCargoGrupo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCargoGrupo!=null) {
				this.jScrollPanelDatosCargoGrupo.setVisible(true);
			}
			
			if(this.jPanelPaginacionCargoGrupo!=null) {
				this.jPanelPaginacionCargoGrupo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCargoGrupo!=null) {
				this.jPanelParametrosReportesCargoGrupo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCargoGrupo!=null) {
				this.jScrollPanelDatosEdicionCargoGrupo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargoGrupo!=null) {
				this.jTabbedPaneBusquedasCargoGrupo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCargoGrupo!=null) {
				this.jScrollPanelDatosCargoGrupo.setVisible(false);
			}
			
			if(this.jPanelPaginacionCargoGrupo!=null) {
				this.jPanelPaginacionCargoGrupo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCargoGrupo!=null) {
				this.jPanelParametrosReportesCargoGrupo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCargoGrupo!=null) {
				this.jScrollPanelDatosEdicionCargoGrupo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargoGrupo!=null) {
				this.jTabbedPaneBusquedasCargoGrupo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCargoGrupo!=null) {
				this.jScrollPanelDatosCargoGrupo.setVisible(false);
			}
			
			if(this.jPanelPaginacionCargoGrupo!=null) {
				this.jPanelPaginacionCargoGrupo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCargoGrupo!=null) {
				this.jPanelParametrosReportesCargoGrupo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCargoGrupo!=null) {
				this.jScrollPanelDatosEdicionCargoGrupo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargoGrupo!=null) {
				this.jTabbedPaneBusquedasCargoGrupo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCargoGrupo!=null) {
				this.jScrollPanelDatosCargoGrupo.setVisible(false);
			}
			
			if(this.jPanelPaginacionCargoGrupo!=null) {
				this.jPanelPaginacionCargoGrupo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCargoGrupo!=null) {
				this.jPanelParametrosReportesCargoGrupo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCargoGrupo!=null) {
				this.jScrollPanelDatosEdicionCargoGrupo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargoGrupo!=null) {
				this.jTabbedPaneBusquedasCargoGrupo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCargoGrupo!=null) {
				this.jScrollPanelDatosCargoGrupo.setVisible(true);
			}
			
			if(this.jPanelPaginacionCargoGrupo!=null) {
				this.jPanelPaginacionCargoGrupo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCargoGrupo!=null) {
				this.jPanelParametrosReportesCargoGrupo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCargoGrupo!=null) {
				this.jScrollPanelDatosEdicionCargoGrupo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargoGrupo!=null) {
				this.jTabbedPaneBusquedasCargoGrupo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCargoGrupo!=null) {
				this.jScrollPanelDatosCargoGrupo.setVisible(true);
			}
			
			if(this.jPanelPaginacionCargoGrupo!=null) {
				this.jPanelPaginacionCargoGrupo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCargoGrupo!=null) {
				this.jPanelParametrosReportesCargoGrupo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCargoGrupo!=null) {
				this.jScrollPanelDatosEdicionCargoGrupo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargoGrupo!=null) {
				this.jTabbedPaneBusquedasCargoGrupo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCargoGrupo!=null) {
				this.jScrollPanelDatosCargoGrupo.setVisible(true);
			}
			
			if(this.jPanelPaginacionCargoGrupo!=null) {
				this.jPanelPaginacionCargoGrupo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCargoGrupo!=null) {
				this.jPanelParametrosReportesCargoGrupo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCargoGrupo!=null) {
					this.jTabbedPaneBusquedasCargoGrupo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCargoGrupo!=null) {
				this.jPanelParametrosReportesCargoGrupo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargoGrupo!=null) {
				this.jTabbedPaneBusquedasCargoGrupo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCargoGrupo!=null) {
				this.jPanelParametrosReportesCargoGrupo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionCargoGrupoParaCargos() throws Exception {
		Boolean isPaginaPopupCargo=false;

		try {

			if(this.cargogrupoSessionBean==null) {
				this.cargogrupoSessionBean=new CargoGrupoSessionBean();
			}

			if(this.jInternalFrameDetalleFormCargoGrupo.cargoSessionBean==null) {
				this.jInternalFrameDetalleFormCargoGrupo.cargoSessionBean=new CargoSessionBean();
			}

			this.jInternalFrameDetalleFormCargoGrupo.cargoSessionBean.setsPathNavegacionActual(cargogrupoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CargoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCargoGrupo.cargoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCargo=this.jInternalFrameDetalleFormCargoGrupo.cargoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCargoGrupo.cargoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCargo(true);
			this.jInternalFrameDetalleFormCargoGrupo.cargoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCargo(CargoGrupoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCargoGrupo.cargoSessionBean.setisBusquedaDesdeForeignKeySesionCargoGrupo(true);
			this.jInternalFrameDetalleFormCargoGrupo.cargoSessionBean.setlidCargoGrupoActual(this.idCargoGrupoActual);

			cargogrupoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCargoGrupo(true);
			cargogrupoSessionBean.setlIdCargoGrupoActualForeignKey(this.idCargoGrupoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CargoGrupoSessionBean cargogrupoSessionBean=new CargoGrupoSessionBean();
		
		if(this.cargogrupoSessionBean==null) {
			this.cargogrupoSessionBean=new CargoGrupoSessionBean();
		}
		
		this.cargogrupoSessionBean.setsUltimaBusquedaCargoGrupo(this.getsAccionBusqueda());
		this.cargogrupoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cargogrupoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			cargogrupoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CargoGrupoSessionBean cargogrupoSessionBean=new CargoGrupoSessionBean();
		
		if(this.cargogrupoSessionBean==null) {
			this.cargogrupoSessionBean=new CargoGrupoSessionBean();
		}
		
		if(this.cargogrupoSessionBean.getsUltimaBusquedaCargoGrupo()!=null&&!this.cargogrupoSessionBean.getsUltimaBusquedaCargoGrupo().equals("")) {
			this.setsAccionBusqueda(cargogrupoSessionBean.getsUltimaBusquedaCargoGrupo());
			this.setiNumeroPaginacion(cargogrupoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cargogrupoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(cargogrupoSessionBean.getid_empresa());
				cargogrupoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.cargogrupoSessionBean.setsUltimaBusquedaCargoGrupo("");
		this.cargogrupoSessionBean.setiNumeroPaginacion(CargoGrupoConstantesFunciones.INUMEROPAGINACION);
		this.cargogrupoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCargoGrupo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCargoGrupo() {
		this.updateBorderResaltarBusquedasFormularioCargoGrupo();
		this.updateVisibilidadBusquedasFormularioCargoGrupo();
		this.updateHabilitarBusquedasFormularioCargoGrupo();
	}
	
	public void updateBorderResaltarBusquedasFormularioCargoGrupo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCargoGrupo.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCargoGrupo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCargoGrupo.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCargoGrupo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCargoGrupo.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCargoGrupo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarCargoGrupo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCargoGrupo() throws Exception {

		if(this.jInternalFrameDetalleFormCargoGrupo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCargoGrupo();
		this.updateVisibilidadResaltarControlesFormularioCargoGrupo();
		this.updateHabilitarResaltarControlesFormularioCargoGrupo();
		
	}
	
	public void updateBorderResaltarControlesFormularioCargoGrupo() throws Exception {
		if(this.jInternalFrameDetalleFormCargoGrupo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cargogrupoConstantesFunciones.resaltaridCargoGrupo!=null && this.jInternalFrameDetalleFormCargoGrupo!=null) {this.jInternalFrameDetalleFormCargoGrupo.jLabelidCargoGrupo.setBorder(this.cargogrupoConstantesFunciones.resaltaridCargoGrupo);}
		if(this.cargogrupoConstantesFunciones.resaltarid_empresaCargoGrupo!=null && this.jInternalFrameDetalleFormCargoGrupo!=null) {this.jInternalFrameDetalleFormCargoGrupo.jComboBoxid_empresaCargoGrupo.setBorder(this.cargogrupoConstantesFunciones.resaltarid_empresaCargoGrupo);}
		if(this.cargogrupoConstantesFunciones.resaltarcodigoCargoGrupo!=null && this.jInternalFrameDetalleFormCargoGrupo!=null) {this.jInternalFrameDetalleFormCargoGrupo.jTextFieldcodigoCargoGrupo.setBorder(this.cargogrupoConstantesFunciones.resaltarcodigoCargoGrupo);}
		if(this.cargogrupoConstantesFunciones.resaltarnombreCargoGrupo!=null && this.jInternalFrameDetalleFormCargoGrupo!=null) {this.jInternalFrameDetalleFormCargoGrupo.jTextAreanombreCargoGrupo.setBorder(this.cargogrupoConstantesFunciones.resaltarnombreCargoGrupo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCargoGrupo() throws Exception {		
		if(this.jInternalFrameDetalleFormCargoGrupo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
	
		//this.jInternalFrameDetalleFormCargoGrupo.jLabelidCargoGrupo.setVisible(this.cargogrupoConstantesFunciones.mostraridCargoGrupo);
		this.jInternalFrameDetalleFormCargoGrupo.jPanelidCargoGrupo.setVisible(this.cargogrupoConstantesFunciones.mostraridCargoGrupo);
		//this.jInternalFrameDetalleFormCargoGrupo.jComboBoxid_empresaCargoGrupo.setVisible(this.cargogrupoConstantesFunciones.mostrarid_empresaCargoGrupo);
		this.jInternalFrameDetalleFormCargoGrupo.jPanelid_empresaCargoGrupo.setVisible(this.cargogrupoConstantesFunciones.mostrarid_empresaCargoGrupo);
		//this.jInternalFrameDetalleFormCargoGrupo.jTextFieldcodigoCargoGrupo.setVisible(this.cargogrupoConstantesFunciones.mostrarcodigoCargoGrupo);
		this.jInternalFrameDetalleFormCargoGrupo.jPanelcodigoCargoGrupo.setVisible(this.cargogrupoConstantesFunciones.mostrarcodigoCargoGrupo);
		//this.jInternalFrameDetalleFormCargoGrupo.jTextAreanombreCargoGrupo.setVisible(this.cargogrupoConstantesFunciones.mostrarnombreCargoGrupo);
		this.jInternalFrameDetalleFormCargoGrupo.jPanelnombreCargoGrupo.setVisible(this.cargogrupoConstantesFunciones.mostrarnombreCargoGrupo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCargoGrupo() throws Exception {
		if(this.jInternalFrameDetalleFormCargoGrupo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCargoGrupo!=null) {
	
		this.jInternalFrameDetalleFormCargoGrupo.jLabelidCargoGrupo.setEnabled(this.cargogrupoConstantesFunciones.activaridCargoGrupo);
		this.jInternalFrameDetalleFormCargoGrupo.jComboBoxid_empresaCargoGrupo.setEnabled(this.cargogrupoConstantesFunciones.activarid_empresaCargoGrupo);
		this.jInternalFrameDetalleFormCargoGrupo.jTextFieldcodigoCargoGrupo.setEnabled(this.cargogrupoConstantesFunciones.activarcodigoCargoGrupo);
		this.jInternalFrameDetalleFormCargoGrupo.jTextAreanombreCargoGrupo.setEnabled(this.cargogrupoConstantesFunciones.activarnombreCargoGrupo);
		}
	}
	
		
}