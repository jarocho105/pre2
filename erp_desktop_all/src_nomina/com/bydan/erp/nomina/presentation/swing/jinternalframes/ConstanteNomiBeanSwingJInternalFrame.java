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

import com.bydan.erp.nomina.util.ConstanteNomiConstantesFunciones;
import com.bydan.erp.nomina.util.ConstanteNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.ConstanteNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.ConstanteNomiBean;
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
public class ConstanteNomiBeanSwingJInternalFrame extends ConstanteNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ConstanteNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ConstanteNomi> constantenomiValidator = new ClassValidator<ConstanteNomi>(ConstanteNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ConstanteNomi constantenomi;	
	public ConstanteNomi constantenomiAux;
	public ConstanteNomi constantenomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ConstanteNomi constantenomiTotales;
	public Long idConstanteNomiActual;
	public Long iIdNuevoConstanteNomi=0L;
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

	public String sFinalQueryComboTipoConstanteNomi="";

	public List<TipoConstanteNomi> tipoconstantenomisForeignKey;

	public List<TipoConstanteNomi> gettipoconstantenomisForeignKey() {
		return tipoconstantenomisForeignKey;
	}

	public void settipoconstantenomisForeignKey(List<TipoConstanteNomi> tipoconstantenomisForeignKey) {
		this.tipoconstantenomisForeignKey = tipoconstantenomisForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoConstanteNomi tipoconstantenomiForeignKey;

	public TipoConstanteNomi gettipoconstantenomiForeignKey() {
		return tipoconstantenomiForeignKey;
	}

	public void settipoconstantenomiForeignKey(TipoConstanteNomi tipoconstantenomiForeignKey) {
		this.tipoconstantenomiForeignKey = tipoconstantenomiForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosEmpleadoConstante=false;

	public Boolean getIsTienePermisosEmpleadoConstante() {
		return isTienePermisosEmpleadoConstante;
	}

	public void setIsTienePermisosEmpleadoConstante(Boolean isTienePermisosEmpleadoConstante) {
		this.isTienePermisosEmpleadoConstante= isTienePermisosEmpleadoConstante;
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
	
	public Boolean isPermisoTodoConstanteNomi;
	public Boolean isPermisoNuevoConstanteNomi;
	public Boolean isPermisoActualizarConstanteNomi;
	public Boolean isPermisoActualizarOriginalConstanteNomi;
	public Boolean isPermisoEliminarConstanteNomi;
	public Boolean isPermisoGuardarCambiosConstanteNomi;
	public Boolean isPermisoConsultaConstanteNomi;
	public Boolean isPermisoBusquedaConstanteNomi;
	public Boolean isPermisoReporteConstanteNomi;
	public Boolean isPermisoPaginacionMedioConstanteNomi;
	public Boolean isPermisoPaginacionAltoConstanteNomi;
	public Boolean isPermisoPaginacionTodoConstanteNomi;
	public Boolean isPermisoCopiarConstanteNomi;
	public Boolean isPermisoVerFormConstanteNomi;
	public Boolean isPermisoDuplicarConstanteNomi;
	public Boolean isPermisoOrdenConstanteNomi;
	
	
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
	
	public ConstanteNomiParameterReturnGeneral constantenomiReturnGeneral;
	public ConstanteNomiParameterReturnGeneral constantenomiParameterGeneral;
	
	

	public EmpleadoConstanteLogic empleadoconstanteLogic=null;

	public EmpleadoConstanteLogic getEmpleadoConstanteLogic() {
		return empleadoconstanteLogic;
	}

	public void setEmpleadoConstanteLogic(EmpleadoConstanteLogic empleadoconstanteLogic) {
		this.empleadoconstanteLogic = empleadoconstanteLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoConstanteNomi=false;
	public Boolean esParaAccionDesdeFormularioConstanteNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public ConstanteNomiLogic constantenomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ConstanteNomi constantenomiBean;
	public ConstanteNomiConstantesFunciones constantenomiConstantesFunciones;
	//public ConstanteNomiParameterReturnGeneral constantenomiReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoConstanteNomiLogic tipoconstantenomiLogic;
	
	//PARAMETROS
	
	
	//public List<ConstanteNomi> constantenomis;	
	//public List<ConstanteNomi> constantenomisEliminados;
	//public List<ConstanteNomi> constantenomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoConstanteNomi=false;
	public Boolean isVisibilidadCeldaDuplicarConstanteNomi=true;
	public Boolean isVisibilidadCeldaCopiarConstanteNomi=true;
	public Boolean isVisibilidadCeldaVerFormConstanteNomi=true;
	public Boolean isVisibilidadCeldaOrdenConstanteNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesConstanteNomi=false;
	public Boolean isVisibilidadCeldaModificarConstanteNomi=false;
	public Boolean isVisibilidadCeldaActualizarConstanteNomi=false;
	public Boolean isVisibilidadCeldaEliminarConstanteNomi=false;
	public Boolean isVisibilidadCeldaCancelarConstanteNomi=false;
	public Boolean isVisibilidadCeldaGuardarConstanteNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosConstanteNomi=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoConstante=false;
	
	public Long getiIdNuevoConstanteNomi() {
		return this.iIdNuevoConstanteNomi;
	}

	public void setiIdNuevoConstanteNomi(Long iIdNuevoConstanteNomi) {
		this.iIdNuevoConstanteNomi = iIdNuevoConstanteNomi;
	}
	
	public Long getidConstanteNomiActual() {
		return this.idConstanteNomiActual;
	}

	public void setidConstanteNomiActual(Long idConstanteNomiActual) {
		this.idConstanteNomiActual = idConstanteNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ConstanteNomi getconstantenomi() {
		return this.constantenomi;
	}

	public void setconstantenomi(ConstanteNomi constantenomi) {
		this.constantenomi = constantenomi;
	}
	
	public ConstanteNomi getconstantenomiAux() {
		return this.constantenomiAux;
	}

	public void setconstantenomiAux(ConstanteNomi constantenomiAux) {
		this.constantenomiAux = constantenomiAux;
	}				
	
	public ConstanteNomi getconstantenomiAnterior() {
		return this.constantenomiAnterior;
	}

	public void setconstantenomiAnterior(ConstanteNomi constantenomiAnterior) {
		this.constantenomiAnterior = constantenomiAnterior;
	}	
	
	public ConstanteNomi getconstantenomiTotales() {
		return this.constantenomiTotales;
	}

	public void setconstantenomiTotales(ConstanteNomi constantenomiTotales) {
		this.constantenomiTotales = constantenomiTotales;
	}	
	
	public ConstanteNomi getconstantenomiBean() {
		return this.constantenomiBean;
	}

	public void setconstantenomiBean(ConstanteNomi constantenomiBean) {
		this.constantenomiBean = constantenomiBean;
	}	
	
	public ConstanteNomiParameterReturnGeneral getconstantenomiReturnGeneral() {
		return this.constantenomiReturnGeneral;
	}

	public void setconstantenomiReturnGeneral(ConstanteNomiParameterReturnGeneral constantenomiReturnGeneral) {
		this.constantenomiReturnGeneral = constantenomiReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_tipo_constante_nomiFK_IdTipoConstante=-1L;

	public Long getid_tipo_constante_nomiFK_IdTipoConstante() {
		return this.id_tipo_constante_nomiFK_IdTipoConstante;
	}

	public void setid_tipo_constante_nomiFK_IdTipoConstante(Long id_tipo_constante_nomiFK_IdTipoConstante) {
		this.id_tipo_constante_nomiFK_IdTipoConstante = id_tipo_constante_nomiFK_IdTipoConstante;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ConstanteNomiLogic getConstanteNomiLogic()	{		
		return constantenomiLogic;
	}

	public void setConstanteNomiLogic(ConstanteNomiLogic constantenomiLogic) {
		this.constantenomiLogic = constantenomiLogic;
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
	
	public Boolean getIsEsNuevoConstanteNomi() {
		return isEsNuevoConstanteNomi;
	}

	public void setIsEsNuevoConstanteNomi(Boolean isEsNuevoConstanteNomi) {
		this.isEsNuevoConstanteNomi = isEsNuevoConstanteNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioConstanteNomi() {
		return esParaAccionDesdeFormularioConstanteNomi;
	}
	
	public void setEsParaAccionDesdeFormularioConstanteNomi(Boolean esParaAccionDesdeFormularioConstanteNomi) {
		this.esParaAccionDesdeFormularioConstanteNomi = esParaAccionDesdeFormularioConstanteNomi;
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

			if(this.constantenomiSessionBean==null) {
				this.constantenomiSessionBean=new ConstanteNomiSessionBean();
			}

			if(!this.constantenomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(constantenomiSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTipoConstanteNomisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoconstantenomisForeignKey=new ArrayList<TipoConstanteNomi>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoConstanteNomiLogic tipoconstantenomiLogic=new TipoConstanteNomiLogic();

			//tipoconstantenomiLogic.getTipoConstanteNomiDataAccess().setIsForForeingKeyData(true);

			if(this.constantenomiSessionBean==null) {
				this.constantenomiSessionBean=new ConstanteNomiSessionBean();
			}

			if(!this.constantenomiSessionBean.getisBusquedaDesdeForeignKeySesionTipoConstanteNomi()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoconstantenomiLogic.getTipoConstanteNomiDataAccess().setIsForForeingKeyData(true);

					tipoconstantenomiLogic.getTodosTipoConstanteNomisWithConnection(sFinalQuery,new Pagination());

					this.tipoconstantenomisForeignKey=tipoconstantenomiLogic.getTipoConstanteNomis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoConstanteNomi(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoconstantenomiLogic.getEntityWithConnection(constantenomiSessionBean.getlidTipoConstanteNomiActual());
					this.tipoconstantenomisForeignKey.add(tipoconstantenomiLogic.getTipoConstanteNomi());
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

					if(this.constantenomi!=null) {
						this.constantenomi.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
						this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_empresaConstanteNomi.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaConstanteNomi.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
						if(this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_empresaConstanteNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_empresaConstanteNomi.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaConstanteNomiGenerico)throws Exception
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
				jComboBoxid_empresaConstanteNomiGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaConstanteNomiGenerico!=null && jComboBoxid_empresaConstanteNomiGenerico.getItemCount()>0) {
					jComboBoxid_empresaConstanteNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoConstanteNomiForeignKey(Long idTipoConstanteNomiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoConstanteNomi  tipoconstantenomiTemp=null;

			for(TipoConstanteNomi tipoconstantenomiAux:tipoconstantenomisForeignKey) {
				if(tipoconstantenomiAux.getId()!=null && tipoconstantenomiAux.getId().equals(idTipoConstanteNomiSeleccionado)) {
					tipoconstantenomiTemp=tipoconstantenomiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoconstantenomiTemp!=null) {

					if(this.constantenomi!=null) {
						this.constantenomi.setTipoConstanteNomi(tipoconstantenomiTemp);
					}

					if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
						this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_tipo_constante_nomiConstanteNomi.setSelectedItem(tipoconstantenomiTemp);
					}
				} else {
					//jComboBoxid_tipo_constante_nomiConstanteNomi.setSelectedItem(tipoconstantenomiTemp);
					if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
						if(this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_tipo_constante_nomiConstanteNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_tipo_constante_nomiConstanteNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoConstante") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoconstantenomiTemp!=null && jComboBoxid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi!=null) {
						jComboBoxid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi.setSelectedItem(tipoconstantenomiTemp);
					} else {
						if(jComboBoxid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi!=null) {
							//jComboBoxid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi.setSelectedItem(tipoconstantenomiTemp);
							if(jComboBoxid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi.getItemCount()>0) {
								jComboBoxid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi.setSelectedIndex(0);
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

	public String getActualTipoConstanteNomiForeignKeyDescripcion(Long idTipoConstanteNomiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoConstanteNomi  tipoconstantenomiTemp=null;

			for(TipoConstanteNomi tipoconstantenomiAux:tipoconstantenomisForeignKey) {
				if(tipoconstantenomiAux.getId()!=null && tipoconstantenomiAux.getId().equals(idTipoConstanteNomiSeleccionado)) {
					tipoconstantenomiTemp=tipoconstantenomiAux;
					break;
				}
			}


			sDescripcion=TipoConstanteNomiConstantesFunciones.getTipoConstanteNomiDescripcion(tipoconstantenomiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoConstanteNomiForeignKeyGenerico(Long idTipoConstanteNomiSeleccionado,JComboBox jComboBoxid_tipo_constante_nomiConstanteNomiGenerico)throws Exception
	{
		try
		{
			TipoConstanteNomi  tipoconstantenomiTemp=null;

			for(TipoConstanteNomi tipoconstantenomiAux:tipoconstantenomisForeignKey) {
				if(tipoconstantenomiAux.getId()!=null && tipoconstantenomiAux.getId().equals(idTipoConstanteNomiSeleccionado)) {
					tipoconstantenomiTemp=tipoconstantenomiAux;
					break;
				}
			}

			if(tipoconstantenomiTemp!=null) {
				jComboBoxid_tipo_constante_nomiConstanteNomiGenerico.setSelectedItem(tipoconstantenomiTemp);
			} else {
				if(jComboBoxid_tipo_constante_nomiConstanteNomiGenerico!=null && jComboBoxid_tipo_constante_nomiConstanteNomiGenerico.getItemCount()>0) {
					jComboBoxid_tipo_constante_nomiConstanteNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ConstanteNomi constantenomi,JComboBox jComboBoxid_empresaConstanteNomiGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaConstanteNomiGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_empresaConstanteNomi.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaConstanteNomiGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				constantenomi.setid_empresa(empresaAux.getId());
				constantenomi.setempresa_descripcion(ConstanteNomiConstantesFunciones.getEmpresaDescripcion(empresaAux));
				constantenomi.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoConstanteNomiForeignKey(ConstanteNomi constantenomi,JComboBox jComboBoxid_tipo_constante_nomiConstanteNomiGenerico)throws Exception
	{
		try
		{
			TipoConstanteNomi  tipoconstantenomiAux=new TipoConstanteNomi();

			if(jComboBoxid_tipo_constante_nomiConstanteNomiGenerico==null) {
				tipoconstantenomiAux=(TipoConstanteNomi)this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_tipo_constante_nomiConstanteNomi.getSelectedItem();
			} else {
				tipoconstantenomiAux=(TipoConstanteNomi)jComboBoxid_tipo_constante_nomiConstanteNomiGenerico.getSelectedItem();
			}

			if(tipoconstantenomiAux!=null && tipoconstantenomiAux.getId()!=null) {
				constantenomi.setid_tipo_constante_nomi(tipoconstantenomiAux.getId());
				constantenomi.settipoconstantenomi_descripcion(ConstanteNomiConstantesFunciones.getTipoConstanteNomiDescripcion(tipoconstantenomiAux));
				constantenomi.setTipoConstanteNomi(tipoconstantenomiAux);			}
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

					if(!ConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConstanteNomi!=null) { 
							this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_empresaConstanteNomi.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_empresaConstanteNomi.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConstanteNomi!=null) { 
					}

					if(!ConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoConstanteNomisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoConstanteNomi=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConstanteNomi!=null) { 
							this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_tipo_constante_nomiConstanteNomi.removeAllItems();

							for(TipoConstanteNomi tipoconstantenomi:this.tipoconstantenomisForeignKey) {
								this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_tipo_constante_nomiConstanteNomi.addItem(tipoconstantenomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConstanteNomi!=null) { 
					}

					if(!ConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoConstante") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi.removeAllItems();

							for(TipoConstanteNomi tipoconstantenomi:this.tipoconstantenomisForeignKey) {
								this.jComboBoxid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi.addItem(tipoconstantenomi);
							}
						}

						if(!ConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
							this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_empresaConstanteNomi.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
							this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_empresaConstanteNomi.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoConstanteNomiForeignKey(TipoConstanteNomi tipoconstantenomi,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
							this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_tipo_constante_nomiConstanteNomi.setSelectedItem(tipoconstantenomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
							this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_tipo_constante_nomiConstanteNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi.setSelectedItem(tipoconstantenomi);
						} else {
							this.jComboBoxid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesConstanteNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ConstanteNomiConstantesFunciones.refrescarForeignKeysDescripcionesConstanteNomi(this.constantenomiLogic.getConstanteNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ConstanteNomiConstantesFunciones.refrescarForeignKeysDescripcionesConstanteNomi(this.constantenomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoConstanteNomi.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//constantenomiLogic.setConstanteNomis(this.constantenomis);
			constantenomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ConstanteNomiParameterReturnGeneral getConstanteNomiParameterGeneral() {
		return this.constantenomiParameterGeneral;
	}
	
	public void setConstanteNomiParameterGeneral(ConstanteNomiParameterReturnGeneral constantenomiParameterGeneral) {
		this.constantenomiParameterGeneral = constantenomiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoConstanteNomi() {
		return isPermisoTodoConstanteNomi;
	}

	public void setIsPermisoTodoConstanteNomi(Boolean isPermisoTodoConstanteNomi) {
		this.isPermisoTodoConstanteNomi = isPermisoTodoConstanteNomi;
	}

	public Boolean getIsPermisoNuevoConstanteNomi() {
		return isPermisoNuevoConstanteNomi;
	}

	public void setIsPermisoNuevoConstanteNomi(Boolean isPermisoNuevoConstanteNomi) {
		this.isPermisoNuevoConstanteNomi = isPermisoNuevoConstanteNomi;
	}

	public Boolean getIsPermisoActualizarConstanteNomi() {
		return isPermisoActualizarConstanteNomi;
	}

	public void setIsPermisoActualizarConstanteNomi(Boolean isPermisoActualizarConstanteNomi) {
		this.isPermisoActualizarConstanteNomi = isPermisoActualizarConstanteNomi;
	}

	public Boolean getIsPermisoEliminarConstanteNomi() {
		return isPermisoEliminarConstanteNomi;
	}

	public void setIsPermisoEliminarConstanteNomi(Boolean isPermisoEliminarConstanteNomi) {
		this.isPermisoEliminarConstanteNomi = isPermisoEliminarConstanteNomi;
	}

	public Boolean getIsPermisoGuardarCambiosConstanteNomi() {
		return isPermisoGuardarCambiosConstanteNomi;
	}

	public void setIsPermisoGuardarCambiosConstanteNomi(Boolean isPermisoGuardarCambiosConstanteNomi) {
		this.isPermisoGuardarCambiosConstanteNomi = isPermisoGuardarCambiosConstanteNomi;
	}
	
	public Boolean getIsPermisoConsultaConstanteNomi() {
		return isPermisoConsultaConstanteNomi;
	}

	public void setIsPermisoConsultaConstanteNomi(Boolean isPermisoConsultaConstanteNomi) {
		this.isPermisoConsultaConstanteNomi = isPermisoConsultaConstanteNomi;
	}

	public Boolean getIsPermisoBusquedaConstanteNomi() {
		return isPermisoBusquedaConstanteNomi;
	}

	public void setIsPermisoBusquedaConstanteNomi(Boolean isPermisoBusquedaConstanteNomi) {
		this.isPermisoBusquedaConstanteNomi = isPermisoBusquedaConstanteNomi;
	}

	public Boolean getIsPermisoReporteConstanteNomi() {
		return isPermisoReporteConstanteNomi;
	}

	public void setIsPermisoReporteConstanteNomi(Boolean isPermisoReporteConstanteNomi) {
		this.isPermisoReporteConstanteNomi = isPermisoReporteConstanteNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioConstanteNomi() {
		return isPermisoPaginacionMedioConstanteNomi;
	}

	public void setIsPermisoPaginacionMedioConstanteNomi(Boolean isPermisoPaginacionMedioConstanteNomi) {
		this.isPermisoPaginacionMedioConstanteNomi = isPermisoPaginacionMedioConstanteNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoConstanteNomi() {
		return isPermisoPaginacionTodoConstanteNomi;
	}

	public void setIsPermisoPaginacionTodoConstanteNomi(Boolean isPermisoPaginacionTodoConstanteNomi) {
		this.isPermisoPaginacionTodoConstanteNomi = isPermisoPaginacionTodoConstanteNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoConstanteNomi() {
		return isPermisoPaginacionAltoConstanteNomi;
	}

	public void setIsPermisoPaginacionAltoConstanteNomi(Boolean isPermisoPaginacionAltoConstanteNomi) {
		this.isPermisoPaginacionAltoConstanteNomi = isPermisoPaginacionAltoConstanteNomi;
	}
	
	public Boolean getIsPermisoCopiarConstanteNomi() {
		return isPermisoCopiarConstanteNomi;
	}

	public void setIsPermisoCopiarConstanteNomi(Boolean isPermisoCopiarConstanteNomi) {
		this.isPermisoCopiarConstanteNomi = isPermisoCopiarConstanteNomi;
	}
	
	public Boolean getIsPermisoVerFormConstanteNomi() {
		return isPermisoVerFormConstanteNomi;
	}

	public void setIsPermisoVerFormConstanteNomi(Boolean isPermisoVerFormConstanteNomi) {
		this.isPermisoVerFormConstanteNomi = isPermisoVerFormConstanteNomi;
	}
	
	public Boolean getIsPermisoDuplicarConstanteNomi() {
		return isPermisoDuplicarConstanteNomi;
	}

	public void setIsPermisoDuplicarConstanteNomi(Boolean isPermisoDuplicarConstanteNomi) {
		this.isPermisoDuplicarConstanteNomi = isPermisoDuplicarConstanteNomi;
	}
	
	public Boolean getIsPermisoOrdenConstanteNomi() {
		return isPermisoOrdenConstanteNomi;
	}

	public void setIsPermisoOrdenConstanteNomi(Boolean isPermisoOrdenConstanteNomi) {
		this.isPermisoOrdenConstanteNomi = isPermisoOrdenConstanteNomi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoConstanteNomi() {
		return isVisibilidadCeldaNuevoConstanteNomi;
	}

	public void setIsVisibilidadCeldaNuevoConstanteNomi(Boolean isVisibilidadCeldaNuevoConstanteNomi) {
		this.isVisibilidadCeldaNuevoConstanteNomi = isVisibilidadCeldaNuevoConstanteNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarConstanteNomi() {
		return isVisibilidadCeldaDuplicarConstanteNomi;
	}

	public void setIsVisibilidadCeldaDuplicarConstanteNomi(Boolean isVisibilidadCeldaDuplicarConstanteNomi) {
		this.isVisibilidadCeldaDuplicarConstanteNomi = isVisibilidadCeldaDuplicarConstanteNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarConstanteNomi() {
		return isVisibilidadCeldaCopiarConstanteNomi;
	}

	public void setIsVisibilidadCeldaCopiarConstanteNomi(Boolean isVisibilidadCeldaCopiarConstanteNomi) {
		this.isVisibilidadCeldaCopiarConstanteNomi = isVisibilidadCeldaCopiarConstanteNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormConstanteNomi() {
		return isVisibilidadCeldaVerFormConstanteNomi;
	}

	public void setIsVisibilidadCeldaVerFormConstanteNomi(Boolean isVisibilidadCeldaVerFormConstanteNomi) {
		this.isVisibilidadCeldaVerFormConstanteNomi = isVisibilidadCeldaVerFormConstanteNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenConstanteNomi() {
		return isVisibilidadCeldaOrdenConstanteNomi;
	}

	public void setIsVisibilidadCeldaOrdenConstanteNomi(Boolean isVisibilidadCeldaOrdenConstanteNomi) {
		this.isVisibilidadCeldaOrdenConstanteNomi = isVisibilidadCeldaOrdenConstanteNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesConstanteNomi() {
		return isVisibilidadCeldaNuevoRelacionesConstanteNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesConstanteNomi(Boolean isVisibilidadCeldaNuevoRelacionesConstanteNomi) {
		this.isVisibilidadCeldaNuevoRelacionesConstanteNomi = isVisibilidadCeldaNuevoRelacionesConstanteNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarConstanteNomi() {
		return isVisibilidadCeldaModificarConstanteNomi;
	}

	public void setIsVisibilidadCeldaModificarConstanteNomi(Boolean isVisibilidadCeldaModificarConstanteNomi) {
		this.isVisibilidadCeldaModificarConstanteNomi = isVisibilidadCeldaModificarConstanteNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarConstanteNomi() {
		return isVisibilidadCeldaActualizarConstanteNomi;
	}

	public void setIsVisibilidadCeldaActualizarConstanteNomi(Boolean isVisibilidadCeldaActualizarConstanteNomi) {
		this.isVisibilidadCeldaActualizarConstanteNomi = isVisibilidadCeldaActualizarConstanteNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarConstanteNomi() {
		return isVisibilidadCeldaEliminarConstanteNomi;
	}

	public void setIsVisibilidadCeldaEliminarConstanteNomi(Boolean isVisibilidadCeldaEliminarConstanteNomi) {
		this.isVisibilidadCeldaEliminarConstanteNomi = isVisibilidadCeldaEliminarConstanteNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarConstanteNomi() {
		return isVisibilidadCeldaCancelarConstanteNomi;
	}

	public void setIsVisibilidadCeldaCancelarConstanteNomi(Boolean isVisibilidadCeldaCancelarConstanteNomi) {
		this.isVisibilidadCeldaCancelarConstanteNomi = isVisibilidadCeldaCancelarConstanteNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarConstanteNomi() {
		return isVisibilidadCeldaGuardarConstanteNomi;
	}

	public void setIsVisibilidadCeldaGuardarConstanteNomi(Boolean isVisibilidadCeldaGuardarConstanteNomi) {
		this.isVisibilidadCeldaGuardarConstanteNomi = isVisibilidadCeldaGuardarConstanteNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosConstanteNomi() {
		return isVisibilidadCeldaGuardarCambiosConstanteNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosConstanteNomi(Boolean isVisibilidadCeldaGuardarCambiosConstanteNomi) {
		this.isVisibilidadCeldaGuardarCambiosConstanteNomi = isVisibilidadCeldaGuardarCambiosConstanteNomi;
	}
		
	public ConstanteNomiSessionBean getconstantenomiSessionBean() {
		return this.constantenomiSessionBean;
	}
	
	public void setconstantenomiSessionBean(ConstanteNomiSessionBean constantenomiSessionBean) {
		this.constantenomiSessionBean=constantenomiSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTipoConstante() {
		return this.isVisibilidadFK_IdTipoConstante;
	}

	public void setisVisibilidadFK_IdTipoConstante(Boolean isVisibilidadFK_IdTipoConstante) {
		this.isVisibilidadFK_IdTipoConstante=isVisibilidadFK_IdTipoConstante;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(ConstanteNomi constantenomi)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(constantenomi,null);
				this.setActualParaGuardarTipoConstanteNomiForeignKey(constantenomi,null);
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
	
	public void bugActualizarReferenciaActual(ConstanteNomi constantenomi,ConstanteNomi constantenomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalConstanteNomi(constantenomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		constantenomiAux.setId(constantenomi.getId());
		constantenomiAux.setVersionRow(constantenomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessConstanteNomi();
		
			int intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomi =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.constantenomi =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualConstanteNomi(this.constantenomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = constantenomiValidator.getInvalidValues(this.constantenomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			constantenomiLogic.setDatosCliente(datosCliente);
			constantenomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				constantenomiAux=new  ConstanteNomi();
				
				constantenomiAux.setIsNew(true);
				constantenomiAux.setIsChanged(true);
				
				constantenomiAux.setConstanteNomiOriginal(this.constantenomi);
				
				constantenomiAux.setId(this.constantenomi.getId());	
				constantenomiAux.setVersionRow(this.constantenomi.getVersionRow());	
				constantenomiAux.setid_empresa(this.constantenomi.getid_empresa());	
				constantenomiAux.setid_tipo_constante_nomi(this.constantenomi.getid_tipo_constante_nomi());	
				constantenomiAux.setnombre(this.constantenomi.getnombre());	
				constantenomiAux.setvalor(this.constantenomi.getvalor());	
				constantenomiAux.setes_para_pregunta(this.constantenomi.getes_para_pregunta());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.constantenomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.constantenomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(constantenomiAux,constantenomiLogic.getConstanteNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(constantenomiAux,constantenomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.constantenomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.constantenomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						constantenomiLogic.saveConstanteNomis();//WithConnection
						//constantenomiLogic.getSetVersionRowConstanteNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.constantenomi,constantenomiAux);
					
					this.refrescarForeignKeysDescripcionesConstanteNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.constantenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				constantenomiAux=new  ConstanteNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.constantenomiSessionBean.getEsGuardarRelacionado() 
					|| (this.constantenomiSessionBean.getEsGuardarRelacionado() && this.constantenomi.getId()>=0)) {
						
					constantenomiAux.setIsNew(false);
				}
				
				constantenomiAux.setIsDeleted(false);
			
				constantenomiAux.setId(this.constantenomi.getId());	
				constantenomiAux.setVersionRow(this.constantenomi.getVersionRow());	
				constantenomiAux.setid_empresa(this.constantenomi.getid_empresa());	
				constantenomiAux.setid_tipo_constante_nomi(this.constantenomi.getid_tipo_constante_nomi());	
				constantenomiAux.setnombre(this.constantenomi.getnombre());	
				constantenomiAux.setvalor(this.constantenomi.getvalor());	
				constantenomiAux.setes_para_pregunta(this.constantenomi.getes_para_pregunta());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(constantenomiAux,constantenomiLogic.getConstanteNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(constantenomiAux,constantenomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.constantenomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.constantenomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						constantenomiLogic.saveConstanteNomis();//WithConnection
						//constantenomiLogic.getSetVersionRowConstanteNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.constantenomi,constantenomiAux);
					
					this.refrescarForeignKeysDescripcionesConstanteNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.constantenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				constantenomiAux=new  ConstanteNomi();
				
				constantenomiAux.setIsNew(false);
				constantenomiAux.setIsChanged(false);
				
				constantenomiAux.setIsDeleted(true);
				
				constantenomiAux.setId(this.constantenomi.getId());	
				constantenomiAux.setVersionRow(this.constantenomi.getVersionRow());	
				constantenomiAux.setid_empresa(this.constantenomi.getid_empresa());	
				constantenomiAux.setid_tipo_constante_nomi(this.constantenomi.getid_tipo_constante_nomi());	
				constantenomiAux.setnombre(this.constantenomi.getnombre());	
				constantenomiAux.setvalor(this.constantenomi.getvalor());	
				constantenomiAux.setes_para_pregunta(this.constantenomi.getes_para_pregunta());	
				
				if(this.constantenomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.constantenomiAux.getId()>=0) {	
						this.constantenomisEliminados.add(constantenomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(constantenomiAux,constantenomiLogic.getConstanteNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(constantenomiAux,constantenomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.constantenomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.constantenomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						constantenomiLogic.saveConstanteNomis();//WithConnection
						//constantenomiLogic.getSetVersionRowConstanteNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.constantenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.quitarFilaTotales();}
							constantenomiAux.setEmpleadoConstantes(this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.empleadoconstanteLogic.getEmpleadoConstantes());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.constantenomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.constantenomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(constantenomiAux,constantenomiLogic.getConstanteNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(constantenomiAux,constantenomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.getConstanteNomis().addAll(this.constantenomisEliminados);
					
					constantenomiLogic.saveConstanteNomis();//WithConnection
					//constantenomiLogic.getSetVersionRowConstanteNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesConstanteNomi();
				
				this.constantenomisEliminados= new ArrayList<ConstanteNomi>();		
			}
			
			if(this.constantenomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.constantenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Constante Nomi GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Constante Nomi",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.constantenomi=constantenomiAux;
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
      		//this.finishProcessConstanteNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(ConstanteNomi constantenomiLocal) throws Exception {
		
		if(this.constantenomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				constantenomiLocal.setEmpleadoConstantes(this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.empleadoconstanteLogic.getEmpleadoConstantes());
			
			} else {
			
				constantenomiLocal.setEmpleadoConstantes(this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.empleadoconstantes);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ConstanteNomi constantenomiLocal) throws Exception {	
		if(this.constantenomiSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				constantenomiLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoConstanteNomiDetalleFormJInternalFrame.class)) {
				TipoConstanteNomiBeanSwingJInternalFrame tipoconstantenomiBeanSwingJInternalFrameLocal=(TipoConstanteNomiBeanSwingJInternalFrame) ((TipoConstanteNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoconstantenomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoConstanteNomi(tipoconstantenomiBeanSwingJInternalFrameLocal.gettipoconstantenomi(),true);
				tipoconstantenomiBeanSwingJInternalFrameLocal.actualizarLista(tipoconstantenomiBeanSwingJInternalFrameLocal.tipoconstantenomi,this.tipoconstantenomisForeignKey);

				tipoconstantenomiBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoconstantenomiBeanSwingJInternalFrameLocal.tipoconstantenomi);

				constantenomiLocal.setTipoConstanteNomi(tipoconstantenomiBeanSwingJInternalFrameLocal.tipoconstantenomi);

				this.addItemDefectoCombosForeignKeyTipoConstanteNomi();
				this.cargarCombosFrameTipoConstanteNomisForeignKey("Formulario");
				this.setActualTipoConstanteNomiForeignKey(tipoconstantenomiBeanSwingJInternalFrameLocal.tipoconstantenomi.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarConstanteNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.constantenomi =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.constantenomi =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = constantenomiValidator.getInvalidValues(this.constantenomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ConstanteNomi constantenomi,List<ConstanteNomi> constantenomis) throws Exception {
		try	{		
			ConstanteNomiConstantesFunciones.actualizarLista(constantenomi,constantenomis,this.constantenomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ConstanteNomi constantenomi,List<ConstanteNomi> constantenomis) throws Exception {
		try	{			
			ConstanteNomiConstantesFunciones.actualizarSelectedLista(constantenomi,constantenomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ConstanteNomi> constantenomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				constantenomisLocal=this.constantenomiLogic.getConstanteNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				constantenomisLocal=this.constantenomis;
			}
			//ARCHITECTURE
		
			for(ConstanteNomi constantenomiLocal:constantenomisLocal) {
				if(this.permiteMantenimiento(constantenomiLocal) && constantenomiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ConstanteNomiConstantesFunciones.getConstanteNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ConstanteNomiConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConstanteNomi.jLabelid_empresaConstanteNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConstanteNomiConstantesFunciones.IDTIPOCONSTANTENOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConstanteNomi.jLabelid_tipo_constante_nomiConstanteNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConstanteNomiConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConstanteNomi.jLabelnombreConstanteNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConstanteNomiConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConstanteNomi.jLabelvalorConstanteNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConstanteNomiConstantesFunciones.ESPARAPREGUNTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConstanteNomi.jLabeles_para_preguntaConstanteNomi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConstanteNomi.jLabelid_empresaConstanteNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConstanteNomi.jLabelid_tipo_constante_nomiConstanteNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConstanteNomi.jLabelnombreConstanteNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConstanteNomi.jLabelvalorConstanteNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConstanteNomi.jLabeles_para_preguntaConstanteNomi,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("EmpleadoConstante")) {
			if(this.constantenomi==null) {
				this.constantenomi= new ConstanteNomi();
			}

			if(this.constantenomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoConstanteNomi
				this.setVariablesFormularioToObjetoActualConstanteNomi(this.constantenomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);

				this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.getempleadoconstante().setConstanteNomi(this.constantenomi);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoConstanteNomi--;	
		
		
		this.constantenomiAux=new ConstanteNomi();
		
		this.constantenomiAux.setId(this.iIdNuevoConstanteNomi);
		this.constantenomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.constantenomiLogic.getConstanteNomis().add(this.constantenomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.constantenomis.add(this.constantenomiAux);
		}
		//ARCHITECTURE
		
		this.constantenomi=this.constantenomiAux;
		
		if(ConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioConstanteNomi(this.constantenomi);
			this.setVariablesObjetoActualToFormularioForeignKeyConstanteNomi(this.constantenomi);
		}
				
		//this.setDefaultControlesConstanteNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyConstanteNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyConstanteNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyConstanteNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConstanteNomi(this.constantenomiBean,this.constantenomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ConstanteNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.constantenomiSessionBean.getConGuardarRelaciones()) {
			classes=ConstanteNomiConstantesFunciones.getClassesRelationshipsOfConstanteNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.constantenomiReturnGeneral=constantenomiLogic.procesarEventosConstanteNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.constantenomiLogic.getConstanteNomis(),this.constantenomi,this.constantenomiParameterGeneral,this.isEsNuevoConstanteNomi,classes);//this.constantenomiLogic.getConstanteNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanConstanteNomi(this.constantenomiReturnGeneral,this.constantenomiBean,false);
		
		if(this.constantenomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyConstanteNomi(this.constantenomiReturnGeneral.getConstanteNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioConstanteNomi(this.constantenomiReturnGeneral.getConstanteNomi());
		}
		
		if(this.constantenomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioConstanteNomi(this.constantenomiReturnGeneral.getConstanteNomi(),classes);//this.constantenomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualConstanteNomi(this.constantenomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyConstanteNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyConstanteNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingConstanteNomi(false);
						
			if(constantenomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.empleadoconstanteSessionBean.getEsGuardarRelacionado() && EmpleadoConstanteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoConstanteActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConstanteNomi();
			}
			
			this.actualizarVisualTableDatosConstanteNomi();
			
			this.jTableDatosConstanteNomi.setRowSelectionInterval(this.getIndiceNuevoConstanteNomi(), this.getIndiceNuevoConstanteNomi());
			
			this.seleccionarFilaTablaConstanteNomiActual();
						
			this.actualizarEstadoCeldasBotonesConstanteNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesConstanteNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormConstanteNomi.jTextAreanombreConstanteNomi.setEnabled(isHabilitar && this.constantenomiConstantesFunciones.activarnombreConstanteNomi);
		this.jInternalFrameDetalleFormConstanteNomi.jTextFieldvalorConstanteNomi.setEnabled(isHabilitar && this.constantenomiConstantesFunciones.activarvalorConstanteNomi);
		this.jInternalFrameDetalleFormConstanteNomi.jCheckBoxes_para_preguntaConstanteNomi.setEnabled(isHabilitar && this.constantenomiConstantesFunciones.activares_para_preguntaConstanteNomi);	
		//
		this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_empresaConstanteNomi.setEnabled(isHabilitar && this.constantenomiConstantesFunciones.activarid_empresaConstanteNomi);
		this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_tipo_constante_nomiConstanteNomi.setEnabled(isHabilitar && this.constantenomiConstantesFunciones.activarid_tipo_constante_nomiConstanteNomi);
	};
	
	public void setDefaultControlesConstanteNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoConstanteNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.constantenomiSessionBean.setConGuardarRelaciones(true);			
			this.constantenomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormConstanteNomi.jTabbedPaneRelacionesConstanteNomi.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.empleadoconstanteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.constantenomiSessionBean.setConGuardarRelaciones(false);			
			this.constantenomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormConstanteNomi.jTabbedPaneRelacionesConstanteNomi.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.empleadoconstanteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoConstanteNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConstanteNomi constantenomiAux:this.constantenomiLogic.getConstanteNomis()) {
				if(constantenomiAux.getId().equals(this.iIdNuevoConstanteNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConstanteNomi constantenomiAux:this.constantenomis) {
				if(constantenomiAux.getId().equals(this.iIdNuevoConstanteNomi)) {
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
	
	public int getIndiceActualConstanteNomi(ConstanteNomi constantenomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConstanteNomi constantenomiAux:this.constantenomiLogic.getConstanteNomis()) {
				if(constantenomiAux.getId().equals(constantenomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConstanteNomi constantenomiAux:this.constantenomis) {
				if(constantenomiAux.getId().equals(constantenomi.getId())) {
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
	
	public void setCamposBaseDesdeOriginalConstanteNomi(ConstanteNomi constantenomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConstanteNomi constantenomiAux:this.constantenomiLogic.getConstanteNomis()) {
				if(constantenomiAux.getConstanteNomiOriginal().getId().equals(constantenomiOriginal.getId())) {
					existe=true;
					constantenomiOriginal.setId(constantenomiAux.getId());
					constantenomiOriginal.setVersionRow(constantenomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConstanteNomi constantenomiAux:this.constantenomis) {
				if(constantenomiAux.getConstanteNomiOriginal().getId().equals(constantenomiOriginal.getId())) {
					existe=true;
					constantenomiOriginal.setId(constantenomiAux.getId());
					constantenomiOriginal.setVersionRow(constantenomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosConstanteNomi(Boolean esParaCancelar) throws Exception {
		constantenomisAux=new ArrayList<ConstanteNomi>();
		constantenomiAux=new ConstanteNomi();
		
		if(!this.constantenomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ConstanteNomi constantenomiAux:this.constantenomiLogic.getConstanteNomis()) {
					if(constantenomiAux.getId()<0) {
						constantenomisAux.add(constantenomiAux);
					}		
				}
				this.iIdNuevoConstanteNomi=0L;
				this.constantenomiLogic.getConstanteNomis().removeAll(constantenomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConstanteNomi constantenomiAux:this.constantenomis) {
					if(constantenomiAux.getId()<0) {
						constantenomisAux.add(constantenomiAux);
					}		
				}
				this.iIdNuevoConstanteNomi=0L;
				this.constantenomis.removeAll(constantenomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoConstanteNomi 
					&& this.constantenomiLogic.getConstanteNomis().size()>0
					) {
					constantenomiAux=this.constantenomiLogic.getConstanteNomis().get(this.constantenomiLogic.getConstanteNomis().size() - 1);
				
					if(constantenomiAux.getId()<0) {
						this.constantenomiLogic.getConstanteNomis().remove(constantenomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoConstanteNomi && this.constantenomis.size()>0) {
					constantenomiAux=this.constantenomis.get(this.constantenomis.size() - 1);
				
					if(constantenomiAux.getId()<0) {
						this.constantenomis.remove(constantenomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoConstanteNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(constantenomi.getId()<0) {
				this.constantenomiLogic.getConstanteNomis().remove(this.constantenomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(constantenomi.getId()<0) {
				this.constantenomis.remove(this.constantenomi);
			}
		}			
	}
	
	public void setEstadosInicialesConstanteNomi(List<ConstanteNomi> constantenomisAux) throws Exception {
		ConstanteNomiConstantesFunciones.setEstadosInicialesConstanteNomi(constantenomisAux);
	}
	
	public void setEstadosInicialesConstanteNomi(ConstanteNomi constantenomiAux) throws Exception {
		ConstanteNomiConstantesFunciones.setEstadosInicialesConstanteNomi(constantenomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarConstanteNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesConstanteNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarConstanteNomiActual()) {
				if(!this.isEsNuevoConstanteNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesConstanteNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoConstanteNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarConstanteNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Constante Nomi ?", "MANTENIMIENTO DE Constante Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesConstanteNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ConstanteNomi constantenomi) throws Exception {
		ConstanteNomiConstantesFunciones.seleccionarAsignar(this.constantenomi,constantenomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarConstanteNomi=this.isPermisoActualizarOriginalConstanteNomi;
			
			
			this.seleccionarAsignar(constantenomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ConstanteNomiConstantesFunciones.quitarEspaciosConstanteNomi(this.constantenomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesConstanteNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.constantenomiSessionBean.setsFuncionBusquedaRapida(this.constantenomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoConstanteNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosConstanteNomi(esParaCancelar);				
				this.cancelarNuevoConstanteNomi(esParaCancelar);								
			}
			
			this.constantenomi=new ConstanteNomi();
			
			this.inicializarConstanteNomi();
			
			this.actualizarEstadoCeldasBotonesConstanteNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarConstanteNomi() throws Exception {
		try {
			ConstanteNomiConstantesFunciones.inicializarConstanteNomi(this.constantenomi);
			
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
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.constantenomiLogic.getConstanteNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteConstanteNomis(String sAccionBusqueda,List<ConstanteNomi> constantenomisParaReportes) throws Exception {
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
					sPathReporteFinal="ConstanteNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ConstanteNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ConstanteNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ConstanteNomi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Constante Nomis");		
		parameters.put("busquedapor", ConstanteNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(EmpleadoConstante.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					ConstanteNomiLogic constantenomiLogicAuxiliar=new ConstanteNomiLogic();
					constantenomiLogicAuxiliar.setDatosCliente(constantenomiLogic.getDatosCliente());				
					constantenomiLogicAuxiliar.setConstanteNomis(constantenomisParaReportes);
					
					constantenomiLogicAuxiliar.cargarRelacionesLoteForeignKeyConstanteNomiWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					constantenomisParaReportes=constantenomiLogicAuxiliar.getConstanteNomis();
					
					//constantenomiLogic.getNewConnexionToDeep();
					
					//for (ConstanteNomi constantenomi:constantenomisParaReportes) {
					//	constantenomiLogic.deepLoad(constantenomi, false, DeepLoadType.INCLUDE, classes);
					//}						
					//constantenomiLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//constantenomiLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileEmpleadoConstante = AuxiliarReportes.class.getResourceAsStream("EmpleadoConstanteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_empleadoconstante", reportFileEmpleadoConstante);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceConstanteNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ConstanteNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ConstanteNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceConstanteNomi=new JRBeanArrayDataSource(ConstanteNomiJInternalFrame.TraerConstanteNomiBeans(constantenomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceConstanteNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ConstanteNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ConstanteNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ConstanteNomiBean.TraerConstanteNomiBeans(constantenomisParaReportes).toArray()));
							
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
				this.generarExcelReporteConstanteNomis(sAccionBusqueda,sTipoArchivoReporte,constantenomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalConstanteNomis(sAccionBusqueda,sTipoArchivoReporte,constantenomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoConstanteNomiActionPerformed(null);
					//this.generarExcelReporteConstanteNomis(sAccionBusqueda,sTipoArchivoReporte,constantenomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalConstanteNomis(sAccionBusqueda,sTipoArchivoReporte,constantenomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesConstanteNomis(sAccionBusqueda,sTipoArchivoReporte,constantenomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesConstanteNomis(sAccionBusqueda,sTipoArchivoReporte,constantenomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteConstanteNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<ConstanteNomi> constantenomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"constantenomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConstanteNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConstanteNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ConstanteNomi constantenomi : constantenomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ConstanteNomiConstantesFunciones.generarExcelReporteDataConstanteNomi("NORMAL",row,workbook,constantenomi,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.constantenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Constante Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderConstanteNomi(String sTipo,Row row,Workbook workbook) {
		
		ConstanteNomiConstantesFunciones.generarExcelReporteHeaderConstanteNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalConstanteNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<ConstanteNomi> constantenomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"constantenomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConstanteNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ConstanteNomi constantenomi : constantenomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ConstanteNomiConstantesFunciones.getConstanteNomiDescripcion(constantenomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConstanteNomiConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConstanteNomiConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(constantenomi.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConstanteNomiConstantesFunciones.LABEL_IDTIPOCONSTANTENOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConstanteNomiConstantesFunciones.LABEL_IDTIPOCONSTANTENOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(constantenomi.gettipoconstantenomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConstanteNomiConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConstanteNomiConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(constantenomi.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConstanteNomiConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConstanteNomiConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(constantenomi.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConstanteNomiConstantesFunciones.LABEL_ESPARAPREGUNTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConstanteNomiConstantesFunciones.LABEL_ESPARAPREGUNTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(constantenomi.getes_para_pregunta()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.constantenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Constante Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesConstanteNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<ConstanteNomi> constantenomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ConstanteNomi> constantenomisRespaldo=null;
		
		classes=ConstanteNomiConstantesFunciones.getClassesRelationshipsOfConstanteNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.constantenomiLogic.setDatosCliente(this.datosCliente);
		this.constantenomiLogic.setDatosDeep(this.datosDeep);
		this.constantenomiLogic.setIsConDeep(true);
		
		constantenomisRespaldo=this.constantenomiLogic.getConstanteNomis();
		
		this.constantenomiLogic.setConstanteNomis(constantenomisParaReportes);	
		this.constantenomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		constantenomisParaReportes=this.constantenomiLogic.getConstanteNomis();
		this.constantenomiLogic.setConstanteNomis(constantenomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"constantenomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConstanteNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConstanteNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ConstanteNomi constantenomi : constantenomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderConstanteNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ConstanteNomiConstantesFunciones.generarExcelReporteDataConstanteNomi("NORMAL",row,workbook,constantenomi,cellStyleDataAux);
		
			
			


				//EmpleadoConstante
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO))) {

				if(constantenomi.getEmpleadoConstantes()!=null && constantenomi.getEmpleadoConstantes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EmpleadoConstanteConstantesFunciones.generarExcelReporteHeaderEmpleadoConstante("RELACIONADO",row,workbook);
				}

				if(constantenomi.getEmpleadoConstantes()!=null) {
					i2=0;
					for(EmpleadoConstante empleadoconstante : constantenomi.getEmpleadoConstantes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EmpleadoConstanteConstantesFunciones.generarExcelReporteDataEmpleadoConstante("RELACIONADO",row,workbook,empleadoconstante,cellStyleDataAuxHijo);
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
		cell.setCellValue(ConstanteNomiConstantesFunciones.getConstanteNomiDescripcion(constantenomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.constantenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Constante Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoConstanteNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConstanteNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoConstanteNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConstanteNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessConstanteNomi() throws Exception {		
		this.startProcessConstanteNomi(true);
	}
	
	public void startProcessConstanteNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasConstanteNomi ,this.jPanelParametrosReportesConstanteNomi, this.jScrollPanelDatosConstanteNomi,this.jPanelPaginacionConstanteNomi, this.jScrollPanelDatosEdicionConstanteNomi, this.jPanelAccionesConstanteNomi,this.jPanelAccionesFormularioConstanteNomi,this.jmenuBarConstanteNomi,this.jmenuBarDetalleConstanteNomi,this.jTtoolBarConstanteNomi,this.jTtoolBarDetalleConstanteNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasConstanteNomi=this.jTabbedPaneBusquedasConstanteNomi; 
		
		final JPanel jPanelParametrosReportesConstanteNomi=this.jPanelParametrosReportesConstanteNomi;
		//final JScrollPane jScrollPanelDatosConstanteNomi=this.jScrollPanelDatosConstanteNomi;
		final JTable jTableDatosConstanteNomi=this.jTableDatosConstanteNomi;		
		final JPanel jPanelPaginacionConstanteNomi=this.jPanelPaginacionConstanteNomi;
		//final JScrollPane jScrollPanelDatosEdicionConstanteNomi=this.jScrollPanelDatosEdicionConstanteNomi;
		final JPanel jPanelAccionesConstanteNomi=this.jPanelAccionesConstanteNomi;
		
		JPanel jPanelCamposAuxiliarConstanteNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarConstanteNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
			jPanelCamposAuxiliarConstanteNomi=this.jInternalFrameDetalleFormConstanteNomi.jPanelCamposConstanteNomi;
			jPanelAccionesFormularioAuxiliarConstanteNomi=this.jInternalFrameDetalleFormConstanteNomi.jPanelAccionesFormularioConstanteNomi;
		}
		
		final JPanel jPanelCamposConstanteNomi=jPanelCamposAuxiliarConstanteNomi;
		final JPanel jPanelAccionesFormularioConstanteNomi=jPanelAccionesFormularioAuxiliarConstanteNomi;
		
		
		final JMenuBar jmenuBarConstanteNomi=this.jmenuBarConstanteNomi;
		final JToolBar jTtoolBarConstanteNomi=this.jTtoolBarConstanteNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarConstanteNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConstanteNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
			jmenuBarDetalleAuxiliarConstanteNomi=this.jInternalFrameDetalleFormConstanteNomi.jmenuBarDetalleConstanteNomi;
			jTtoolBarDetalleAuxiliarConstanteNomi=this.jInternalFrameDetalleFormConstanteNomi.jTtoolBarDetalleConstanteNomi;
		}
		
		final JMenuBar jmenuBarDetalleConstanteNomi=jmenuBarDetalleAuxiliarConstanteNomi;
		final JToolBar jTtoolBarDetalleConstanteNomi=jTtoolBarDetalleAuxiliarConstanteNomi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConstanteNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConstanteNomi;
			processRunnable.jTableDatos=jTableDatosConstanteNomi;
			processRunnable.jPanelCampos=jPanelCamposConstanteNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionConstanteNomi;
			processRunnable.jPanelAcciones=jPanelAccionesConstanteNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConstanteNomi;
			
			
			processRunnable.jmenuBar=jmenuBarConstanteNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConstanteNomi;
			processRunnable.jTtoolBar=jTtoolBarConstanteNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConstanteNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConstanteNomi ,jPanelParametrosReportesConstanteNomi,jTableDatosConstanteNomi, /*jScrollPanelDatosConstanteNomi,*/jPanelCamposConstanteNomi,jPanelPaginacionConstanteNomi, /*jScrollPanelDatosEdicionConstanteNomi,*/ jPanelAccionesConstanteNomi,jPanelAccionesFormularioConstanteNomi,jmenuBarConstanteNomi,jmenuBarDetalleConstanteNomi,jTtoolBarConstanteNomi,jTtoolBarDetalleConstanteNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConstanteNomi ,jPanelParametrosReportesConstanteNomi, jScrollPanelDatosConstanteNomi,jPanelPaginacionConstanteNomi, jScrollPanelDatosEdicionConstanteNomi, jPanelAccionesConstanteNomi,jPanelAccionesFormularioConstanteNomi,jmenuBarConstanteNomi,jmenuBarDetalleConstanteNomi,jTtoolBarConstanteNomi,jTtoolBarDetalleConstanteNomi);
						
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
	
	public void finishProcessConstanteNomi() {// throws Exception 
		this.finishProcessConstanteNomi(true);
	}
	
	public void finishProcessConstanteNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasConstanteNomi ,this.jPanelParametrosReportesConstanteNomi, this.jScrollPanelDatosConstanteNomi,this.jPanelPaginacionConstanteNomi, this.jScrollPanelDatosEdicionConstanteNomi, this.jPanelAccionesConstanteNomi,this.jPanelAccionesFormularioConstanteNomi,this.jmenuBarConstanteNomi,this.jmenuBarDetalleConstanteNomi,this.jTtoolBarConstanteNomi,this.jTtoolBarDetalleConstanteNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasConstanteNomi=this.jTabbedPaneBusquedasConstanteNomi; 
		
		final JPanel jPanelParametrosReportesConstanteNomi=this.jPanelParametrosReportesConstanteNomi;
		//final JScrollPane jScrollPanelDatosConstanteNomi=this.jScrollPanelDatosConstanteNomi;
		final JTable jTableDatosConstanteNomi=this.jTableDatosConstanteNomi;		
		final JPanel jPanelPaginacionConstanteNomi=this.jPanelPaginacionConstanteNomi;
		//final JScrollPane jScrollPanelDatosEdicionConstanteNomi=this.jScrollPanelDatosEdicionConstanteNomi;
		final JPanel jPanelAccionesConstanteNomi=this.jPanelAccionesConstanteNomi;
		
		JPanel jPanelCamposAuxiliarConstanteNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarConstanteNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
			jPanelCamposAuxiliarConstanteNomi=this.jInternalFrameDetalleFormConstanteNomi.jPanelCamposConstanteNomi;
			jPanelAccionesFormularioAuxiliarConstanteNomi=this.jInternalFrameDetalleFormConstanteNomi.jPanelAccionesFormularioConstanteNomi;
		}
		
		final JPanel jPanelCamposConstanteNomi=jPanelCamposAuxiliarConstanteNomi;
		final JPanel jPanelAccionesFormularioConstanteNomi=jPanelAccionesFormularioAuxiliarConstanteNomi;
		
		
		final JMenuBar jmenuBarConstanteNomi=this.jmenuBarConstanteNomi;		
		final JToolBar jTtoolBarConstanteNomi=this.jTtoolBarConstanteNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarConstanteNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConstanteNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
			jmenuBarDetalleAuxiliarConstanteNomi=this.jInternalFrameDetalleFormConstanteNomi.jmenuBarDetalleConstanteNomi;
			jTtoolBarDetalleAuxiliarConstanteNomi=this.jInternalFrameDetalleFormConstanteNomi.jTtoolBarDetalleConstanteNomi;		
		}
		
		final JMenuBar jmenuBarDetalleConstanteNomi=jmenuBarDetalleAuxiliarConstanteNomi;
		final JToolBar jTtoolBarDetalleConstanteNomi=jTtoolBarDetalleAuxiliarConstanteNomi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConstanteNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConstanteNomi;
			processRunnable.jTableDatos=jTableDatosConstanteNomi;
			processRunnable.jPanelCampos=jPanelCamposConstanteNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionConstanteNomi;
			processRunnable.jPanelAcciones=jPanelAccionesConstanteNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConstanteNomi;
			
			
			processRunnable.jmenuBar=jmenuBarConstanteNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConstanteNomi;
			processRunnable.jTtoolBar=jTtoolBarConstanteNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConstanteNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasConstanteNomi ,jPanelParametrosReportesConstanteNomi, jTableDatosConstanteNomi,/*jScrollPanelDatosConstanteNomi,*/jPanelCamposConstanteNomi,jPanelPaginacionConstanteNomi, /*jScrollPanelDatosEdicionConstanteNomi,*/ jPanelAccionesConstanteNomi,jPanelAccionesFormularioConstanteNomi,jmenuBarConstanteNomi,jmenuBarDetalleConstanteNomi,jTtoolBarConstanteNomi,jTtoolBarDetalleConstanteNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesConstanteNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarConstanteNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuConstanteNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarConstanteNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarConstanteNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleConstanteNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuConstanteNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarConstanteNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleConstanteNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.constantenomiConstantesFunciones.getsFinalQueryConstanteNomi();
		String  finalQueryPaginacionTodos=this.constantenomiConstantesFunciones.getsFinalQueryConstanteNomi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ConstanteNomiConstantesFunciones.getArrayColumnasGlobalesNoConstanteNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ConstanteNomiConstantesFunciones.getArrayColumnasGlobalesConstanteNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ConstanteNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.constantenomisEliminados= new ArrayList<ConstanteNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessConstanteNomi();
		
				///*ConstanteNomiSessionBean*/this.constantenomiSessionBean=new ConstanteNomiSessionBean();
			
			if(this.constantenomiSessionBean==null) {
				this.constantenomiSessionBean=new ConstanteNomiSessionBean();
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
					this.iNumeroPaginacion=ConstanteNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ConstanteNomiConstantesFunciones.getClassesForeignKeysOfConstanteNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/constantenomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			constantenomisAux= new ArrayList<ConstanteNomi>();
			
				
			constantenomiLogic.setDatosCliente(this.datosCliente);
			constantenomiLogic.setDatosDeep(this.datosDeep);
			constantenomiLogic.setIsConDeep(true);
			
			
			constantenomiLogic.getConstanteNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					constantenomiLogic.getTodosConstanteNomis(finalQueryGlobal,pagination);
					
					//constantenomiLogic.getTodosConstanteNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(constantenomiLogic.getConstanteNomis()==null|| constantenomiLogic.getConstanteNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							constantenomisAux= new ArrayList<ConstanteNomi>();
							constantenomisAux.addAll(constantenomiLogic.getConstanteNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							constantenomisAux= new ArrayList<ConstanteNomi>();
							constantenomisAux.addAll(constantenomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							constantenomiLogic.getTodosConstanteNomis(finalQueryGlobal+"",this.pagination);												
							
							//constantenomiLogic.getTodosConstanteNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteConstanteNomis("Todos",constantenomiLogic.getConstanteNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							constantenomiLogic.setConstanteNomis(new ArrayList<ConstanteNomi>());					
							constantenomiLogic.getConstanteNomis().addAll(constantenomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							constantenomis=new ArrayList<ConstanteNomi>();
							constantenomis.addAll(constantenomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idConstanteNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idConstanteNomi=this.idActual;
				
				} else if(this.idConstanteNomiActual!=null && this.idConstanteNomiActual!=0L) {
					idConstanteNomi=idConstanteNomiActual;
				}
				
					
				this.sDetalleReporte=ConstanteNomiConstantesFunciones.getDetalleIndicePorId(idConstanteNomi);
				
				this.constantenomis=new ArrayList<ConstanteNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					constantenomiLogic.getEntity(idConstanteNomi);
					
					//constantenomiLogic.getEntityWithConnection(idConstanteNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					constantenomiLogic.setConstanteNomis(new ArrayList<ConstanteNomi>());
					constantenomiLogic.getConstanteNomis().add(constantenomiLogic.getConstanteNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.constantenomis=new ArrayList<ConstanteNomi>();
					this.constantenomis.add(constantenomi);
				}
				
				if(constantenomiLogic.getConstanteNomi()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ConstanteNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					constantenomiLogic.getConstanteNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConstanteNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConstanteNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=constantenomiLogic.getConstanteNomis()==null||constantenomiLogic.getConstanteNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=constantenomis==null|| constantenomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						constantenomisAux=new ArrayList<ConstanteNomi>();
						constantenomisAux.addAll(constantenomiLogic.getConstanteNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							constantenomisAux=new ArrayList<ConstanteNomi>();
							constantenomisAux.addAll(constantenomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							constantenomiLogic.getConstanteNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConstanteNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConstanteNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConstanteNomis("FK_IdEmpresa",constantenomiLogic.getConstanteNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConstanteNomis("FK_IdEmpresa",constantenomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						constantenomiLogic.setConstanteNomis(new ArrayList<ConstanteNomi>());
						constantenomiLogic.getConstanteNomis().addAll(constantenomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							constantenomis=new ArrayList<ConstanteNomi>();
							constantenomis.addAll(constantenomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoConstante")) {
				this.sDetalleReporte=ConstanteNomiConstantesFunciones.getDetalleIndiceFK_IdTipoConstante(id_tipo_constante_nomiFK_IdTipoConstante);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					constantenomiLogic.getConstanteNomisFK_IdTipoConstante(finalQueryGlobal,pagination,id_tipo_constante_nomiFK_IdTipoConstante);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConstanteNomiConstantesFunciones.getDetalleIndiceFK_IdTipoConstante(id_tipo_constante_nomiFK_IdTipoConstante);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConstanteNomiConstantesFunciones.getDetalleIndiceFK_IdTipoConstante(id_tipo_constante_nomiFK_IdTipoConstante);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=constantenomiLogic.getConstanteNomis()==null||constantenomiLogic.getConstanteNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=constantenomis==null|| constantenomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						constantenomisAux=new ArrayList<ConstanteNomi>();
						constantenomisAux.addAll(constantenomiLogic.getConstanteNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							constantenomisAux=new ArrayList<ConstanteNomi>();
							constantenomisAux.addAll(constantenomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							constantenomiLogic.getConstanteNomisFK_IdTipoConstante(finalQueryGlobal,pagination,id_tipo_constante_nomiFK_IdTipoConstante);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConstanteNomiConstantesFunciones.getDetalleIndiceFK_IdTipoConstante(id_tipo_constante_nomiFK_IdTipoConstante);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConstanteNomiConstantesFunciones.getDetalleIndiceFK_IdTipoConstante(id_tipo_constante_nomiFK_IdTipoConstante);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConstanteNomis("FK_IdTipoConstante",constantenomiLogic.getConstanteNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConstanteNomis("FK_IdTipoConstante",constantenomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						constantenomiLogic.setConstanteNomis(new ArrayList<ConstanteNomi>());
						constantenomiLogic.getConstanteNomis().addAll(constantenomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							constantenomis=new ArrayList<ConstanteNomi>();
							constantenomis.addAll(constantenomisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesConstanteNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessConstanteNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=constantenomiLogic.getConstanteNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=constantenomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=constantenomiLogic.getConstanteNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=constantenomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ConstanteNomi constantenomi) {
		Boolean permite=true;
		
		if(this.constantenomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ConstanteNomiConstantesFunciones.getOrderByListaConstanteNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ConstanteNomiConstantesFunciones.getOrderByListaConstanteNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConstanteNomi constantenomi:constantenomiLogic.getConstanteNomis()) {
				if(constantenomi.getsType().equals(Constantes2.S_TOTALES)) {
					constantenomiTotales=constantenomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConstanteNomi constantenomi:this.constantenomis) {
				if(constantenomi.getsType().equals(Constantes2.S_TOTALES)) {
					constantenomiTotales=constantenomi;
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
			this.constantenomiAux=new ConstanteNomi();
			this.constantenomiAux.setsType(Constantes2.S_TOTALES);
			this.constantenomiAux.setIsNew(false);
			this.constantenomiAux.setIsChanged(false);
			this.constantenomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ConstanteNomiConstantesFunciones.TotalizarValoresFilaConstanteNomi(this.constantenomiLogic.getConstanteNomis(),this.constantenomiAux);
				
				this.constantenomiLogic.getConstanteNomis().add(this.constantenomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ConstanteNomiConstantesFunciones.TotalizarValoresFilaConstanteNomi(this.constantenomis,this.constantenomiAux);
				
				this.constantenomis.add(this.constantenomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		constantenomiTotales=new ConstanteNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.constantenomiLogic.getConstanteNomis().remove(constantenomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.constantenomis.remove(constantenomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		constantenomiTotales=new ConstanteNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConstanteNomi constantenomi:constantenomiLogic.getConstanteNomis()) {
				if(constantenomi.getsType().equals(Constantes2.S_TOTALES)) {
					constantenomiTotales=constantenomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConstanteNomiConstantesFunciones.TotalizarValoresFilaConstanteNomi(this.constantenomiLogic.getConstanteNomis(),constantenomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConstanteNomi constantenomi:this.constantenomis) {
				if(constantenomi.getsType().equals(Constantes2.S_TOTALES)) {
					constantenomiTotales=constantenomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConstanteNomiConstantesFunciones.TotalizarValoresFilaConstanteNomi(this.constantenomis,constantenomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getConstanteNomisFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConstanteNomisFK_IdTipoConstante()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoConstante";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getConstanteNomisFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					constantenomiLogic.getConstanteNomisFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConstanteNomisFK_IdTipoConstante(String sFinalQuery,Long id_tipo_constante_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					constantenomiLogic.getConstanteNomisFK_IdTipoConstante(sFinalQuery,this.pagination,id_tipo_constante_nomi);
				
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
	
	public void inicializarPermisosConstanteNomi() {
		this.isPermisoTodoConstanteNomi=false;
		this.isPermisoNuevoConstanteNomi=false;
		this.isPermisoActualizarConstanteNomi=false;
		this.isPermisoActualizarOriginalConstanteNomi=false;
		this.isPermisoEliminarConstanteNomi=false;
		this.isPermisoGuardarCambiosConstanteNomi=false;
		this.isPermisoConsultaConstanteNomi=false;
		this.isPermisoBusquedaConstanteNomi=false;
		this.isPermisoReporteConstanteNomi=false;		
		this.isPermisoOrdenConstanteNomi=false;		
		this.isPermisoPaginacionMedioConstanteNomi=false;		
		this.isPermisoPaginacionAltoConstanteNomi=false;
		this.isPermisoPaginacionTodoConstanteNomi=false;
		this.isPermisoCopiarConstanteNomi=false;		
		this.isPermisoVerFormConstanteNomi=false;		
		this.isPermisoDuplicarConstanteNomi=false;		
		this.isPermisoOrdenConstanteNomi=false;		
	}
	
	public void setPermisosUsuarioConstanteNomi(Boolean isPermiso) {
		this.isPermisoTodoConstanteNomi=isPermiso;
		this.isPermisoNuevoConstanteNomi=isPermiso;
		this.isPermisoActualizarConstanteNomi=isPermiso;
		this.isPermisoActualizarOriginalConstanteNomi=isPermiso;
		this.isPermisoEliminarConstanteNomi=isPermiso;
		this.isPermisoGuardarCambiosConstanteNomi=isPermiso;
		this.isPermisoConsultaConstanteNomi=isPermiso;
		this.isPermisoBusquedaConstanteNomi=isPermiso;
		this.isPermisoReporteConstanteNomi=isPermiso;
		this.isPermisoOrdenConstanteNomi=isPermiso;		
		this.isPermisoPaginacionMedioConstanteNomi=isPermiso;		
		this.isPermisoPaginacionAltoConstanteNomi=isPermiso;		
		this.isPermisoPaginacionTodoConstanteNomi=isPermiso;		
		this.isPermisoCopiarConstanteNomi=isPermiso;		
		this.isPermisoVerFormConstanteNomi=isPermiso;		
		this.isPermisoDuplicarConstanteNomi=isPermiso;
		this.isPermisoOrdenConstanteNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioConstanteNomi(Boolean isPermiso) {
		//this.isPermisoTodoConstanteNomi=isPermiso;
		this.isPermisoNuevoConstanteNomi=isPermiso;
		this.isPermisoActualizarConstanteNomi=isPermiso;
		this.isPermisoActualizarOriginalConstanteNomi=isPermiso;
		this.isPermisoEliminarConstanteNomi=isPermiso;
		this.isPermisoGuardarCambiosConstanteNomi=isPermiso;
		//this.isPermisoConsultaConstanteNomi=isPermiso;
		//this.isPermisoBusquedaConstanteNomi=isPermiso;
		//this.isPermisoReporteConstanteNomi=isPermiso;
		//this.isPermisoOrdenConstanteNomi=isPermiso;		
		//this.isPermisoPaginacionMedioConstanteNomi=isPermiso;		
		//this.isPermisoPaginacionAltoConstanteNomi=isPermiso;		
		//this.isPermisoPaginacionTodoConstanteNomi=isPermiso;		
		//this.isPermisoCopiarConstanteNomi=isPermiso;		
		//this.isPermisoDuplicarConstanteNomi=isPermiso;
		//this.isPermisoOrdenConstanteNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioConstanteNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(EmpleadoConstanteConstantesFunciones.SNOMBREOPCION);
		
		if(ConstanteNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosEmpleadoConstante=false;
		this.isTienePermisosEmpleadoConstante=this.verificarGetPermisosUsuarioOpcionConstanteNomiClaseRelacionada(this.opcionsRelacionadas,EmpleadoConstanteConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebConstanteNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioConstanteNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosEmpleadoConstante=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioConstanteNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionConstanteNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioConstanteNomiClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosEmpleadoConstante && this.jInternalFrameDetalleFormConstanteNomi!=null && this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormConstanteNomi.jTabbedPaneRelacionesConstanteNomi.remove(this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioConstanteNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ConstanteNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.constantenomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ConstanteNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoConstanteNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarConstanteNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalConstanteNomi=this.isPermisoActualizarConstanteNomi;
			this.isPermisoEliminarConstanteNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosConstanteNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaConstanteNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaConstanteNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoConstanteNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteConstanteNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConstanteNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioConstanteNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoConstanteNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoConstanteNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarConstanteNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormConstanteNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarConstanteNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConstanteNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.constantenomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosConstanteNomi.setToolTipText(this.jTableDatosConstanteNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioConstanteNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioConstanteNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ConstanteNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ConstanteNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioConstanteNomi() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosEmpleadoConstante && this.constantenomiConstantesFunciones.mostrarEmpleadoConstanteConstanteNomi && !ConstanteNomiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Empleado Constante");
			reporte.setsDescripcion("Empleado Constante");
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
	public void inicializarCombosForeignKeyConstanteNomiListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipoconstantenomisForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyConstanteNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ConstanteNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyConstanteNomiListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoConstanteNomiListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoConstanteNomiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoconstantenomisForeignKey==null||this.tipoconstantenomisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoConstanteNomiConstantesFunciones.getArrayColumnasGlobalesTipoConstanteNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoConstanteNomiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoConstanteNomiConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoConstanteNomisForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyConstanteNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ConstanteNomiParameterReturnGeneral constantenomiReturnGeneral=new ConstanteNomiParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.constantenomiConstantesFunciones.cargarid_empresaConstanteNomi)
					 || (this.esRecargarFks && this.constantenomiConstantesFunciones.cargarid_empresaConstanteNomi)) {

					if(!this.constantenomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+constantenomiSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoConstanteNomi="";

				if(((this.tipoconstantenomisForeignKey==null||this.tipoconstantenomisForeignKey.size()<=0) && this.constantenomiConstantesFunciones.cargarid_tipo_constante_nomiConstanteNomi)
					 || (this.esRecargarFks && this.constantenomiConstantesFunciones.cargarid_tipo_constante_nomiConstanteNomi)) {

					if(!this.constantenomiSessionBean.getisBusquedaDesdeForeignKeySesionTipoConstanteNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoConstanteNomiConstantesFunciones.getArrayColumnasGlobalesTipoConstanteNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoConstanteNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoConstanteNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoConstanteNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoConstanteNomi, "");
						finalQueryGlobalTipoConstanteNomi+=TipoConstanteNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoConstanteNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoConstanteNomi=" WHERE " + ConstantesSql.ID + "="+constantenomiSessionBean.getlidTipoConstanteNomiActual();
					}
				} else {
					finalQueryGlobalTipoConstanteNomi="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				constantenomiReturnGeneral=constantenomiLogic.cargarCombosLoteForeignKeyConstanteNomi(finalQueryGlobalEmpresa,finalQueryGlobalTipoConstanteNomi);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=constantenomiReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoConstanteNomi.equals("NONE")) {
				this.tipoconstantenomisForeignKey=constantenomiReturnGeneral.gettipoconstantenomisForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyConstanteNomi()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoConstanteNomi();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.constantenomiSessionBean==null) {
				this.constantenomiSessionBean=new ConstanteNomiSessionBean();
			}

			if(!this.constantenomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTipoConstanteNomi()throws Exception {
		try {

			if(!this.constantenomiSessionBean.getisBusquedaDesdeForeignKeySesionTipoConstanteNomi()) {
				TipoConstanteNomi tipoconstantenomi=new TipoConstanteNomi();
				TipoConstanteNomiConstantesFunciones.setTipoConstanteNomiDescripcion(tipoconstantenomi,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoconstantenomi.setId(null);

				if(!TipoConstanteNomiConstantesFunciones.ExisteEnLista(this.tipoconstantenomisForeignKey,tipoconstantenomi,true)) {

					this.tipoconstantenomisForeignKey.add(0,tipoconstantenomi);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyConstanteNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyConstanteNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyConstanteNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyConstanteNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyConstanteNomi(ConstanteNomi constantenomi)throws Exception {	
		try {
			
			this.setActualTipoConstanteNomiForeignKey(constantenomi.getid_tipo_constante_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyConstanteNomi(ConstanteNomi constantenomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyConstanteNomi()throws Exception {	
		try {
			
			this.setActualTipoConstanteNomiForeignKey(this.constantenomiConstantesFunciones.getid_tipo_constante_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyConstanteNomi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyConstanteNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyConstanteNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroConstanteNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyConstanteNomi()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoConstanteNomisForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyConstanteNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoConstanteNomisForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyConstanteNomi()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_empresaConstanteNomi!=null && this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_empresaConstanteNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_empresaConstanteNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_tipo_constante_nomiConstanteNomi!=null && this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_tipo_constante_nomiConstanteNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_tipo_constante_nomiConstanteNomi.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public ConstanteNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ConstanteNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ConstanteNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.constantenomiSessionBean=new ConstanteNomiSessionBean(); 
		this.constantenomiConstantesFunciones=new ConstanteNomiConstantesFunciones(); 
		this.constantenomiBean=new ConstanteNomi();//(this.constantenomiConstantesFunciones); 		
		this.constantenomiReturnGeneral=new ConstanteNomiParameterReturnGeneral(); 
		
		this.constantenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.constantenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ConstanteNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ConstanteNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ConstanteNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessConstanteNomi(true);
			
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
			
			this.constantenomiConstantesFunciones=new ConstanteNomiConstantesFunciones(); 
			this.constantenomiBean=new ConstanteNomi();//this.constantenomiConstantesFunciones); 			
			this.constantenomiReturnGeneral=new ConstanteNomiParameterReturnGeneral(); 
		
			ConstanteNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Constante Nomi Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.constantenomi=new ConstanteNomi();
			this.constantenomis = new ArrayList<ConstanteNomi>();
			this.constantenomisAux = new ArrayList<ConstanteNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic=new ConstanteNomiLogic();
				this.constantenomiLogic.getNewConnexionToDeep("");
			}
			
			//this.constantenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.constantenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormConstanteNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoConstanteNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConstanteNomi);	
					}
					
					if(this.jInternalFrameImportacionConstanteNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConstanteNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByConstanteNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByConstanteNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormConstanteNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormConstanteNomi);
				this.jInternalFrameDetalleFormConstanteNomi.setVisible(false);
				this.jInternalFrameDetalleFormConstanteNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoConstanteNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConstanteNomi);
					this.jInternalFrameReporteDinamicoConstanteNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoConstanteNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionConstanteNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionConstanteNomi);
					this.jInternalFrameImportacionConstanteNomi.setVisible(false);
					this.jInternalFrameImportacionConstanteNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByConstanteNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByConstanteNomi);
					this.jInternalFrameOrderByConstanteNomi.setVisible(false);
					this.jInternalFrameOrderByConstanteNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idConstanteNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ConstanteNomiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.constantenomiReturnGeneral=new ConstanteNomiParameterReturnGeneral();
			
			this.constantenomiParameterGeneral=new ConstanteNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.constantenomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.constantenomiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ConstanteNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.constantenomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(EmpleadoConstanteConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConstanteNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.constantenomiSessionBean.getEsGuardarRelacionado(),this.constantenomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConstanteNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.constantenomiSessionBean.getEsGuardarRelacionado(),this.constantenomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoConstanteNomi=false;
			this.isVisibilidadCeldaDuplicarConstanteNomi=true;
			this.isVisibilidadCeldaCopiarConstanteNomi=true;
			this.isVisibilidadCeldaVerFormConstanteNomi=true;
			this.isVisibilidadCeldaOrdenConstanteNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesConstanteNomi=false;
			this.isVisibilidadCeldaModificarConstanteNomi=false;
			this.isVisibilidadCeldaActualizarConstanteNomi=false;
			this.isVisibilidadCeldaEliminarConstanteNomi=false;
			this.isVisibilidadCeldaCancelarConstanteNomi=false;
			this.isVisibilidadCeldaGuardarConstanteNomi=false;
			this.isVisibilidadCeldaGuardarCambiosConstanteNomi=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoConstante=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesConstanteNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosConstanteNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioConstanteNomi(false);
			
			this.setPermisosUsuarioConstanteNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.constantenomiSessionBean.getEsGuardarRelacionado() 
				|| (this.constantenomiSessionBean.getEsGuardarRelacionado() && this.constantenomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioConstanteNomiClasesRelacionadas();
			}
			
			if(this.constantenomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioConstanteNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosConstanteNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualConstanteNomi();
			}
			
			if(!this.isPermisoBusquedaConstanteNomi) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasConstanteNomi.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.constantenomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioConstanteNomi,this.isPermisoPaginacionMedioConstanteNomi,this.isPermisoPaginacionTodoConstanteNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ConstanteNomiConstantesFunciones.getTiposSeleccionarConstanteNomi());
				
				this.tiposColumnasSelect=ConstanteNomiConstantesFunciones.getTiposSeleccionarConstanteNomi(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectConstanteNomi();				
				//this.tiposRelacionesSelect=ConstanteNomiConstantesFunciones.getTiposRelacionesConstanteNomi(true);
				
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
			//if(!this.constantenomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioConstanteNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioConstanteNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioConstanteNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesConstanteNomi() ;
			
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
			
			
			this.empleadoconstanteLogic=new EmpleadoConstanteLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.tipoconstantenomiLogic=new TipoConstanteNomiLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				constantenomiImplementable= (ConstanteNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConstanteNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				constantenomiImplementableHome= (ConstanteNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConstanteNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.constantenomis= new ArrayList<ConstanteNomi>();
			this.constantenomisEliminados= new ArrayList<ConstanteNomi>();
						
			this.isEsNuevoConstanteNomi=false;
			this.esParaAccionDesdeFormularioConstanteNomi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipoconstantenomisForeignKey=new ArrayList<TipoConstanteNomi>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyConstanteNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroConstanteNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.constantenomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ConstanteNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesConstanteNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingConstanteNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormConstanteNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioConstanteNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioConstanteNomi();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasConstanteNomi.getTabCount(); i++) {
					this.jTabbedPaneBusquedasConstanteNomi.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasConstanteNomi.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessConstanteNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ConstanteNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectConstanteNomi() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesConstanteNomi")) {
				iIndex=this.jInternalFrameDetalleFormConstanteNomi.jTabbedPaneRelacionesConstanteNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormConstanteNomi.jTabbedPaneRelacionesConstanteNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();	
				
				

				if(sTitle.equals("Empleado Constantes")) {
					if(!EmpleadoConstanteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessConstanteNomi();

						this.cargarParteTabPanelRelacionadaEmpleadoConstante(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessConstanteNomi();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaEmpleadoConstante(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormConstanteNomi.cargarSessionConBeanSwingJInternalFrameEmpleadoConstante(false,true,iIndex);
		this.jButtonEmpleadoConstanteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEmpleadoConstante();

		//this.jTabbedPaneRelacionesConstanteNomi.updateUI();
		//this.jTabbedPaneRelacionesConstanteNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesConstanteNomi.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("EmpleadoConstante")) {
				int row=this.jTableDatosConstanteNomi.getSelectedRow();
				jButtonEmpleadoConstanteActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.constantenomiSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Empleado Constante")) {

					if(this.isTienePermisosEmpleadoConstante && this.constantenomiConstantesFunciones.mostrarEmpleadoConstanteConstanteNomi && !ConstanteNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Empleado Constantes"+"("+EmpleadoConstanteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Empleado Constantes");

						if(constantenomiConstantesFunciones.resaltarEmpleadoConstanteConstanteNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(constantenomiConstantesFunciones.resaltarEmpleadoConstanteConstanteNomi);
						}

						jmenuItem.setEnabled(this.constantenomiConstantesFunciones.activarEmpleadoConstanteConstanteNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"EmpleadoConstante"));

						

						this.jInternalFrameDetalleFormConstanteNomi.jmenuDetalleConstanteNomi.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyConstanteNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyConstanteNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyConstanteNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyConstanteNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyConstanteNomi();
		
		this.cargarCombosFrameForeignKeyConstanteNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyConstanteNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyConstanteNomi();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoConstanteNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoConstanteNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoConstanteNomi();
				this.cargarCombosFrameTipoConstanteNomisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoConstanteNomi(this.tipoconstantenomisForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoConstanteNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.constantenomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormConstanteNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
			
			
			if(jTableDatosConstanteNomi.getRowCount()>=1) {
				jTableDatosConstanteNomi.removeRowSelectionInterval(0, jTableDatosConstanteNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoConstanteNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoConstanteNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesConstanteNomi(true);			
			//this.constantenomi=new ConstanteNomi();
			//this.constantenomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConstanteNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConstanteNomi() ;
			
			if(ConstanteNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConstanteNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.constantenomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.constantenomi);				
			
			ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
			
			if(this.constantenomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ConstanteNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarConstanteNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ConstanteNomi> constantenomisSeleccionados=new ArrayList<ConstanteNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosConstanteNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosConstanteNomi.getSelectedRows().length;			
			}
			
			constantenomisSeleccionados=this.getConstanteNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoConstanteNomi--;			
				//ConstanteNomi constantenomiAux= new ConstanteNomi();			
				//constantenomiAux.setId(this.iIdNuevoConstanteNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ConstanteNomi constantenomiOrigen=new ConstanteNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ConstanteNomi constantenomiOrigen : constantenomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							constantenomiOrigen =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							constantenomiOrigen =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaConstanteNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.constantenomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosConstanteNomi(constantenomiOrigen,this.constantenomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.constantenomiLogic.getConstanteNomis().add(this.constantenomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.constantenomis.add(this.constantenomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaConstanteNomi(false);
				
				this.jTableDatosConstanteNomi.setRowSelectionInterval(this.getIndiceNuevoConstanteNomi(), this.getIndiceNuevoConstanteNomi());
				
				int iLastRow =  this.jTableDatosConstanteNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConstanteNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConstanteNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConstanteNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ConstanteNomi> constantenomisSeleccionados=new ArrayList<ConstanteNomi>();									
		
			ConstanteNomi constantenomiOrigen=new ConstanteNomi();
			ConstanteNomi constantenomiDestino=new ConstanteNomi();
				
			constantenomisSeleccionados=this.getConstanteNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosConstanteNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || constantenomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosConstanteNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						constantenomiOrigen =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						constantenomiOrigen =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						constantenomiDestino =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						constantenomiDestino =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				constantenomiOrigen =constantenomisSeleccionados.get(0);
				constantenomiDestino =constantenomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosConstanteNomi(constantenomiOrigen,constantenomiDestino,true,false);
				
				constantenomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(constantenomiDestino,constantenomiLogic.getConstanteNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(constantenomiDestino,constantenomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaConstanteNomi(false);
				
				//this.jTableDatosConstanteNomi.setRowSelectionInterval(this.getIndiceNuevoConstanteNomi(), this.getIndiceNuevoConstanteNomi());
				
				int iLastRow =  this.jTableDatosConstanteNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConstanteNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConstanteNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConstanteNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConstanteNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormConstanteNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesConstanteNomi.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasConstanteNomi.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesConstanteNomi.setVisible(!isVisible);
			this.jPanelPaginacionConstanteNomi.setVisible(!isVisible);
			this.jPanelAccionesConstanteNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameConstanteNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoConstanteNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionConstanteNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByConstanteNomi();
			
			this.abrirFrameOrderByConstanteNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByConstanteNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleConstanteNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormConstanteNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormConstanteNomi.isMaximum()) {
					this.jInternalFrameDetalleFormConstanteNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormConstanteNomi.setSize(this.jInternalFrameDetalleFormConstanteNomi.iWidthFormulario,this.jInternalFrameDetalleFormConstanteNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormConstanteNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormConstanteNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormConstanteNomi.isMaximum()) {
						this.jInternalFrameDetalleFormConstanteNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormConstanteNomi.jContentPaneDetalleConstanteNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormConstanteNomi.jTabbedPaneRelacionesConstanteNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormConstanteNomi.jContentPaneDetalleConstanteNomi.getWidth(),ConstanteNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConstanteNomi.jTabbedPaneRelacionesConstanteNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormConstanteNomi.jContentPaneDetalleConstanteNomi.getWidth(),ConstanteNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConstanteNomi.jTabbedPaneRelacionesConstanteNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormConstanteNomi.jContentPaneDetalleConstanteNomi.getWidth(),ConstanteNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(EmpleadoConstanteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEmpleadoConstante();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormConstanteNomi.setVisible(true);
	        this.jInternalFrameDetalleFormConstanteNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByConstanteNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByConstanteNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByConstanteNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConstanteNomi,false,this);
				} else {
					this.jInternalFrameOrderByConstanteNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConstanteNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByConstanteNomi);
				this.jInternalFrameOrderByConstanteNomi.setVisible(false);
				this.jInternalFrameOrderByConstanteNomi.setSelected(false);
				
				this.jInternalFrameOrderByConstanteNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConstanteNomi"));
				
				this.inicializarActualizarBindingTablaOrderByConstanteNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionConstanteNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionConstanteNomi==null) {
				
				this.jInternalFrameImportacionConstanteNomi=new ImportacionJInternalFrame(ConstanteNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConstanteNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionConstanteNomi);
				this.jInternalFrameImportacionConstanteNomi.setVisible(false);
				this.jInternalFrameImportacionConstanteNomi.setSelected(false);


				this.jInternalFrameImportacionConstanteNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConstanteNomi"));
				this.jInternalFrameImportacionConstanteNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConstanteNomi"));
				this.jInternalFrameImportacionConstanteNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConstanteNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoConstanteNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoConstanteNomi==null) {
				this.jInternalFrameReporteDinamicoConstanteNomi=new ReporteDinamicoJInternalFrame(ConstanteNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConstanteNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConstanteNomi);
				this.jInternalFrameReporteDinamicoConstanteNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoConstanteNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoConstanteNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConstanteNomi"));
				this.jInternalFrameReporteDinamicoConstanteNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConstanteNomi"));
				this.jInternalFrameReporteDinamicoConstanteNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConstanteNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConstanteNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaEmpleadoConstante() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoConstante.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormConstanteNomi.jContentPaneDetalleConstanteNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoConstante.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoConstante.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoConstante.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleConstanteNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormConstanteNomi);
			
	       	this.jInternalFrameDetalleFormConstanteNomi.setVisible(false);
	        this.jInternalFrameDetalleFormConstanteNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormConstanteNomi.dispose();
			//this.jInternalFrameDetalleFormConstanteNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoConstanteNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoConstanteNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoConstanteNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionConstanteNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionConstanteNomi.setVisible(true);
	        this.jInternalFrameImportacionConstanteNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByConstanteNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByConstanteNomi.setVisible(true);
	        this.jInternalFrameOrderByConstanteNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByConstanteNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByConstanteNomi.setVisible(false);
	        this.jInternalFrameOrderByConstanteNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoConstanteNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoConstanteNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoConstanteNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionConstanteNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionConstanteNomi.setVisible(false);
	        this.jInternalFrameImportacionConstanteNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarConstanteNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarConstanteNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesConstanteNomi(true);
			//this.isEsNuevoConstanteNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomi =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.constantenomi =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesConstanteNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConstanteNomi(false) ;
			
			if(constantenomiSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.empleadoconstanteSessionBean.getEsGuardarRelacionado() && EmpleadoConstanteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoConstanteActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ConstanteNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConstanteNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConstanteNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaConstanteNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomi =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.constantenomi =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarConstanteNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConstanteNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesConstanteNomi(true);
			//this.isEsNuevoConstanteNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomi =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.constantenomi =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.constantenomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesConstanteNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesConstanteNomi(false) ;
			
			if(ConstanteNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConstanteNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConstanteNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoConstanteNomi(List<TipoConstanteNomi> tipoconstantenomisForeignKey)throws Exception{
		TableColumn tableColumnTipoConstanteNomi=this.jTableDatosConstanteNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConstanteNomi,ConstanteNomiConstantesFunciones.LABEL_IDTIPOCONSTANTENOMI));
		TableCellEditor tableCellEditorTipoConstanteNomi =tableColumnTipoConstanteNomi.getCellEditor();

		TipoConstanteNomiTableCell tipoconstantenomiTableCellFk=(TipoConstanteNomiTableCell)tableCellEditorTipoConstanteNomi;

		if(tipoconstantenomiTableCellFk!=null) {
			tipoconstantenomiTableCellFk.settipoconstantenomisForeignKey(tipoconstantenomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConstanteNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoconstantenomiTableCellFk.setRowActual(intSelectedRow);
			//tipoconstantenomiTableCellFk.settipoconstantenomisForeignKeyActual(tipoconstantenomisForeignKey);
		//}


		if(tipoconstantenomiTableCellFk!=null) {
			tipoconstantenomiTableCellFk.RecargarTipoConstanteNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesConstanteNomi(false);
			
			//if(!this.isEsNuevoConstanteNomi) {								
				int intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomi =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.constantenomi =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualConstanteNomi(this.constantenomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);
				
			}
			
			if(this.permiteMantenimiento(this.constantenomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.constantenomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoConstanteNomi=true;
					this.inicializarActualizarBindingTablaConstanteNomi(false);
					this.isEsNuevoConstanteNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoConstanteNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoConstanteNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConstanteNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConstanteNomi(false);
				
				this.habilitarDeshabilitarControlesConstanteNomi(false);
			
												
				
				if(ConstanteNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleConstanteNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoConstanteNomiActionPerformed(evt,constantenomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualConstanteNomi(this.constantenomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosConstanteNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,constantenomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.constantenomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ConstanteNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConstanteNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomi =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				this.constantenomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.constantenomi =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				this.constantenomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.constantenomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.constantenomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ConstanteNomiModel) this.jTableDatosConstanteNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoConstanteNomi=true;
				this.inicializarActualizarBindingTablaConstanteNomi(false);
				this.isEsNuevoConstanteNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConstanteNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConstanteNomi(false);
				
				this.habilitarDeshabilitarControlesConstanteNomi(false);
				
				
				
				if(ConstanteNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleConstanteNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarConstanteNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosConstanteNomi.getRowCount()>=1) {
				jTableDatosConstanteNomi.removeRowSelectionInterval(0, jTableDatosConstanteNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesConstanteNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaConstanteNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConstanteNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConstanteNomi(false) ;
			
			this.isEsNuevoConstanteNomi=false;
			
			if(ConstanteNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleConstanteNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosConstanteNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingConstanteNomi(false);
				
				//SI ES MANUAL
				if(ConstanteNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualConstanteNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosConstanteNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoConstanteNomi--;			
			//ConstanteNomi constantenomiAux= new ConstanteNomi();			
			//constantenomiAux.setId(this.iIdNuevoConstanteNomi);
			
			if(this.jInternalFrameDetalleFormConstanteNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaConstanteNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);
			
			this.constantenomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.constantenomiLogic.getConstanteNomis().add(this.constantenomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.constantenomis.add(this.constantenomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaConstanteNomi(false);
			
			this.jTableDatosConstanteNomi.setRowSelectionInterval(this.getIndiceNuevoConstanteNomi(), this.getIndiceNuevoConstanteNomi());
			
			int iLastRow =  this.jTableDatosConstanteNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosConstanteNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosConstanteNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaConstanteNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionConstanteNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingConstanteNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConstanteNomi(false);
			
			//SI ES MANUAL
			if(ConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConstanteNomi();
			}
			
			//this.abrirFrameTreeConstanteNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionConstanteNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Constante NomiS ?", "MANTENIMIENTO DE Constante Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionConstanteNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralConstanteNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.constantenomiReturnGeneral=constantenomiLogic.procesarImportacionConstanteNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.constantenomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarConstanteNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionConstanteNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionConstanteNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionConstanteNomi.setFileImportacion(this.jInternalFrameImportacionConstanteNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionConstanteNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionConstanteNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionConstanteNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionConstanteNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ConstanteNomi> constantenomisSeleccionados=new ArrayList<ConstanteNomi>();		

		constantenomisSeleccionados=this.getConstanteNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConstanteNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConstanteNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ConstanteNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ConstanteNomiBaseDesign.jrxml";
			
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
			
			this.generarReporteConstanteNomis("Todos",constantenomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.constantenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Constante Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoConstanteNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConstanteNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConstanteNomiConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConstanteNomiConstantesFunciones.LABEL_IDTIPOCONSTANTENOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoConstanteNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoConstanteNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoConstanteNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoConstanteNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConstanteNomiConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConstanteNomiConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConstanteNomiConstantesFunciones.LABEL_ESPARAPREGUNTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ParaPregunta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ParaPregunta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ParaPregunta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ParaPregunta_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoConstanteNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoConstanteNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoConstanteNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ConstanteNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ConstanteNomiConstantesFunciones.LABEL_IDTIPOCONSTANTENOMI:
					sNombreCampoCategoria="id_tipo_constante_nomi";
					break;

				case ConstanteNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ConstanteNomiConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case ConstanteNomiConstantesFunciones.LABEL_ESPARAPREGUNTA:
					sNombreCampoCategoria="es_para_pregunta";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoConstanteNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ConstanteNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ConstanteNomiConstantesFunciones.LABEL_IDTIPOCONSTANTENOMI:
					sNombreCampoCategoriaValor="id_tipo_constante_nomi";
					break;

				case ConstanteNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ConstanteNomiConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case ConstanteNomiConstantesFunciones.LABEL_ESPARAPREGUNTA:
					sNombreCampoCategoriaValor="es_para_pregunta";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoConstanteNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConstanteNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConstanteNomiConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ConstanteNomiConstantesFunciones.LABEL_IDTIPOCONSTANTENOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Constante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_constante_nomi");
					break;

				case ConstanteNomiConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ConstanteNomiConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case ConstanteNomiConstantesFunciones.LABEL_ESPARAPREGUNTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Para Pregunta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_para_pregunta");
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
	
	public void jButtonGenerarExcelReporteDinamicoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ConstanteNomi> constantenomisSeleccionados=new ArrayList<ConstanteNomi>();		
		
		constantenomisSeleccionados=this.getConstanteNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"constantenomi";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ConstanteNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoConstanteNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoConstanteNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ConstanteNomiConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConstanteNomiConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ConstanteNomi constantenomi:constantenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(constantenomi.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConstanteNomiConstantesFunciones.LABEL_IDTIPOCONSTANTENOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConstanteNomiConstantesFunciones.LABEL_IDTIPOCONSTANTENOMI);
					iRow++;

					for(ConstanteNomi constantenomi:constantenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(constantenomi.gettipoconstantenomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConstanteNomiConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConstanteNomiConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ConstanteNomi constantenomi:constantenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(constantenomi.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConstanteNomiConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConstanteNomiConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(ConstanteNomi constantenomi:constantenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(constantenomi.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConstanteNomiConstantesFunciones.LABEL_ESPARAPREGUNTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConstanteNomiConstantesFunciones.LABEL_ESPARAPREGUNTA);
					iRow++;

					for(ConstanteNomi constantenomi:constantenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(constantenomi.getes_para_pregunta());
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
			//	this.getFilaCabeceraExportarExcelConstanteNomi(row);				
			//	iRow++;
			//}				
			
			//for(ConstanteNomi constantenomiAux:constantenomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelConstanteNomi(constantenomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.constantenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Constante Nomi",JOptionPane.INFORMATION_MESSAGE);
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
				this.constantenomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConstanteNomi(false);
			
			//SI ES MANUAL
			if(ConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConstanteNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresConstanteNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConstanteNomi(false);
			
			//SI ES MANUAL
			if(ConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConstanteNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesConstanteNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConstanteNomi(false);
			
			//SI ES MANUAL
			if(ConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConstanteNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaConstanteNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosConstanteNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosConstanteNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosConstanteNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosConstanteNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosConstanteNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosConstanteNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosConstanteNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingConstanteNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingConstanteNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingConstanteNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaConstanteNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesConstanteNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.constantenomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasConstanteNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConstanteNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesConstanteNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualConstanteNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaConstanteNomi();
		
		this.inicializarActualizarBindingBotonesManualConstanteNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.constantenomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualConstanteNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConstanteNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualConstanteNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualConstanteNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosConstanteNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosConstanteNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteConstanteNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormConstanteNomi.jCheckBoxPostAccionNuevoConstanteNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormConstanteNomi.jCheckBoxPostAccionSinCerrarConstanteNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormConstanteNomi.jCheckBoxPostAccionSinMensajeConstanteNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosConstanteNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosConstanteNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteConstanteNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
				this.jInternalFrameDetalleFormConstanteNomi.jCheckBoxPostAccionNuevoConstanteNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormConstanteNomi.jCheckBoxPostAccionSinCerrarConstanteNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormConstanteNomi.jCheckBoxPostAccionSinMensajeConstanteNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionConstanteNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionConstanteNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormConstanteNomi.jComboBoxTiposAccionesFormularioConstanteNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesConstanteNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoConstanteNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConstanteNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesConstanteNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesConstanteNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarConstanteNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesConstanteNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoConstanteNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConstanteNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesConstanteNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralConstanteNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesConstanteNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(ConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualConstanteNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesConstanteNomi() throws Exception {
		try	{
			if(ConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualConstanteNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConstanteNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormConstanteNomi.jComboBoxTiposAccionesFormularioConstanteNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormConstanteNomi.jComboBoxTiposAccionesFormularioConstanteNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualConstanteNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesConstanteNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesConstanteNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesConstanteNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesConstanteNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesConstanteNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesConstanteNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionConstanteNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionConstanteNomi.addItem(reporte);
			}
			
			
			if(!this.constantenomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionConstanteNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionConstanteNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesConstanteNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesConstanteNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesConstanteNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesConstanteNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormConstanteNomi.jComboBoxTiposAccionesFormularioConstanteNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormConstanteNomi.jComboBoxTiposAccionesFormularioConstanteNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarConstanteNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarConstanteNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarConstanteNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConstanteNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConstanteNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConstanteNomi!=null) {
				this.jInternalFrameReporteDinamicoConstanteNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoConstanteNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConstanteNomi!=null) {
				this.jInternalFrameReporteDinamicoConstanteNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoConstanteNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoConstanteNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoConstanteNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConstanteNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConstanteNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoConstanteNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConstanteNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConstanteNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoConstanteNomi.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoConstanteNomi.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ConstanteNomiConstantesFunciones.getTiposSeleccionarConstanteNomi(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoConstanteNomi.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoConstanteNomi.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoConstanteNomi.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ConstanteNomiConstantesFunciones.getTiposSeleccionarConstanteNomi(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoConstanteNomi.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoConstanteNomi.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoConstanteNomi.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ConstanteNomiConstantesFunciones.getTiposSeleccionarConstanteNomi(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConstanteNomi.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoConstanteNomi.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoConstanteNomi.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoConstanteNomi.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualConstanteNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi.getSelectedItem()!=null){this.id_tipo_constante_nomiFK_IdTipoConstante=((TipoConstanteNomi)this.jComboBoxid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasConstanteNomi(Boolean esInicializar) throws Exception {				
		if(ConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualConstanteNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaConstanteNomi() throws Exception {
		this.inicializarActualizarBindingTablaConstanteNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByConstanteNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByConstanteNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByConstanteNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConstanteNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ConstanteNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByConstanteNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConstanteNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ConstanteNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosConstanteNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConstanteNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ConstanteNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByConstanteNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConstanteNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ConstanteNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByConstanteNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaConstanteNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=constantenomiLogic.getConstanteNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=constantenomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosConstanteNomi.setModel(new ConstanteNomiModel(this.constantenomiLogic.getConstanteNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosConstanteNomi.setModel(new ConstanteNomiModel(this.constantenomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByConstanteNomi!=null && this.jInternalFrameOrderByConstanteNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByConstanteNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosConstanteNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConstanteNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ConstanteNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO,constantenomiConstantesFunciones.resaltarSeleccionarConstanteNomi,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO,constantenomiConstantesFunciones.resaltarSeleccionarConstanteNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosConstanteNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConstanteNomi,ConstanteNomiConstantesFunciones.LABEL_ID));

		if(this.constantenomiConstantesFunciones.mostraridConstanteNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConstanteNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.constantenomiConstantesFunciones.resaltaridConstanteNomi,this.constantenomiConstantesFunciones.activaridConstanteNomi,iSizeTabla,this,true,"idConstanteNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.constantenomiConstantesFunciones.resaltaridConstanteNomi,this.constantenomiConstantesFunciones.activaridConstanteNomi,this,true,"idConstanteNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConstanteNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConstanteNomi,ConstanteNomiConstantesFunciones.LABEL_IDEMPRESA));

		if(this.constantenomiConstantesFunciones.mostrarid_empresaConstanteNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConstanteNomiConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.constantenomiConstantesFunciones.resaltarid_empresaConstanteNomi,this,this.constantenomiConstantesFunciones.activarid_empresaConstanteNomi,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.constantenomiConstantesFunciones.resaltarid_empresaConstanteNomi,this,this.constantenomiConstantesFunciones.activarid_empresaConstanteNomi,false,"id_empresaConstanteNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConstanteNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConstanteNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConstanteNomi,ConstanteNomiConstantesFunciones.LABEL_IDTIPOCONSTANTENOMI));

		if(this.constantenomiConstantesFunciones.mostrarid_tipo_constante_nomiConstanteNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConstanteNomiConstantesFunciones.LABEL_IDTIPOCONSTANTENOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoConstanteNomiTableCell(this.tipoconstantenomisForeignKey,this.constantenomiConstantesFunciones.resaltarid_tipo_constante_nomiConstanteNomi,this,this.constantenomiConstantesFunciones.activarid_tipo_constante_nomiConstanteNomi,iSizeTabla));
			tableColumn.setCellEditor(new TipoConstanteNomiTableCell(this.tipoconstantenomisForeignKey,this.constantenomiConstantesFunciones.resaltarid_tipo_constante_nomiConstanteNomi,this,this.constantenomiConstantesFunciones.activarid_tipo_constante_nomiConstanteNomi,true,"id_tipo_constante_nomiConstanteNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConstanteNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConstanteNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConstanteNomi,ConstanteNomiConstantesFunciones.LABEL_NOMBRE));

		if(this.constantenomiConstantesFunciones.mostrarnombreConstanteNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConstanteNomiConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.constantenomiConstantesFunciones.resaltarnombreConstanteNomi,this.constantenomiConstantesFunciones.activarnombreConstanteNomi,iSizeTabla,this,true,"nombreConstanteNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.constantenomiConstantesFunciones.resaltarnombreConstanteNomi,this.constantenomiConstantesFunciones.activarnombreConstanteNomi,this,true,"nombreConstanteNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConstanteNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConstanteNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConstanteNomi,ConstanteNomiConstantesFunciones.LABEL_VALOR));

		if(this.constantenomiConstantesFunciones.mostrarvalorConstanteNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConstanteNomiConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.constantenomiConstantesFunciones.resaltarvalorConstanteNomi,this.constantenomiConstantesFunciones.activarvalorConstanteNomi,iSizeTabla,this,true,"valorConstanteNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.constantenomiConstantesFunciones.resaltarvalorConstanteNomi,this.constantenomiConstantesFunciones.activarvalorConstanteNomi,this,true,"valorConstanteNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConstanteNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConstanteNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConstanteNomi,ConstanteNomiConstantesFunciones.LABEL_ESPARAPREGUNTA));

		if(this.constantenomiConstantesFunciones.mostrares_para_preguntaConstanteNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConstanteNomiConstantesFunciones.LABEL_ESPARAPREGUNTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.constantenomiConstantesFunciones.resaltares_para_preguntaConstanteNomi,this.constantenomiConstantesFunciones.activares_para_preguntaConstanteNomi,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.constantenomiConstantesFunciones.resaltares_para_preguntaConstanteNomi,this.constantenomiConstantesFunciones.activares_para_preguntaConstanteNomi,this,true,"es_para_preguntaConstanteNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConstanteNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.constantenomiSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosEmpleadoConstante && this.constantenomiConstantesFunciones.mostrarEmpleadoConstanteConstanteNomi && !ConstanteNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Empleado Constantes");
				tableColumn.setHeaderValue("Empleado Constantes");
				tableColumn.setCellRenderer(new EmpleadoConstanteTableCell(constantenomiConstantesFunciones.resaltarEmpleadoConstanteConstanteNomi,this,this.constantenomiConstantesFunciones.activarEmpleadoConstanteConstanteNomi));
				tableColumn.setCellEditor(new EmpleadoConstanteTableCell(constantenomiConstantesFunciones.resaltarEmpleadoConstanteConstanteNomi,this,this.constantenomiConstantesFunciones.activarEmpleadoConstanteConstanteNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosConstanteNomi.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.constantenomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.constantenomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConstanteNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.constantenomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.constantenomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConstanteNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarConstanteNomi && this.isPermisoGuardarCambiosConstanteNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.constantenomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.constantenomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosConstanteNomi.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.constantenomiSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false,iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,true,false,iSizeTabla));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosConstanteNomi.addColumn(tableColumn);
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
			
			this.jTableDatosConstanteNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConstanteNomi && this.isPermisoGuardarCambiosConstanteNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.constantenomiSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConstanteNomi && this.isPermisoGuardarCambiosConstanteNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosConstanteNomi.moveColumn(this.jTableDatosConstanteNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosConstanteNomi.moveColumn(this.jTableDatosConstanteNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.constantenomiSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosConstanteNomi.moveColumn(this.jTableDatosConstanteNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosConstanteNomi.moveColumn(this.jTableDatosConstanteNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosConstanteNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosConstanteNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosConstanteNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosConstanteNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosConstanteNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosConstanteNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosConstanteNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosConstanteNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=constantenomiLogic.getConstanteNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=constantenomis.size()-1;
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
		//this.jTableDatosConstanteNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosConstanteNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosConstanteNomi();
			
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
				
				//this.isEsNuevoConstanteNomi=false;
					
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
			
				if(this.constantenomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormConstanteNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConstanteNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConstanteNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomi =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.constantenomi =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.constantenomi.getsType().equals("DUPLICADO")
				   || this.constantenomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoConstanteNomi=true;
				
				} else {
					this.isEsNuevoConstanteNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.constantenomiSessionBean.getEsGuardarRelacionado()) {
					if(this.constantenomi.getId()>=0 && !this.constantenomi.getIsNew()) {						
						this.isEsNuevoConstanteNomi=false;
						
					} else {
						this.isEsNuevoConstanteNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoConstanteNomi(esRelaciones);						
				
				this.seleccionarConstanteNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.constantenomi.getId()<0) {
					this.isEsNuevoConstanteNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarConstanteNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarConstanteNomi(evt,rowIndex);
				}	
				
				if(this.constantenomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ConstanteNomi: " + this.dDif); 
					}
				}								
				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarConstanteNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.constantenomi)) {
					if(this.constantenomi.getId()>0) {
						this.constantenomi.setIsDeleted(true);
						
						this.constantenomisEliminados.add(this.constantenomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.constantenomiLogic.getConstanteNomis().remove(this.constantenomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.constantenomis.remove(this.constantenomi);				
					}
					
					
					((ConstanteNomiModel) this.jTableDatosConstanteNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaConstanteNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarConstanteNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoConstanteNomi) {
			
			if(this.jInternalFrameDetalleFormConstanteNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConstanteNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConstanteNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomi =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.constantenomi =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioConstanteNomi(this.constantenomi);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.constantenomiConstantesFunciones.cargarid_empresaConstanteNomi || this.constantenomiConstantesFunciones.event_dependid_empresaConstanteNomi) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.constantenomi.getid_empresa());
									//this.inicializarActualizarBindingConstanteNomi(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(constantenomi.getEmpresa()!=null) {
							this.empresasForeignKey.add(constantenomi.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.constantenomi.getid_empresa(),false,"Formulario");

					//TipoConstanteNomi
					if(!this.constantenomiConstantesFunciones.cargarid_tipo_constante_nomiConstanteNomi || this.constantenomiConstantesFunciones.event_dependid_tipo_constante_nomiConstanteNomi) {
						//this.cargarCombosTipoConstanteNomisForeignKeyLista(" where id="+this.constantenomi.getid_tipo_constante_nomi());
									//this.inicializarActualizarBindingConstanteNomi(false,false);
						this.tipoconstantenomisForeignKey=new ArrayList<TipoConstanteNomi>();

						if(constantenomi.getTipoConstanteNomi()!=null) {
							this.tipoconstantenomisForeignKey.add(constantenomi.getTipoConstanteNomi());
						}

						this.addItemDefectoCombosForeignKeyTipoConstanteNomi();
						this.cargarCombosFrameTipoConstanteNomisForeignKey("Todos");
					}
					this.setActualTipoConstanteNomiForeignKey(this.constantenomi.getid_tipo_constante_nomi(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesConstanteNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesConstanteNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConstanteNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoConstanteNomi(ConstanteNomi constantenomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoConstanteNomi(constantenomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoConstanteNomi(ConstanteNomi constantenomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioConstanteNomi(constantenomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyConstanteNomi(constantenomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyConstanteNomi(constantenomi);
	}
	
	public void setVariablesObjetoActualToFormularioConstanteNomi(ConstanteNomi constantenomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormConstanteNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormConstanteNomi.jLabelidConstanteNomi.setText(constantenomi.getId().toString());
			this.jInternalFrameDetalleFormConstanteNomi.jTextAreanombreConstanteNomi.setText(constantenomi.getnombre());
			this.jInternalFrameDetalleFormConstanteNomi.jTextFieldvalorConstanteNomi.setText(constantenomi.getvalor().toString());
			this.jInternalFrameDetalleFormConstanteNomi.jCheckBoxes_para_preguntaConstanteNomi.setSelected(constantenomi.getes_para_pregunta());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ConstanteNomi constantenomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,constantenomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ConstanteNomi constantenomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				constantenomiLocal=this.constantenomi;
			} else {
				constantenomiLocal=this.constantenomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(constantenomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoConstanteNomi(constantenomiLocal,true);
					
					if(constantenomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(constantenomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.constantenomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(constantenomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoConstanteNomi(ConstanteNomi constantenomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConstanteNomi(constantenomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(constantenomi);
	}
	
	public void setVariablesFormularioToObjetoActualConstanteNomi(ConstanteNomi constantenomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConstanteNomi(constantenomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualConstanteNomi(ConstanteNomi constantenomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormConstanteNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormConstanteNomi.jLabelidConstanteNomi.getText()==null || this.jInternalFrameDetalleFormConstanteNomi.jLabelidConstanteNomi.getText()=="" || this.jInternalFrameDetalleFormConstanteNomi.jLabelidConstanteNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormConstanteNomi.jLabelidConstanteNomi.setText("0");
			}

			if(conColumnasBase) {constantenomi.setId(Long.parseLong(this.jInternalFrameDetalleFormConstanteNomi.jLabelidConstanteNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConstanteNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConstanteNomi.jLabelIdConstanteNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			constantenomi.setnombre(this.jInternalFrameDetalleFormConstanteNomi.jTextAreanombreConstanteNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConstanteNomiConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConstanteNomi.jLabelnombreConstanteNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			constantenomi.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormConstanteNomi.jTextFieldvalorConstanteNomi.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConstanteNomiConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConstanteNomi.jLabelvalorConstanteNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			constantenomi.setes_para_pregunta(this.jInternalFrameDetalleFormConstanteNomi.jCheckBoxes_para_preguntaConstanteNomi.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConstanteNomiConstantesFunciones.LABEL_ESPARAPREGUNTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConstanteNomi.jLabeles_para_preguntaConstanteNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConstanteNomi(ConstanteNomi constantenomiBean,ConstanteNomi constantenomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && constantenomiBean.getid_tipo_constante_nomi()!=null && !constantenomiBean.getid_tipo_constante_nomi().equals(-1L))) {constantenomi.setid_tipo_constante_nomi(constantenomiBean.getid_tipo_constante_nomi());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosConstanteNomi(ConstanteNomi constantenomiOrigen,ConstanteNomi constantenomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && constantenomiOrigen.getId()!=null && !constantenomiOrigen.getId().equals(0L))) {constantenomi.setId(constantenomiOrigen.getId());}}
			if(conDefault || (!conDefault && constantenomiOrigen.getid_tipo_constante_nomi()!=null && !constantenomiOrigen.getid_tipo_constante_nomi().equals(-1L))) {constantenomi.setid_tipo_constante_nomi(constantenomiOrigen.getid_tipo_constante_nomi());}
			if(conDefault || (!conDefault && constantenomiOrigen.getnombre()!=null && !constantenomiOrigen.getnombre().equals(""))) {constantenomi.setnombre(constantenomiOrigen.getnombre());}
			if(conDefault || (!conDefault && constantenomiOrigen.getvalor()!=null && !constantenomiOrigen.getvalor().equals(0.0))) {constantenomi.setvalor(constantenomiOrigen.getvalor());}
			if(conDefault || (!conDefault && constantenomiOrigen.getes_para_pregunta()!=null && !constantenomiOrigen.getes_para_pregunta().equals(false))) {constantenomi.setes_para_pregunta(constantenomiOrigen.getes_para_pregunta());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConstanteNomi(ConstanteNomi constantenomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConstanteNomi.jLabelidConstanteNomi.setText(constantenomi.getId().toString());
			this.jInternalFrameDetalleFormConstanteNomi.jTextAreanombreConstanteNomi.setText(constantenomi.getnombre());
			this.jInternalFrameDetalleFormConstanteNomi.jTextFieldvalorConstanteNomi.setText(constantenomi.getvalor().toString());
			this.jInternalFrameDetalleFormConstanteNomi.jCheckBoxes_para_preguntaConstanteNomi.setSelected(constantenomi.getes_para_pregunta());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConstanteNomi(ConstanteNomiBean constantenomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConstanteNomi.jLabelidConstanteNomi.setText(constantenomiBean.getId().toString());
			this.jInternalFrameDetalleFormConstanteNomi.jTextAreanombreConstanteNomi.setText(constantenomiBean.getnombre());
			this.jInternalFrameDetalleFormConstanteNomi.jTextFieldvalorConstanteNomi.setText(constantenomiBean.getvalor().toString());
			this.jInternalFrameDetalleFormConstanteNomi.jCheckBoxes_para_preguntaConstanteNomi.setSelected(constantenomiBean.getes_para_pregunta());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanConstanteNomi(ConstanteNomiParameterReturnGeneral constantenomiReturnGeneral,ConstanteNomiBean constantenomiBean,Boolean conDefault) throws Exception { 
		try {
			ConstanteNomi constantenomiLocal=new ConstanteNomi();
			
			constantenomiLocal=constantenomiReturnGeneral.getConstanteNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && constantenomiLocal.getId()!=null && !constantenomiLocal.getId().equals(0L))) {constantenomiBean.setId(constantenomiLocal.getId());}}
			if(conDefault || (!conDefault && constantenomiLocal.getid_tipo_constante_nomi()!=null && !constantenomiLocal.getid_tipo_constante_nomi().equals(-1L))) {constantenomiBean.setid_tipo_constante_nomi(constantenomiLocal.getid_tipo_constante_nomi());}
			if(conDefault || (!conDefault && constantenomiLocal.getnombre()!=null && !constantenomiLocal.getnombre().equals(""))) {constantenomiBean.setnombre(constantenomiLocal.getnombre());}
			if(conDefault || (!conDefault && constantenomiLocal.getvalor()!=null && !constantenomiLocal.getvalor().equals(0.0))) {constantenomiBean.setvalor(constantenomiLocal.getvalor());}
			if(conDefault || (!conDefault && constantenomiLocal.getes_para_pregunta()!=null && !constantenomiLocal.getes_para_pregunta().equals(false))) {constantenomiBean.setes_para_pregunta(constantenomiLocal.getes_para_pregunta());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxConstanteNomiGenerico(Long idConstanteNomiSeleccionado,JComboBox jComboBoxConstanteNomi,List<ConstanteNomi> constantenomisLocal)throws Exception {
		try {
			ConstanteNomi  constantenomiTemp=null;

			for(ConstanteNomi constantenomiAux:constantenomisLocal) {
				if(constantenomiAux.getId()!=null && constantenomiAux.getId().equals(idConstanteNomiSeleccionado)) {
					constantenomiTemp=constantenomiAux;
					break;
				}
			}

			jComboBoxConstanteNomi.setSelectedItem(constantenomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxConstanteNomiGenerico(JComboBox jComboBoxConstanteNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxConstanteNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConstanteNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxConstanteNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConstanteNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConstanteNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxConstanteNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConstanteNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxConstanteNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxConstanteNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxConstanteNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("EmpleadoConstante")) {
			jButtonEmpleadoConstanteActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			constantenomi=(ConstanteNomi) constantenomiLogic.getConstanteNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			constantenomi =(ConstanteNomi) constantenomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!constantenomi.getIsNew() && !constantenomi.getIsChanged() && !constantenomi.getIsDeleted()) {
				sDescripcion=constantenomi.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=constantenomi.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoConstanteNomi")) {
			//sDescripcion=this.getActualTipoConstanteNomiForeignKeyDescripcion((Long)value);
			if(!constantenomi.getIsNew() && !constantenomi.getIsChanged() && !constantenomi.getIsDeleted()) {
				sDescripcion=constantenomi.gettipoconstantenomi_descripcion();
			} else {
				//sDescripcion=this.getActualTipoConstanteNomiForeignKeyDescripcion((Long)value);
				sDescripcion=constantenomi.gettipoconstantenomi_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ConstanteNomi constantenomiRow=new ConstanteNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			constantenomiRow=(ConstanteNomi) constantenomiLogic.getConstanteNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			constantenomiRow=(ConstanteNomi) constantenomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonEmpleadoConstanteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,ConstanteNomi constantenomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormConstanteNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.constantenomi = (ConstanteNomi)this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.constantenomi = (ConstanteNomi)this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(constantenomi!=null) {
						this.constantenomi = constantenomi;
					} else {
						this.constantenomi = new ConstanteNomi();
					}
				}

				if(this.isTienePermisosEmpleadoConstante && this.permiteMantenimiento(this.constantenomi)) {
					EmpleadoConstanteBeanSwingJInternalFrame empleadoconstanteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFramePopup=new EmpleadoConstanteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						empleadoconstanteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFramePopup;
					} else {
						empleadoconstanteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame;
					}

					List<ConstanteNomi> constantenomis=new ArrayList<ConstanteNomi>();
					constantenomis.add(this.constantenomi);
					if(!esRelacionado) {
						//empleadoconstanteBeanSwingJInternalFrame.empleadoconstanteSessionBean.setConGuardarRelaciones(false);
						//empleadoconstanteBeanSwingJInternalFrame.empleadoconstanteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					empleadoconstanteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormConstanteNomi.cargarEmpleadoConstanteBeanSwingJInternalFrame(constantenomis,this.constantenomi,empleadoconstanteBeanSwingJInternalFrame,/*conInicializar,*/empleadoconstanteBeanSwingJInternalFrame.empleadoconstanteSessionBean.getConGuardarRelaciones(),empleadoconstanteBeanSwingJInternalFrame.empleadoconstanteSessionBean.getEsGuardarRelacionado());
					empleadoconstanteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						empleadoconstanteBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoConstante("no_relacionado");

						empleadoconstanteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EmpleadoConstanteConstantesFunciones.ITAMANIOFILATABLA + (EmpleadoConstanteConstantesFunciones.ITAMANIOFILATABLA/2));

						empleadoconstanteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderConstanteNomi=(TitledBorder)this.jScrollPanelDatosConstanteNomi.getBorder();
						TitledBorder titledBorderEmpleadoConstante=(TitledBorder)empleadoconstanteBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoConstante.getBorder();

						titledBorderEmpleadoConstante.setTitle(titledBorderConstanteNomi.getTitle() + " -> Empleado Constante");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,empleadoconstanteBeanSwingJInternalFrame);
						}

						empleadoconstanteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(empleadoconstanteBeanSwingJInternalFrame);

						empleadoconstanteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.constantenomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Empleado Constante",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualConstanteNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoConstanteNomi.setVisible((this.isVisibilidadCeldaNuevoConstanteNomi && this.isPermisoNuevoConstanteNomi));			
			this.jButtonDuplicarConstanteNomi.setVisible((this.isVisibilidadCeldaDuplicarConstanteNomi && this.isPermisoDuplicarConstanteNomi));			
			this.jButtonCopiarConstanteNomi.setVisible((this.isVisibilidadCeldaCopiarConstanteNomi && this.isPermisoCopiarConstanteNomi));
			this.jButtonVerFormConstanteNomi.setVisible((this.isVisibilidadCeldaVerFormConstanteNomi && this.isPermisoVerFormConstanteNomi));
			
			this.jButtonAbrirOrderByConstanteNomi.setVisible((this.isVisibilidadCeldaOrdenConstanteNomi && this.isPermisoOrdenConstanteNomi));			
			
			this.jButtonNuevoRelacionesConstanteNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesConstanteNomi && this.isPermisoNuevoConstanteNomi));			
			this.jButtonNuevoGuardarCambiosConstanteNomi.setVisible((this.isVisibilidadCeldaNuevoConstanteNomi && this.isPermisoNuevoConstanteNomi && this.isPermisoGuardarCambiosConstanteNomi));
			
			if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
			this.jInternalFrameDetalleFormConstanteNomi.jButtonModificarConstanteNomi.setVisible((this.isVisibilidadCeldaModificarConstanteNomi && this.isPermisoActualizarConstanteNomi));	
			this.jInternalFrameDetalleFormConstanteNomi.jButtonActualizarConstanteNomi.setVisible((this.isVisibilidadCeldaActualizarConstanteNomi && this.isPermisoActualizarConstanteNomi));	
			this.jInternalFrameDetalleFormConstanteNomi.jButtonEliminarConstanteNomi.setVisible((this.isVisibilidadCeldaEliminarConstanteNomi && this.isPermisoEliminarConstanteNomi));
			this.jInternalFrameDetalleFormConstanteNomi.jButtonCancelarConstanteNomi.setVisible(this.isVisibilidadCeldaCancelarConstanteNomi);							
			this.jInternalFrameDetalleFormConstanteNomi.jButtonGuardarCambiosConstanteNomi.setVisible((this.isVisibilidadCeldaGuardarConstanteNomi && this.isPermisoGuardarCambiosConstanteNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaConstanteNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosConstanteNomi && this.isPermisoGuardarCambiosConstanteNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarConstanteNomi.setVisible((this.isVisibilidadCeldaNuevoConstanteNomi && this.isPermisoNuevoConstanteNomi));						
			this.jButtonDuplicarToolBarConstanteNomi.setVisible((this.isVisibilidadCeldaDuplicarConstanteNomi && this.isPermisoDuplicarConstanteNomi));						
			this.jButtonCopiarToolBarConstanteNomi.setVisible((this.isVisibilidadCeldaCopiarConstanteNomi && this.isPermisoCopiarConstanteNomi));			
			this.jButtonVerFormToolBarConstanteNomi.setVisible((this.isVisibilidadCeldaVerFormConstanteNomi && this.isPermisoVerFormConstanteNomi));			
			this.jButtonAbrirOrderByToolBarConstanteNomi.setVisible((this.isVisibilidadCeldaOrdenConstanteNomi && this.isPermisoOrdenConstanteNomi));
			this.jButtonNuevoRelacionesToolBarConstanteNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesConstanteNomi && this.isPermisoNuevoConstanteNomi));			
			this.jButtonNuevoGuardarCambiosToolBarConstanteNomi.setVisible((this.isVisibilidadCeldaNuevoConstanteNomi && this.isPermisoNuevoConstanteNomi && this.isPermisoGuardarCambiosConstanteNomi));			
			
			if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
			this.jInternalFrameDetalleFormConstanteNomi.jButtonModificarToolBarConstanteNomi.setVisible((this.isVisibilidadCeldaModificarConstanteNomi && this.isPermisoActualizarConstanteNomi));	
			this.jInternalFrameDetalleFormConstanteNomi.jButtonActualizarToolBarConstanteNomi.setVisible((this.isVisibilidadCeldaActualizarConstanteNomi  && this.isPermisoActualizarConstanteNomi));	
			this.jInternalFrameDetalleFormConstanteNomi.jButtonEliminarToolBarConstanteNomi.setVisible((this.isVisibilidadCeldaEliminarConstanteNomi && this.isPermisoEliminarConstanteNomi));
			this.jInternalFrameDetalleFormConstanteNomi.jButtonCancelarToolBarConstanteNomi.setVisible(this.isVisibilidadCeldaCancelarConstanteNomi);				
			this.jInternalFrameDetalleFormConstanteNomi.jButtonGuardarCambiosToolBarConstanteNomi.setVisible((this.isVisibilidadCeldaGuardarConstanteNomi && this.isPermisoGuardarCambiosConstanteNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarConstanteNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosConstanteNomi && this.isPermisoGuardarCambiosConstanteNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoConstanteNomi.setVisible((this.isVisibilidadCeldaNuevoConstanteNomi && this.isPermisoNuevoConstanteNomi));			
			this.jMenuItemDuplicarConstanteNomi.setVisible((this.isVisibilidadCeldaDuplicarConstanteNomi && this.isPermisoDuplicarConstanteNomi));			
			this.jMenuItemCopiarConstanteNomi.setVisible((this.isVisibilidadCeldaCopiarConstanteNomi && this.isPermisoCopiarConstanteNomi));			
			this.jMenuItemVerFormConstanteNomi.setVisible((this.isVisibilidadCeldaVerFormConstanteNomi && this.isPermisoVerFormConstanteNomi));			
			this.jMenuItemAbrirOrderByConstanteNomi.setVisible((this.isVisibilidadCeldaOrdenConstanteNomi && this.isPermisoOrdenConstanteNomi));			
			//this.jMenuItemMostrarOcultarConstanteNomi.setVisible((this.isVisibilidadCeldaOrdenConstanteNomi && this.isPermisoOrdenConstanteNomi));
			this.jMenuItemDetalleAbrirOrderByConstanteNomi.setVisible((this.isVisibilidadCeldaOrdenConstanteNomi && this.isPermisoOrdenConstanteNomi));			
			//this.jMenuItemDetalleMostrarOcultarConstanteNomi.setVisible((this.isVisibilidadCeldaOrdenConstanteNomi && this.isPermisoOrdenConstanteNomi));			
			this.jMenuItemNuevoRelacionesConstanteNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesConstanteNomi && this.isPermisoNuevoConstanteNomi));			
			this.jMenuItemNuevoGuardarCambiosConstanteNomi.setVisible((this.isVisibilidadCeldaNuevoConstanteNomi && this.isPermisoNuevoConstanteNomi && this.isPermisoGuardarCambiosConstanteNomi));									
			
			if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
			this.jInternalFrameDetalleFormConstanteNomi.jMenuItemModificarConstanteNomi.setVisible((this.isVisibilidadCeldaModificarConstanteNomi && this.isPermisoActualizarConstanteNomi));	
			this.jInternalFrameDetalleFormConstanteNomi.jMenuItemActualizarConstanteNomi.setVisible((this.isVisibilidadCeldaActualizarConstanteNomi && this.isPermisoActualizarConstanteNomi));	
			this.jInternalFrameDetalleFormConstanteNomi.jMenuItemEliminarConstanteNomi.setVisible((this.isVisibilidadCeldaEliminarConstanteNomi && this.isPermisoEliminarConstanteNomi));
			this.jInternalFrameDetalleFormConstanteNomi.jMenuItemCancelarConstanteNomi.setVisible(this.isVisibilidadCeldaCancelarConstanteNomi);				
			}
			
			this.jMenuItemGuardarCambiosConstanteNomi.setVisible((this.isVisibilidadCeldaGuardarConstanteNomi && this.isPermisoGuardarCambiosConstanteNomi));						
			this.jMenuItemGuardarCambiosTablaConstanteNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosConstanteNomi && this.isPermisoGuardarCambiosConstanteNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoConstanteNomi=this.jButtonNuevoConstanteNomi.isVisible();
			this.isVisibilidadCeldaDuplicarConstanteNomi=this.jButtonDuplicarConstanteNomi.isVisible();
			this.isVisibilidadCeldaCopiarConstanteNomi=this.jButtonCopiarConstanteNomi.isVisible();
			this.isVisibilidadCeldaVerFormConstanteNomi=this.jButtonVerFormConstanteNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenConstanteNomi=this.jButtonAbrirOrderByConstanteNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesConstanteNomi=this.jButtonNuevoRelacionesConstanteNomi.isVisible();
			this.isVisibilidadCeldaModificarConstanteNomi=this.jButtonModificarConstanteNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
			this.isVisibilidadCeldaActualizarConstanteNomi=this.jInternalFrameDetalleFormConstanteNomi.jButtonActualizarConstanteNomi.isVisible();
			this.isVisibilidadCeldaEliminarConstanteNomi=this.jInternalFrameDetalleFormConstanteNomi.jButtonEliminarConstanteNomi.isVisible();
			this.isVisibilidadCeldaCancelarConstanteNomi=this.jInternalFrameDetalleFormConstanteNomi.jButtonCancelarConstanteNomi.isVisible();
			this.isVisibilidadCeldaGuardarConstanteNomi=this.jInternalFrameDetalleFormConstanteNomi.jButtonGuardarCambiosConstanteNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosConstanteNomi=this.jButtonGuardarCambiosTablaConstanteNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoConstanteNomi=this.jButtonNuevoToolBarConstanteNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConstanteNomi=this.jButtonNuevoRelacionesToolBarConstanteNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
			this.isVisibilidadCeldaModificarConstanteNomi=this.jInternalFrameDetalleFormConstanteNomi.jButtonModificarToolBarConstanteNomi.isVisible();
			this.isVisibilidadCeldaActualizarConstanteNomi=this.jInternalFrameDetalleFormConstanteNomi.jButtonActualizarToolBarConstanteNomi.isVisible();
			this.isVisibilidadCeldaEliminarConstanteNomi=this.jInternalFrameDetalleFormConstanteNomi.jButtonEliminarToolBarConstanteNomi.isVisible();
			this.isVisibilidadCeldaCancelarConstanteNomi=this.jInternalFrameDetalleFormConstanteNomi.jButtonCancelarToolBarConstanteNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConstanteNomi=this.jButtonGuardarCambiosToolBarConstanteNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConstanteNomi=this.jButtonGuardarCambiosTablaToolBarConstanteNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoConstanteNomi=this.jMenuItemNuevoConstanteNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConstanteNomi=this.jMenuItemNuevoRelacionesConstanteNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
			this.isVisibilidadCeldaModificarConstanteNomi=this.jInternalFrameDetalleFormConstanteNomi.jMenuItemModificarConstanteNomi.isVisible();
			this.isVisibilidadCeldaActualizarConstanteNomi=this.jInternalFrameDetalleFormConstanteNomi.jMenuItemActualizarConstanteNomi.isVisible();
			this.isVisibilidadCeldaEliminarConstanteNomi=this.jInternalFrameDetalleFormConstanteNomi.jMenuItemEliminarConstanteNomi.isVisible();
			this.isVisibilidadCeldaCancelarConstanteNomi=this.jInternalFrameDetalleFormConstanteNomi.jMenuItemCancelarConstanteNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConstanteNomi=this.jMenuItemGuardarCambiosConstanteNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConstanteNomi=this.jMenuItemGuardarCambiosTablaConstanteNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesConstanteNomi(Boolean esInicializar) {
		if(ConstanteNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.constantenomiSessionBean.getConGuardarRelaciones()) {
				//if(this.constantenomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesConstanteNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualConstanteNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualConstanteNomi() {
		this.jButtonNuevoConstanteNomi.setVisible(this.isPermisoNuevoConstanteNomi);			
		this.jButtonDuplicarConstanteNomi.setVisible(this.isPermisoDuplicarConstanteNomi);			
		this.jButtonCopiarConstanteNomi.setVisible(this.isPermisoCopiarConstanteNomi);			
		this.jButtonVerFormConstanteNomi.setVisible(this.isPermisoVerFormConstanteNomi);			
		
		this.jButtonAbrirOrderByConstanteNomi.setVisible(this.isPermisoOrdenConstanteNomi);					
		
		this.jButtonNuevoRelacionesConstanteNomi.setVisible(this.isPermisoNuevoConstanteNomi);			
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConstanteNomi.jButtonModificarConstanteNomi.setVisible(this.isPermisoActualizarConstanteNomi);	
			this.jInternalFrameDetalleFormConstanteNomi.jButtonActualizarConstanteNomi.setVisible(this.isPermisoActualizarConstanteNomi);	
			this.jInternalFrameDetalleFormConstanteNomi.jButtonEliminarConstanteNomi.setVisible(this.isPermisoEliminarConstanteNomi);
			this.jInternalFrameDetalleFormConstanteNomi.jButtonCancelarConstanteNomi.setVisible(this.isVisibilidadCeldaCancelarConstanteNomi);						
			this.jInternalFrameDetalleFormConstanteNomi.jButtonGuardarCambiosConstanteNomi.setVisible(this.isPermisoGuardarCambiosConstanteNomi);							
		}
		
		this.jButtonGuardarCambiosTablaConstanteNomi.setVisible(this.isPermisoActualizarConstanteNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleConstanteNomi() {
		this.jInternalFrameDetalleFormConstanteNomi.jButtonModificarConstanteNomi.setVisible(this.isPermisoActualizarConstanteNomi);	
		this.jInternalFrameDetalleFormConstanteNomi.jButtonActualizarConstanteNomi.setVisible(this.isPermisoActualizarConstanteNomi);	
		this.jInternalFrameDetalleFormConstanteNomi.jButtonEliminarConstanteNomi.setVisible(this.isPermisoEliminarConstanteNomi);
		this.jInternalFrameDetalleFormConstanteNomi.jButtonCancelarConstanteNomi.setVisible(this.isVisibilidadCeldaCancelarConstanteNomi);							
		this.jInternalFrameDetalleFormConstanteNomi.jButtonGuardarCambiosConstanteNomi.setVisible((this.isVisibilidadCeldaGuardarConstanteNomi && this.isPermisoGuardarCambiosConstanteNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosConstanteNomi() {
		if(ConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualConstanteNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesConstanteNomi() {
	}
	
	public void jTableDatosConstanteNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarConstanteNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidConstanteNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConstanteNomi(this.getconstantenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.constantenomi =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.constantenomi =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.constantenomi==null) {
						this.constantenomi = new ConstanteNomi();
					}

					this.setVariablesFormularioToObjetoActualConstanteNomi(this.constantenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);
				}

				if(this.constantenomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.constantenomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConstanteNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaConstanteNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebConstanteNomi(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConstanteNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConstanteNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomi =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.constantenomi =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConstanteNomi(this.getconstantenomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.constantenomiLogic.getConnexion());

				if(this.constantenomi.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.constantenomi.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConstanteNomi=(TitledBorder)this.jScrollPanelDatosConstanteNomi.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderConstanteNomi.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaConstanteNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConstanteNomi(this.getconstantenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.constantenomi =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.constantenomi =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.constantenomi==null) {
						this.constantenomi = new ConstanteNomi();
					}

					this.setVariablesFormularioToObjetoActualConstanteNomi(this.constantenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);
				}

				if(this.constantenomi.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.constantenomi.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConstanteNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_constante_nomiConstanteNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoconstantenomi=true;

			idTienePermisotipoconstantenomi=this.tienePermisosUsuarioEnPaginaWebConstanteNomi(TipoConstanteNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoconstantenomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConstanteNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConstanteNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomi =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.constantenomi =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConstanteNomi(this.getconstantenomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);

				this.tipoconstantenomiBeanSwingJInternalFrame=new TipoConstanteNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoconstantenomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoconstantenomiBeanSwingJInternalFrame.getTipoConstanteNomiLogic().setConnexion(this.constantenomiLogic.getConnexion());

				if(this.constantenomi.getid_tipo_constante_nomi()!=null) {
					this.tipoconstantenomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoconstantenomiBeanSwingJInternalFrame.setIdActual(this.constantenomi.getid_tipo_constante_nomi());
					this.tipoconstantenomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoconstantenomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoconstantenomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoConstanteNomi();
				}

				JInternalFrameBase jinternalFrame =this.tipoconstantenomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConstanteNomi=(TitledBorder)this.jScrollPanelDatosConstanteNomi.getBorder();
				TitledBorder titledBordertipoconstantenomi=(TitledBorder)this.tipoconstantenomiBeanSwingJInternalFrame.jScrollPanelDatosTipoConstanteNomi.getBorder();

				titledBordertipoconstantenomi.setTitle(titledBorderConstanteNomi.getTitle() + " -> Tipo Constante");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_constante_nomiConstanteNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConstanteNomi(this.getconstantenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.constantenomi =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.constantenomi =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.constantenomi==null) {
						this.constantenomi = new ConstanteNomi();
					}

					this.setVariablesFormularioToObjetoActualConstanteNomi(this.constantenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);
				}

				if(this.constantenomi.getid_tipo_constante_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_constante_nomi = "+this.constantenomi.getid_tipo_constante_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConstanteNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreConstanteNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConstanteNomi(this.getconstantenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.constantenomi =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.constantenomi =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.constantenomi==null) {
						this.constantenomi = new ConstanteNomi();
					}

					this.setVariablesFormularioToObjetoActualConstanteNomi(this.constantenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);
				}

				if(this.constantenomi.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.constantenomi.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConstanteNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorConstanteNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConstanteNomi(this.getconstantenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.constantenomi =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.constantenomi =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.constantenomi==null) {
						this.constantenomi = new ConstanteNomi();
					}

					this.setVariablesFormularioToObjetoActualConstanteNomi(this.constantenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);
				}

				if(this.constantenomi.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.constantenomi.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConstanteNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_para_preguntaConstanteNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConstanteNomi(this.getconstantenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.constantenomi =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.constantenomi =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.constantenomi==null) {
						this.constantenomi = new ConstanteNomi();
					}

					this.setVariablesFormularioToObjetoActualConstanteNomi(this.constantenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);
				}

				if(this.constantenomi.getes_para_pregunta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_para_pregunta = "+this.constantenomi.getes_para_pregunta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConstanteNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaConstanteNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConstanteNomi(false,false);

			this.getConstanteNomisFK_IdEmpresa();

			this.inicializarActualizarBindingConstanteNomi(false);

			//if(ConstanteNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConstanteNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoConstanteConstanteNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConstanteNomi(false,false);

			this.getConstanteNomisFK_IdTipoConstante();

			this.inicializarActualizarBindingConstanteNomi(false);

			//if(ConstanteNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConstanteNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.constantenomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameConstanteNomi() {
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
		

		if(this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
			this.jInternalFrameDetalleFormConstanteNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormConstanteNomi.dispose();
			this.jInternalFrameDetalleFormConstanteNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoConstanteNomi!=null) {
			this.jInternalFrameReporteDinamicoConstanteNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoConstanteNomi.dispose();
			this.jInternalFrameReporteDinamicoConstanteNomi=null;
		}
		
		if(this.jInternalFrameImportacionConstanteNomi!=null) {
			this.jInternalFrameImportacionConstanteNomi.setVisible(false);	    			
			this.jInternalFrameImportacionConstanteNomi.dispose();
			this.jInternalFrameImportacionConstanteNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessConstanteNomi();
			
			ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoConstanteNomi")) {
				jButtonNuevoConstanteNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarConstanteNomi")) {
				jButtonDuplicarConstanteNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarConstanteNomi")) {
				jButtonCopiarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormConstanteNomi")) {
				jButtonVerFormConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarConstanteNomi")) {
				jButtonNuevoConstanteNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarConstanteNomi")) {
				jButtonDuplicarConstanteNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoConstanteNomi")) {
				jButtonNuevoConstanteNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarConstanteNomi")) {
				jButtonDuplicarConstanteNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesConstanteNomi")) {
				jButtonNuevoConstanteNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarConstanteNomi")) {
				jButtonNuevoConstanteNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesConstanteNomi")) {
				jButtonNuevoConstanteNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarConstanteNomi")) {
				jButtonModificarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarConstanteNomi")) {
				jButtonModificarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarConstanteNomi")) {
				jButtonModificarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarConstanteNomi")) {
				jButtonActualizarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarConstanteNomi")) {
				jButtonActualizarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarConstanteNomi")) {
				jButtonActualizarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarConstanteNomi")) {
				jButtonEliminarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarConstanteNomi")) {
				jButtonEliminarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarConstanteNomi")) {
				jButtonEliminarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarConstanteNomi")) {
				jButtonCancelarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarConstanteNomi")) {
				jButtonCancelarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarConstanteNomi")) {
				jButtonCancelarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarConstanteNomi")) {
				jButtonCerrarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarConstanteNomi")) {
				jButtonCerrarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarConstanteNomi")) {
				jButtonCerrarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarConstanteNomi")) {
				jButtonMostrarOcultarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarConstanteNomi")) {
				jButtonCancelarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosConstanteNomi")) {
				jButtonGuardarCambiosConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarConstanteNomi")) {
				jButtonGuardarCambiosConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarConstanteNomi")) {
				jButtonCopiarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarConstanteNomi")) {
				jButtonVerFormConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosConstanteNomi")) {
				jButtonGuardarCambiosConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarConstanteNomi")) {
				jButtonCopiarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormConstanteNomi")) {
				jButtonVerFormConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaConstanteNomi")) {
				jButtonGuardarCambiosConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarConstanteNomi")) {
				jButtonGuardarCambiosConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaConstanteNomi")) {
				jButtonGuardarCambiosConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionConstanteNomi")) {
				jButtonRecargarInformacionConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarConstanteNomi")) {
				jButtonRecargarInformacionConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionConstanteNomi")) {
				jButtonRecargarInformacionConstanteNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresConstanteNomi")) {
				jButtonAnterioresConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarConstanteNomi")) {
				jButtonAnterioresConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreConstanteNomi")) {
				jButtonAnterioresConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesConstanteNomi")) {
				jButtonSiguientesConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarConstanteNomi")) {
				jButtonSiguientesConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesConstanteNomi")) {
				jButtonSiguientesConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByConstanteNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByConstanteNomi")) {
				jButtonAbrirOrderByConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarConstanteNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarConstanteNomi")) {
				jButtonMostrarOcultarConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosConstanteNomi")) {
				jButtonNuevoGuardarCambiosConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarConstanteNomi")) {
				jButtonNuevoGuardarCambiosConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosConstanteNomi")) {
				jButtonNuevoGuardarCambiosConstanteNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoConstanteNomi")) {
				jButtonCerrarReporteDinamicoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoConstanteNomi")) {
				jButtonGenerarReporteDinamicoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoConstanteNomi")) {
				
				jButtonGenerarExcelReporteDinamicoConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionConstanteNomi")) {
				jButtonCerrarImportacionConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionConstanteNomi")) {
				
				jButtonGenerarImportacionConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionConstanteNomi")) {
				
				jButtonAbrirImportacionConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesConstanteNomi")) {
				jComboBoxTiposAccionesConstanteNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesConstanteNomi")) {
				jComboBoxTiposRelacionesConstanteNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioConstanteNomi")) {
				jComboBoxTiposAccionesConstanteNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarConstanteNomi")) {
				
				jComboBoxTiposSeleccionarConstanteNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralConstanteNomi")) {
				jTextFieldValorCampoGeneralConstanteNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByConstanteNomi")) {
				jButtonAbrirOrderByConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarConstanteNomi")) {
				jButtonAbrirOrderByConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByConstanteNomi")) {
				jButtonCerrarOrderByConstanteNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConstanteNomiBusqueda")) {
				this.jButtonidConstanteNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConstanteNomiUpdate")) {
				this.jButtonid_empresaConstanteNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConstanteNomiBusqueda")) {
				this.jButtonid_empresaConstanteNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_constante_nomiConstanteNomiUpdate")) {
				this.jButtonid_tipo_constante_nomiConstanteNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_constante_nomiConstanteNomiBusqueda")) {
				this.jButtonid_tipo_constante_nomiConstanteNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreConstanteNomiBusqueda")) {
				this.jButtonnombreConstanteNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorConstanteNomiBusqueda")) {
				this.jButtonvalorConstanteNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_para_preguntaConstanteNomiBusqueda")) {
				this.jButtones_para_preguntaConstanteNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTipoConstanteConstanteNomi")) {
				this.jButtonFK_IdTipoConstanteConstanteNomiActionPerformed(evt);
			}
			
			;
			
			
			ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessConstanteNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConstanteNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.constantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.constantenomi);
				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
				
				


				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConstanteNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConstanteNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ConstanteNomi constantenomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				constantenomiLocal=this.constantenomi;
			} else {
				constantenomiLocal=this.constantenomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.constantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.constantenomi);
				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
							
				
				


				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConstanteNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConstanteNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConstanteNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiAnterior =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.constantenomiAnterior =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
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
			
			ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
			
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
			
			


			
			ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConstanteNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.constantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.constantenomi);
				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
								
						
				


				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConstanteNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConstanteNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.constantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.constantenomi);
				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
								
				
				


				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConstanteNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConstanteNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConstanteNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiAnterior =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.constantenomiAnterior =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.constantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.constantenomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConstanteNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiAnterior =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.constantenomiAnterior =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConstanteNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.constantenomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.constantenomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.constantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.constantenomi);
				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
							
				
				


				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConstanteNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConstanteNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConstanteNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.constantenomiAnterior =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.constantenomiAnterior =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
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
			
			ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
			
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
			
			


			
			ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConstanteNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.constantenomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.constantenomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.constantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.constantenomi);
				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
								
				
				


				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConstanteNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConstanteNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConstanteNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiAnterior =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.constantenomiAnterior =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConstanteNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.constantenomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.constantenomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConstanteNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.constantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.constantenomi);
				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosConstanteNomi")) {
					jCheckBoxSeleccionarTodosConstanteNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosConstanteNomi")) {
					jCheckBoxSeleccionadosConstanteNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarConstanteNomi")) {
					
				}
				
				


				
				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConstanteNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConstanteNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.constantenomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.constantenomi);
				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
												
				
				


				
				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConstanteNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConstanteNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConstanteNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.constantenomiAnterior =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.constantenomiAnterior =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConstanteNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.constantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.constantenomi);
				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
				
				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
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
			
			ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
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
			
			


			
			ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConstanteNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.constantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.constantenomi);
				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConstanteNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConstanteNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.constantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.constantenomi);
				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
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
				
				


				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConstanteNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConstanteNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConstanteNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.constantenomiAnterior =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.constantenomiAnterior =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarConstanteNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosConstanteNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosConstanteNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.constantenomi =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.constantenomi =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.constantenomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarConstanteNomi")) {
				
				}
				
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarConstanteNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosConstanteNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarConstanteNomi")) {
			
			}
			
			ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessConstanteNomi();
			
			ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
			
			if(sTipo.equals("NuevoConstanteNomi")) {
				jButtonNuevoConstanteNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarConstanteNomi")) {
				jButtonDuplicarConstanteNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarConstanteNomi")) {
				jButtonCopiarConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormConstanteNomi")) {
				jButtonVerFormConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesConstanteNomi")) {
				jButtonNuevoConstanteNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarConstanteNomi")) {
				jButtonModificarConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarConstanteNomi")) {
				jButtonActualizarConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarConstanteNomi")) {
				jButtonEliminarConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaConstanteNomi")) {
				jButtonGuardarCambiosConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarConstanteNomi")) {
				jButtonCancelarConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarConstanteNomi")) {
				jButtonCerrarConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosConstanteNomi")) {
				jButtonGuardarCambiosConstanteNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosConstanteNomi")) {
				jButtonNuevoGuardarCambiosConstanteNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByConstanteNomi")) {
				jButtonAbrirOrderByConstanteNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionConstanteNomi")) {
				jButtonRecargarInformacionConstanteNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresConstanteNomi")) {
				jButtonAnterioresConstanteNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesConstanteNomi")) {
				jButtonSiguientesConstanteNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConstanteNomiBusqueda")) {
				this.jButtonidConstanteNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConstanteNomiUpdate")) {
				this.jButtonid_empresaConstanteNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConstanteNomiBusqueda")) {
				this.jButtonid_empresaConstanteNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_constante_nomiConstanteNomiUpdate")) {
				this.jButtonid_tipo_constante_nomiConstanteNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_constante_nomiConstanteNomiBusqueda")) {
				this.jButtonid_tipo_constante_nomiConstanteNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreConstanteNomiBusqueda")) {
				this.jButtonnombreConstanteNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorConstanteNomiBusqueda")) {
				this.jButtonvalorConstanteNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_para_preguntaConstanteNomiBusqueda")) {
				this.jButtones_para_preguntaConstanteNomiBusquedaActionPerformed(evt);
			}
			
			ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessConstanteNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameConstanteNomi")) {
				closingInternalFrameConstanteNomi();
				
			} else if(sTipo.equals("jButtonCancelarConstanteNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormConstanteNomi = (JInternalFrameBase)evt.getSource();
	            	
	            ConstanteNomiBeanSwingJInternalFrame jInternalFrameParent=(ConstanteNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormConstanteNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarConstanteNomiActionPerformed(null);
			}
			
			ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.constantenomi,new Object(),this.constantenomiParameterGeneral,this.constantenomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormConstanteNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormConstanteNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormConstanteNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.constantenomi)) {
			if(!esControlTabla) {
				if(ConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualConstanteNomi(this.constantenomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);			
				}
				
				if(this.constantenomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualConstanteNomi(this.constantenomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.constantenomiReturnGeneral=constantenomiLogic.procesarEventosConstanteNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.constantenomiLogic.getConstanteNomis(),this.constantenomi,this.constantenomiParameterGeneral,this.isEsNuevoConstanteNomi,classes);//this.constantenomiLogic.getConstanteNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanConstanteNomi(this.constantenomiReturnGeneral,this.constantenomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.constantenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanConstanteNomi(classes,this.constantenomiReturnGeneral,this.constantenomiBean,false);
					}
						
					if(this.constantenomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyConstanteNomi(this.constantenomiReturnGeneral.getConstanteNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioConstanteNomi(this.constantenomiReturnGeneral.getConstanteNomi());	
					}
						
					if(this.constantenomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioConstanteNomi(this.constantenomiReturnGeneral.getConstanteNomi(),classes);//this.constantenomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioConstanteNomi(this.constantenomi,classes);//this.constantenomiBean);									
				}
			
				if(ConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualConstanteNomi(this.constantenomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConstanteNomi(this.constantenomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.constantenomiAnterior!=null) {
						this.constantenomi=this.constantenomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.constantenomiReturnGeneral=constantenomiLogic.procesarEventosConstanteNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.constantenomiLogic.getConstanteNomis(),this.constantenomi,this.constantenomiParameterGeneral,this.isEsNuevoConstanteNomi,classes);//this.constantenomiLogic.getConstanteNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.constantenomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.constantenomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.constantenomiReturnGeneral.getConstanteNomi(),constantenomiLogic.getConstanteNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.constantenomiReturnGeneral.getConstanteNomi(),this.constantenomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosConstanteNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosConstanteNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosConstanteNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosConstanteNomi() throws Exception {
		
		ConstanteNomiModel constantenomiModel=(ConstanteNomiModel)this.jTableDatosConstanteNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			constantenomiModel.constantenomis=this.constantenomiLogic.getConstanteNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			constantenomiModel.constantenomis=this.constantenomis;
		}
		
		
		((ConstanteNomiModel) this.jTableDatosConstanteNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaConstanteNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getconstantenomiAnterior(),this.constantenomiLogic.getConstanteNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getconstantenomiAnterior(),this.constantenomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosConstanteNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioConstanteNomi(ConstanteNomi constantenomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoConstante.class)) {
					this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.empleadoconstanteLogic.setEmpleadoConstantes(constantenomi.getEmpleadoConstantes());
					this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoConstante(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
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
										
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.constantenomi,new Object(),generalEntityParameterGeneral,this.constantenomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.constantenomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ConstanteNomiConstantesFunciones.getClassesRelationshipsOfConstanteNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ConstanteNomiConstantesFunciones.getClassesRelationshipsFromStringsOfConstanteNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormConstanteNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.constantenomi,new Object(),generalEntityParameterGeneral,this.constantenomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioConstanteNomi(ConstanteNomiBean constantenomiBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoConstante.class)) {
					this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.empleadoconstanteLogic.setEmpleadoConstantes(constantenomi.getEmpleadoConstantes());
					this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoConstante(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanConstanteNomi(ArrayList<Classe> classes,ConstanteNomiReturnGeneral constantenomiReturnGeneral,ConstanteNomiBean constantenomiBean,Boolean conDefault) throws Exception {
		
			this.constantenomiBean.setEmpleadoConstantes(constantenomiReturnGeneral.getConstanteNomi().getEmpleadoConstantes());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualConstanteNomi(ConstanteNomi constantenomi,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoConstante.class)) {
					constantenomi.setEmpleadoConstantes(this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.empleadoconstanteLogic.getEmpleadoConstantes());
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
		if(!paraTabla && !this.permiteMantenimiento(this.constantenomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormConstanteNomi = new ConstanteNomiDetalleFormJInternalFrame(jDesktopPane,this.constantenomiSessionBean.getConGuardarRelaciones(),this.constantenomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormConstanteNomi);
		this.jInternalFrameDetalleFormConstanteNomi.setVisible(false);
		this.jInternalFrameDetalleFormConstanteNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormConstanteNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormConstanteNomi.constantenomiLogic=this.constantenomiLogic;
		
		this.cargarCombosFrameForeignKeyConstanteNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleConstanteNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConstanteNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyConstanteNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyConstanteNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormConstanteNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConstanteNomi"));
		
		this.jInternalFrameDetalleFormConstanteNomi.jButtonModificarConstanteNomi.addActionListener(new ButtonActionListener(this,"ModificarConstanteNomi"));

		
		this.jInternalFrameDetalleFormConstanteNomi.jButtonModificarToolBarConstanteNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarConstanteNomi"));
					
		this.jInternalFrameDetalleFormConstanteNomi.jMenuItemModificarConstanteNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarConstanteNomi"));		
		
		
		
		this.jInternalFrameDetalleFormConstanteNomi.jButtonActualizarConstanteNomi.addActionListener (new ButtonActionListener(this,"ActualizarConstanteNomi"));
		
		
		this.jInternalFrameDetalleFormConstanteNomi.jButtonActualizarToolBarConstanteNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConstanteNomi"));
						
		this.jInternalFrameDetalleFormConstanteNomi.jMenuItemActualizarConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConstanteNomi"));		
		
		
		
		this.jInternalFrameDetalleFormConstanteNomi.jButtonEliminarConstanteNomi.addActionListener (new ButtonActionListener(this,"EliminarConstanteNomi"));
		
		
		this.jInternalFrameDetalleFormConstanteNomi.jButtonEliminarToolBarConstanteNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarConstanteNomi"));
								
		this.jInternalFrameDetalleFormConstanteNomi.jMenuItemEliminarConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConstanteNomi"));		
		
		
		
		this.jInternalFrameDetalleFormConstanteNomi.jButtonCancelarConstanteNomi.addActionListener (new ButtonActionListener(this,"CancelarConstanteNomi"));
		
		
		this.jInternalFrameDetalleFormConstanteNomi.jButtonCancelarToolBarConstanteNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarConstanteNomi"));
					
		this.jInternalFrameDetalleFormConstanteNomi.jMenuItemCancelarConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConstanteNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormConstanteNomi.jMenuItemDetalleCerrarConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConstanteNomi"));		
		
		
		
		this.jInternalFrameDetalleFormConstanteNomi.jButtonGuardarCambiosToolBarConstanteNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConstanteNomi"));
		
		
		
		this.jInternalFrameDetalleFormConstanteNomi.jButtonGuardarCambiosToolBarConstanteNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConstanteNomi"));
		
		
		
		this.jInternalFrameDetalleFormConstanteNomi.jComboBoxTiposAccionesFormularioConstanteNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConstanteNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConstanteNomi.jButtonidConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"idConstanteNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConstanteNomi.jButtonid_empresaConstanteNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConstanteNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConstanteNomi.jButtonid_empresaConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConstanteNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConstanteNomi.jButtonid_tipo_constante_nomiConstanteNomiUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_constante_nomiConstanteNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConstanteNomi.jButtonid_tipo_constante_nomiConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_constante_nomiConstanteNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConstanteNomi.jButtonnombreConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreConstanteNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConstanteNomi.jButtonvalorConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"valorConstanteNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConstanteNomi.jButtones_para_preguntaConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"es_para_preguntaConstanteNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormConstanteNomi.jTabbedPaneRelacionesConstanteNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConstanteNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameConstanteNomi"));
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConstanteNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConstanteNomi"));
		}
		
		this.jTableDatosConstanteNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarConstanteNomi"));
		
		this.jTableDatosConstanteNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarConstanteNomi"));
		
		this.jButtonNuevoConstanteNomi.addActionListener(new ButtonActionListener(this,"NuevoConstanteNomi"));
		
		this.jButtonDuplicarConstanteNomi.addActionListener(new ButtonActionListener(this,"DuplicarConstanteNomi"));
		
		this.jButtonCopiarConstanteNomi.addActionListener(new ButtonActionListener(this,"CopiarConstanteNomi"));
		
		this.jButtonVerFormConstanteNomi.addActionListener(new ButtonActionListener(this,"VerFormConstanteNomi"));
		
		
		this.jButtonNuevoToolBarConstanteNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarConstanteNomi"));
			
		this.jButtonDuplicarToolBarConstanteNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarConstanteNomi"));
			
		this.jMenuItemNuevoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoConstanteNomi"));
			
		this.jMenuItemDuplicarConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarConstanteNomi"));		
		
		
		this.jButtonNuevoRelacionesConstanteNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesConstanteNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarConstanteNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarConstanteNomi"));
			
		this.jMenuItemNuevoRelacionesConstanteNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesConstanteNomi"));		
		
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConstanteNomi.jButtonModificarConstanteNomi.addActionListener(new ButtonActionListener(this,"ModificarConstanteNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConstanteNomi.jButtonModificarToolBarConstanteNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarConstanteNomi"));
			
			this.jInternalFrameDetalleFormConstanteNomi.jMenuItemModificarConstanteNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarConstanteNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormConstanteNomi.jButtonActualizarConstanteNomi.addActionListener (new ButtonActionListener(this,"ActualizarConstanteNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConstanteNomi.jButtonActualizarToolBarConstanteNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConstanteNomi"));
				
			this.jInternalFrameDetalleFormConstanteNomi.jMenuItemActualizarConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConstanteNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConstanteNomi.jButtonEliminarConstanteNomi.addActionListener (new ButtonActionListener(this,"EliminarConstanteNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConstanteNomi.jButtonEliminarToolBarConstanteNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarConstanteNomi"));
						
			this.jInternalFrameDetalleFormConstanteNomi.jMenuItemEliminarConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConstanteNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConstanteNomi.jButtonCancelarConstanteNomi.addActionListener (new ButtonActionListener(this,"CancelarConstanteNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConstanteNomi.jButtonCancelarToolBarConstanteNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarConstanteNomi"));
			
			this.jInternalFrameDetalleFormConstanteNomi.jMenuItemCancelarConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConstanteNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarConstanteNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarConstanteNomi"));		
		
		
		this.jButtonCerrarConstanteNomi.addActionListener (new ButtonActionListener(this,"CerrarConstanteNomi"));
		
		
		this.jButtonCerrarToolBarConstanteNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarConstanteNomi"));
			
		this.jMenuItemCerrarConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarConstanteNomi"));
			
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConstanteNomi.jMenuItemDetalleCerrarConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConstanteNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConstanteNomi.jButtonGuardarCambiosConstanteNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosConstanteNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConstanteNomi.jButtonGuardarCambiosToolBarConstanteNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConstanteNomi"));
		}
		
		this.jButtonCopiarToolBarConstanteNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarConstanteNomi"));
			
		this.jButtonVerFormToolBarConstanteNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarConstanteNomi"));
		
		this.jMenuItemGuardarCambiosConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosConstanteNomi"));
			
		this.jMenuItemCopiarConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarConstanteNomi"));		
		
		this.jMenuItemVerFormConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormConstanteNomi"));		
		
		
		this.jButtonGuardarCambiosTablaConstanteNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConstanteNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarConstanteNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarConstanteNomi"));
			
		this.jMenuItemGuardarCambiosTablaConstanteNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConstanteNomi"));		
		
		
		
		this.jButtonRecargarInformacionConstanteNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionConstanteNomi"));
					
		this.jButtonRecargarInformacionToolBarConstanteNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarConstanteNomi"));
		
		this.jMenuItemRecargarInformacionConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionConstanteNomi"));		
		
		
		
		this.jButtonAnterioresConstanteNomi.addActionListener (new ButtonActionListener(this,"AnterioresConstanteNomi"));
		
		
		this.jButtonAnterioresToolBarConstanteNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarConstanteNomi"));
		
		this.jMenuItemAnterioresConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresConstanteNomi"));		
		
		
		this.jButtonSiguientesConstanteNomi.addActionListener (new ButtonActionListener(this,"SiguientesConstanteNomi"));
		
		
		this.jButtonSiguientesToolBarConstanteNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarConstanteNomi"));
			
		this.jMenuItemSiguientesConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesConstanteNomi"));
			
		this.jMenuItemAbrirOrderByConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByConstanteNomi"));
			
		this.jMenuItemMostrarOcultarConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarConstanteNomi"));
			
		this.jMenuItemDetalleAbrirOrderByConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByConstanteNomi"));
			
		this.jMenuItemDetalleMostarOcultarConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarConstanteNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosConstanteNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosConstanteNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarConstanteNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarConstanteNomi"));
			
		this.jMenuItemNuevoGuardarCambiosConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosConstanteNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosConstanteNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosConstanteNomi"));

		this.jCheckBoxSeleccionadosConstanteNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosConstanteNomi"));
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConstanteNomi.jComboBoxTiposAccionesFormularioConstanteNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConstanteNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesConstanteNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesConstanteNomi"));
			
		this.jComboBoxTiposAccionesConstanteNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesConstanteNomi"));
					
		this.jComboBoxTiposSeleccionarConstanteNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarConstanteNomi"));
			
		this.jTextFieldValorCampoGeneralConstanteNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralConstanteNomi"));		
		
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConstanteNomi.jButtonidConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"idConstanteNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConstanteNomi.jButtonid_empresaConstanteNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConstanteNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConstanteNomi.jButtonid_empresaConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConstanteNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConstanteNomi.jButtonid_tipo_constante_nomiConstanteNomiUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_constante_nomiConstanteNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConstanteNomi.jButtonid_tipo_constante_nomiConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_constante_nomiConstanteNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConstanteNomi.jButtonnombreConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreConstanteNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConstanteNomi.jButtonvalorConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"valorConstanteNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConstanteNomi.jButtones_para_preguntaConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"es_para_preguntaConstanteNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTipoConstanteConstanteNomi.addActionListener(new ButtonActionListener(this,"FK_IdTipoConstanteConstanteNomi"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoConstanteNomi!=null) {
				this.jInternalFrameReporteDinamicoConstanteNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConstanteNomi"));
				this.jInternalFrameReporteDinamicoConstanteNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConstanteNomi"));
				this.jInternalFrameReporteDinamicoConstanteNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConstanteNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoConstanteNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConstanteNomi"));				
			//this.jButtonGenerarReporteDinamicoConstanteNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConstanteNomi"));
			//this.jButtonGenerarExcelReporteDinamicoConstanteNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConstanteNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionConstanteNomi!=null) {
				this.jInternalFrameImportacionConstanteNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConstanteNomi"));
				this.jInternalFrameImportacionConstanteNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConstanteNomi"));
				this.jInternalFrameImportacionConstanteNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConstanteNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByConstanteNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByConstanteNomi"));
			
			this.jButtonAbrirOrderByToolBarConstanteNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarConstanteNomi"));			
			
			if(this.jInternalFrameOrderByConstanteNomi!=null) {
				this.jInternalFrameOrderByConstanteNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConstanteNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConstanteNomi.jTabbedPaneRelacionesConstanteNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConstanteNomi"));
		
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
            		closingInternalFrameConstanteNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormConstanteNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormConstanteNomi = (JInternalFrameBase)event.getSource();
	            	
	            ConstanteNomiBeanSwingJInternalFrame jInternalFrameParent=(ConstanteNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormConstanteNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarConstanteNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosConstanteNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosConstanteNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosConstanteNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosConstanteNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConstanteNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConstanteNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConstanteNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoConstanteNomi";
		inputMap = this.jButtonNuevoConstanteNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoConstanteNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConstanteNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConstanteNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConstanteNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConstanteNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesConstanteNomi";
		inputMap = this.jButtonNuevoRelacionesConstanteNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesConstanteNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConstanteNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarConstanteNomi";
		inputMap = this.jButtonModificarConstanteNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarConstanteNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarConstanteNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarConstanteNomi";
		inputMap = this.jButtonActualizarConstanteNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarConstanteNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarConstanteNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarConstanteNomi";
		inputMap = this.jButtonEliminarConstanteNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarConstanteNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarConstanteNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarConstanteNomi";
		inputMap = this.jButtonCancelarConstanteNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarConstanteNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarConstanteNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarConstanteNomi";
		inputMap = this.jButtonCerrarConstanteNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarConstanteNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarConstanteNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormConstanteNomi.jButtonGuardarCambiosConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosConstanteNomi";
		inputMap = this.jInternalFrameDetalleFormConstanteNomi.jButtonGuardarCambiosConstanteNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormConstanteNomi.jButtonGuardarCambiosConstanteNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosConstanteNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosConstanteNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosConstanteNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesConstanteNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesConstanteNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarConstanteNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarConstanteNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralConstanteNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralConstanteNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConstanteNomi.jButtonidConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"idConstanteNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConstanteNomi.jButtonid_empresaConstanteNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConstanteNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConstanteNomi.jButtonid_empresaConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConstanteNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConstanteNomi.jButtonid_tipo_constante_nomiConstanteNomiUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_constante_nomiConstanteNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConstanteNomi.jButtonid_tipo_constante_nomiConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_constante_nomiConstanteNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConstanteNomi.jButtonnombreConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreConstanteNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConstanteNomi.jButtonvalorConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"valorConstanteNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConstanteNomi.jButtones_para_preguntaConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"es_para_preguntaConstanteNomiBusqueda"));
		
		
		this.jButtonFK_IdTipoConstanteConstanteNomi.addActionListener(new ButtonActionListener(this,"FK_IdTipoConstanteConstanteNomi"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarConstanteNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarConstanteNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosConstanteNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ConstanteNomi constantenomiAux:this.constantenomiLogic.getConstanteNomis()) {
					constantenomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConstanteNomi constantenomiAux:constantenomis) {
					constantenomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosConstanteNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConstanteNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ConstanteNomi constantenomiAux:this.constantenomiLogic.getConstanteNomis()) {
						constantenomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConstanteNomi constantenomiAux:constantenomis) {
						constantenomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ConstanteNomi constantenomiAux:this.constantenomiLogic.getConstanteNomis()) {
					
						if(sTipoSeleccionar.equals(ConstanteNomiConstantesFunciones.LABEL_ESPARAPREGUNTA)) {
							existe=true;
							constantenomiAux.setes_para_pregunta(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConstanteNomi constantenomiAux:constantenomis) {
						
						if(sTipoSeleccionar.equals(ConstanteNomiConstantesFunciones.LABEL_ESPARAPREGUNTA)) {
							existe=true;
							constantenomiAux.setes_para_pregunta(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaConstanteNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConstanteNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConstanteNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConstanteNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosConstanteNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConstanteNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosConstanteNomi.getSelectedRows();
			
			ConstanteNomi constantenomiLocal=new ConstanteNomi();
			
			//this.seleccionarTodosConstanteNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					constantenomiLocal =(ConstanteNomi) this.constantenomiLogic.getConstanteNomis().toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					constantenomiLocal =(ConstanteNomi) this.constantenomis.toArray()[this.jTableDatosConstanteNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				constantenomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ConstanteNomi constantenomiAux:this.constantenomiLogic.getConstanteNomis()) {
						constantenomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConstanteNomi constantenomiAux:constantenomis) {
						constantenomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaConstanteNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConstanteNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConstanteNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConstanteNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualConstanteNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarConstanteNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralConstanteNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingConstanteNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralConstanteNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ConstanteNomi constantenomiAux:this.constantenomiLogic.getConstanteNomis()) {
				
						if(sTipoSeleccionar.equals(ConstanteNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							constantenomiAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConstanteNomiConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							constantenomiAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConstanteNomi constantenomiAux:constantenomis) {
					
						if(sTipoSeleccionar.equals(ConstanteNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							constantenomiAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConstanteNomiConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							constantenomiAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaConstanteNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesConstanteNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingConstanteNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioConstanteNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesConstanteNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormConstanteNomi.jComboBoxTiposAccionesFormularioConstanteNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteConstanteNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessConstanteNomi(conSplash);
				
					this.generarReporteConstanteNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConstanteNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConstanteNomi.jComboBoxTiposAccionesFormularioConstanteNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoConstanteNomisSeleccionados();
				//this.jComboBoxTiposAccionesConstanteNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConstanteNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesConstanteNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConstanteNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesConstanteNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConstanteNomi();
				
				this.exportarConstanteNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConstanteNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConstanteNomi.jComboBoxTiposAccionesFormularioConstanteNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionConstanteNomis();
				//this.importarConstanteNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConstanteNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConstanteNomi.jComboBoxTiposAccionesFormularioConstanteNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConstanteNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelConstanteNomisSeleccionados();
				//this.jComboBoxTiposAccionesConstanteNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Constante Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessConstanteNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoConstanteNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyConstanteNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Constante Nomi",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConstanteNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConstanteNomi.jComboBoxTiposAccionesFormularioConstanteNomi.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralConstanteNomi();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessConstanteNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesConstanteNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessConstanteNomi();
			
			if(this.jInternalFrameDetalleFormConstanteNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ConstanteNomi> constantenomisSeleccionados=new ArrayList<ConstanteNomi>();		
			ConstanteNomi constantenomi=new ConstanteNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingConstanteNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesConstanteNomi.getSelectedItem();
			
			
			
			
			constantenomisSeleccionados=this.getConstanteNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(constantenomisSeleccionados.size()==1) {
				for(ConstanteNomi constantenomiAux:constantenomisSeleccionados) {
					constantenomi=constantenomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Empleado Constante")) {
					jButtonEmpleadoConstanteActionPerformed(null,rowIndex,true,false,constantenomi);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessConstanteNomi();
			
      		//this.finishProcessConstanteNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarConstanteNomiReturnGeneral() throws Exception {
		if(this.constantenomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.constantenomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.constantenomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.constantenomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.constantenomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.constantenomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingConstanteNomi(false);
		}
		
		if(this.constantenomiReturnGeneral.getConRetornoLista() || this.constantenomiReturnGeneral.getConRetornoObjeto()) {
			if(this.constantenomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.constantenomiLogic.setConstanteNomis(this.constantenomiReturnGeneral.getConstanteNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.constantenomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.constantenomiLogic.setConstanteNomi(this.constantenomiReturnGeneral.getConstanteNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingConstanteNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralConstanteNomi() throws Exception {
		
		
	}
	
	public ArrayList<ConstanteNomi> getConstanteNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ConstanteNomi> constantenomisSeleccionados=new ArrayList<ConstanteNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioConstanteNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ConstanteNomi constantenomiAux:constantenomiLogic.getConstanteNomis()) {
					if(constantenomiAux.getIsSelected()) {
						constantenomisSeleccionados.add(constantenomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConstanteNomi constantenomiAux:this.constantenomis) {
					if(constantenomiAux.getIsSelected()) {
						constantenomisSeleccionados.add(constantenomiAux);				
					}
				}
			}
			
			if(constantenomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						constantenomisSeleccionados.addAll(this.constantenomiLogic.getConstanteNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						constantenomisSeleccionados.addAll(this.constantenomis);				
					}
				}
			}
		} else {
			constantenomisSeleccionados.add(this.constantenomi);
		}
		
		return constantenomisSeleccionados;
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
	
	public void generarReporteConstanteNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalConstanteNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoConstanteNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConstanteNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConstanteNomisSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesConstanteNomisSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Constante Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesConstanteNomisSeleccionados() throws Exception {
		ArrayList<ConstanteNomi> constantenomisSeleccionados=new ArrayList<ConstanteNomi>();		
		
		constantenomisSeleccionados=this.getConstanteNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteConstanteNomis("Todos",constantenomisSeleccionados);
		
	}	
	
	public void generarReporteNormalConstanteNomisSeleccionados() throws Exception {
		ArrayList<ConstanteNomi> constantenomisSeleccionados=new ArrayList<ConstanteNomi>();		
		
		constantenomisSeleccionados=this.getConstanteNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteConstanteNomis("Todos",constantenomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionConstanteNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ConstanteNomi> constantenomisSeleccionados=new ArrayList<ConstanteNomi>();
		
		constantenomisSeleccionados=this.getConstanteNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteConstanteNomis("Todos",constantenomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoConstanteNomisSeleccionados() throws Exception {
		ArrayList<ConstanteNomi> constantenomisSeleccionados=new ArrayList<ConstanteNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoConstanteNomi();
		
		
		constantenomisSeleccionados=this.getConstanteNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoConstanteNomi();
		
		
		//this.generarReporteConstanteNomis("Todos",constantenomisSeleccionados ,constantenomiImplementable,constantenomiImplementableHome);
	}
	
	public void mostrarImportacionConstanteNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionConstanteNomi();
		
		this.abrirFrameImportacionConstanteNomi();		
		
			
		//this.generarReporteConstanteNomis("Todos",constantenomisSeleccionados ,constantenomiImplementable,constantenomiImplementableHome);
	}
	
	public void importarConstanteNomis() throws Exception {		
	
	}
	
	public void exportarConstanteNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelConstanteNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoConstanteNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlConstanteNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Constante Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoConstanteNomisSeleccionados() throws Exception {
		ArrayList<ConstanteNomi> constantenomisSeleccionados=new ArrayList<ConstanteNomi>();		
		
		constantenomisSeleccionados=this.getConstanteNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"constantenomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarConstanteNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ConstanteNomi constantenomiAux:constantenomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarConstanteNomi(constantenomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//constantenomiAux.setsDetalleGeneralEntityReporte(constantenomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.constantenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Constante Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarConstanteNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ConstanteNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConstanteNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConstanteNomiConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConstanteNomiConstantesFunciones.LABEL_IDTIPOCONSTANTENOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConstanteNomiConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConstanteNomiConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConstanteNomiConstantesFunciones.LABEL_ESPARAPREGUNTA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarConstanteNomi(ConstanteNomi constantenomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=constantenomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=constantenomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=constantenomi.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=constantenomi.gettipoconstantenomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=constantenomi.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=constantenomi.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=constantenomi.getes_para_pregunta().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelConstanteNomisSeleccionados() throws Exception {
		ArrayList<ConstanteNomi> constantenomisSeleccionados=new ArrayList<ConstanteNomi>();		
		
		constantenomisSeleccionados=this.getConstanteNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"constantenomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ConstanteNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelConstanteNomi(row);				
				iRow++;
			}				
			
			for(ConstanteNomi constantenomiAux:constantenomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelConstanteNomi(constantenomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.constantenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Constante Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlConstanteNomisSeleccionados() throws Exception {
		ArrayList<ConstanteNomi> constantenomisSeleccionados=new ArrayList<ConstanteNomi>();		
		
		constantenomisSeleccionados=this.getConstanteNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"constantenomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("constantenomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("constantenomi");
			//elementRoot.appendChild(element);
		
			for(ConstanteNomi constantenomiAux:constantenomisSeleccionados) {
				element = document.createElement("constantenomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlConstanteNomi(constantenomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.constantenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Constante Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelConstanteNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ConstanteNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ConstanteNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ConstanteNomiConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConstanteNomiConstantesFunciones.LABEL_IDTIPOCONSTANTENOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(ConstanteNomiConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ConstanteNomiConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ConstanteNomiConstantesFunciones.LABEL_ESPARAPREGUNTA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelConstanteNomi(ConstanteNomi constantenomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(constantenomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(constantenomi.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(constantenomi.gettipoconstantenomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(constantenomi.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(constantenomi.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(constantenomi.getes_para_pregunta());				
	}
	
	public void setFilaDatosExportarXmlConstanteNomi(ConstanteNomi constantenomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ConstanteNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(constantenomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ConstanteNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(constantenomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ConstanteNomiConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(constantenomi.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtipoconstantenomi_descripcion = document.createElement(ConstanteNomiConstantesFunciones.IDTIPOCONSTANTENOMI);
		elementtipoconstantenomi_descripcion.appendChild(document.createTextNode(constantenomi.gettipoconstantenomi_descripcion()));
		element.appendChild(elementtipoconstantenomi_descripcion);

		Element elementnombre = document.createElement(ConstanteNomiConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(constantenomi.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementvalor = document.createElement(ConstanteNomiConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(constantenomi.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementes_para_pregunta = document.createElement(ConstanteNomiConstantesFunciones.ESPARAPREGUNTA);
		elementes_para_pregunta.appendChild(document.createTextNode(constantenomi.getes_para_pregunta().toString().trim()));
		element.appendChild(elementes_para_pregunta);
	}
	
	public void generarReporteGroupGenericoConstanteNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ConstanteNomi> constantenomisSeleccionados=new ArrayList<ConstanteNomi>();
		
		constantenomisSeleccionados=this.getConstanteNomisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoConstanteNomi(constantenomisSeleccionados);
		
		this.generarReporteConstanteNomis("Todos",constantenomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoConstanteNomi(ArrayList<ConstanteNomi> constantenomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ConstanteNomi constantenomiAux:constantenomisSeleccionados) {
				constantenomiAux.setsDetalleGeneralEntityReporte(constantenomiAux.toString());
			
				if(sTipoSeleccionar.equals(ConstanteNomiConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					constantenomiAux.setsDescripcionGeneralEntityReporte1(constantenomiAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConstanteNomiConstantesFunciones.LABEL_IDTIPOCONSTANTENOMI)) {
					existe=true;
					constantenomiAux.setsDescripcionGeneralEntityReporte1(constantenomiAux.gettipoconstantenomi_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConstanteNomiConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					constantenomiAux.setsDescripcionGeneralEntityReporte1(constantenomiAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ConstanteNomiConstantesFunciones.LABEL_ESPARAPREGUNTA)) {
					existe=true;
					constantenomiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(constantenomiAux.getes_para_pregunta()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesConstanteNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoConstanteNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesConstanteNomi=true;
				this.isVisibilidadCeldaGuardarCambiosConstanteNomi=true;
			}
			
			this.isVisibilidadCeldaModificarConstanteNomi=false;
			this.isVisibilidadCeldaActualizarConstanteNomi=false;
			this.isVisibilidadCeldaEliminarConstanteNomi=false;
			this.isVisibilidadCeldaCancelarConstanteNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConstanteNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarConstanteNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoConstanteNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesConstanteNomi=false;
			this.isVisibilidadCeldaGuardarCambiosConstanteNomi=false;
			this.isVisibilidadCeldaModificarConstanteNomi=false;
			this.isVisibilidadCeldaActualizarConstanteNomi=true;
			this.isVisibilidadCeldaEliminarConstanteNomi=false;
			this.isVisibilidadCeldaCancelarConstanteNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConstanteNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarConstanteNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoConstanteNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesConstanteNomi=false;
			this.isVisibilidadCeldaGuardarCambiosConstanteNomi=false;
			this.isVisibilidadCeldaModificarConstanteNomi=false;
			this.isVisibilidadCeldaActualizarConstanteNomi=true;
			this.isVisibilidadCeldaEliminarConstanteNomi=true;
			this.isVisibilidadCeldaCancelarConstanteNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConstanteNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarConstanteNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoConstanteNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesConstanteNomi=false;
			this.isVisibilidadCeldaGuardarCambiosConstanteNomi=false;
			this.isVisibilidadCeldaModificarConstanteNomi=false;
			this.isVisibilidadCeldaActualizarConstanteNomi=true;
			this.isVisibilidadCeldaEliminarConstanteNomi=false;
			this.isVisibilidadCeldaCancelarConstanteNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConstanteNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarConstanteNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoConstanteNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesConstanteNomi=true;
			this.isVisibilidadCeldaGuardarCambiosConstanteNomi=true;
			this.isVisibilidadCeldaModificarConstanteNomi=false;
			this.isVisibilidadCeldaActualizarConstanteNomi=false;
			this.isVisibilidadCeldaEliminarConstanteNomi=false;
			this.isVisibilidadCeldaCancelarConstanteNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConstanteNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarConstanteNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoConstanteNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesConstanteNomi=false;
			this.isVisibilidadCeldaGuardarCambiosConstanteNomi=false;
			this.isVisibilidadCeldaActualizarConstanteNomi=false;
			this.isVisibilidadCeldaEliminarConstanteNomi=false;
			this.isVisibilidadCeldaCancelarConstanteNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConstanteNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarConstanteNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoConstanteNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesConstanteNomi=false;
			this.isVisibilidadCeldaGuardarCambiosConstanteNomi=false;
			this.isVisibilidadCeldaModificarConstanteNomi=true;
			this.isVisibilidadCeldaActualizarConstanteNomi=false;
			this.isVisibilidadCeldaEliminarConstanteNomi=false;
			this.isVisibilidadCeldaCancelarConstanteNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConstanteNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarConstanteNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ConstanteNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoConstanteNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesConstanteNomi=true;
			this.isVisibilidadCeldaGuardarCambiosConstanteNomi=true;
		} else {
			this.actualizarEstadoPanelsConstanteNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarConstanteNomi=false;
			//this.isVisibilidadCeldaVerFormConstanteNomi=false;
			this.isVisibilidadCeldaDuplicarConstanteNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!constantenomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesConstanteNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoConstanteNomi=false;
			this.isVisibilidadCeldaGuardarCambiosConstanteNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(constantenomiSessionBean.getEsGuardarRelacionado()) {
			if(!constantenomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesConstanteNomi=false;												
			}
			
			this.jButtonCerrarConstanteNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesConstanteNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.constantenomi)) {
			this.isVisibilidadCeldaActualizarConstanteNomi=false;
			this.isVisibilidadCeldaEliminarConstanteNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesConstanteNomi() {
		this.isVisibilidadCeldaNuevoConstanteNomi=false;
		this.isVisibilidadCeldaGuardarCambiosConstanteNomi=false;
	}
	
	public void actualizarEstadoPanelsConstanteNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionConstanteNomi!=null) {
				this.jScrollPanelDatosEdicionConstanteNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConstanteNomi!=null) {
				this.jTabbedPaneBusquedasConstanteNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConstanteNomi!=null) {
				this.jScrollPanelDatosConstanteNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionConstanteNomi!=null) {
				this.jPanelPaginacionConstanteNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConstanteNomi!=null) {
				this.jPanelParametrosReportesConstanteNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionConstanteNomi!=null) {
				this.jScrollPanelDatosEdicionConstanteNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConstanteNomi!=null) {
				this.jTabbedPaneBusquedasConstanteNomi.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosConstanteNomi!=null) {
				this.jScrollPanelDatosConstanteNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionConstanteNomi!=null) {
				this.jPanelPaginacionConstanteNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConstanteNomi!=null) {
				this.jPanelParametrosReportesConstanteNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionConstanteNomi!=null) {
				this.jScrollPanelDatosEdicionConstanteNomi.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConstanteNomi!=null) {
				this.jTabbedPaneBusquedasConstanteNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConstanteNomi!=null) {
				this.jScrollPanelDatosConstanteNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionConstanteNomi!=null) {
				this.jPanelPaginacionConstanteNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConstanteNomi!=null) {
				this.jPanelParametrosReportesConstanteNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionConstanteNomi!=null) {
				this.jScrollPanelDatosEdicionConstanteNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConstanteNomi!=null) {
				this.jTabbedPaneBusquedasConstanteNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConstanteNomi!=null) {
				this.jScrollPanelDatosConstanteNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionConstanteNomi!=null) {
				this.jPanelPaginacionConstanteNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConstanteNomi!=null) {
				this.jPanelParametrosReportesConstanteNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionConstanteNomi!=null) {
				this.jScrollPanelDatosEdicionConstanteNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConstanteNomi!=null) {
				this.jTabbedPaneBusquedasConstanteNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConstanteNomi!=null) {
				this.jScrollPanelDatosConstanteNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionConstanteNomi!=null) {
				this.jPanelPaginacionConstanteNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConstanteNomi!=null) {
				this.jPanelParametrosReportesConstanteNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionConstanteNomi!=null) {
				this.jScrollPanelDatosEdicionConstanteNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConstanteNomi!=null) {
				this.jTabbedPaneBusquedasConstanteNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConstanteNomi!=null) {
				this.jScrollPanelDatosConstanteNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionConstanteNomi!=null) {
				this.jPanelPaginacionConstanteNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConstanteNomi!=null) {
				this.jPanelParametrosReportesConstanteNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionConstanteNomi!=null) {
				this.jScrollPanelDatosEdicionConstanteNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConstanteNomi!=null) {
				this.jTabbedPaneBusquedasConstanteNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConstanteNomi!=null) {
				this.jScrollPanelDatosConstanteNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionConstanteNomi!=null) {
				this.jPanelPaginacionConstanteNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConstanteNomi!=null) {
				this.jPanelParametrosReportesConstanteNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.constantenomiSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasConstanteNomi!=null) {
					this.jTabbedPaneBusquedasConstanteNomi.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesConstanteNomi!=null) {
				this.jPanelParametrosReportesConstanteNomi.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.constantenomiSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConstanteNomi!=null) {
				this.jTabbedPaneBusquedasConstanteNomi.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesConstanteNomi!=null) {
				this.jPanelParametrosReportesConstanteNomi.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdTipoConstante=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoConstante) {this.jTabbedPaneBusquedasConstanteNomi.remove(jPanelFK_IdTipoConstanteConstanteNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoConstanteNomi(Boolean isParaTipoConstanteNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoConstanteNomiNegation=!isParaTipoConstanteNomi;

			this.isVisibilidadFK_IdTipoConstante=isParaTipoConstanteNomi;
			if(!this.isVisibilidadFK_IdTipoConstante) {this.jTabbedPaneBusquedasConstanteNomi.remove(jPanelFK_IdTipoConstanteConstanteNomi);}
		}
		
	}
	
	

	public String registrarSesionConstanteNomiParaEmpleadoConstantes() throws Exception {
		Boolean isPaginaPopupEmpleadoConstante=false;

		try {

			if(this.constantenomiSessionBean==null) {
				this.constantenomiSessionBean=new ConstanteNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteSessionBean==null) {
				this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteSessionBean=new EmpleadoConstanteSessionBean();
			}

			this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteSessionBean.setsPathNavegacionActual(constantenomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEmpleadoConstante=this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleadoConstante(true);
			this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoConstante(ConstanteNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteSessionBean.setisBusquedaDesdeForeignKeySesionConstanteNomi(true);
			this.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteSessionBean.setlidConstanteNomiActual(this.idConstanteNomiActual);

			constantenomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyConstanteNomi(true);
			constantenomiSessionBean.setlIdConstanteNomiActualForeignKey(this.idConstanteNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ConstanteNomiSessionBean constantenomiSessionBean=new ConstanteNomiSessionBean();
		
		if(this.constantenomiSessionBean==null) {
			this.constantenomiSessionBean=new ConstanteNomiSessionBean();
		}
		
		this.constantenomiSessionBean.setsUltimaBusquedaConstanteNomi(this.getsAccionBusqueda());
		this.constantenomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.constantenomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			constantenomiSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoConstante")) {
			constantenomiSessionBean.setid_tipo_constante_nomi(this.getid_tipo_constante_nomiFK_IdTipoConstante());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ConstanteNomiSessionBean constantenomiSessionBean=new ConstanteNomiSessionBean();
		
		if(this.constantenomiSessionBean==null) {
			this.constantenomiSessionBean=new ConstanteNomiSessionBean();
		}
		
		if(this.constantenomiSessionBean.getsUltimaBusquedaConstanteNomi()!=null&&!this.constantenomiSessionBean.getsUltimaBusquedaConstanteNomi().equals("")) {
			this.setsAccionBusqueda(constantenomiSessionBean.getsUltimaBusquedaConstanteNomi());
			this.setiNumeroPaginacion(constantenomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(constantenomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(constantenomiSessionBean.getid_empresa());
				constantenomiSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoConstante")) {
				this.setid_tipo_constante_nomiFK_IdTipoConstante(constantenomiSessionBean.getid_tipo_constante_nomi());
				constantenomiSessionBean.setid_tipo_constante_nomi(-1L);
			}
		}
		
		this.constantenomiSessionBean.setsUltimaBusquedaConstanteNomi("");
		this.constantenomiSessionBean.setiNumeroPaginacion(ConstanteNomiConstantesFunciones.INUMEROPAGINACION);
		this.constantenomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaConstanteNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioConstanteNomi() {
		this.updateBorderResaltarBusquedasFormularioConstanteNomi();
		this.updateVisibilidadBusquedasFormularioConstanteNomi();
		this.updateHabilitarBusquedasFormularioConstanteNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioConstanteNomi() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasConstanteNomi.getComponents().length>0) {
	

		if(this.constantenomiConstantesFunciones.resaltarFK_IdTipoConstanteConstanteNomi!=null) {
			index= this.jTabbedPaneBusquedasConstanteNomi.indexOfComponent(this.jPanelFK_IdTipoConstanteConstanteNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConstanteNomi.getComponent(index);
				jPanel.setBorder(this.constantenomiConstantesFunciones.resaltarFK_IdTipoConstanteConstanteNomi);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioConstanteNomi() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasConstanteNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConstanteNomi.indexOfComponent(this.jPanelFK_IdTipoConstanteConstanteNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasConstanteNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.constantenomiConstantesFunciones.mostrarFK_IdTipoConstanteConstanteNomi);
			if(!this.constantenomiConstantesFunciones.mostrarFK_IdTipoConstanteConstanteNomi && index>-1) {
				this.jTabbedPaneBusquedasConstanteNomi.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioConstanteNomi() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasConstanteNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConstanteNomi.indexOfComponent(this.jPanelFK_IdTipoConstanteConstanteNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasConstanteNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.constantenomiConstantesFunciones.activarFK_IdTipoConstanteConstanteNomi);
				this.jTabbedPaneBusquedasConstanteNomi.setEnabledAt(index,this.constantenomiConstantesFunciones.activarFK_IdTipoConstanteConstanteNomi);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaConstanteNomi(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTipoConstante")) {
			index= this.jTabbedPaneBusquedasConstanteNomi.indexOfComponent(this.jPanelFK_IdTipoConstanteConstanteNomi);

			this.jTabbedPaneBusquedasConstanteNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConstanteNomi.getComponent(index);

			this.constantenomiConstantesFunciones.setResaltarFK_IdTipoConstanteConstanteNomi(resaltar);

			jPanel.setBorder(this.constantenomiConstantesFunciones.resaltarFK_IdTipoConstanteConstanteNomi);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarConstanteNomi.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioConstanteNomi() throws Exception {

		if(this.jInternalFrameDetalleFormConstanteNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioConstanteNomi();
		this.updateVisibilidadResaltarControlesFormularioConstanteNomi();
		this.updateHabilitarResaltarControlesFormularioConstanteNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioConstanteNomi() throws Exception {
		if(this.jInternalFrameDetalleFormConstanteNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.constantenomiConstantesFunciones.resaltaridConstanteNomi!=null && this.jInternalFrameDetalleFormConstanteNomi!=null) {this.jInternalFrameDetalleFormConstanteNomi.jLabelidConstanteNomi.setBorder(this.constantenomiConstantesFunciones.resaltaridConstanteNomi);}
		if(this.constantenomiConstantesFunciones.resaltarid_empresaConstanteNomi!=null && this.jInternalFrameDetalleFormConstanteNomi!=null) {this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_empresaConstanteNomi.setBorder(this.constantenomiConstantesFunciones.resaltarid_empresaConstanteNomi);}
		if(this.constantenomiConstantesFunciones.resaltarid_tipo_constante_nomiConstanteNomi!=null && this.jInternalFrameDetalleFormConstanteNomi!=null) {this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_tipo_constante_nomiConstanteNomi.setBorder(this.constantenomiConstantesFunciones.resaltarid_tipo_constante_nomiConstanteNomi);}
		if(this.constantenomiConstantesFunciones.resaltarnombreConstanteNomi!=null && this.jInternalFrameDetalleFormConstanteNomi!=null) {this.jInternalFrameDetalleFormConstanteNomi.jTextAreanombreConstanteNomi.setBorder(this.constantenomiConstantesFunciones.resaltarnombreConstanteNomi);}
		if(this.constantenomiConstantesFunciones.resaltarvalorConstanteNomi!=null && this.jInternalFrameDetalleFormConstanteNomi!=null) {this.jInternalFrameDetalleFormConstanteNomi.jTextFieldvalorConstanteNomi.setBorder(this.constantenomiConstantesFunciones.resaltarvalorConstanteNomi);}
		if(this.constantenomiConstantesFunciones.resaltares_para_preguntaConstanteNomi!=null && this.jInternalFrameDetalleFormConstanteNomi!=null) {this.jInternalFrameDetalleFormConstanteNomi.jCheckBoxes_para_preguntaConstanteNomi.setBorderPainted(true);this.jInternalFrameDetalleFormConstanteNomi.jCheckBoxes_para_preguntaConstanteNomi.setBorder(this.constantenomiConstantesFunciones.resaltares_para_preguntaConstanteNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioConstanteNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormConstanteNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
	
		//this.jInternalFrameDetalleFormConstanteNomi.jLabelidConstanteNomi.setVisible(this.constantenomiConstantesFunciones.mostraridConstanteNomi);
		this.jInternalFrameDetalleFormConstanteNomi.jPanelidConstanteNomi.setVisible(this.constantenomiConstantesFunciones.mostraridConstanteNomi);
		//this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_empresaConstanteNomi.setVisible(this.constantenomiConstantesFunciones.mostrarid_empresaConstanteNomi);
		this.jInternalFrameDetalleFormConstanteNomi.jPanelid_empresaConstanteNomi.setVisible(this.constantenomiConstantesFunciones.mostrarid_empresaConstanteNomi);
		//this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_tipo_constante_nomiConstanteNomi.setVisible(this.constantenomiConstantesFunciones.mostrarid_tipo_constante_nomiConstanteNomi);
		this.jInternalFrameDetalleFormConstanteNomi.jPanelid_tipo_constante_nomiConstanteNomi.setVisible(this.constantenomiConstantesFunciones.mostrarid_tipo_constante_nomiConstanteNomi);
		//this.jInternalFrameDetalleFormConstanteNomi.jTextAreanombreConstanteNomi.setVisible(this.constantenomiConstantesFunciones.mostrarnombreConstanteNomi);
		this.jInternalFrameDetalleFormConstanteNomi.jPanelnombreConstanteNomi.setVisible(this.constantenomiConstantesFunciones.mostrarnombreConstanteNomi);
		//this.jInternalFrameDetalleFormConstanteNomi.jTextFieldvalorConstanteNomi.setVisible(this.constantenomiConstantesFunciones.mostrarvalorConstanteNomi);
		this.jInternalFrameDetalleFormConstanteNomi.jPanelvalorConstanteNomi.setVisible(this.constantenomiConstantesFunciones.mostrarvalorConstanteNomi);
		//this.jInternalFrameDetalleFormConstanteNomi.jCheckBoxes_para_preguntaConstanteNomi.setVisible(this.constantenomiConstantesFunciones.mostrares_para_preguntaConstanteNomi);
		this.jInternalFrameDetalleFormConstanteNomi.jPaneles_para_preguntaConstanteNomi.setVisible(this.constantenomiConstantesFunciones.mostrares_para_preguntaConstanteNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioConstanteNomi() throws Exception {
		if(this.jInternalFrameDetalleFormConstanteNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConstanteNomi!=null) {
	
		this.jInternalFrameDetalleFormConstanteNomi.jLabelidConstanteNomi.setEnabled(this.constantenomiConstantesFunciones.activaridConstanteNomi);
		this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_empresaConstanteNomi.setEnabled(this.constantenomiConstantesFunciones.activarid_empresaConstanteNomi);
		this.jInternalFrameDetalleFormConstanteNomi.jComboBoxid_tipo_constante_nomiConstanteNomi.setEnabled(this.constantenomiConstantesFunciones.activarid_tipo_constante_nomiConstanteNomi);
		this.jInternalFrameDetalleFormConstanteNomi.jTextAreanombreConstanteNomi.setEnabled(this.constantenomiConstantesFunciones.activarnombreConstanteNomi);
		this.jInternalFrameDetalleFormConstanteNomi.jTextFieldvalorConstanteNomi.setEnabled(this.constantenomiConstantesFunciones.activarvalorConstanteNomi);
		this.jInternalFrameDetalleFormConstanteNomi.jCheckBoxes_para_preguntaConstanteNomi.setEnabled(this.constantenomiConstantesFunciones.activares_para_preguntaConstanteNomi);
		}
	}
	
		
}